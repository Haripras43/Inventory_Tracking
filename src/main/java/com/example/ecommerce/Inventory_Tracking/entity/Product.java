package com.example.ecommerce.Inventory_Tracking.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    private String brand;
    @Id
    private Long styleId;
    private String article;
    private String gender;
    private String size;
    private double fobPrice;
    private int stockQty;
    private int reorderLvl;//threshold for reorder
    private String category;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getStyleId() {
        return styleId;
    }

    public void setStyleId(Long styleId) {
        this.styleId = styleId;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getFobPrice() {
        return fobPrice;
    }

    public void setPrice(double fobPrice) {
        this.fobPrice = fobPrice;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public int getReorderLvl() {
        return reorderLvl;
    }

    public void setReorderLvl(int reorderLvl) {
        this.reorderLvl = reorderLvl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product(String brand, Long styleId, String article, String gender, String size, double fobPrice, int stockQty, int reorderLvl, String category) {
        this.brand = brand;
        this.styleId = styleId;
        this.article = article;
        this.gender = gender;
        this.size = size;
        this.fobPrice = fobPrice;
        this.stockQty = stockQty;
        this.reorderLvl = reorderLvl;
        this.category = category;
    }

    public Product() {
    }
}
