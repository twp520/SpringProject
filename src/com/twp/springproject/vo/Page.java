package com.twp.springproject.vo;

public class Page {

    private Integer pageIndex = 1;

    private Integer pageSize = 3;

    private Integer startIndex = (pageIndex - 1) * pageSize;

    private Integer count;

    private Integer totalPage;

    public Page() {
    }

    public Page(Integer pageIndex, Integer pageSize) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartIndex() {
        startIndex = (pageIndex - 1) * pageSize;
        return startIndex;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotalPage() {
        totalPage = Math.round((float) count / (float) pageSize);
        return totalPage;
    }

}
