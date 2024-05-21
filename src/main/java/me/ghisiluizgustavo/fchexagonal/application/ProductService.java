package me.ghisiluizgustavo.fchexagonal.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService implements ProductServiceInterface {

    private final ProductPersistenceInterface persistenceInterface;

    @Override
    public ProductInterface get(String id) {
        return persistenceInterface.productReader.get(id);
    }

    @Override
    public ProductInterface create(String name, double price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        boolean valid = product.isValid();
        if (!valid) {
            return new Product();
        }
        ProductInterface result = persistenceInterface.productWriter.save(product);
        if (result == null) {
            return new Product();
        }
        return result;
    }

    @Override
    public ProductInterface enable(ProductInterface product) {
        product.enable();
        ProductInterface save = persistenceInterface.productWriter.save(product);
        if (save == null) {
            return new Product();
        }
        return save;
    }

    @Override
    public ProductInterface disable(ProductInterface product) {
        product.disable();
        ProductInterface save = persistenceInterface.productWriter.save(product);
        if (save == null) {
            return new Product();
        }
        return save;
    }
}
