package com.factorymethodpatternexample.document;

import com.factorymethodpatternexample.abs.Document;

public class WordDocument extends Document {
	@Override
    public void open() {
        System.out.println("Opening a Word document.");
    }

}
