//Productservice
package com.example.ProductApplication.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductAplication> getProducts() {
        return productRepository.findAll();
    }

    public ResponseEntity<Object> createProduct(ProductAplication product) {
        Optional<ProductAplication> existingProduct = productRepository.findProductAplicationByName(product.getName());
        HashMap<String, Object> datos = new HashMap<>();
        if (existingProduct.isPresent()) {
            datos.put("data", false);
            datos.put("message", "El usuario ya existe");
            return new ResponseEntity<>(datos, HttpStatus.CONFLICT);
        } else {
            ProductAplication savedProduct = productRepository.save(product);
            datos.put("data", savedProduct);
            datos.put("message", "Usuario creado");

            return new ResponseEntity<>(datos, HttpStatus.CREATED);
        }
    }

    public ResponseEntity<Object> updateProduct(ProductAplication product) {
        Optional<ProductAplication> existingProduct = productRepository.findById(product.getId());
        HashMap<String, Object> datos = new HashMap<>();
        if (existingProduct.isPresent()) {
            ProductAplication savedProduct = productRepository.save(product);
            datos.put("data", savedProduct);
            datos.put("message", "Producto actualizado");

            return new ResponseEntity<>(datos, HttpStatus.OK);
        } else {
            datos.put("data", false);
            datos.put("message", "El producto con ID " + product.getId() + " no existe");
            return new ResponseEntity<>(datos, HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Object> deleteProduct(Long productId) {
        boolean exists = productRepository.existsById(productId);
        HashMap<String, Object> datos = new HashMap<>();

        if (!exists) {
            datos.put("data", false);
            datos.put("message", "El usuario con id " + productId + " no existe");
            return new ResponseEntity<>(datos, HttpStatus.NOT_FOUND);
        }
        productRepository.deleteById(productId);
        datos.put("data", true);
        datos.put("message", "El usuario con id " + productId + " ha sido eliminado");
        return new ResponseEntity<>(datos, HttpStatus.OK);
    }
}