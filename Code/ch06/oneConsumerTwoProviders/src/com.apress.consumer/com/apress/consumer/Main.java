package com.apress.consumer;

import com.apress.moduleA.interfaces.ServiceExample;
import java.util.ServiceLoader;

public class Main {

	public static void main(String[] args) {
		Iterable<ServiceExample> services = ServiceLoader.load(ServiceExample.class);

		for(ServiceExample serviceExample : services) {
			System.out.println(serviceExample.printHelloWorld());
		}
	}
}
