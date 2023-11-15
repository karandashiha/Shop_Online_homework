package app;

import app.controller.OrderController;
import app.model.OrderWithDelivery;
import app.model.OrderWithoutDelivery;
import app.view.OrderView;

import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) { filterOption(getOption());}

    private static int getOption() {
        System.out.println("""
                Choose an option:
                1 - Order With Delivery
                2 - Order Without Delivery
                """);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static void filterOption(int option) {
        switch (option){
            case 1 ->{
                OrderWithoutDelivery orderModel = new OrderWithoutDelivery(500);
                OrderView orderView = new OrderView();
                OrderController orderController = new OrderController(orderModel, orderView);
                orderController.updateView();
            }
            case 2 -> {
                OrderWithDelivery orderModel = new OrderWithDelivery(670, 15);
                OrderView orderView = new OrderView();
                OrderController orderController = new OrderController(orderModel, orderView);
                orderController.updateView();
            }
            default -> System.out.println(option + " is wrong.");
    }
    }
}
