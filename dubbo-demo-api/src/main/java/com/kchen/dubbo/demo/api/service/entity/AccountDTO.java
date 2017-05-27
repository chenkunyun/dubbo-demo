package com.kchen.dubbo.demo.api.service.entity;

/**
 * Created by kchen on 2017/5/24.
 */
public class AccountDTO {

    private Long userId;
    private String userName;
    private String phone;
    private String email;

    public AccountDTO() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
