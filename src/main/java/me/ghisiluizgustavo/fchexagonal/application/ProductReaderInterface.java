package me.ghisiluizgustavo.fchexagonal.application;

import me.ghisiluizgustavo.fchexagonal.adapters.out.db.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProductReaderInterface extends ProductRepository {

    default ProductInterface get(String id){
        return findById(id).orElseThrow().toProduct();
    }

}
