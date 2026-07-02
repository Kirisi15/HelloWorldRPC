package com.helloworldrpc.server;

import javax.jws.WebService;

@WebService(endpointInterface = "com.helloworldrpc.server.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }

}