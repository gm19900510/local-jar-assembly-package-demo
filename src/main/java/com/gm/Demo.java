package com.gm;

import java.util.Collection;
import java.util.Vector;
import org.apache.commons.collections.collection.SynchronizedCollection;

public class Demo {

	public static void main(String[] args) {
		// create vector object
		Vector<String> vector = new Vector<String>();

		// populate the vector
		vector.add("1");
		vector.add("2");
		vector.add("3");
		vector.add("4");
		vector.add("5");

		// create a synchronized view
		Collection<String> c = SynchronizedCollection.decorate(vector);

		System.out.println("Sunchronized view is :" + c);
	}
}
