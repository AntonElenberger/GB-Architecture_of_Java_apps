package lesson6.datamapper;

import java.util.List;

public interface PurchaseOrderMapper {
    List<PurchaseOrder> findAll();
    PurchaseOrder findByID(int ID);
    void insert(PurchaseOrder purchaseOrder);
    void update(PurchaseOrder purchaseOrder);
    void delete(PurchaseOrder purchaseOrder);
}
