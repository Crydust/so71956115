package com.example;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;

import com.example.generated.Dummy;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello world!");

		final Dummy dummy = new Dummy();
		dummy.setEl("el");
		dummy.setAttr("attr");

		// should be: <?xml version="1.0" encoding="UTF-8" standalone="yes"?><Dummy attr="attr"><el>el</el></Dummy>
		System.out.println("marshal(dummy) = " + marshal(dummy));

		// should be: com.example.generated.Dummy@5223e5ee[el=el, attr=attr]
		System.out.println("dummy.toString() = " + dummy);
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