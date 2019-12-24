package com.zx.email.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "oms_order", schema = "gemail", catalog = "")
public class OmsOrdermodel {
    private int id;
    private Integer memberId;
    private Integer couponId;
    private String orderSn;
    private Timestamp createTime;
    private String memberUsername;
    private String totalAmount;
    private String payAmount;
    private String freightAmount;
    private String promotionAmount;
    private String integrationAmount;
    private String couponAmount;
    private String discountAmount;
    private Integer payType;
    private Integer sourceType;
    private Integer status;
    private Integer orderType;
    private String deliveryCompany;
    private String deliverySn;
    private String autoConfigDay;
    private String integration;
    private String growth;
    private String promotionInfo;
    private Integer billType;
    private String billHeader;
    private String billContent;
    private String billReceiverPhone;
    private String billReceiverEmail;
    private String receiverName;
    private String receiverPhone;
    private String receiverPostCode;
    private String receiverProvince;
    private String receiverCity;
    private String receiverRegion;
    private String receiverDetailAddress;
    private String note;
    private Integer confirmStatus;
    private Integer deleteStatus;
    private String useIntegration;
    private Timestamp paymentTime;
    private Timestamp deliveryTime;
    private Timestamp receiveTime;
    private Timestamp commentTime;
    private Timestamp modifyTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "coupon_id")
    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    @Basic
    @Column(name = "order_sn")
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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
    @Column(name = "member_username")
    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    @Basic
    @Column(name = "total_amount")
    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Basic
    @Column(name = "pay_amount")
    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    @Basic
    @Column(name = "freight_amount")
    public String getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(String freightAmount) {
        this.freightAmount = freightAmount;
    }

    @Basic
    @Column(name = "promotion_amount")
    public String getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(String promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    @Basic
    @Column(name = "integration_amount")
    public String getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(String integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    @Basic
    @Column(name = "coupon_amount")
    public String getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Basic
    @Column(name = "discount_amount")
    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Basic
    @Column(name = "pay_type")
    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "source_type")
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Basic
    @Column(name = "STATUS")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "order_type")
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "delivery_company")
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    @Basic
    @Column(name = "delivery_sn")
    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    @Basic
    @Column(name = "auto_config_day")
    public String getAutoConfigDay() {
        return autoConfigDay;
    }

    public void setAutoConfigDay(String autoConfigDay) {
        this.autoConfigDay = autoConfigDay;
    }

    @Basic
    @Column(name = "integration")
    public String getIntegration() {
        return integration;
    }

    public void setIntegration(String integration) {
        this.integration = integration;
    }

    @Basic
    @Column(name = "growth")
    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    @Basic
    @Column(name = "promotion_info")
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    @Basic
    @Column(name = "bill_type")
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    @Basic
    @Column(name = "bill_header")
    public String getBillHeader() {
        return billHeader;
    }

    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader;
    }

    @Basic
    @Column(name = "bill_content")
    public String getBillContent() {
        return billContent;
    }

    public void setBillContent(String billContent) {
        this.billContent = billContent;
    }

    @Basic
    @Column(name = "bill_receiver_phone")
    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone;
    }

    @Basic
    @Column(name = "bill_receiver_email")
    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail;
    }

    @Basic
    @Column(name = "receiver_name")
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "receiver_phone")
    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    @Basic
    @Column(name = "receiver_post_code")
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    @Basic
    @Column(name = "receiver_province")
    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    @Basic
    @Column(name = "receiver_city")
    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    @Basic
    @Column(name = "receiver_region")
    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    @Basic
    @Column(name = "receiver_detail_address")
    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "confirm_status")
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
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
    @Column(name = "use_integration")
    public String getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(String useIntegration) {
        this.useIntegration = useIntegration;
    }

    @Basic
    @Column(name = "payment_time")
    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Basic
    @Column(name = "delivery_time")
    public Timestamp getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Timestamp deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Basic
    @Column(name = "receive_time")
    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Basic
    @Column(name = "comment_time")
    public Timestamp getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Timestamp commentTime) {
        this.commentTime = commentTime;
    }

    @Basic
    @Column(name = "modify_time")
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrdermodel that = (OmsOrdermodel) o;
        return id == that.id &&
                Objects.equals(memberId, that.memberId) &&
                Objects.equals(couponId, that.couponId) &&
                Objects.equals(orderSn, that.orderSn) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(memberUsername, that.memberUsername) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(payAmount, that.payAmount) &&
                Objects.equals(freightAmount, that.freightAmount) &&
                Objects.equals(promotionAmount, that.promotionAmount) &&
                Objects.equals(integrationAmount, that.integrationAmount) &&
                Objects.equals(couponAmount, that.couponAmount) &&
                Objects.equals(discountAmount, that.discountAmount) &&
                Objects.equals(payType, that.payType) &&
                Objects.equals(sourceType, that.sourceType) &&
                Objects.equals(status, that.status) &&
                Objects.equals(orderType, that.orderType) &&
                Objects.equals(deliveryCompany, that.deliveryCompany) &&
                Objects.equals(deliverySn, that.deliverySn) &&
                Objects.equals(autoConfigDay, that.autoConfigDay) &&
                Objects.equals(integration, that.integration) &&
                Objects.equals(growth, that.growth) &&
                Objects.equals(promotionInfo, that.promotionInfo) &&
                Objects.equals(billType, that.billType) &&
                Objects.equals(billHeader, that.billHeader) &&
                Objects.equals(billContent, that.billContent) &&
                Objects.equals(billReceiverPhone, that.billReceiverPhone) &&
                Objects.equals(billReceiverEmail, that.billReceiverEmail) &&
                Objects.equals(receiverName, that.receiverName) &&
                Objects.equals(receiverPhone, that.receiverPhone) &&
                Objects.equals(receiverPostCode, that.receiverPostCode) &&
                Objects.equals(receiverProvince, that.receiverProvince) &&
                Objects.equals(receiverCity, that.receiverCity) &&
                Objects.equals(receiverRegion, that.receiverRegion) &&
                Objects.equals(receiverDetailAddress, that.receiverDetailAddress) &&
                Objects.equals(note, that.note) &&
                Objects.equals(confirmStatus, that.confirmStatus) &&
                Objects.equals(deleteStatus, that.deleteStatus) &&
                Objects.equals(useIntegration, that.useIntegration) &&
                Objects.equals(paymentTime, that.paymentTime) &&
                Objects.equals(deliveryTime, that.deliveryTime) &&
                Objects.equals(receiveTime, that.receiveTime) &&
                Objects.equals(commentTime, that.commentTime) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, couponId, orderSn, createTime, memberUsername, totalAmount, payAmount, freightAmount, promotionAmount, integrationAmount, couponAmount, discountAmount, payType, sourceType, status, orderType, deliveryCompany, deliverySn, autoConfigDay, integration, growth, promotionInfo, billType, billHeader, billContent, billReceiverPhone, billReceiverEmail, receiverName, receiverPhone, receiverPostCode, receiverProvince, receiverCity, receiverRegion, receiverDetailAddress, note, confirmStatus, deleteStatus, useIntegration, paymentTime, deliveryTime, receiveTime, commentTime, modifyTime);
    }
}
