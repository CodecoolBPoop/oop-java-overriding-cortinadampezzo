package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {

    @Override
    void action(Orderable item) {
        item.checkout();
        System.out.println("Checkout is processing...");
    }

}
