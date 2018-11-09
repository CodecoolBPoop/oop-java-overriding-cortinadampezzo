package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {

        Order product = new Order();
        Order otherProduct = new Order();
        CheckoutProcess checkout = new CheckoutProcess();
        PaymentProcess payment = new PaymentProcess();

        System.out.println("Order #" + product.getId());
        System.out.println("Status: " + product.getStatus() + "\n");

        checkout.process(product);
        System.out.println("Status: " + product.getStatus() + "\n");

        payment.process(product);
        System.out.println("Status: " + product.getStatus() + "\n");

        System.out.println("Order #" + otherProduct.getId());
        System.out.println("Status: " + otherProduct.getStatus() + "\n");

        checkout.process(otherProduct);
        System.out.println("Status: " + otherProduct.getStatus() + "\n");

        payment.process(otherProduct);
        System.out.println("Status: " + otherProduct.getStatus() + "\n");

    }

}
