package lesson6.datamapper;

public class PurchaseOrder {

    private int orderID;
    private String productTitle;
    private double cost;
    private String vendor;

    public PurchaseOrder(int orderID, String productTitle, double cost, String vendor) {
        this.orderID = orderID;
        this.productTitle = productTitle;
        this.cost = cost;
        this.vendor = vendor;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
