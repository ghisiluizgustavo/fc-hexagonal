package me.ghisiluizgustavo.fchexagonal.adapters.out.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.ghisiluizgustavo.fchexagonal.application.Product;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class ProductEntity {

    @Id
    private String id;
    private String name;
    private double price;
    private String status;

    public Product toProduct(){
        return new Product(id, name, price, status);
    }

}
