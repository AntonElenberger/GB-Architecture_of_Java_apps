package lesson6.datamapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PurchaseOrderMapperImp implements PurchaseOrderMapper {
    private PurchaseOrder order;
    private Map<Integer, PurchaseOrder> identityMap = new HashMap<>();
    List<PurchaseOrder> orders = new ArrayList<>();

    @Override
    public List<PurchaseOrder> findAll() {
        List<PurchaseOrder> ordersList = new ArrayList<>();
        for(PurchaseOrder o : this.getOrders()) {
            ordersList.add(o);
        }
        return ordersList;
    }

    @Override
    public PurchaseOrder findByID(int ID) {
        if(identityMap.containsKey(ID)) {
            return identityMap.get(ID);
        }
        for(PurchaseOrder o : this.getOrders()) {
            if(o.getOrderID() == ID) {
                return o;
            }
        }
        return null;
    }

    @Override
    public void insert(PurchaseOrder purchaseOrder) {
        if(!this.getOrders().contains(purchaseOrder)) {
            this.getOrders().add(purchaseOrder);
            identityMap.put(purchaseOrder.getOrderID(), purchaseOrder);
        } else {
            System.out.println("Order already exist");
        }
    }

    @Override
    public void update(PurchaseOrder purchaseOrder) {
        if(this.getOrders().contains(purchaseOrder)) {
            int index = this.getOrders().indexOf(purchaseOrder);
            this.getOrders().set(index, purchaseOrder);
        } else {
            System.out.println("Order not found");
        }
    }

    @Override
    public void delete(PurchaseOrder purchaseOrder) {
        if(this.getOrders().contains(purchaseOrder)) {
            this.getOrders().remove(purchaseOrder);
            identityMap.remove(purchaseOrder.getOrderID(), purchaseOrder);
        } else {
            System.out.println("Order not found");
        }
    }

    public List<PurchaseOrder> getOrders(){
        return this.orders;
    }
}
