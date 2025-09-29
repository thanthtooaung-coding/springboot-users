package com.example.users.controller;

public class Pagination {
    private int currentPage;
    private int total;
    private int pageSize;

    public Pagination(int currentPage, int total, int pageSize) {
        this.currentPage = currentPage;
        this.total = total;
        this.pageSize = pageSize;
    }

    // getters and setters
    public int getCurrentPage() { return currentPage; }
    public void setCurrentPage(int currentPage) { this.currentPage = currentPage; }

    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }

    public int getPageSize() { return pageSize; }
    public void setPageSize(int pageSize) { this.pageSize = pageSize; }
}
