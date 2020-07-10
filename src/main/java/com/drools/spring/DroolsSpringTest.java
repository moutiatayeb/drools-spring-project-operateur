package com.drools.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javainuse.model.Operateur;
import com.javainuse.service.ProductServiceImpl;

import java.util.Scanner;

public class DroolsSpringTest {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ProductServiceImpl bean = ((ProductServiceImpl) applicationContext
                .getBean("ProductServiceImpl"));
        System.out.println("Donner le nom de l'operateur");
        Scanner in = new Scanner(System.in);
        String operateur = in.nextLine();
        Operateur product = new Operateur();
        product.setType(operateur.toLowerCase());

        bean.CalculateDiscount(product);

        showDiscount(product,operateur);
    }

    private static void showDiscount(Operateur product, String operateur) {
        System.out.println("Le prix d'une minute de communication telephonique en " + operateur + "  = " + product.getPrix() + " Mil");
    }
}
