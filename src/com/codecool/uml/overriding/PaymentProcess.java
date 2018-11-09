package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {

    @Override
    void action(Orderable item) {
        item.pay();
        System.out.println("Payment is processing...");
    }

}
