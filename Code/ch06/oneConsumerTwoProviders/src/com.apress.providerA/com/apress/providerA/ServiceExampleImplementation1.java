package com.apress.providerA;

import com.apress.moduleA.interfaces.ServiceExample;

public class ServiceExampleImplementation1 implements ServiceExample {

    public ServiceExampleImplementation1() {
    }

    @Override
    public String printHelloWorld() {

        return "Hello World from ServiceExampleImplementation1";
    }
}