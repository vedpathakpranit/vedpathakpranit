package com.pdfcreation.project;

import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import com.itextpdf.text.Document;  
import com.itextpdf.text.DocumentException;  
import com.itextpdf.text.Paragraph;  
import com.itextpdf.text.pdf.PdfWriter;  
public class createPdf2  
{  
public static void main(String args[])  
{  
//created PDF document instance   
Document doc = new Document();  
try  
{  
//generate a PDF at the specified location  
PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("Sample.pdf"));  
System.out.println("PDF created.");  
//opens the PDF  
doc.open();  
//adds paragraph to the PDF file  
doc.add(new Paragraph("If you're offered a seat on a rocket ship, don't ask what seat! Just get on."));   
//close the PDF file  
doc.close();  
//closes the writer  
writer.close();  
}   
catch (DocumentException e)  
{  
e.printStackTrace();  
}   
catch (FileNotFoundException e)  
{  
e.printStackTrace();  
}

//We can also set the attributes (author, date, title, subject, etc.) to the PDF file.

doc.addAuthor("Anubhav");  
doc.addCreationDate();  
doc.addCreator("javatpoint.com");  
doc.addTitle("Setting Attribute");  
doc.addSubject("Setting attributes to the PDF files.");  
}  
}  