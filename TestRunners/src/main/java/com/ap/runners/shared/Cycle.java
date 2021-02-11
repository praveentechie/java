package com.ap.runners.shared;

public class Cycle extends Vehicle {
    private String modal;

    public Cycle() {
        super(2, 2);
    }

    public Cycle(String modal) {
        super(2, 2);
        this.modal = modal;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }
}
