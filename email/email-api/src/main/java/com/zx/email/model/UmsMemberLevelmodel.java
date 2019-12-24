package com.zx.email.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ums_member_level", schema = "gemail", catalog = "")
public class UmsMemberLevelmodel {
    private int id;
    private String name;
    private String growthPoint;
    private Integer defaultStatus;
    private String freeFreightPoint;
    private String commentGrowthPoint;
    private Integer priviledgeFreeFreight;
    private String priviledgeSignIn;
    private String priviledgeComment;
    private String priviledgePromotion;
    private BigDecimal priviledgeMemberPrice;
    private Timestamp priviledgeBirthday;
    private String note;

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
    @Column(name = "growth_point")
    public String getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(String growthPoint) {
        this.growthPoint = growthPoint;
    }

    @Basic
    @Column(name = "default_status")
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    @Basic
    @Column(name = "free_freight_point")
    public String getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(String freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    @Basic
    @Column(name = "comment_growth_point")
    public String getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(String commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    @Basic
    @Column(name = "priviledge_free_freight")
    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    @Basic
    @Column(name = "priviledge_sign_in")
    public String getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(String priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    @Basic
    @Column(name = "priviledge_comment")
    public String getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(String priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    @Basic
    @Column(name = "priviledge_promotion")
    public String getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(String priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    @Basic
    @Column(name = "priviledge_member_price")
    public BigDecimal getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(BigDecimal priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    @Basic
    @Column(name = "priviledge_birthday")
    public Timestamp getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Timestamp priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UmsMemberLevelmodel that = (UmsMemberLevelmodel) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(growthPoint, that.growthPoint) &&
                Objects.equals(defaultStatus, that.defaultStatus) &&
                Objects.equals(freeFreightPoint, that.freeFreightPoint) &&
                Objects.equals(commentGrowthPoint, that.commentGrowthPoint) &&
                Objects.equals(priviledgeFreeFreight, that.priviledgeFreeFreight) &&
                Objects.equals(priviledgeSignIn, that.priviledgeSignIn) &&
                Objects.equals(priviledgeComment, that.priviledgeComment) &&
                Objects.equals(priviledgePromotion, that.priviledgePromotion) &&
                Objects.equals(priviledgeMemberPrice, that.priviledgeMemberPrice) &&
                Objects.equals(priviledgeBirthday, that.priviledgeBirthday) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, growthPoint, defaultStatus, freeFreightPoint, commentGrowthPoint, priviledgeFreeFreight, priviledgeSignIn, priviledgeComment, priviledgePromotion, priviledgeMemberPrice, priviledgeBirthday, note);
    }
}
