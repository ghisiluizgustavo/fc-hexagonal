package me.ghisiluizgustavo.fchexagonal.application;

import me.ghisiluizgustavo.fchexagonal.adapters.out.db.entity.ProductEntity;

public interface ProductInterface {

    String DISABLED = "disabled";
    String ENABLED = "enabled";

    boolean isValid();
    void enable();
    void disable();
    String getId();
    String getName();
    String getStatus();
    double getPrice();

    ProductEntity toEntity();

}
