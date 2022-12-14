var $largeCategoryGrid, $smallCategoryGrid;

var resultData;

var _parentGrpNo = 0;

var boundData = 0;
var curMenuPageNo = 0;
var curMenuPageGrpNo = 0;
var pageIds = [];
var pageGrpIds = [];
var menuIds = [];

var Main = {
    /** variable */
    initVariable: function() {
        $largeCategoryGrid = $('#largeCategoryGrid'), $smallCategoryGrid = $('#smallCategoryGrid');
    },

    /** add event */
    observe: function() {
        $('button').bind('click', function(event) { Main.eventControl(event); });
    },

    /** event handler */
    eventControl: function(event) {
        var curTarget = event.currentTarget;
        switch(curTarget.id) {
            case 'btnAdd_largeCategory': this.addLargeCategoryPage(); break;
            case 'btnEdit_largeCategory': this.editLargeCategoryPage(); break;
            case 'btnDel_largeCategory': this.delLargeCategoryPage(); break;
            case 'btnSave_largeCategory': this.saveLargeCategoryPage(); break;

            case 'btnAdd_smallCategory': this.addSmallCategoryGroup(); break;
            case 'btnEdit_smallCategory': this.editSmallCategoryGroup(); break;
            case 'btnDel_smallCategory': this.delSmallCategoryGroup(); break;
            case 'btnSave_smallCategory': this.saveSmallCategoryGroup(); break;
        }
    },

    /** init design */
    initDesign: function() {

        // var source =new $.jqx.dataAdapter(
        //     {
        //         datatype: 'json',
        //         root : 'resultData',
        //         datafields: [
        //             { name: 'grpNo', type: 'int' },
        //             { name: 'grpName', type: 'string' },
        //             { name: 'parentGrpNo', type: 'int' },
        //             { name: 'grpPrice', type: 'int' },
        //         ],
        //         url: '/manager/getProductGroupList'
        // });

        //data pulling
        // var source = $.ajax({
        //     type: "GET",
        //     url: '/manager/getProductGroupList.do',
        //     dataType: 'json',
        //     // async: false,
        //     // contentType: 'application/json; charset=utf-8',
        //     // data: {a: '_a', b: '_b'},
        //     success: function (_result) {
        //         alert(_result.resultData);
        //         resultData = _result.resultData;
        //     },//success
        //     error: function(xhr, status, error) {
        //         alert(error);
        //     }//error
        // });
        //
        var source = {
            url: '/manager/getProductGroupListForList.do',
            dataType: 'json',
            // async: false,
            // contentType: 'application/json; charset=utf-8',
            // data: {parentGrpNo: _parentGrpNo}
        };

        // debugger
        // for (var idx in resultData){
            console.log("idx", resultData)
        // }

        var largeCategoryData=[], smallCategoryData=[];

        var dataLargeCategoryAdapter = new $.jqx.dataAdapter(source
            // ,{
            //     async : true,
            //     formatData : function(data) {
            //         console.log(data)
            //         for (var i in data) {
            //             if ( data.parentGrpNo == null || data.parentGrpNo == 0 ) {
            //                 largeCategoryData.push(i)
            //             } else {
            //                 smallCategoryData.push(i)
            //             }
            //         }
            //
            //         console.log(largeCategoryData)
            //         return largeCategoryData;
            //     }
            // }
            );

        var dataSmallCategoryAdapter = new $.jqx.dataAdapter(source
            ,{
                async : true,
                formatData : function(data) {
                    _parentGrpNo = $largeCategoryGrid.jqxGrid("getselectedrowindex");
                    if (_parentGrpNo != -1) {
                        data.parentGrpNo = _parentGrpNo
                    }

                    return data;
                }
            }
            );

        $('#splitter1').jqxSplitter({  width: "99.9%", height: "99.8%", panels: [{ size: "30%" }] });

        $largeCategoryGrid.jqxGrid({

            width: "99.9%",
            height: "99.9%",
            source: dataLargeCategoryAdapter,
            editable: true,
            // selectionmode: 'multiplecellsadvanced',
            columns: [
                { text: 'grpNo', datafield: 'grpNo', hidden:true },
                { text: '??????', datafield: 'grpName' },
                { text: 'useFlag', datafield: 'useFlag', hidden:true }
            ]

        })
        //     .on('rowclick', function (event) {
        //     _parentGrpNo = event.args.row.bounddata.grpNo;
        //     console.log("this is event",event);
        //     console.log("parentGrpNo",_parentGrpNo);
        //     $smallCategoryGrid.jqxGrid('clear');
        //     source.url = source.url + "?grpNo=" + _parentGrpNo;
        //     console.log("this is url", source);
        //     $smallCategoryGrid.jqxGrid('updatebounddata');
        // })
        ;

        $smallCategoryGrid.jqxGrid({

            width: "99.9%",
            height: "99.9%",
            source: dataSmallCategoryAdapter,
            editable: true,
            // selectionmode: 'multiplecellsadvanced',
            columns: [
                { text: 'grpNo', datafield: 'grpNo', hidden:true },
                { text: '??????', datafield: 'grpName' },
                { text: '??????', datafield: 'grpPrice' },
                { text: 'useFlag', datafield: 'useFlag', hidden:true }
            ]

        });
        // $largeCategoryGrid.on('bindingcomplete', function() {
        //     $(this).jqxGrid('sortby', 'visibleOrder', 'asc');
        //     var datarow = $pageGrid.jqxGrid('getrowdata', 0);
        //     curMenuPageNo = datarow.menuNo;
        //     Main.searchPageGroup();
        // });
        //
        // $largeCategoryGrid.on('rowclick', function(event) {
        //     var row = event.args.rowindex;
        //     var datarow = $pageGrid.jqxGrid('getrowdata', row);
        //     curMenuPageNo = datarow.menuNo;
        //     Main.searchPageGroup();
        // });


    },

    // initData: function() {
    //     HmGrid.updateBoundData($pageGrid, ctxPath + '/engineer/menuMgmt/getPageList.do');
    // },
    // searchPage: function() {
    //     HmGrid.updateBoundData($pageGrid, ctxPath + '/engineer/menuMgmt/getPageList.do');
    // },
    // searchPageGroup: function() {
    //     HmGrid.updateBoundData($pageGrpGrid, ctxPath + '/engineer/menuMgmt/getPageGroupList.do');
    // },
    // searchMenu: function() {
    //     HmGrid.updateBoundData($menuGrid, ctxPath + '/engineer/menuMgmt/getMenuList.do');
    // },



    /** ????????? ?????? */
    addLargeCategoryPage: function() {
        $.get(ctxPath + '/engineer/popup/pPageAdd.do', function(result) {
            HmWindow.open($('#pwindow'), '????????? ??????', result, 300, 150);
        });
    },

    /** ????????? ?????? */
    editLargeCategoryPage: function() {
        $.get(ctxPath + '/engineer/popup/pPageAdd.do', function(result) {
            HmWindow.open($('#pwindow'), '????????? ??????', result, 300, 150);
        });
    },

    /** ????????? ?????? */
    delLargeCategoryPage: function() {
        var rowIdxes = HmGrid.getRowIdx($pageGrid);
        if(rowIdxes === false) return;
        var rowdata = $pageGrid.jqxGrid('getrowdata', rowIdxes);

        if(!confirm('[' + rowdata.menuName + '] ??? ?????????????????????????')) return;

        Server.post('/engineer/popup/delPage.do', {
            data: { menuNo: rowdata.menuNo },
            success: function(result) {
                $pageGrid.jqxGrid('deleterow', rowdata.uid);
                alert('?????????????????????.');
            }
        });
    },
    /** ????????? ?????? */
    saveLargeCategoryPage: function() {
        HmGrid.endRowEdit($pageGrid);
        if(pageIds.length == 0) {
            alert('????????? ???????????? ????????????.');
            return;
        }

        var _list = [];
        $.each(pageIds, function(idx, value) {
            _list.push($pageGrid.jqxGrid('getrowdatabyid', value));
        });
        Server.post('/engineer/popup/savePage.do', {
            data: { list: _list },
            success: function(result) {
                alert('?????????????????????.');
                pageIds = [];
            }
        });
    },

    /** ????????? ?????? */
    addSmallCategoryGroup: function() {
        $.get(ctxPath + '/engineer/popup/pPageGroupAdd.do', function(result) {
            HmWindow.open($('#pwindow'), '????????? ??????', result, 300, 150);
        });
    },

    /** ????????? ?????? */
    editSmallCategoryGroup: function() {
        $.get(ctxPath + '/engineer/popup/pPageGroupAdd.do', function(result) {
            HmWindow.open($('#pwindow'), '????????? ??????', result, 300, 150);
        });
    },

    /** ????????? ?????? */
    delSmallCategoryGroup: function() {
        var rowIdxes = HmGrid.getRowIdx($pageGrpGrid);
        if(rowIdxes === false) return;
        var rowdata = $pageGrpGrid.jqxGrid('getrowdata', rowIdxes);

        if(!confirm('[' + rowdata.menuName + '] ??? ?????????????????????????')) return;

        Server.post('/engineer/popup/delPageGroup.do', {
            data: { menuNo: rowdata.menuNo,
                menuPageNo: rowdata.menuPageNo},
            success: function(result) {
                $pageGrpGrid.jqxGrid('deleterow', rowdata.uid);
                alert('?????????????????????.');
            }
        });
    },
    /** ????????? ?????? */
    saveSmallCategoryGroup: function() {
        HmGrid.endRowEdit($pageGrpGrid);
        if(pageGrpIds.length == 0) {
            alert('????????? ???????????? ????????????.');
            return;
        }

        var _list = [];
        $.each(pageGrpIds, function(idx, value) {
            _list.push($pageGrpGrid.jqxGrid('getrowdatabyid', value));
        });

        Server.post('/engineer/popup/savePageGroup.do', {
            data: { list: _list },
            success: function(result) {
                alert('?????????????????????.');
                pageGrpIds = [];
            }
        });
    },

};

// function addDevResult() {
//     HmGrid.updateBoundData($pageGrid);
// }
// function refreshPageGroup() {
//     HmGrid.updateBoundData($pageGrpGrid);
// }
// function refreshMenu() {
//     HmGrid.updateBoundData($menuGrid);
// }
//

$(function() {
    Main.initVariable();
    Main.observe();
    Main.initDesign();
    // Main.initData();
});
