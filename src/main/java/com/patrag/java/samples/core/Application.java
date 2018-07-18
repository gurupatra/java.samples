package com.patrag.java.samples.core;

public class Application {
    private static final String APPLICATION_NAME = "Java8 Samples.";

    public static void main(String ...args){
        startApplicationBanner(APPLICATION_NAME);
    }

    public static void startApplicationBanner(String applicationName){
        System.out.println("Starting ...");
        System.out.println(applicationName + " started.");
    }
}
