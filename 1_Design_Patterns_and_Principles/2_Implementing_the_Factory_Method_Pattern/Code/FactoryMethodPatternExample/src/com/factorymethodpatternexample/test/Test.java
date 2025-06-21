package com.factorymethodpatternexample.test;

import com.factorymethodpatternexample.abs.Document;
import com.factorymethodpatternexample.abs.DocumentFactory;
import com.factorymethodpatternexample.concretedocument.ExcelDocumentFactory;
import com.factorymethodpatternexample.concretedocument.PdfDocumentFactory;
import com.factorymethodpatternexample.concretedocument.WordDocumentFactory;

public class Test {
	public static void main(String[] args) {
        DocumentFactory factory;

        factory = new WordDocumentFactory();
        Document wordDoc = factory.createDocument();
        wordDoc.open();

        factory = new PdfDocumentFactory();
        Document pdfDoc = factory.createDocument();
        pdfDoc.open();

        factory = new ExcelDocumentFactory();
        Document excelDoc = factory.createDocument();
        excelDoc.open();
    }
}
