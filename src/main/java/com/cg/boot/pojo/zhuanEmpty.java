package com.cg.boot.pojo;

public class zhuanEmpty {
    /**
     * 专业表实体类
     */
    private Integer zhuanId;
    private Integer xiId;
    private String zhuanName;

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

    public String getZhuanName() {
        return zhuanName;
    }

    public void setZhuanName(String zhuanName) {
        this.zhuanName = zhuanName;
    }

    public zhuanEmpty() {
    }

    public zhuanEmpty(Integer zhuanId, Integer xiId, String zhuanName) {
        this.zhuanId = zhuanId;
        this.xiId = xiId;
        this.zhuanName = zhuanName;
    }
}
