package me.ghisiluizgustavo.fchexagonal.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductTest {

    @Test
    void shouldEnableProduct(){
        Product product = new Product();
        product.setName("Hello");
        product.setStatus(Product.DISABLED);
        product.setPrice(10);

        product.enable();

        Assertions.assertEquals(Product.ENABLED, product.getStatus());
    }

    @Test()
    void shouldNotEnableProduct(){
        Product product = new Product();
        product.setName("Hello");
        product.setStatus(Product.DISABLED);
        product.setPrice(0);

        RuntimeException priceIsNull = Assertions.assertThrows(
                RuntimeException.class,
                product::enable,
                "Price is null"
        );

        Assertions.assertTrue(priceIsNull.getMessage().contains("price"));
    }

    @Test
    void shouldDisableProduct(){
        Product product = new Product();
        product.setName("Hello");
        product.setStatus(Product.DISABLED);
        product.setPrice(0);

        product.disable();

        Assertions.assertEquals(Product.DISABLED, product.getStatus());
    }

    @Test()
    void shouldNotDisableProduct(){
        Product product = new Product();
        product.setName("Hello");
        product.setStatus(Product.DISABLED);
        product.setPrice(10);

        RuntimeException priceIsNull = Assertions.assertThrows(
                RuntimeException.class,
                product::disable,
                "Price is greater than zero"
        );

        Assertions.assertTrue(priceIsNull.getMessage().contains("price"));
    }

}
