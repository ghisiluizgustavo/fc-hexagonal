package me.ghisiluizgustavo.fchexagonal.adapters.in.cli;

import lombok.RequiredArgsConstructor;
import me.ghisiluizgustavo.fchexagonal.application.ProductInterface;
import me.ghisiluizgustavo.fchexagonal.application.ProductServiceInterface;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCli {

    private final ProductServiceInterface service;


    public String run(
            String action,
            String productId,
            String productName,
            double price
    ){
        ProductInterface product;
        switch (action){
            case "create":
                product = service.create(productName, price);
                return String.format(
                        "Product ID %s with name %s has been created with the price %s and status %s",
                        product.getId(),
                        product.getName(),
                        product.getPrice(),
                        product.getStatus()
                );

            case "enable":
                product = service.get(productId);
                product = service.enable(product);
                return String.format("Product %s has been enabled", product.getName());

            case "disable":
                product = service.get(productId);
                product = service.disable(product);
                return String.format("Product %s has been disabled", product.getName());

            default:
                product = service.get(productId);
                return product.toString();
        }
    }
}
