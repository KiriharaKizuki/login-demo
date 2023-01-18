package com.seuwxxh.logindemo.model;

/**
 * @author Kiriharakizuki
**/

public final class Administer extends User {
    private int admActionPointNum;
    private int admActionPoint;

    public Administer() {
    }

    public Administer(int admActionPointNum, int admActionPoint) {
        this.admActionPointNum = admActionPointNum;
        this.admActionPoint = admActionPoint;
    }

    public int getAdmActionPointNum() {
        return admActionPointNum;
    }

    public void setAdmActionPointNum(int admActionPointNum) {
        this.admActionPointNum = admActionPointNum;
    }

    public int getAdmActionPoint() {
        return admActionPoint;
    }

    public void setAdmActionPoint(int admActionPoint) {
        this.admActionPoint = admActionPoint;
    }
}
