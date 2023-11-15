package app.model;

public class OrderWithoutDelivery implements Order {
    private double orderAmount;

    public OrderWithoutDelivery(double orderAmount) {
        this.orderAmount = orderAmount;
    }

     @Override
     public double calculateTotalCost(){
        return orderAmount;
    }

}
