package com.example.ecommerce.Inventory_Tracking.dto;

public class ProductDto {
    private String brand;
    private Long styleId;
    private String article;
    private String gender;
    private String size;
    private int stockQty;
    private int reorderLvl;
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

    public ProductDto(String brand, Long styleId, String article, String gender, String size, int stockQty, int reorderLvl, String category) {
        this.brand = brand;
        this.styleId = styleId;
        this.article = article;
        this.gender = gender;
        this.size = size;
        this.stockQty = stockQty;
        this.reorderLvl = reorderLvl;
        this.category = category;
    }

    public ProductDto() {
    }
}
