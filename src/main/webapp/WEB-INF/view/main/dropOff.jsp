<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Leeyouje
  Date: 2022-11-05
  Time: 오전 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>맡기기</title>
    <script type="text/javascript" src="/lib/jquery-3.4.1.min.js"></script>
</head>
<script>
    var _laundryList = [];
    $(function(){

        $.ajax({
            type: "GET",
            url: '/manager/getProductGroupListForList.do',
            dataType: 'json',
            //contentType: 'contentType: "application/x-www-form-urlencoded; charset=UTF-8;',
            data: {a: 'a'},
            success: function(result){
                //alert(result);
                console.log(result);
                console.log(result.resultData);
                $("#dressList").jqxDropDownList({ source: result.resultData, placeHolder: "Select Item", width: 100, height: 30 ,selectedIndex: 0, displayMember: 'grpName', valueMember: 'grpNo' });
                $('#dressList').on('change', function (event)
                {
                    $.ajax({
                        type: "GET",
                        url: '/manager/getProductGroupListForList.do',
                        dataType: 'json',
                        //contentType: 'contentType: "application/x-www-form-urlencoded; charset=UTF-8;',
                        data: {parentGrpNo: $("#dressList").val()},
                        success: function(sub_result){
                            console.log(sub_result);
                            console.log(sub_result.resultData);
                            $("#subList").jqxDropDownList({ source: sub_result.resultData, placeHolder: "Select Item", width: 100, height: 30 ,selectedIndex: 0, displayMember: 'grpName', valueMember: 'grpNo' });
                        },//success
                        error: function(xhr, status, error) {
                            alert(error);
                        }//error
                    });//$.ajax()

                    //
//                    var args = event.args;
//                    if (args) {
//                        // index represents the item's index.
//                        var index = args.index;
//                        var item = args.item;
//                        console.log(item)
//                        // get item's label and value.
//                        var label = item.label;
//                        var value = item.value;
//                        var type = args.type; // keyboard, mouse or null depending on how the item was selected.
//
//                        var _subList = [];
//                        switch (label){
//                            case '상의':
//                                _subList = [
//                                    '와이셔츠',
//                                    '티셔츠',
//                                    '니트'
//                                ]
//                                break;
//                            case '하의':
//                                _subList = [
//                                    '청바지',
//                                    '면바지',
//                                    '정장바지'
//                                ]
//                                break;
//                            case '외투':
//                                _subList = [
//                                    '패딩',
//                                    '코트',
//                                    '자켓'
//                                ]
//                                break;
//
//
//                        }//switch(label)
//                        $("#subList").jqxDropDownList({ source: _subList});
//                    }
                });

                $.ajax({
                    type: "GET",
                    url: '/manager/getProductGroupListForList.do',
                    dataType: 'json',
                    //contentType: 'contentType: "application/x-www-form-urlencoded; charset=UTF-8;',
                    data: {parentGrpNo: $("#dressList").val()},
                    success: function(sub_result){
                        console.log(sub_result);
                        console.log(sub_result.resultData);
                        $("#subList").jqxDropDownList({ source: sub_result.resultData, placeHolder: "Select Item", width: 100, height: 30 ,selectedIndex: 0, displayMember: 'grpName', valueMember: 'grpNo' });
                    },//success
                    error: function(xhr, status, error) {
                        alert(error);
                    }//error
                });//$.ajax()
            },//success
            error: function(xhr, status, error) {
                alert(error);
            }//error
        });//$.ajax()

        repairArea.style.display = "none";


//        var subList = [
//            '와이셔츠',
//            '티셔츠',
//            '니트'
//        ]
//        $("#subList").jqxDropDownList({ source: subList, placeHolder: "Select Item", width: 100, height: 30 ,selectedIndex: 0});
    })
        function selectMenu(data){
        var dressArea = document.getElementById('dressArea');
        var repairArea = document.getElementById('repairArea');

        if(data == 'dress'){
            repairArea.style.display = "none";
            dressArea.style.display =  "block";
        }
        if(data == 'repair'){
            dressArea.style.display = "none";
            repairArea.style.display = "block";
        }
        if(data == 'shoes'){
            dressArea.style.display = "none";
            repairArea.style.display = "none";
        }
    }
        function selectLaundryAdd(){

            var laundryCheck = document.getElementById('laundryCheck');
            var customerNm = document.getElementById('customerNm').value;
            var customerNumber = document.getElementById('customerNumber').value;
            var customerAddress = document.getElementById('customerAddress').value;
            var customerTime = document.getElementById('customerTime').value;
            var customerEtc = document.getElementById('customerEtc').value;
            var customerCnt = document.getElementById('customerCnt').value;
            var customerPrice = document.getElementById('customerPrice').value;
            var customerRepairEtc = document.getElementById('customerRepairEtc').value;

            var text = laundryCheck.innerHTML;

            var _id = $('input[name="selectMenu"]:checked')[0].id;
            if(_id == 'chkDress'){
               text += "<li>옷/" + "수량 :" + customerCnt + "/가격:" + customerPrice + "</li>";
            }
            else if (_id == 'chkRepair'){
                text += "<li>수선/" + "수량 :" + customerCnt + "/가격:" + customerPrice + "/수선정보:" + customerRepairEtc + "</li>";
            }
            else {
                text += "<li>신발/" + "수량 :" + customerCnt + "/가격:" + customerPrice + "</li>" ;
            }


//            text += "이름: " + customerNm + "<br>" + "전화번호: " + customerNumber + "<br>"+ "주소: " + customerAddress + "<br>"+ "예정시각: " + customerTime + "<br>" +"특이사항: " + customerEtc
//            +"<br>"+"수량: " + customerCnt +" 개"+ "<br>" + "가격: " + customerPrice +" 원" + "<br>";

            laundryCheck.innerHTML = text;
            _laundryList.push({
                clothType: 1,
                clothGrpNo: 1,
                clothSubGrpNo: 4,
                repairText: '',
                clothCnt: 1,
                clothPrice: 10000,
            })
        }


        function laundryAddReset(){
            document.getElementById('customerNm').value = "";
            document.getElementById('customerNumber').value = "";
            document.getElementById('customerAddress').value = "";
            document.getElementById('customerTime').value = "";
            document.getElementById('customerEtc').value = "";
            document.getElementById('customerCnt').value = "";
            document.getElementById('customerPrice').value = "";
        }
        function addDropOff(){
            var customerNm = document.getElementById('customerNm').value;
            var customerNumber = document.getElementById('customerNumber').value;
            var customerAddress = document.getElementById('customerAddress').value;
            var customerTime = document.getElementById('customerTime').value;
            var customerEtc = document.getElementById('customerEtc').value;
            var customerCnt = document.getElementById('customerCnt').value;
            var customerPrice = document.getElementById('customerPrice').value;
            var customerRepairEtc = document.getElementById('customerRepairEtc').value;

            var obj = {
                userName: customerNm,
                userNumber: customerNumber,
                userAddress: customerAddress,
                memo: customerEtc,
                storeDate:customerTime,
                dueDate: '202211061844',
                totalCnt:customerCnt,
                totalPrice: customerPrice,
//                laundryList: [
//                    {
//                        clothType: 1,
//                        clothGrpNo: 1,
//                        clothSubGrpNo: 4,
//                        repairText: '',
//                        clothCnt: 1,
//                        clothPrice: 10000,
//                    }
//                ]
                laundryList: _laundryList
            }

            $.ajax({
                type: "POST",
                url: '/dropOff/addDropOffData.do',
                contentType: 'application/json',
                data: JSON.stringify(obj),
                success: function(result){

                   console.log(result);
                },//success
                error: function(xhr, status, error) {
                    alert(error);
                }//error
            });//$.ajax()

            console.log(obj);
        }
