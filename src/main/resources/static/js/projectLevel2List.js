layui.use(['form','layer','table','laytpl'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laytpl = layui.laytpl,
        table = layui.table;

    //用户列表
    var tableIns = table.render({
        elem: '#projectLevel2List',
        url : '../../../json/projectLevel2List.json',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 20,
        id : "projectLevel2ListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: 'projectLevel2Id', title: 'ID', width:60, align:"center"},
            {field: 'projectLevel1Indicator', title: '一级课题指标', minWidth:200, align:'center'},
			{field: 'projectLevel2Indicator', title: '二级课题指标', minWidth:200, align:'center'},
            {field: 'projectLevel2IndicatorName', title: '二级课题指标名称', align:'center'},
			{field: 'projectLevel2Status', title: '完成状态', align:'center'},
            {title: '操作', minWidth:175, templet:'#projectLevel2ListBar',fixed:"right",align:"center"}
        ]]
    });

    //搜索【此功能需要后台配合，所以暂时没有动态效果演示】
    $(".search_btn").on("click",function(){
        if($(".searchVal").val() != ''){
            table.reload("projectLevel2ListTable",{
                page: {
                    curr: 1 //重新从第 1 页开始
                },
                where: {
                    key: $(".searchVal").val()  //搜索的关键字
                }
            })
        }else{
            layer.msg("请输入搜索的内容");
        }
    });

    //添加用户
    function addProjectLevel2(edit){
        var index = layui.layer.open({
            title : "添加二级课题信息",
            type : 2,
            content : "projectLevel2Add.html",
            success : function(layero, index){
                var body = layui.layer.getChildFrame('body', index);
                if(edit){
                    body.find(".projectLevel2Id").val(edit.projectLevel2Id);  //登录名
					body.find(".projectLevel1Indicator").val(edit.projectLevel1Indicator);  //登录名
                    body.find(".projectLevel2Indicator").val(edit.projectLevel2Indicator);  //邮箱
                    body.find(".projectLevel2IndicatorName").val(edit.projectLevel2IndicatorName);
					body.find(".projectLevel2Status").val(edit.projectLevel2Status);
                    form.render();
                }
                setTimeout(function(){
                    layui.layer.tips('点击此处返回二级课题列表', '.layui-layer-setwin .layui-layer-close', {
                        tips: 3
                    });
                },500)
            }
        })
        layui.layer.full(index);
        window.sessionStorage.setItem("index",index);
        //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
        $(window).on("resize",function(){
            layui.layer.full(window.sessionStorage.getItem("index"));
        })
    }
    $(".addProjectLevel2_btn").click(function(){
        addProjectLevel2();
    })

    //批量删除
    $(".delAll_btn").click(function(){
        var checkStatus = table.checkStatus('projectLevel2ListTable'),
            data = checkStatus.data,
            newsId = [];
        if(data.length > 0) {
            for (var i in data) {
                newsId.push(data[i].newsId);
            }
            layer.confirm('确定删除选中的二级课题指标？', {icon: 3, title: '提示信息'}, function (index) {
                // $.get("删除文章接口",{
                //     newsId : newsId  //将需要删除的newsId作为参数传入
                // },function(data){
                tableIns.reload();
                layer.close(index);
                // })
            })
        }else{
            layer.msg("请选择需要删除的二级课题指标");
        }
    })

    //列表操作
    table.on('tool(projectLevel2List)', function(obj){
        var layEvent = obj.event,
            data = obj.data;

        if(layEvent === 'edit'){ //编辑
            addProjectLevel2(data);
        }else if(layEvent === 'del'){ //删除
            layer.confirm('确定删除该二级课题指标？',{icon:3, title:'提示信息'},function(index){
                // $.get("删除文章接口",{
                //     newsId : data.newsId  //将需要删除的newsId作为参数传入
                // },function(data){
                    tableIns.reload();
                    layer.close(index);
                // })
            });
        }
    });

})
