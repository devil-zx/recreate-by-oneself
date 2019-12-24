package com.zx.email.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pms_comment", schema = "gemail", catalog = "")
public class PmsCommentmodel {
    private int id;
    private Integer productId;
    private String memberNickName;
    private String productName;
    private String star;
    private String memberIp;
    private Timestamp createTime;
    private String showStatus;
    private String productAttribute;
    private Integer collectCount;
    private Integer readCount;
    private String pics;
    private String memberIcon;
    private Integer replayCount;
    private String content;

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
    @Column(name = "member_nick_name")
    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
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
    @Column(name = "star")
    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    @Basic
    @Column(name = "member_ip")
    public String getMemberIp() {
        return memberIp;
    }

    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
    @Column(name = "product_attribute")
    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    @Basic
    @Column(name = "collect_count")
    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    @Basic
    @Column(name = "read_count")
    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @Basic
    @Column(name = "pics")
    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    @Basic
    @Column(name = "member_icon")
    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    @Basic
    @Column(name = "replay_count")
    public Integer getReplayCount() {
        return replayCount;
    }

    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsCommentmodel that = (PmsCommentmodel) o;
        return id == that.id &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(memberNickName, that.memberNickName) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(star, that.star) &&
                Objects.equals(memberIp, that.memberIp) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(showStatus, that.showStatus) &&
                Objects.equals(productAttribute, that.productAttribute) &&
                Objects.equals(collectCount, that.collectCount) &&
                Objects.equals(readCount, that.readCount) &&
                Objects.equals(pics, that.pics) &&
                Objects.equals(memberIcon, that.memberIcon) &&
                Objects.equals(replayCount, that.replayCount) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, memberNickName, productName, star, memberIp, createTime, showStatus, productAttribute, collectCount, readCount, pics, memberIcon, replayCount, content);
    }
}
