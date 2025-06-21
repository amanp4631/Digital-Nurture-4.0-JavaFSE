package com.factorymethodpatternexample.concretedocument;

import com.factorymethodpatternexample.abs.Document;
import com.factorymethodpatternexample.abs.DocumentFactory;
import com.factorymethodpatternexample.document.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
	@Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
