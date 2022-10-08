package com.cg.boot.pojo;

public class classUser {
    /**
     * 班级学生表实体类
     */

    private Integer classId;
    private String className;
    private String classSex;
    private Integer classAge;
    private Double classMark;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassSex() {
        return classSex;
    }

    public void setClassSex(String classSex) {
        this.classSex = classSex;
    }

    public Integer getClassAge() {
        return classAge;
    }

    public void setClassAge(Integer classAge) {
        this.classAge = classAge;
    }

    public Double getClassMark() {
        return classMark;
    }

    public void setClassMark(Double classMark) {
        this.classMark = classMark;
    }

    public classUser() {
    }

    public classUser(Integer classId, String className, String classSex, Integer classAge, Double classMark) {
        this.classId = classId;
        this.className = className;
        this.classSex = classSex;
        this.classAge = classAge;
        this.classMark = classMark;
    }
}
