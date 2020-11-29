package org.kodluyoruz.examples.lists;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {

    private ProductPriceCompareEnum priceCompareEnum;

    public ProductPriceComparator(ProductPriceCompareEnum priceCompareEnum) {
        this.priceCompareEnum = priceCompareEnum;
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (priceCompareEnum.equals(ProductPriceCompareEnum.ASC)) {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else if (o1.getPrice().equals(o2.getPrice())) {
                return 0;
            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
            }
        } else if (priceCompareEnum.equals(ProductPriceCompareEnum.DESC)) {
            if (o1.getPrice() > o2.getPrice()) {
                return -1;
            } else if (o1.getPrice().equals(o2.getPrice())) {
                return 0;
            } else if (o1.getPrice() < o2.getPrice()) {
                return 1;
            }

        }
        return 0;
    }
}

enum ProductPriceCompareEnum {
    ASC /*azalandan artana*/,
    DESC; // artandan -> azalana
}
