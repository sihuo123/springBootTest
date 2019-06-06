
function del(id) {
    confirm("确定删除该商品吗？");
    $.ajax({
        type:"get",
        url:"/admin/delManger",
        data:{"goodId":id},
        success:function (data) {
            console.log(data);
            if(data>0){
                alert("删除成功");
                window.location.reload();
            }else{
                alert("删除失败");
            }

        }

    });

}
function  delAll() {
    var arr=[];
    $("input[name='goodsId']:checked").each(function () {
        arr.push($(this).val());
    });
    if(arr.length<=0){
        alert("请选择要删除的商品");
        return;
    }
    confirm("确定删除所选商品吗？");
    $.ajax({
        type:"POST",
        url:"/admin/delAllManger",
        data:{goodIds:arr},
        traditional:true,
        success:function (data) {
            if(data!=null){
                alert("删除成功");
                window.location.reload();
            }else{
                alert("删除失败");
            }

        }

    });
    
}
/*全选和反选*/
function checkAll() {
    var flag = $("input[name='checkAll']").is(':checked');
    if(flag==true){
        $("input[name='goodsId']").prop("checked", true);
    }else {
        $("input[name='goodsId']").prop("checked", false);
    }

    
}
function update(id) {

    window.location.href="/admin/toEditGoodsManger?goodsId="+id;


}
function doUpdate(id) {
    $.ajax({
        type:"POST",
        url:"/admin/doEditGoodsManger",
        data:{"goodsNumber":$("#goodsNumber").val(),
                "goodsName":$("#goodsName").val(),
                "goodsType":$("#goodsType").val(),
                goodsNum:$("#goodsNum").val(),
                goodsInPrice:$("#goodsInPrice").val(),
                "goodsIntroduction":$("#goodsIntroduction").val(),
            goodsId:id
        },
        traditional:true,
        success:function (data) {
            if(data!=null){
                alert("修改成功");
                window.location.href="/admin/goodsManger"
            }else{
                alert("修改失败");
            }

        }

    });

}
/*新增*/
function  add() {
    window.location.href="/admin/toAddGoodsManger";
    
}
/*查询*/
function serach() {
    window.location.href="/admin/goodsManger?goodNumber="+$("#goodNumber").val()+"&goodsName="+$("#goodsName").val()+"&goodType="+$("#goodType").val();

}

function  back() {
    window.location.href="/admin/goodsManger";
}