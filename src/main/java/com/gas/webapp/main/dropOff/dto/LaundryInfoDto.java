package com.gas.webapp.main.dropOff.dto;

public class LaundryInfoDto {
    private long userNo;
    private long seqNo;
    private String clothType;
    private long clothGrpNo;
    private long clothSubGrpNo;
    private String repairText;

    public long getUserNo() {
        return userNo;
    }

    public void setUserNo(long userNo) {
        this.userNo = userNo;
    }

    public long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }

    public String getClothType() {
        return clothType;
    }

    public void setClothType(String clothType) {
        this.clothType = clothType;
    }

    public long getClothGrpNo() {
        return clothGrpNo;
    }

    public void setClothGrpNo(long clothGrpNo) {
        this.clothGrpNo = clothGrpNo;
    }

    public long getClothSubGrpNo() {
        return clothSubGrpNo;
    }

    public void setClothSubGrpNo(long clothSubGrpNo) {
        this.clothSubGrpNo = clothSubGrpNo;
    }

    public String getRepairText() {
        return repairText;
    }

    public void setRepairText(String repairText) {
        this.repairText = repairText;
    }
}
