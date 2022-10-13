package com.cg.boot.pojo;

public class banEmpty {
    /**
     *班级表实体类
     */
    private Integer banId;
    private Integer yearId;
    private String yearName;
    private Integer zhuanId;
    private String zhuanName;

    public banEmpty(Integer banId, Integer yearId, String yearName, Integer zhuanId, String zhuanName, Integer xiId, String xiName, String banName) {
        this.banId = banId;
        this.yearId = yearId;
        this.yearName = yearName;
        this.zhuanId = zhuanId;
        this.zhuanName = zhuanName;
        this.xiId = xiId;
        this.xiName = xiName;
        this.banName = banName;
    }

    private Integer xiId;
    private String xiName;
    private String banName;



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

    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }

    public Integer getZhuanId() {
        return zhuanId;
    }

    public void setZhuanId(Integer zhuanId) {
        this.zhuanId = zhuanId;
    }

    public Integer getXiId() {
        return xiId;
    }

    public void setXiId(Integer xiId) {
        this.xiId = xiId;
    }

    public String getXiName() {
        return xiName;
    }

    public void setXiName(String xiName) {
        this.xiName = xiName;
    }

    public String getZhuanName() {
        return zhuanName;
    }

    public void setZhuanName(String zhuanName) {
        this.zhuanName = zhuanName;
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
