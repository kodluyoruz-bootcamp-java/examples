package org.kodluyoruz.examples.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExamplesComparable {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Raid", 10.00));
        products.add(new Product("Kosla", 250.00));
        products.add(new Product("Razer", 325.00));
        products.add(new Product("Boraks", 275.00));
        products.add(new Product("Gucci", 128.00));

        System.out.println("Before compare operations");
        for (Product product : products) {
            System.out.println(product.toString());
        }

        //Collections.sort(products);
        ProductPriceComparator ppc = new ProductPriceComparator(ProductPriceCompareEnum.DESC);
        Collections.sort(products, ppc);
        System.out.println("After compare operation");

        for (Product product : products) {
            System.out.println(product.toString());
        }

    }
}
