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
@Table(name = "menu")
public class Menu implements Serializable {


    private static final long serialVersionUID = 3136764855614879350L;


    /**
     * 权限id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * 权限名称
     */
    @Column(name = "menu_name")
    private String menuName;

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
     * 权限描述
     */
    @Column(name = "menu_description")
    private String menuDescription;

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

    public Menu() {
        super();
    }

    public Menu(Long id, String menuName, Long parentId, String url, String menuDescription, Date gmtCreateTime, Date gmtUpdateTime) {
        this.id = id;
        this.menuName = menuName;
        this.parentId = parentId;
        this.url = url;
        this.menuDescription = menuDescription;
        this.gmtCreateTime = gmtCreateTime;
        this.gmtUpdateTime = gmtUpdateTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return this.menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
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

    public String getMenuDescription() {
        return this.menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
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
