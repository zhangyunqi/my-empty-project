package com.zyq.myemptyproject.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * generated by Generate POJOs.groovy
 * <p>Date: Fri Mar 22 16:46:41 CST 2019.</p>
 *
 * @author zhangyq
 */
@Entity
@Table(name = "operation")
public class Operation implements Serializable {


    private static final long serialVersionUID = 4115454745270900994L;


    /**
     * 权限id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /**
     * 权限名称
     */
    @Column(name = "operation_name")
    private String operationName;

    /**
     * 父菜单ID
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * URL
     */
    @Column(name = "url")
    private String url;

    /**
     * 操作编码
     */
    @Column(name = "code")
    private String code;

    /**
     * 权限描述
     */
    @Column(name = "operation_description")
    private String operationDescription;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create_time")
    private Date gmtCreateTime;

    /**
     * 更新时间
     */
    @Column(name = "gmt_update_time")
    private Date gmtUpdateTime;

    public Operation() {
        super();
    }

    public Operation(Long id, String operationName, Long parentId, String url, String code, String operationDescription, Date gmtCreateTime, Date gmtUpdateTime) {
        this.id = id;
        this.operationName = operationName;
        this.parentId = parentId;
        this.url = url;
        this.code = code;
        this.operationDescription = operationDescription;
        this.gmtCreateTime = gmtCreateTime;
        this.gmtUpdateTime = gmtUpdateTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationName() {
        return this.operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOperationDescription() {
        return this.operationDescription;
    }

    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    public Date getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public void setGmtCreateTime(Date gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
    }

    public Date getGmtUpdateTime() {
        return this.gmtUpdateTime;
    }

    public void setGmtUpdateTime(Date gmtUpdateTime) {
        this.gmtUpdateTime = gmtUpdateTime;
    }

}
