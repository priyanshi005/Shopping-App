package org.example;

import org.example.config.ProductConfig;
import org.example.domain.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
        Product obj = context.getBean("product1",Product.class);
        System.out.println(obj);

        Product obj1 = context.getBean("product2",Product.class);
        System.out.println(obj1);
    }
}
