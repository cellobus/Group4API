package com.example.Group4API;

        import org.springframework.web.bind.annotation.*;
        import org.springframework.web.client.RestTemplate;

        import java.lang.reflect.Parameter;
        import java.util.List;

@RestController
public class APIController {
    ProductRepository productRepository = new ProductRepository();

    @GetMapping("/shop")
    public List<Product> getProdList(RestTemplate restTemplate) {
        return productRepository.products;
    }

    @GetMapping("/shop/{id}")
    public Product getproduct(@PathVariable int id)   {
        for(Product p :  productRepository.products)   {
            if (p.getId() == id)  {
                return p;
            }
        }
        return null;
    }
}


