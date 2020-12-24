layui.use(['form','layer','table','laytpl'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laytpl = layui.laytpl,
        table = layui.table;

    //用户列表
    var tableIns = table.render({
        elem: '#achievementList',
        url : '../../json/achievementList.json',
        cellMinWidth : 95,
        page : true,
        height : "full-125",
        limits : [10,15,20,25],
        limit : 20,
        id : "achievementListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: 'achievementId', title: 'ID', width:60, align:"center"},
            {field: 'achievementName', title: '名称', minWidth:200, align:'center'},
			{field: 'achievementDesc', title: '描述', minWidth:200, align:'center'},
            {field: 'achievementPhoto', title: '图片', align:'center', templet: addPhotoLink},
			/* templet: '<div><a href="/页面设计_1127/images/xiaohui.jpg" class="layui-table-link">{{d.achievementPhoto}}</a></div>' */
			{field: 'achievementVideo', title: '视频', align:'center'},
			{field: 'achievementTeam', title: '所属团队', align:'center'},
            {title: '操作', minWidth:175, templet:'#achievementListBar',fixed:"right",align:"center"}
        ]]
    });

	//表格中添加超链接
	function addPhotoLink(d) {
	　　var addLink = d.achievementPhoto;
	   if ('' == addLink || null == addLink || undefined == addLink) {
	        return '';
	   }
	   if (addLink.length > 0) {                  
	        return '<a class="layui-table-link" href="javascript:void(0);" lay-event="link">' + d.achievementPhoto + '</a>';                  
	   }
	}      
	
	
    //搜索【此功能需要后台配合，所以暂时没有动态效果演示】
    $(".search_btn").on("click",function(){
        if($(".searchVal").val() != ''){
            table.reload("achievementListTable",{
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
    function addAchievement(edit){
        var index = layui.layer.open({
            title : "添加成果",
            type : 2,
            content : "achievementAdd.html",
            success : function(layero, index){
                var body = layui.layer.getChildFrame('body', index);
                if(edit){
                    body.find(".achievementId").val(edit.achievementId);  //登录名
                    body.find(".achievementName").val(edit.achievementName);  //邮箱
                    body.find(".achievementDesc").val(edit.achievementDesc);
					body.find(".achievementPhoto").val(edit.achievementPhoto);
					body.find(".achievementVideo").val(edit.achievementVideo);
					body.find(".achievementTeam").val(edit.achievementTeam);
                    form.render();
                }
                setTimeout(function(){
                    layui.layer.tips('点击此处返回成果信息列表', '.layui-layer-setwin .layui-layer-close', {
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
    $(".addAchievement_btn").click(function(){
        addAchievement();
    })

    //批量删除
    $(".delAll_btn").click(function(){
        var checkStatus = table.checkStatus('achievementListTable'),
            data = checkStatus.data,
            newsId = [];
        if(data.length > 0) {
            for (var i in data) {
                newsId.push(data[i].newsId);
            }
            layer.confirm('确定删除选中的成果？', {icon: 3, title: '提示信息'}, function (index) {
                // $.get("删除文章接口",{
                //     newsId : newsId  //将需要删除的newsId作为参数传入
                // },function(data){
                tableIns.reload();
                layer.close(index);
                // })
            })
        }else{
            layer.msg("请选择需要删除的成果");
        }
    })

    //列表操作
    table.on('tool(achievementList)', function(obj){
        var layEvent = obj.event,
			data = obj.data;
			url = data.achievementPhoto;
			
		url = encodeURIComponent(url);
		console.log(data.achievementPhoto);
		layer.open({
		           type: 2,
		           title: '成果图片',
		           shadeClose: true,
		           shade: 0.8,
				   area: ['60%', '90%'],
				   content: '/页面设计_1127/images/'+url
		      });
        if(layEvent === 'edit'){ //编辑
            addAchievement(data);
        }else if(layEvent === 'del'){ //删除
            layer.confirm('确定删除该成果？',{icon:3, title:'提示信息'},function(index){
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
