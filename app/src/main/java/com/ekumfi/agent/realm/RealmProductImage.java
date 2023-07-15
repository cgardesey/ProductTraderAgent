package com.ekumfi.agent.realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by 2CLearning on 12/16/2017.
 */

public class RealmProductImage extends RealmObject {

    private int id;
    @PrimaryKey
    private String product_image_id;
    private String url;
    private String name;
    private String description;
    private int featured_image;
    private String product_id;;
    private String created_at;
    private String updated_at;

    public RealmProductImage() {

    }

    public RealmProductImage(String product_image_id, String url, String name, String description, int featured_image, String product_id, String created_at, String updated_at) {
        this.product_image_id = product_image_id;
        this.url = url;
        this.name = name;
        this.description = description;
        this.featured_image = featured_image;
        this.product_id = product_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_image_id() {
        return product_image_id;
    }

    public void setProduct_image_id(String product_image_id) {
        this.product_image_id = product_image_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFeatured_image() {
        return featured_image;
    }

    public void setFeatured_image(int featured_image) {
        this.featured_image = featured_image;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
