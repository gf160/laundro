package com.gas.webapp.main.manager.dto;

/**
 * Created by Leeyouje on 2022-10-31.
 */
public class ManagerDto {

    private int grpNo;
    private String grpName;
    private int parentGrpNo;
    private int grpPrice;
    private int useFlag;

    public int getGrpNo() {
        return grpNo;
    }

    public void setGrpNo(int grpNo) {
        this.grpNo = grpNo;
    }

    public String getGrpName() {
        return grpName;
    }

    public void setGrpName(String grpName) {
        this.grpName = grpName;
    }

    public int getParentGrpNo() {
        return parentGrpNo;
    }

    public void setParentGrpNo(int parentGrpNo) {
        this.parentGrpNo = parentGrpNo;
    }

    public int getGrpPrice() {
        return grpPrice;
    }

    public void setGrpPrice(int grpPrice) {
        this.grpPrice = grpPrice;
    }

    public int getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(int useFlag) {
        this.useFlag = useFlag;
    }
}
