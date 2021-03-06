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
@Table(name = "operation_permission_relation")
public class Operation_Permission_Relation implements Serializable {


    private static final long serialVersionUID = 5868377347280580919L;


    /**
     * 关联关系id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /**
     * 权限ID
     */
    @Column(name = "permission_id")
    private Long permissionId;

    /**
     * 角色ID
     */
    @Column(name = "operation_id")
    private Long operationId;

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

    public Operation_Permission_Relation() {
        super();
    }

    public Operation_Permission_Relation(Long id, Long permissionId, Long operationId, Date gmtCreateTime, Date gmtUpdateTime) {
        this.id = id;
        this.permissionId = permissionId;
        this.operationId = operationId;
        this.gmtCreateTime = gmtCreateTime;
        this.gmtUpdateTime = gmtUpdateTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPermissionId() {
        return this.permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public Long getOperationId() {
        return this.operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
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
