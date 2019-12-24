package com.zx.email.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "oms_cart_item", schema = "gemail", catalog = "")
public class OmsCartItemmodel {
    private int id;
    private Integer productId;
    private Integer productSkuId;
    private Integer memberId;
    private Integer quantity;
    private Integer price;
    private String sp1;
    private String sp2;
    private String sp3;
    private String productPic;
    private String productName;
    private String productSubTitle;
    private Timestamp createDate;
    private Integer deleteStatus;
    private Integer productCategoryId;
    private String productBrand;
    private String productSn;
    private String productAttr;
    private String cartAllPrice;
    private Integer isChecked;

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
    @Column(name = "product_sku_id")
    public Integer getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Integer productSkuId) {
        this.productSkuId = productSkuId;
    }

    @Basic
    @Column(name = "member_id")
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
    @Column(name = "sp1")
    public String getSp1() {
        return sp1;
    }

    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    @Basic
    @Column(name = "sp2")
    public String getSp2() {
        return sp2;
    }

    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    @Basic
    @Column(name = "sp3")
    public String getSp3() {
        return sp3;
    }

    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    @Basic
    @Column(name = "product_pic")
    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_sub_title")
    public String getProductSubTitle() {
        return productSubTitle;
    }

    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "delete_status")
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Basic
    @Column(name = "product_category_id")
    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Basic
    @Column(name = "product_brand")
    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    @Basic
    @Column(name = "product_sn")
    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    @Basic
    @Column(name = "product_attr")
    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    @Basic
    @Column(name = "cart_all_price")
    public String getCartAllPrice() {
        return cartAllPrice;
    }

    public void setCartAllPrice(String cartAllPrice) {
        this.cartAllPrice = cartAllPrice;
    }

    @Basic
    @Column(name = "is_checked")
    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsCartItemmodel that = (OmsCartItemmodel) o;
        return id == that.id &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(productSkuId, that.productSkuId) &&
                Objects.equals(memberId, that.memberId) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(price, that.price) &&
                Objects.equals(sp1, that.sp1) &&
                Objects.equals(sp2, that.sp2) &&
                Objects.equals(sp3, that.sp3) &&
                Objects.equals(productPic, that.productPic) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productSubTitle, that.productSubTitle) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(deleteStatus, that.deleteStatus) &&
                Objects.equals(productCategoryId, that.productCategoryId) &&
                Objects.equals(productBrand, that.productBrand) &&
                Objects.equals(productSn, that.productSn) &&
                Objects.equals(productAttr, that.productAttr) &&
                Objects.equals(cartAllPrice, that.cartAllPrice) &&
                Objects.equals(isChecked, that.isChecked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, productSkuId, memberId, quantity, price, sp1, sp2, sp3, productPic, productName, productSubTitle, createDate, deleteStatus, productCategoryId, productBrand, productSn, productAttr, cartAllPrice, isChecked);
    }
}
