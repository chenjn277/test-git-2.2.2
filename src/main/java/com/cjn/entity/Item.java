package com.cjn.entity;

import cjn.entity.ItemCat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Item implements Serializable {

    private static final long serialVersionUID = -7939343502778783286L;

    private BigDecimal id;

    private String title;

    private String sellPoint;

    private BigDecimal price;

    private Long num;

    private String barcode;

    private String image;

    private Long cid;

    private Long status;

    private Date created;

    private Date updated;

    //业务字段

    private String order;

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    private ItemCat itemCat;

    private BigDecimal  minprice;

    private BigDecimal  maxprice;

//*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (!getId().equals(item.getId())) return false;
        if (!getTitle().equals(item.getTitle())) return false;
        if (!getSellPoint().equals(item.getSellPoint())) return false;
        if (!getPrice().equals(item.getPrice())) return false;
        if (!getNum().equals(item.getNum())) return false;
        if (!getBarcode().equals(item.getBarcode())) return false;
        if (!getImage().equals(item.getImage())) return false;
        if (!getCid().equals(item.getCid())) return false;
        if (!getStatus().equals(item.getStatus())) return false;
        if (!getCreated().equals(item.getCreated())) return false;
        if (!getUpdated().equals(item.getUpdated())) return false;
        if (!getItemCat().equals(item.getItemCat())) return false;
        if (!getMinprice().equals(item.getMinprice())) return false;
        return getMaxprice().equals(item.getMaxprice());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getSellPoint().hashCode();
        result = 31 * result + getPrice().hashCode();
        result = 31 * result + getNum().hashCode();
        result = 31 * result + getBarcode().hashCode();
        result = 31 * result + getImage().hashCode();
        result = 31 * result + getCid().hashCode();
        result = 31 * result + getStatus().hashCode();
        result = 31 * result + getCreated().hashCode();
        result = 31 * result + getUpdated().hashCode();
        result = 31 * result + getItemCat().hashCode();
        result = 31 * result + getMinprice().hashCode();
        result = 31 * result + getMaxprice().hashCode();
        return result;
    }

    public Item() {
    }

    public Item(BigDecimal id, String title, String sellPoint, BigDecimal price, Long num, String barcode, String image, Long cid, Long status, Date created, Date updated, ItemCat itemCat, BigDecimal minprice, BigDecimal maxprice) {
        this.id = id;
        this.title = title;
        this.sellPoint = sellPoint;
        this.price = price;
        this.num = num;
        this.barcode = barcode;
        this.image = image;
        this.cid = cid;
        this.status = status;
        this.created = created;
        this.updated = updated;
        this.itemCat = itemCat;
        this.minprice = minprice;
        this.maxprice = maxprice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sellPoint='" + sellPoint + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", barcode='" + barcode + '\'' +
                ", image='" + image + '\'' +
                ", cid=" + cid +
                ", status=" + status +
                ", created=" + created +
                ", updated=" + updated +
                ", itemCat=" + itemCat +
                ", minprice=" + minprice +
                ", maxprice=" + maxprice +
                '}';
    }

    public ItemCat getItemCat() {
        return itemCat;
    }

    public void setItemCat(ItemCat itemCat) {
        this.itemCat = itemCat;
    }

    public BigDecimal getMinprice() {
        return minprice;
    }

    public void setMinprice(BigDecimal minprice) {
        this.minprice = minprice;
    }

    public BigDecimal getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(BigDecimal maxprice) {
        this.maxprice = maxprice;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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