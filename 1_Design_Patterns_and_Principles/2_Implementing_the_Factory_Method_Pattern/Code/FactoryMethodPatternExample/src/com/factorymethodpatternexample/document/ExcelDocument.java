package com.factorymethodpatternexample.document;

import com.factorymethodpatternexample.abs.Document;

public class ExcelDocument extends Document {
	@Override
    public void open() {
        System.out.println("Opening a Excel document.");
    }
}
