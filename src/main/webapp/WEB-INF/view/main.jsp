<%--
  Created by IntelliJ IDEA.
  User: Leeyouje
  Date: 2022-10-28
  Time: 오후 3:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
    <script src="/lib/jquery-3.4.1.min.js"></script>

    <%-- bootstrap --%>
    <link rel="stylesheet" type="text/css" href="/lib/boostrap/bootstrap.min.css">
    <script src="/lib/boostrap/bootstrap.min.js"></script>

    <link rel="stylesheet" type="text/css" href="/css/main.css">

    <script>
        $(function(){
            $('#dropOffBtn').click(function(){
                location.href = '/main/dropOff.do';
            });
            $('#takeOut').click(function(){
                location.href = '/main/takeOut.do';
            });
            clock();
            setInterval(clock, 1000);
        });
        function clock() {
            var Target = document.getElementById("clock");
            var time = new Date();

            var month = time.getMonth();
            var date = time.getDate();

            var hours = time.getHours();
            var minutes = time.getMinutes();

            Target.innerText = (month + 1) + '월 '
                + (date) + '일 '
                + (hours) + '시 '
                + (minutes) + '분 ';
        }

    </script>
</head>
<body>

    <div style="width: 100%" align="center">
        <h1 style="font-size:70px; font-weight: 900;">청학 세탁소</h1>
        <div id="clock" style="text-align: right; font-size:25px">
    </div>

    </div>
        <br>
        <br>

    <div>
        <button type="button" class="action-btn" style="color: blue;" id="dropOffBtn"> 맡기기</button>
        <button type="button" class="action-btn" style="color: red;" id="takeOut"> 반  출</button>
        <div style="float:right">
            <button type="button" class="action-btn2" style="height:400px;"> 조  회</button><br>
            <button type="button" class="action-btn2" style="height: 100px;"> 관  리</button>
        </div>
    </div>

</body>
</html>
