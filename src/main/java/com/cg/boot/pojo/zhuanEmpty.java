package com.cg.boot.pojo;

public class zhuanEmpty {
    /**
     * 专业实体类
     */
    private Integer zhuanId;
    private Integer xiId;

    private String xiName;
    private String zhuanName;

    public zhuanEmpty() {
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

    public zhuanEmpty(Integer zhuanId, Integer xiId, String xiName, String zhuanName) {
        this.zhuanId = zhuanId;
        this.xiId = xiId;
        this.xiName = xiName;
        this.zhuanName = zhuanName;
    }
}
