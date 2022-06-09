package com.company.controller;

import com.company.service.ModelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class ModelController {
    private final ModelService service;

    public ModelController(ModelService service) {
        this.service = service;
    }

    @GetMapping("/create")
    public String getOrderPage(Model model) {
        model.addAttribute("order", new com.company.model.Model());
        return "order";
    }

    @GetMapping("/accept")
    public String getAcceptPage(Model model) {
        model.addAttribute("getAllOrders", service.getAllOrders());
        return "accept";
    }

    @PostMapping
    public String order(@ModelAttribute com.company.model.Model order) {
        service.addOrder(order);
        return "redirect:/order/accept";
    }

    @GetMapping("/all-orders")
    public String getAllOrders(Model model) {
        model.addAttribute("getAllOrders", service.getAllOrders());
        return "all_orders";
    }
}
