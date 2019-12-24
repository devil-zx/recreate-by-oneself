package com.zx.email.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_sku_attr_value", schema = "gemail", catalog = "")
public class PmsSkuAttrValuemodel {
    private int id;
    private Integer attrId;
    private Integer valueId;
    private Integer skuId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attr_id")
    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    @Basic
    @Column(name = "value_id")
    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    @Basic
    @Column(name = "sku_id")
    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSkuAttrValuemodel that = (PmsSkuAttrValuemodel) o;
        return id == that.id &&
                Objects.equals(attrId, that.attrId) &&
                Objects.equals(valueId, that.valueId) &&
                Objects.equals(skuId, that.skuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attrId, valueId, skuId);
    }
}
