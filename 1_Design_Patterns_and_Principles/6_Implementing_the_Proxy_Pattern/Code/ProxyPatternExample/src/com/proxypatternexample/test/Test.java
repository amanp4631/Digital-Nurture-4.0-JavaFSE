package com.proxypatternexample.test;

import com.proxypatternexample.abs.Image;
import com.proxypatternexample.impl.ProxyImage;

public class Test {
	public static void main(String[] args) {
        Image image = new ProxyImage("img.jpg");

        System.out.println("First call:");
        image.display();

        System.out.println("\nSecond call:");
        image.display();
    }

}
