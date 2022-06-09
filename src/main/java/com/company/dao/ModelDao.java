package com.company.dao;

import com.company.model.Model;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ModelDao {
    private ArrayList<Model> modelArrayList = new ArrayList<Model>();
    private int idCounter;

    public void addOrder(Model order) {
        Model model = new Model();
        model.setId(++idCounter);
        model.setName(order.getName());
        model.setColor(order.getColor());
        model.setMaterial(order.getMaterial());
        modelArrayList.add(model);
    }

    public ArrayList<Model> getAllOrders() {
        return modelArrayList;
    }
}
