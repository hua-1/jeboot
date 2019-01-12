package com.example.jeboot.entity;

import com.example.jeboot.base.BaseEntity;

import java.util.Date;

public class TCcoreIdentity extends BaseEntity{
    private Long oid;

    private String name;

    private String number;

    private String typeCode;

    private Date effectiveDate;

    private Date expiredDate;

    private String obverseSidePicture;

    private String reverseSidePicture;

    private String createBy;

    private Date createTimestamp;

    private String updateBy;

    private Date updateTimestamp;

    private Integer version;

    private Boolean active;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getObverseSidePicture() {
        return obverseSidePicture;
    }

    public void setObverseSidePicture(String obverseSidePicture) {
        this.obverseSidePicture = obverseSidePicture == null ? null : obverseSidePicture.trim();
    }

    public String getReverseSidePicture() {
        return reverseSidePicture;
    }

    public void setReverseSidePicture(String reverseSidePicture) {
        this.reverseSidePicture = reverseSidePicture == null ? null : reverseSidePicture.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}