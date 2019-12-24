package com.zx.email.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_sku_image", schema = "gemail", catalog = "")
public class PmsSkuImagemodel {
    private int id;
    private Integer skuId;
    private String imgName;
    private String imgUrl;
    private Integer productImgId;
    private String isDefault;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sku_id")
    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    @Basic
    @Column(name = "img_name")
    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    @Basic
    @Column(name = "img_url")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "product_img_id")
    public Integer getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Integer productImgId) {
        this.productImgId = productImgId;
    }

    @Basic
    @Column(name = "is_default")
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSkuImagemodel that = (PmsSkuImagemodel) o;
        return id == that.id &&
                Objects.equals(skuId, that.skuId) &&
                Objects.equals(imgName, that.imgName) &&
                Objects.equals(imgUrl, that.imgUrl) &&
                Objects.equals(productImgId, that.productImgId) &&
                Objects.equals(isDefault, that.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skuId, imgName, imgUrl, productImgId, isDefault);
    }
}
