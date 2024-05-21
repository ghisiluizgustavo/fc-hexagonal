package me.ghisiluizgustavo.fchexagonal.application;

import lombok.RequiredArgsConstructor;
import me.ghisiluizgustavo.fchexagonal.adapters.out.db.repository.ProductRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductPersistenceInterface {

    final ProductReaderInterface productReader;
    final ProductWriterInterface productWriter;
}
