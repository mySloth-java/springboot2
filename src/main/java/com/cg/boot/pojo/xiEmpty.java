package com.cg.boot.pojo;

public class xiEmpty {
    /**
     * 系别表实体类
     */

    private Integer xiId;
    private  String xiName;

    public xiEmpty() {
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

    public xiEmpty(Integer xiId, String xiName) {
        this.xiId = xiId;
        this.xiName = xiName;
    }
}
