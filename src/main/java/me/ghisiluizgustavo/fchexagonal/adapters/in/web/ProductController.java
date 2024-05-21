package me.ghisiluizgustavo.fchexagonal.adapters.in.web;

import lombok.RequiredArgsConstructor;
import me.ghisiluizgustavo.fchexagonal.application.ProductInterface;
import me.ghisiluizgustavo.fchexagonal.application.ProductServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductServiceInterface service;

    @GetMapping("/{id}")
    public ProductInterface getProductById(@PathVariable String id){
        return service.get(id);
    }
}
