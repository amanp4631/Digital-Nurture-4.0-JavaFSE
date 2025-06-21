package com.factorymethodpatternexample.concretedocument;

import com.factorymethodpatternexample.abs.Document;
import com.factorymethodpatternexample.abs.DocumentFactory;
import com.factorymethodpatternexample.document.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
	@Override
    public Document createDocument() {
        return new WordDocument();
    }
}
