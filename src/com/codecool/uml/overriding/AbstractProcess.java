package com.codecool.uml.overriding;

abstract class AbstractProcess {

    void process(Orderable item) {
        stepBefore();
        action(item);
        stepAfter();
    }

    private void stepBefore() {
        System.out.println("Starting process...");
    }

    abstract void action (Orderable item);

    private void stepAfter() {
        System.out.println("The process has finished!");
    }

}
