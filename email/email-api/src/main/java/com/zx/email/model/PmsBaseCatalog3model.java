package com.zx.email.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_base_catalog3", schema = "gemail", catalog = "")
public class PmsBaseCatalog3model {
    private int id;
    private String name;
    private Integer catalog2Id;

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
    @Column(name = "catalog2_id")
    public Integer getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(Integer catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsBaseCatalog3model that = (PmsBaseCatalog3model) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(catalog2Id, that.catalog2Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, catalog2Id);
    }
}
