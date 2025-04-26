package com;
import java.io.File;
import java.io.FileOutputStream;

import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.convert.out.pdf.PdfConversion;
import org.docx4j.convert.out.pdf.viaXSLFO.Conversion;

public class DocxToPdfConverter {
    public static void main(String[] args) {
        try {
            // Load the Word document
            File inputFile = new File("input.docx");
            WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(inputFile);

            // Output PDF file
            FileOutputStream os = new FileOutputStream("output.pdf");

            // Convert to PDF
            PdfConversion converter = new Conversion(wordMLPackage);
            converter.output(os, null);

            System.out.println("Conversion complete. PDF saved as output.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
