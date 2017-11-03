package com.apress.getSystemResource;
import java.net.URL;

public class Main {

	public static void main(String[] args) {

		URL url = ClassLoader.getSystemResource("java/lang/String.class");
		System.out.println(url);
	}
}
