package app.model;

public class OrderWithDelivery implements Order{
    private double orderAmount;
    private double deliveryPercentage;

    public OrderWithDelivery(double orderAmount, double deliveryPercentage) {
        this.orderAmount = orderAmount;
        this.deliveryPercentage = deliveryPercentage;
    }
    @Override
    public double calculateTotalCost(){
        return orderAmount + (orderAmount * deliveryPercentage / 100);
    }
}
