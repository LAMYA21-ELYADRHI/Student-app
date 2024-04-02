package ma.emsi.students.web;

import ma.emsi.students.entities.Product;
import ma.emsi.students.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {

    @Autowired
    private ProductRepository productRepository;




    @GetMapping("/products")

    public List<Product> products(){
        return productRepository.findAll();
    }
}
