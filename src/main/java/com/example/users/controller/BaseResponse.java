package com.example.users.controller;

import java.util.List;

public class BaseResponse<T> {
    private int code;
    private String message;
    private List<T> data;

    public BaseResponse(int code, String message, List<T> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // getters and setters
    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public List<T> getData() { return data; }
    public void setData(List<T> data) { this.data = data; }
}
