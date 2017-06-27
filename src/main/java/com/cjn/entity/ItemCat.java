package com.cjn.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ItemCat implements Serializable {

    private static final long serialVersionUID = -1833671061583853780L;

    private BigDecimal id;

    private BigDecimal parentId;

    private String name;

    private BigDecimal status;

    private BigDecimal sortOrder;

    private BigDecimal isParent;

    private Date created;

    private Date updated;

    private List children;

    //业务字段
    private String state = "closed";// open,closed

//*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemCat)) return false;

        ItemCat itemCat = (ItemCat) o;

        if (!getId().equals(itemCat.getId())) return false;
        if (!getParentId().equals(itemCat.getParentId())) return false;
        if (!getName().equals(itemCat.getName())) return false;
        if (!getStatus().equals(itemCat.getStatus())) return false;
        if (!getSortOrder().equals(itemCat.getSortOrder())) return false;
        if (!getIsParent().equals(itemCat.getIsParent())) return false;
        if (!getCreated().equals(itemCat.getCreated())) return false;
        return getUpdated().equals(itemCat.getUpdated());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getParentId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getStatus().hashCode();
        result = 31 * result + getSortOrder().hashCode();
        result = 31 * result + getIsParent().hashCode();
        result = 31 * result + getCreated().hashCode();
        result = 31 * result + getUpdated().hashCode();
        return result;
    }

    public ItemCat() {
    }

    public ItemCat(BigDecimal id, BigDecimal parentId, String name, BigDecimal status, BigDecimal sortOrder, BigDecimal isParent, Date created, Date updated) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.status = status;
        this.sortOrder = sortOrder;
        this.isParent = isParent;
        this.created = created;
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "ItemCat{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", sortOrder=" + sortOrder +
                ", isParent=" + isParent +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getParentId() {
        return parentId;
    }

    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(BigDecimal sortOrder) {
        this.sortOrder = sortOrder;
    }

    public BigDecimal getIsParent() {
        return isParent;
    }

    public void setIsParent(BigDecimal isParent) {
        this.isParent = isParent;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}