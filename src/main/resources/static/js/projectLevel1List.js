layui.use(['form','layer','table','laytpl'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laytpl = layui.laytpl,
        table = layui.table;

    //用户列表
    var tableIns = table.render({
        elem: '#projectLevel1List',
        url : '../../../json/projectLevel1List.json',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 20,
        id : "projectLevel1ListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: 'projectLevel1Id', title: 'ID', width:60, align:"center"},
            {field: 'projectName', title: '课题名称', minWidth:200, align:'center'},
			{field: 'projectLevel1Indicator', title: '一级课题指标', minWidth:200, align:'center'},
            {field: 'projectLevel1IndicatorName', title: '一级课题指标名称', align:'center'},
			{field: 'projectLevel1Student', title: '负责学生', align:'center'},
            {title: '操作', minWidth:175, templet:'#projectLevel1ListBar',fixed:"right",align:"center"}
        ]]
    });

    //搜索【此功能需要后台配合，所以暂时没有动态效果演示】
    $(".search_btn").on("click",function(){
        if($(".searchVal").val() != ''){
            table.reload("projectLevel1ListTable",{
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
    function addProjectLevel1(edit){
        var index = layui.layer.open({
            title : "添加一级课题信息",
            type : 2,
            content : "projectLevel1Add.html",
            success : function(layero, index){
                var body = layui.layer.getChildFrame('body', index);
                if(edit){
                    body.find(".projectLevel1Id").val(edit.projectLevel1Id);  //登录名
					body.find(".projectName").val(edit.projectName);  //登录名
                    body.find(".projectLevel1Indicator").val(edit.projectLevel1Indicator);  //邮箱
                    body.find(".projectLevel1IndicatorName").val(edit.projectLevel1IndicatorName);
					body.find(".projectLevel1Student").val(edit.projectLevel1Student);
                    form.render();
                }
                setTimeout(function(){
                    layui.layer.tips('点击此处返回一级课题列表', '.layui-layer-setwin .layui-layer-close', {
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
    $(".addProjectLevel1_btn").click(function(){
        addProjectLevel1();
    })

    //批量删除
    $(".delAll_btn").click(function(){
        var checkStatus = table.checkStatus('projectLevel1ListTable'),
            data = checkStatus.data,
            newsId = [];
        if(data.length > 0) {
            for (var i in data) {
                newsId.push(data[i].newsId);
            }
            layer.confirm('确定删除选中的课题？', {icon: 3, title: '提示信息'}, function (index) {
                // $.get("删除文章接口",{
                //     newsId : newsId  //将需要删除的newsId作为参数传入
                // },function(data){
                tableIns.reload();
                layer.close(index);
                // })
            })
        }else{
            layer.msg("请选择需要删除的课题");
        }
    })

    //列表操作
    table.on('tool(projectLevel1List)', function(obj){
        var layEvent = obj.event,
            data = obj.data;

        if(layEvent === 'edit'){ //编辑
            addProjectLevel1(data);
        }else if(layEvent === 'del'){ //删除
            layer.confirm('确定删除该课题？',{icon:3, title:'提示信息'},function(index){
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
