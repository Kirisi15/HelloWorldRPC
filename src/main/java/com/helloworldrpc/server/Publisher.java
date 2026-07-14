package com.helloworldrpc.server;

import javax.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {

        Endpoint.publish(
                "http://localhost:8888/ws/hello",
                new HelloWorldImpl());

        System.out.println("=================================");
        System.out.println("HelloWorld RPC Service Started");
        System.out.println("http://localhost:8888/ws/hello");
        System.out.println("=================================");

    }

}