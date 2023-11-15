package app.controller;

import app.model.Order;
import app.until.Rounder;
import app.view.OrderView;

public class OrderController {
    private Order model;
    private OrderView view;

    public OrderController(Order model, OrderView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        double totalCost = model.calculateTotalCost();
        String rounded = Rounder.roundValue(totalCost);
        view.displayOrderDetails(rounded);
    }
}
