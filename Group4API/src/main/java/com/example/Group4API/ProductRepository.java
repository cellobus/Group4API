package com.example.Group4API;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    ArrayList<Product> products = new ArrayList<>();

    public ProductRepository() {
         products.add(new Product(1, "T-Shirt", 100,  "Top", "Nice T-shirt, latest collection", 99.0, 0.0, "https://lp2.hm.com/hmgoepprod?set=source[/d8/12/d812412329a628300624e1661969be84286fe637.jpg],origin[dam],category[men_tshirtstanks_shortsleeve],type[DESCRIPTIVESTILLLIFE],res[z],hmver[1]&call=url[file:/product/main]", ""));
            products.add(new Product(1, "T-Shirt", 100,  "Top", "Nice T-shirt, Wite, ", 99.0, 0.0, "", ""));
            products.add(new Product(2, "T-Shirt", 100,  "Top", "Nice T-shirt, Blue", 99.0, 0.0, "", ""));
            products.add(new Product(3, "T-Shirt", 100,  "Top", "Nice T-shirt, Green", 99.0, 0.0, "", ""));
            products.add(new Product(4, "T-Shirt", 100,  "Top", "Nice T-shirt, Red", 99.0, 0.0, "", ""));
            products.add(new Product(5, "T-Shirt", 100,  "Top", "Nice T-shirt, Gray", 99.0, 0.0, "", ""));
        }
}
