package com.codecool.uml.overriding;

public class Order implements Orderable {

    private static int counter = 1;
    private int id;
    private String status;

    Order() {
        this.id = counter++;
        this.status = "new";
    }

    int getId() {
        return id;
    }

    String getStatus() {
        return status;
    }

    @Override
    public boolean checkout() {
        this.status = "checked";
        return true;
    }

    @Override
    public boolean pay() {
        this.status = "paid";
        return true;
    }

}
