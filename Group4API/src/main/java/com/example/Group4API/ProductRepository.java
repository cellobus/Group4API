package com.example.Group4API;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    ArrayList<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product(1, "T-Shirt", 100, "Top", "Nice T-shirt, latest collection", 99.0, 0.0, "https://lp2.hm.com/hmgoepprod?set=source[/d8/12/d812412329a628300624e1661969be84286fe637.jpg],origin[dam],category[men_tshirtstanks_shortsleeve],type[DESCRIPTIVESTILLLIFE],res[z],hmver[1]&call=url[file:/product/main]", ""));
        products.add(new Product(2, "T-Shirt", 100, "Top", "Nice T-shirt, Wite, ", 99.0, 0.0, "", ""));
        products.add(new Product(3, "T-Shirt", 100, "Top", "Nice T-shirt, Blue", 99.0, 0.0, "", ""));
        products.add(new Product(4, "T-Shirt", 100, "Top", "Nice T-shirt, Green", 99.0, 0.0, "", ""));
        products.add(new Product(5, "T-Shirt", 100, "Top", "Nice T-shirt, Red", 99.0, 0.0, "", ""));
        products.add(new Product(6, "T-Shirt", 100, "Top", "Nice T-shirt, Gray", 99.0, 0.0, "", ""));
        products.add(new Product(7, "Sock", 2000, "Top", "Nice T-shirt, Gray", 99.0, 0.0, "", ""));
    }

    public Product getProduct(int id)   {
        for(var p : products)   {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public Product updateProduct(Product product, int id)  {
        for(var p : products)   {
            if (p.getId() == id) {// ID och created at
                int savedid = p.getId();
                String savedCreatedAt = p.getCreatedAt();
                p = product;
                p.setCreatedAt(savedCreatedAt);
                p.setId(savedid);
                return p;
            }
        }
        return null;
    }

    public Product addProduct(Product product)  {
       int nextID=0;
        for (var p : products)   {
            if (nextID <=  p.getId())
                nextID =  p.getId()+1;
            }
        product.setId(nextID);
        product.setCreatedAt("");
        products.add(product);
        return product;
    }
}


