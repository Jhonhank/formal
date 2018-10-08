//user页面
layui.use('table', function(){
    var table = layui.table;

    table.render({
        elem: '#user_list'
        ,url:'/admin/user/userListData.do'
        ,toolbar: '#toolbarDemo'
        ,title: '用户数据表'
        ,cols: [[
            {type: 'checkbox', fixed: 'left'}
            ,{field:'id', title:'ID', width:80, fixed: 'left', unresize: true, sort: true}
            ,{field:'addr', title:'地址', width:120, edit: 'text'}
            ,{field:'email', title:'邮箱', width:150, edit: 'text'/*, templet: function(res){
                        return '<em>'+ res.email +'</em>'
                    }*/}
            ,{field:'name', title:'姓名', width:120, edit: 'text'}
            ,{field:'password', title:'密码', width:80, edit: 'text', sort: true}
            ,{field:'phone', title:'手机号', width:120, edit: 'text'}
            ,{field:'username', title:'用户名', width:100}
            ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
        ]]
        ,page: true
    });

    //头工具栏事件
    table.on('toolbar(test)', function(obj){
        var checkStatus = table.checkStatus(obj.config.id);
        switch(obj.event){
            case 'getCheckData':
                var data = checkStatus.data;
                layer.alert(JSON.stringify(data));
                break;
            case 'getCheckLength':
                var data = checkStatus.data;
                layer.msg('选中了：'+ data.length + ' 个');
                break;
            case 'isAll':
                layer.msg(checkStatus.isAll ? '全选': '未全选');
                break;
        };
    });

    //监听行工具事件
    table.on('tool(test)', function(obj){
        var data = obj.data;
        //console.log(obj)
        if(obj.event === 'del'){
            layer.confirm('真的删除行么', function(index){
                obj.del();
                layer.close(index);
            });
        } else if(obj.event === 'edit'){
            window.location.href='/admin/user/toUserEdit.do'
        }
    });
});