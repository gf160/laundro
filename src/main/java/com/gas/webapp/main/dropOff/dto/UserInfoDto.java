package com.gas.webapp.main.dropOff.dto;

public class UserInfoDto {
    private long userNo;
    private String userName;
    private String userNumber;
    private String userAddress;
    private double lat;
    private double lng;
    private String memo;
    private String storeDate;
    private long storeImgNo;
    private String dueDate;
    private int totalCnt;
    private long totalPrice;
    private int takeOffType;
    private String takeOffDate;
    private long takeOffImgNo;

    public long getUserNo() {
        return userNo;
    }

    public void setUserNo(long userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getStoreDate() {
        return storeDate;
    }

    public void setStoreDate(String storeDate) {
        this.storeDate = storeDate;
    }

    public long getStoreImgNo() {
        return storeImgNo;
    }

    public void setStoreImgNo(long storeImgNo) {
        this.storeImgNo = storeImgNo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(int totalCnt) {
        this.totalCnt = totalCnt;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTakeOffType() {
        return takeOffType;
    }

    public void setTakeOffType(int takeOffType) {
        this.takeOffType = takeOffType;
    }

    public String getTakeOffDate() {
        return takeOffDate;
    }

    public void setTakeOffDate(String takeOffDate) {
        this.takeOffDate = takeOffDate;
    }

    public long getTakeOffImgNo() {
        return takeOffImgNo;
    }

    public void setTakeOffImgNo(long takeOffImgNo) {
        this.takeOffImgNo = takeOffImgNo;
    }
}
