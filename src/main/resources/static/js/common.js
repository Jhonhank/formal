layui.use('element', function(){
    var element = layui.element;
});
//JavaScript代码区域
layui.use('layer', function(){
    var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
    $('#logout').click(function () {
        layer.confirm('是否注销你的账户?', {
            title:'注销',
            btn: ['确认', '取消'] //可以无限个按钮
        }, function(index, layero){
            //按钮【按钮一】的回调
            window.location.href = "logout.do";
        }, function(index){
            //按钮【按钮二】的回调
        });
        // if (confirm("确定退出登录？")) {
        //     window.location.href = "logout.do";
        // }
    });
});