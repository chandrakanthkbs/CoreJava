package com.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable  {

    public static void main(String args[]) throws InterruptedException, ExecutionException{
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        
        
        //Create MyCallable instance
        Callable<String> emailCallable = new EmailCallable();
        Callable<String> tokenCallable = new TokenCallable();
        
        Future<String> futureEmail = executor.submit(emailCallable);
        executor.submit(tokenCallable);
        String str = futureEmail.get();
        System.err.println("Completed : "+str);
        
        //shut down the executor service now
        executor.shutdown();
    }

}