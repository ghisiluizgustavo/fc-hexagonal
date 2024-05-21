package me.ghisiluizgustavo.fchexagonal.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//public class ProductServiceTest {
//
//    @Mock
//    ProductInterface productInterface;
//
//    @Mock
//    ProductReaderInterface persistenceReaderInterface;
//
//    @Mock
//    ProductPersistenceInterface persistenceInterface;
//
//
//    // TODO - NOT WORKING, FIGURE OUT HOW TO MOCK PERSISTENCE READER INTERFACE INSIDE PERSISTENCE INTERFACE
//    @Test
//    public void shouldGetProduct(){
//        Mockito.when(persistenceReaderInterface.get(Mockito.anyString())).thenReturn(productInterface);
//
//        ProductService productService = new ProductService(persistenceInterface);
//
//        ProductInterface result = productService.get("abc");
//
//        Assertions.assertEquals(productInterface, result);
//    }
//}
