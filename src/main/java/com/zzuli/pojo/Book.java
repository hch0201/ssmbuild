package com.zzuli.pojo;

public class Book {
    private Integer bId;

    private String bName;

    private Integer bCounts;

    private String bDetail;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public Integer getbCounts() {
        return bCounts;
    }

    public void setbCounts(Integer bCounts) {
        this.bCounts = bCounts;
    }

    public String getbDetail() {
        return bDetail;
    }

    public void setbDetail(String bDetail) {
        this.bDetail = bDetail == null ? null : bDetail.trim();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", bCounts=" + bCounts +
                ", bDetail='" + bDetail + '\'' +
                '}';
    }
}