package com.zx.email.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wms_ware_order_task", schema = "gemail", catalog = "")
public class WmsWareOrderTaskmodel {
    private int id;
    private Integer orderId;
    private String consignee;
    private String consigneeTel;
    private String consigneeAddress;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_id")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "consignee")
    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    @Basic
    @Column(name = "consignee_tel")
    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    @Basic
    @Column(name = "consignee_address")
    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WmsWareOrderTaskmodel that = (WmsWareOrderTaskmodel) o;
        return id == that.id &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(consignee, that.consignee) &&
                Objects.equals(consigneeTel, that.consigneeTel) &&
                Objects.equals(consigneeAddress, that.consigneeAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, consignee, consigneeTel, consigneeAddress);
    }
}
