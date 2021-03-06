package com.zyq.myemptyproject.common.vo;

import java.io.Serializable;

/**
 * 分页返回JSON
 * @author zhangyunqi
 * @date 2019/04/03
 */
public class PageJson<T> implements Serializable{
    /**
     * 总数
     */
    private long total;
    /**
     * 数据
     */
    private Iterable<T> rows;

    public PageJson(long total, Iterable<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Iterable<T> getRows() {
        return rows;
    }

    public void setRows(Iterable<T> rows) {
        this.rows = rows;
    }
}
