package com.zx.email.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_product_sale_attr_value", schema = "gemail", catalog = "")
public class PmsProductSaleAttrValuemodel {
    private int id;
    private Integer productId;
    private Integer saleAttrId;
    private String saleAttrValueName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_id")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "sale_attr_id")
    public Integer getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Integer saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    @Basic
    @Column(name = "sale_attr_value_name")
    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProductSaleAttrValuemodel that = (PmsProductSaleAttrValuemodel) o;
        return id == that.id &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(saleAttrId, that.saleAttrId) &&
                Objects.equals(saleAttrValueName, that.saleAttrValueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, saleAttrId, saleAttrValueName);
    }
}
