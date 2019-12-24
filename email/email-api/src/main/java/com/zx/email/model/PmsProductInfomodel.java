package com.zx.email.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_product_info", schema = "gemail", catalog = "")
public class PmsProductInfomodel {
    private int id;
    private String productName;
    private String description;
    private Integer catalog3Id;
    private Integer tmId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "tm_id")
    public Integer getTmId() {
        return tmId;
    }

    public void setTmId(Integer tmId) {
        this.tmId = tmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProductInfomodel that = (PmsProductInfomodel) o;
        return id == that.id &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(catalog3Id, that.catalog3Id) &&
                Objects.equals(tmId, that.tmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, description, catalog3Id, tmId);
    }
}
