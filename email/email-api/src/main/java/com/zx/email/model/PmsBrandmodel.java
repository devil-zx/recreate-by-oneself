package com.zx.email.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_brand", schema = "gemail", catalog = "")
public class PmsBrandmodel {
    private int id;
    private String name;
    private String firstLetter;
    private String sort;
    private String factoryStatus;
    private String showStatus;
    private Integer productCount;
    private Integer productCommentCount;
    private String logo;
    private String bigPic;
    private String brandStory;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "first_letter")
    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    @Basic
    @Column(name = "sort")
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "factory_status")
    public String getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(String factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    @Basic
    @Column(name = "show_status")
    public String getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(String showStatus) {
        this.showStatus = showStatus;
    }

    @Basic
    @Column(name = "product_count")
    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @Basic
    @Column(name = "product_comment_count")
    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    @Basic
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "big_pic")
    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    @Basic
    @Column(name = "brand_story")
    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsBrandmodel that = (PmsBrandmodel) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(firstLetter, that.firstLetter) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(factoryStatus, that.factoryStatus) &&
                Objects.equals(showStatus, that.showStatus) &&
                Objects.equals(productCount, that.productCount) &&
                Objects.equals(productCommentCount, that.productCommentCount) &&
                Objects.equals(logo, that.logo) &&
                Objects.equals(bigPic, that.bigPic) &&
                Objects.equals(brandStory, that.brandStory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, firstLetter, sort, factoryStatus, showStatus, productCount, productCommentCount, logo, bigPic, brandStory);
    }
}
