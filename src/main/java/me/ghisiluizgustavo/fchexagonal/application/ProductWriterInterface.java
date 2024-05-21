package me.ghisiluizgustavo.fchexagonal.application;

import me.ghisiluizgustavo.fchexagonal.adapters.out.db.entity.ProductEntity;
import me.ghisiluizgustavo.fchexagonal.adapters.out.db.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProductWriterInterface extends ProductRepository {

    default ProductInterface save(ProductInterface product){
        return save(product.toEntity()).toProduct();
    }
}
