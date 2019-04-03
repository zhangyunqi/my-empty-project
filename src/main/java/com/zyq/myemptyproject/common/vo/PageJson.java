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
    private Integer total;
    /**
     * 数据
     */
    private Iterable<T> rows;

    public PageJson(Integer total, Iterable<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Iterable<T> getRows() {
        return rows;
    }

    public void setRows(Iterable<T> rows) {
        this.rows = rows;
    }
}
