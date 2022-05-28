package com.company;

public abstract class ServiceStation implements Service {

    public void check(Service service) {
           service.check();
        }
    }

