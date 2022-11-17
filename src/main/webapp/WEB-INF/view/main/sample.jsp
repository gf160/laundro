<%--
  Created by IntelliJ IDEA.
  User: Leeyouje
  Date: 2022-10-31
  Time: 오전 8:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sample</title>
    <script src="/lib/jquery-3.4.1.min.js"></script>
    <script>
        $(function(){
            $('#btn').click(function(){
                //document.getElementById('a') = $('#a') = document.querySelect('#a')
                var _a = $('#a').val();
                var _b = $('#b').val();
                alert(_a + ' // ' + _b);



                var param = {a: _a, b: _b};
                $.ajax({
                    type: "GET",
                    url: '/main/sample/getSampleList.do',
                    dataType: 'json',
                    //contentType: 'contentType: "application/x-www-form-urlencoded; charset=UTF-8;',
                    data: param,
                    success: function(result){
                        alert(result);
                    },//success
                    error: function(xhr, status, error) {
                        alert(error);
                    }//error
                });//$.ajax()
            });//$('#btn').click()
        });
    </script>
</head>
<body>
    <p>이 페이지는 샘플 페이지 입니다.</p>
    <input id="a"/>
    <input id="b"/>
    <button id="btn">dd</button>
</body>
</html>
