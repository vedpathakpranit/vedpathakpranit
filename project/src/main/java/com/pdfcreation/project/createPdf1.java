package com.pdfcreation.project;

import java.io.IOException;  
import org.apache.pdfbox.pdmodel.PDDocument;  
import org.apache.pdfbox.pdmodel.PDPage;  
public class createPdf1   
{  
public static void main(String[] args) throws IOException   
{  
PDDocument pdfdoc= new PDDocument();  
pdfdoc.addPage(new PDPage());  
//path where the PDF file will be store  
pdfdoc.save("Sample.pdf");  
//prints the message if the PDF is created successfully   
System.out.println("PDF created");  
//closes the document  
pdfdoc.close();  
}  
}  