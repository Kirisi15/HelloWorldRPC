package com.helloworldrpc.client;

import com.helloworldrpc.generated.HelloWorld;
import com.helloworldrpc.generated.HelloWorldImplService;

public class Client {

    public static void main(String[] args) {

        // Create the service factory
        HelloWorldImplService service = new HelloWorldImplService();

        // Get the client stub (proxy)
        HelloWorld hello = service.getHelloWorldImplPort();

        // Remote Procedure Call
        String response = hello.sayHello("Kirisi");

        System.out.println("Server replied: " + response);
    }
}