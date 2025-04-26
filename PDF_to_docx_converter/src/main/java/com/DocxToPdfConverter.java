package com;

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
