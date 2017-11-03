package com.apress.providerB;

import com.apress.moduleA.interfaces.ServiceExample;

public class ServiceExampleImplementation2 implements ServiceExample {

    public ServiceExampleImplementation2() {
    }

    @Override
    public String printHelloWorld() {
        return "Hello World from ServiceExampleImplementation2";
    }
}