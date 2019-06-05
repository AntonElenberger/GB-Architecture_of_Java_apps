package lesson6.datamapper;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        PurchaseOrderMapperImp mapper = new PurchaseOrderMapperImp();

        PurchaseOrder purchaseOrder1 = new PurchaseOrder(1, "Tyre", 2999, "Transcom");
        PurchaseOrder purchaseOrder2 = new PurchaseOrder(2, "Extrusion", 235, "FlighTime");

        mapper.insert(purchaseOrder1);
        mapper.insert(purchaseOrder2);

        PurchaseOrder order = mapper.findByID(1);
        List<PurchaseOrder> orders = mapper.findAll();
        mapper.delete(purchaseOrder1);
    }
}
