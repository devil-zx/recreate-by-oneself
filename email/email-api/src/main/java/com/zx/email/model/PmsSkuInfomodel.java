package com.zx.email.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "pms_sku_info", schema = "gemail", catalog = "")
public class PmsSkuInfomodel {
    private int id;
    private Integer productId;
    private Integer price;
    private String skuName;
    private String skuDesc;
    private BigDecimal weight;
    private Integer tmId;
    private Integer catalog3Id;
    private String skuDefaultImg;

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
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "sku_name")
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    @Basic
    @Column(name = "sku_desc")
    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    @Basic
    @Column(name = "weight")
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "tm_id")
    public Integer getTmId() {
        return tmId;
    }

    public void setTmId(Integer tmId) {
        this.tmId = tmId;
    }

    @Basic
    @Column(name = "catalog3_id")
    public Integer getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Integer catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    @Basic
    @Column(name = "sku_default_img")
    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSkuInfomodel that = (PmsSkuInfomodel) o;
        return id == that.id &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(price, that.price) &&
                Objects.equals(skuName, that.skuName) &&
                Objects.equals(skuDesc, that.skuDesc) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(tmId, that.tmId) &&
                Objects.equals(catalog3Id, that.catalog3Id) &&
                Objects.equals(skuDefaultImg, that.skuDefaultImg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, price, skuName, skuDesc, weight, tmId, catalog3Id, skuDefaultImg);
    }
}
