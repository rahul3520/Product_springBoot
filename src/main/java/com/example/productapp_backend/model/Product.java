package com.example.productapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String code;
    private String name;
    private String mfgDate;
    private String expDate;
    private String brand;
    private int price;
    private String sellarName;
    private String distributorName;

    public Product() {
    }

    public Product(int id, String code, String name, String mfgDate, String expDate, String brand, int price, String sellarName, String distributorName) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.mfgDate = mfgDate;
        this.expDate = expDate;
        this.brand = brand;
        this.price = price;
        this.sellarName = sellarName;
        this.distributorName = distributorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(String mfgDate) {
        this.mfgDate = mfgDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellarName() {
        return sellarName;
    }

    public void setSellarName(String sellarName) {
        this.sellarName = sellarName;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }
}
