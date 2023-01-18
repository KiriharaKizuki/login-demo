package com.seuwxxh.logindemo.model;

/**
 * @author Kiriharakizuki
**/

public final class Student extends User {
    private int userCommentPoint;
    private int userCommentPointNum;
    private int userHistoryPoint;
    private int userHistoryPointNum;
    private int userCommentReply;
    private int userCommentReplyNum;

    public Student() {
    }

    public Student(int userCommentPoint, int userCommentPointNum, int userHistoryPoint, int userHistoryPointNum, int userCommentReply, int userCommentReplyNum) {
        this.userCommentPoint = userCommentPoint;
        this.userCommentPointNum = userCommentPointNum;
        this.userHistoryPoint = userHistoryPoint;
        this.userHistoryPointNum = userHistoryPointNum;
        this.userCommentReply = userCommentReply;
        this.userCommentReplyNum = userCommentReplyNum;
    }

    public int getUserCommentPoint() {
        return userCommentPoint;
    }

    public void setUserCommentPoint(int userCommentPoint) {
        this.userCommentPoint = userCommentPoint;
    }

    public int getUserCommentPointNum() {
        return userCommentPointNum;
    }

    public void setUserCommentPointNum(int userCommentPointNum) {
        this.userCommentPointNum = userCommentPointNum;
    }

    public int getUserHistoryPoint() {
        return userHistoryPoint;
    }

    public void setUserHistoryPoint(int userHistoryPoint) {
        this.userHistoryPoint = userHistoryPoint;
    }

    public int getUserHistoryPointNum() {
        return userHistoryPointNum;
    }

    public void setUserHistoryPointNum(int userHistoryPointNum) {
        this.userHistoryPointNum = userHistoryPointNum;
    }

    public int getUserCommentReply() {
        return userCommentReply;
    }

    public void setUserCommentReply(int userCommentReply) {
        this.userCommentReply = userCommentReply;
    }

    public int getUserCommentReplyNum() {
        return userCommentReplyNum;
    }

    public void setUserCommentReplyNum(int userCommentReplyNum) {
        this.userCommentReplyNum = userCommentReplyNum;
    }
}
