package com.example;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;

import com.example.generated.Dummy;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello world!");
		// should be: <?xml version="1.0" encoding="UTF-8" standalone="yes"?><Dummy/>
		System.out.println("marshal(new Dummy()) = " + marshal(new Dummy()));
	}

	private static String marshal(Object object) throws Exception {
		try (final StringWriter writer = new StringWriter()) {
			JAXBContext.newInstance("com.example.generated")
					.createMarshaller()
					.marshal(object, writer);
			return writer.toString();
		}
	}
}