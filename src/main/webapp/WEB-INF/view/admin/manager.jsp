<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>설정</title>

<%--jquery--%>
<script type="text/javascript" src="/lib/jquery-3.4.1.min.js"></script>
<%-- bootstrap --%>
<link rel="stylesheet" type="text/css" href="/lib/boostrap/bootstrap.min.css">
<script src="/lib/boostrap/bootstrap.min.js"></script>
<%--jsLoad--%>
<script src="/js/manager.js"></script>

</head>

<body>

<div class="contentsP10" style="top: 120px">
    <div id="splitter1">
        <div>
            <div class="searchBox">
                <div class="searchBtn">
                    <button id="btnAdd_largeCategory" type="button">추가</button>
                    <button id="btnEdit_largeCategory" type="button">수정</button>
                    <button id="btnDel_largeCategory" type="button">삭제</button>
                    <button id="btnSave_largeCategory" type="button">저장</button>
                </div>
            </div>
            <div class="scontent" style="position: absolute; width: 100%; top: 35px; bottom: 0">
                <div id="largeCategoryGrid" style="border: none"></div>
            </div>
        </div>
        <div>
            <div class="searchBox">
                <div class="searchBtn">
                    <button id="btnAdd_smallCategory" type="button">추가</button>
                    <button id="btnEdit_smallCategory" type="button">수정</button>
                    <button id="btnDel_smallCategory" type="button">삭제</button>
                    <button id="btnSave_smallCategory" type="button">저장</button>
                </div>
            </div>
            <div class="scontent" style="position: absolute; width: 100%; top: 35px; bottom: 0">
                <div id="smallCategoryGrid" style="border: none"></div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
