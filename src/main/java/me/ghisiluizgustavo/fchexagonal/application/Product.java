package me.ghisiluizgustavo.fchexagonal.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.ghisiluizgustavo.fchexagonal.adapters.out.db.entity.ProductEntity;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Product implements ProductInterface {

    private String id;
    private String name;
    private double price;
    private String status;

    public Product(){
        this.id = UUID.randomUUID().toString();
        this.status = DISABLED;
    }

    @Override
    public boolean isValid() {
        if (this.status.isEmpty()){
            this.status = DISABLED;
        }

        if (!this.status.equals(ENABLED) && !this.status.equals(DISABLED)){
            return false;
        }

        if (price < 0){
            return false;
        }

        return true;
    }

    @Override
    public void enable() {
        if (this.price > 0){
            this.status = ENABLED;
            return;
        }
        throw new RuntimeException("The price must be greater than zero to enable the product");
    }

    @Override
    public void disable() {
        if (this.price == 0){
            this.status = DISABLED;
            return;
        }
        throw new RuntimeException("The price must be zero to disable the product");
    }

    @Override
    public ProductEntity toEntity() {
        return new ProductEntity(id, name, price, status);
    }


}
