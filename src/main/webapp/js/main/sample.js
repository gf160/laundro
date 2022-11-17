/**
 * Created by Leeyouje on 2022-10-31.
 */
var Main ={
    initVariable: function () {},

    /** add event */
    observe: function () {
        $('button').bind('click', function (event) {
            Main.eventControl(event);
        });
    },

    eventControl: function (event) {
        var curTarget = event.currentTarget;
        switch (curTarget.id) {
            case "btnSearch":
                this.search();
                break;
        }//switch
    },
    initDesign: function(){},
    initData: function(){},
    search: function(){}
};

$(function(){
    Main.initVariable();
    Main.initDesign();
    Main.initData();
});