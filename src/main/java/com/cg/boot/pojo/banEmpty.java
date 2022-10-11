package com.cg.boot.pojo;

public class banEmpty {
    /**
     * 班级表实体类
     */

    private Integer banId;
    private Integer yearId;
    private Integer zhuanId;
    private String banName;

    public banEmpty(Integer banId, Integer yearId, Integer zhuanId, String banName) {
        this.banId = banId;
        this.yearId = yearId;
        this.zhuanId = zhuanId;
        this.banName = banName;
    }

    public Integer getBanId() {
        return banId;
    }

    public void setBanId(Integer banId) {
        this.banId = banId;
    }

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public Integer getZhuanId() {
        return zhuanId;
    }

    public void setZhuanId(Integer zhuanId) {
        this.zhuanId = zhuanId;
    }

    public String getBanName() {
        return banName;
    }

    public void setBanName(String banName) {
        this.banName = banName;
    }

    public banEmpty() {
    }
}
