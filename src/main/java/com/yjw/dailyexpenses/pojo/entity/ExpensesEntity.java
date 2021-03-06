/**
 * hxgy Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.yjw.dailyexpenses.pojo.entity;

import java.util.Date;

/**
 * 日常开销实体类
 * 
 * @author YangJianWei
 * @version $Id: ExpensesEntity.java, v 0.1 2018年10月9日 下午1:47:57 YangJianWei Exp $
 */
public class ExpensesEntity {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 外键人物id
     */
    private Integer personId;

    /**
     * 物品名称
     */
    private String  name;

    /**
     * 数量
     */
    private String  quantity;

    /**
     * 单价
     */
    private Double  price;

    /**
     * 金额（数量×单价）
     */
    private Double  amount;

    /**
     * 创建时间
     */
    private Date    createTime;

    /**
     * 修改时间
     */
    private Date    updateTime;

    /**
     * Getter method for property <tt>id</tt>.
     * 
     * @return property value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     * 
     * @param id value to be assigned to property id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>personId</tt>.
     * 
     * @return property value of personId
     */
    public Integer getPersonId() {
        return personId;
    }

    /**
     * Setter method for property <tt>personId</tt>.
     * 
     * @param personId value to be assigned to property personId
     */
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>quantity</tt>.
     * 
     * @return property value of quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Setter method for property <tt>quantity</tt>.
     * 
     * @param quantity value to be assigned to property quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter method for property <tt>price</tt>.
     * 
     * @return property value of price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Setter method for property <tt>price</tt>.
     * 
     * @param price value to be assigned to property price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Getter method for property <tt>amount</tt>.
     * 
     * @return property value of amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Setter method for property <tt>amount</tt>.
     * 
     * @param amount value to be assigned to property amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Getter method for property <tt>createTime</tt>.
     * 
     * @return property value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createTime</tt>.
     * 
     * @param createTime value to be assigned to property createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter method for property <tt>updateTime</tt>.
     * 
     * @return property value of updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter method for property <tt>updateTime</tt>.
     * 
     * @param updateTime value to be assigned to property updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ExpensesEntity [id=" + id + ", personId=" + personId + ", name=" + name
               + ", quantity=" + quantity + ", price=" + price + ", amount=" + amount
               + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
    }

}
