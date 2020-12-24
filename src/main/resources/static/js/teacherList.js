layui.use(['form','layer','table','laytpl'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laytpl = layui.laytpl,
        table = layui.table;

    //用户列表
    var tableIns = table.render({
        elem: '#teacherList',
        url : '../../json/teacherList.json',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 20,
        id : "teacherListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: 'teacherId', title: 'ID', width:60, align:"center"},
			{field: 'teacherJobNum', title: '工号', minWidth:100, align:"center"},
            {field: 'teacherName', title: '姓名', minWidth:200, align:'center'},
            {field: 'teacherTitle', title: '职称', align:'center'},
			{field: 'teacherTeam', title: '所属课题组', align:'center'},
            {title: '操作', minWidth:175, templet:'#teacherListBar',fixed:"right",align:"center"}
        ]]
    });

    //搜索【此功能需要后台配合，所以暂时没有动态效果演示】
    $(".search_btn").on("click",function(){
        if($(".searchVal").val() != ''){
            table.reload("newsListTable",{
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
    function addTeacher(edit){
        var index = layui.layer.open({
            title : "添加老师",
            type : 2,
            content : "teacherAdd.html",
            success : function(layero, index){
                var body = layui.layer.getChildFrame('body', index);
                if(edit){
                    body.find(".teacherId").val(edit.teacherId);  //登录名
					body.find(".teacherJobNum").val(edit.teacherJobNum);  //登录名
                    body.find(".teacherName").val(edit.teacherName);  //邮箱
                    body.find(".teacherTitle").val(edit.teacherTitle);
					body.find(".teacherTeam").val(edit.teacherTeam);
                    form.render();
                }
                setTimeout(function(){
                    layui.layer.tips('点击此处返回老师信息列表', '.layui-layer-setwin .layui-layer-close', {
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
    $(".addTeacher_btn").click(function(){
        addTeacher();
    })

    //批量删除
    $(".delAll_btn").click(function(){
        var checkStatus = table.checkStatus('teacherListTable'),
            data = checkStatus.data,
            newsId = [];
        if(data.length > 0) {
            for (var i in data) {
                newsId.push(data[i].newsId);
            }
            layer.confirm('确定删除选中的老师？', {icon: 3, title: '提示信息'}, function (index) {
                // $.get("删除文章接口",{
                //     newsId : newsId  //将需要删除的newsId作为参数传入
                // },function(data){
                tableIns.reload();
                layer.close(index);
                // })
            })
        }else{
            layer.msg("请选择需要删除的老师");
        }
    })

    //列表操作
    table.on('tool(teacherList)', function(obj){
        var layEvent = obj.event,
            data = obj.data;

        if(layEvent === 'edit'){ //编辑
            addTeacher(data);
        }else if(layEvent === 'del'){ //删除
            layer.confirm('确定删除该老师？',{icon:3, title:'提示信息'},function(index){
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
