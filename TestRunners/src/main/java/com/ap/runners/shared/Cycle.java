package com.ap.runners.shared;

import java.io.Serializable;

public class Cycle extends Vehicle<String> implements Serializable {
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
