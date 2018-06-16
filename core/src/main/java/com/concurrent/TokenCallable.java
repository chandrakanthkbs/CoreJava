package com.concurrent;

import java.util.concurrent.Callable;

public class TokenCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(6000);
        System.err.println("token response " + Thread.currentThread().getId());
        return Thread.currentThread().getName();
    }
}