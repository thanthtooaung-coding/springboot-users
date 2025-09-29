package com.example.users.controller;

import java.util.List;

public class BaseResponseWithPagination<T> extends BaseResponse<T> {
    private Pagination pagination;

    public BaseResponseWithPagination(int code, String message, List<T> data, Pagination pagination) {
        super(code, message, data);
        this.pagination = pagination;
    }

    // getter and setter
    public Pagination getPagination() { return pagination; }
    public void setPagination(Pagination pagination) { this.pagination = pagination; }
}
