package org.example.five;

import org.example.four.collection.product.Product;
import org.example.four.collection.product.ProductDao;

public class DemoTest {
    public static void main(String[] args) {

        /**
         * Da bi pozvali funkciju getInstance() mora li postojati objekat kreiran po šablonu klase
         * ConnectionPool ???
         * <li> getInstance() --> STATIC </li>
         */
        ProductDao productDao = new ProductDao();
        for (int i = 1; i <= 12; i++) {
            Product product = productDao.get(i);
            System.out.println(product);
        }
    }
}
