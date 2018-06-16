package com.concurrent;

import java.util.concurrent.Callable;

public class EmailCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        System.err.println("email response " + Thread.currentThread().getId());
        return "email sent";
    }
}