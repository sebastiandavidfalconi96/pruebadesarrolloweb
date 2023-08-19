package com.example.ProductApplication.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductAplication> getAllProducts() {
        return productService.getProducts();
    }

    @PostMapping
    public ResponseEntity<Object> crearProduct(@RequestBody ProductAplication product) {
        return productService.createProduct(product);
    }

    @PutMapping
    public ResponseEntity<Object> actualizarProduct(@RequestBody ProductAplication product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping(path = "{productId}")
    public ResponseEntity<Object> eliminarProduct(@PathVariable("productId") Long productId) {
        return productService.deleteProduct(productId);
    }
}