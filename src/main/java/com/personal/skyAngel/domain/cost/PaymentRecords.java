package com.personal.skyAngel.domain.cost;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.personal.skyAngel.domain.base.CommonEnum.PaymentStatus;
import com.personal.skyAngel.domain.base.CommonEnum.PaymentType;
import com.personal.skyAngel.domain.base.IdBestEntity;

@Entity
@Table(name = "pament_records")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "pament_records_sequence")
public class PaymentRecords extends IdBestEntity {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /** 缴费记录编号 */
    private String paymentNumber;

    /** 缴费时间 */
    private Date paymentTime;

    /** 缴费幼儿 */
    private Student student;

    /** 缴费状态（一次性交清、未缴费、部分缴费） */
    private PaymentStatus paymentStatus;

    /** 操作员姓名 */
    private String operater;

    /** 缴费金额 */
    private BigDecimal paymentAmount;

    /** 费用明细 */
    private Cost cost;

    /** 缴费--学期 */
    private Semester semester;

    /** 缴费方式（现金收讫、微信支付、支付宝支付、银联支付） */
    private PaymentType paymentType;

    public PaymentRecords() {
    }

    public PaymentRecords(String paymentNumber, Date paymentTime, Student student, PaymentStatus paymentStatus,
            String operater, BigDecimal paymentAmount, Cost cost, Semester semester, PaymentType paymentType) {
        super();
        this.paymentNumber = paymentNumber;
        this.paymentTime = paymentTime;
        this.student = student;
        this.paymentStatus = paymentStatus;
        this.operater = operater;
        this.paymentAmount = paymentAmount;
        this.cost = cost;
        this.semester = semester;
        this.paymentType = paymentType;
    }

    @JsonProperty
    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    @JsonProperty
    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    @JsonProperty
    @ManyToOne()
    @JoinColumn
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @JsonProperty
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @JsonProperty
    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    @JsonProperty
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @JsonProperty
    @OneToOne
    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    @JsonProperty
    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    @JsonProperty
    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

}
