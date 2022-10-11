package com.cg.boot.pojo;

public class yearEmpty {
    /**
     * 年级表实体类
     */
    private Integer yearId;
    private String yearName;

    public yearEmpty() {
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

    public yearEmpty(Integer yearId, String yearName) {
        this.yearId = yearId;
        this.yearName = yearName;
    }
}
