package com.example.Group4API;

public class Product {
    protected int id;
    protected String productName;
    protected int stock;
    protected String category;
    protected String description;
    protected double price;
    protected double  discountInPercentage;
    protected String productImage;
    protected String createdAt;

    public Product(int id, String productName, int stock, String category, String description, double price, double discountInPercentage, String productImage, String createdAt) {
        this.id = id;
        this.productName = productName;
        this.stock = stock;
        this.category = category;
        this.description = description;
        this.price = price;
        this.discountInPercentage = discountInPercentage;
        this.productImage = productImage;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountInPercentage() {
        return discountInPercentage;
    }

    public void setDiscountInPercentage(double discountInPercentage) {
        this.discountInPercentage = discountInPercentage;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}