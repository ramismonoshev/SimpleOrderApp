package com.company.service;

import com.company.dao.ModelDao;
import com.company.model.Model;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ModelService {
    private final ModelDao modelDao;

    public ModelService(ModelDao modelDao) {
        this.modelDao = modelDao;
    }

    public void addOrder(Model order) {
        modelDao.addOrder(order);
    }

    public ArrayList<Model> getAllOrders() {
        return modelDao.getAllOrders();
    }
}
