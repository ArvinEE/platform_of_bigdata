layui.use(['form', 'layer', 'table', 'laytpl'], function() {
	var form = layui.form,
		layer = parent.layer === undefined ? layui.layer : top.layer,
		$ = layui.jquery,
		laytpl = layui.laytpl,
		table = layui.table;

	//用户列表
	var tableIns = table.render({
		elem: '#projectList',
		url: '../../json/projectList.json',
		cellMinWidth: 95,
		page: true,
		height: "full-125",
		limits: [10, 15, 20, 25],
		limit: 20,
		id: "projectListTable",
		cols: [
			[{
					type: "checkbox",
					fixed: "left",
					width: 50
				},
				{
					field: 'projectId',
					title: 'ID',
					width: 60,
					align: "center"
				},
				{
					field: 'projectName',
					title: '课题名称',
					minWidth: 200,
					align: 'center'
				},
				{
					field: 'projectTeam',
					title: '负责课题组',
					minWidth: 200,
					align: 'center'
				},
				{
					field: 'projectTeacher',
					title: '负责老师',
					align: 'center'
				},
				{
					field: 'projectStartTime',
					title: '开题时间',
					align: 'center'
				},
				{
					field: 'projectEndTime',
					title: '结题时间',
					align: 'center'
				},
				{
					field: 'projectProgress',
					title: '课题进度',
					align: 'center'
				},
				/* {
					field: 'projectLevel1',
					title: '一级课题',
					align: 'center',
					templet: addProjectLevel1Link
				}, */
				{
					title: '操作',
					minWidth: 175,
					templet: '#projectListBar',
					fixed: "right",
					align: "center"
				}
			]
		]
	});

	//搜索【此功能需要后台配合，所以暂时没有动态效果演示】
	$(".search_btn").on("click", function() {
		if ($(".searchVal").val() != '') {
			table.reload("newsListTable", {
				page: {
					curr: 1 //重新从第 1 页开始
				},
				where: {
					key: $(".searchVal").val() //搜索的关键字
				}
			})
		} else {
			layer.msg("请输入搜索的内容");
		}
	});


	//表格中添加超链接
	function addProjectLevel1Link(d) {
		var addLink = d.projectLevel1;
		if ('' == addLink || null == addLink || undefined == addLink) {
			return '';
		}
		if (addLink.length > 0) {
			return '<a class="layui-table-link" href="javascript:void(0);" lay-event="link">' + d.projectLevel1 + '</a>';
		}
	}


	//添加用户
	function addProject(edit) {
		var index = layui.layer.open({
			title: "添加课题",
			type: 2,
			content: "projectAdd.html",
			success: function(layero, index) {
				var body = layui.layer.getChildFrame('body', index);
				if (edit) {
					body.find(".projectId").val(edit.projectId);
					body.find(".projectName").val(edit.projectName);
					body.find(".projectTeam").val(edit.projectTeam);
					body.find(".projectTeacher").val(edit.projectTeacher);
					body.find(".projectStartTime").val(edit.projectStartTime);
					body.find(".projectEndTime").val(edit.projectEndTime);
					body.find(".projectProgress").val(edit.projectProgress);
					body.find(".projectLevel1").val(edit.projectLevel1);
					form.render();
				}
				setTimeout(function() {
					layui.layer.tips('点击此处返回课题列表', '.layui-layer-setwin .layui-layer-close', {
						tips: 3
					});
				}, 500)
			}
		})
		layui.layer.full(index);
		window.sessionStorage.setItem("index", index);
		//改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
		$(window).on("resize", function() {
			layui.layer.full(window.sessionStorage.getItem("index"));
		})
	}
	$(".addProject_btn").click(function() {
		addProject();
	})

	//批量删除
	$(".delAll_btn").click(function() {
		var checkStatus = table.checkStatus('projectListTable'),
			data = checkStatus.data,
			newsId = [];
		if (data.length > 0) {
			for (var i in data) {
				newsId.push(data[i].newsId);
			}
			layer.confirm('确定删除选中的课题？', {
				icon: 3,
				title: '提示信息'
			}, function(index) {
				// $.get("删除文章接口",{
				//     newsId : newsId  //将需要删除的newsId作为参数传入
				// },function(data){
				tableIns.reload();
				layer.close(index);
				// })
			})
		} else {
			layer.msg("请选择需要删除的课题");
		}
	})

	//列表操作
	table.on('tool(projectList)', function(obj) {
		var layEvent = obj.event,
			data = obj.data;
		url = data.projectLevel1;

		url = encodeURIComponent(url);
		console.log(data.projectLevel1);
		var index = layer.open({
			type: 2,
			title: '一级课题',
			shadeClose: true,
			shade: 0.8,
			area: ['50%', '70%'],
			maxmin: true,
			content: '/页面设计_1127/page/project/projectLevel1/' + url + '.html'
		});
		
		if (layEvent === 'edit') { //编辑
			addProject(data);
		} else if (layEvent === 'del') { //删除
			layer.confirm('确定删除该课题？', {
				icon: 3,
				title: '提示信息'
			}, function(index) {
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
