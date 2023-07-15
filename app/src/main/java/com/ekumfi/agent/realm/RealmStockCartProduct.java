package com.ekumfi.agent.realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by 2CLearning on 12/16/2017.
 */

public class RealmStockCartProduct extends RealmObject {

    private int id;
    @PrimaryKey
    private String stock_cart_product_id;
    private String stock_cart_id;
    private String product_id;
    private int quantity;
    private double price;

    private String name;
    private String image_url;
    private int unit_quantity;
    private int quantity_available;
    private double unit_price;

    public RealmStockCartProduct() {

    }

    public RealmStockCartProduct(int id, String stock_cart_product_id, String stock_cart_id, String product_id, int quantity, double price, String name, String image_url, int unit_quantity, int quantity_available, double unit_price) {
        this.id = id;
        this.stock_cart_product_id = stock_cart_product_id;
        this.stock_cart_id = stock_cart_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.image_url = image_url;
        this.unit_quantity = unit_quantity;
        this.quantity_available = quantity_available;
        this.unit_price = unit_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStock_cart_product_id() {
        return stock_cart_product_id;
    }

    public void setStock_cart_product_id(String stock_cart_product_id) {
        this.stock_cart_product_id = stock_cart_product_id;
    }

    public String getStock_cart_id() {
        return stock_cart_id;
    }

    public void setStock_cart_id(String stock_cart_id) {
        this.stock_cart_id = stock_cart_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getUnit_quantity() {
        return unit_quantity;
    }

    public void setUnit_quantity(int unit_quantity) {
        this.unit_quantity = unit_quantity;
    }

    public int getQuantity_available() {
        return quantity_available;
    }

    public void setQuantity_available(int quantity_available) {
        this.quantity_available = quantity_available;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }
}
