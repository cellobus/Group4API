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

    @GetMapping("/shop/{id}") // HTTP status - Return code 404 Not found...
    public Product getproduct(@PathVariable int id)   {
        for(Product p :  productRepository.products)   {
            if (p.getId() == id)  {
                return p;
            }
        }
        return null;
    }

    @DeleteMapping("/shop/{id}")   // HTTP status - Return code 404 Not found...
    public String  deleteProduct(@PathVariable int id)   {
        for(Product p :  productRepository.products)   {
            if (p.getId() == id)  {
                productRepository.products.remove(p);
                return "Deleted";
            }
        }
        return "Not found";
    }

    @PostMapping("/shop") // HTTP status - create - Return code 201
    public Product createProduct(@RequestBody Product product)   {
        product.setCreatedAt("");
        product.setDiscountInPercentage(0.0);
        productRepository.addProduct(product);
        return  product;
    }

    @PutMapping("/shop/{id}") // HTTP status - Return code 200 - OK
    public Product updateProduct(@PathVariable int id, @RequestBody Product product)   {
        Product aProduct = productRepository.updateProduct(product, id);// getProduct(product.getId());
        aProduct = product;
       // productRepository.products.add(aProduct);
        return aProduct;//(Book)bookRepository.getBook(aBook);
    }


/*

    @PutMapping(value="/book/{bookId}")
    public Book updateBook(@PathVariable long bookId, @RequestBody Book book)   {
        Book aBook = bookRepository.getBook(book.getId());
        aBook = book;
        return aBook;//(Book)bookRepository.getBook(aBook);
    }
    @PostMapping("/book")
    public Book create(@RequestBody Book book) {
        return bookRepository.addBook(book);
    }

 */
}


