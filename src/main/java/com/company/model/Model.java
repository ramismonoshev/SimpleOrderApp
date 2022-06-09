package com.company.model;

public class Model {
    private int id;
    private String name;
    private String color;
    private String material;

    public Model() {

    }

    public Model(int id, String name, String color, String material) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
