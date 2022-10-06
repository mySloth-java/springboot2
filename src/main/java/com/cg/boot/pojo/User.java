package com.cg.boot.pojo;

public class User {
    /**
     * 用户登录实体类
     */
    private String logName;
    private String logPassword;

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getLogPassword() {
        return logPassword;
    }

    public void setLogPassword(String logPassword) {
        this.logPassword = logPassword;
    }

    public User() {
    }

    public User(String logName, String logPassword) {
        this.logName = logName;
        this.logPassword = logPassword;
    }
}
