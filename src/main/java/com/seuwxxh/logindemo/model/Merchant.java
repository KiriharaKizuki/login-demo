package com.seuwxxh.logindemo.model;

/**
 * @author Kiriharakizuki
**/

public final class Merchant extends User{
    private String userShopTelephone;
    private int userShopPointNum;
    private int userShopPoint;

    public Merchant() {
    }

    public Merchant(String userShopTelephone, int userShopPointNum, int userShopPoint) {
        this.userShopTelephone = userShopTelephone;
        this.userShopPointNum = userShopPointNum;
        this.userShopPoint = userShopPoint;
    }

    public String getUserShopTelephone() {
        return userShopTelephone;
    }

    public void setUserShopTelephone(String userShopTelephone) {
        this.userShopTelephone = userShopTelephone;
    }

    public int getUserShopPointNum() {
        return userShopPointNum;
    }

    public void setUserShopPointNum(int userShopPointNum) {
        this.userShopPointNum = userShopPointNum;
    }

    public int getUserShopPoint() {
        return userShopPoint;
    }

    public void setUserShopPoint(int userShopPoint) {
        this.userShopPoint = userShopPoint;
    }
}