</script>
<body>
    <h3>맡기기</h3>
    <table border="1">
        <tr>
            <td>이름</td>
            <td colspan="4"><input type="text" id="customerNm"></td>
        </tr>
        <tr>
            <td>전화번호</td>
            <td colspan="4"><input type="text"  id="customerNumber"></td>
        </tr>
        <tr>
            <td>주소</td>
            <td><input type="text" id="customerAddress"></td>
            <td><input type="button" value="지도"></td>
            <td>위도</td>
            <td><input type="text"></td>
        </tr>
        <tr>
            <td>특이사항</td>
            <td><input type="text" id="customerEtc"></td>
            <td>&emsp;</td>
            <td>경도</td>
            <td><input type="text"></td>
        </tr>
        <tr>
            <td>예정시각</td>
            <td colspan="4"><input type="text" id="customerTime"></td>
        </tr>
        <tr>
            <td colspan="5">
            <input type="radio" id="chkDress" name="selectMenu" value="옷" onchange="selectMenu('dress')" checked> 옷
            <input type="radio" id="chkRepair" name="selectMenu" value="수선" onchange="selectMenu('repair')"> 수선
            <input type="radio" id="chkShoes" name="selectMenu" value="운동화" onchange="selectMenu('shoes')"> 운동화 </td>
        </tr>
        <tr id="dressArea">
            <td colspan="5">
                <div id="dressList" style="float: left"></div>
                <div id="subList" style="float: left"></div>
            </td>
        </tr>
        <tr>
            <td>수량</td>
            <td colspan="4"><input type="text" id="customerCnt"></td>
        </tr>
        <tr>
            <td>가격</td>
            <td colspan="4"><input type="text" id="customerPrice"></td>
        </tr>
        <tr id="repairArea">
            <td>수선정보</td>
            <td colspan="4"><textarea name="content"cols="30" rows="10" id="customerRepairEtc"></textarea></td>
        </tr>
        <tr>
            <td colspan="5">
                <input type="button" value="추가" id="laundryAdd" onclick="selectLaundryAdd()">
                <input type="button" value="취소(reset)" id="laundryAddCancell" onclick="laundryAddReset()">
            </td>
        </tr>
    </table>

    <div>
        <ul id="laundryCheck"></ul>
    </div>
    <button onclick="addDropOff()">저장</button>
</body>
</html>
