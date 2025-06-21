package com.factorymethodpatternexample.concretedocument;

import com.factorymethodpatternexample.abs.Document;
import com.factorymethodpatternexample.abs.DocumentFactory;
import com.factorymethodpatternexample.document.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
	@Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
