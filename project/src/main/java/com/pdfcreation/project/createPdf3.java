package com.pdfcreation.project;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class createPdf3 {
	private static String USER_PASSWORD = "1234567";
	private static String OWNER_PASSWORD = "";

	public static void main(String args[]) {
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your secret USER_PASSWORD to Encrypt\n");
			USER_PASSWORD = br.readLine();
			// location where PDF will be generated
			FileOutputStream fos = new FileOutputStream("Three_Crushes_Seq_.pdf");

			System.out.println("Enter your secret OWNER_PASSWORD to Encrypt\n");
			OWNER_PASSWORD = br.readLine();

			// creates an instance of PDF document
			Document doc = new Document();
			//doc writer for the PDF  
			PdfWriter writer = PdfWriter.getInstance(doc, fos);
			writer.setEncryption(USER_PASSWORD.getBytes(), OWNER_PASSWORD.getBytes(), PdfWriter.ALLOW_PRINTING,
					PdfWriter.ENCRYPTION_AES_128);
			//opens the PDF  
			doc.open();
			//adding paragraphs to the PDF  
			doc.add(new Paragraph("                        Message has been send to registered number !!!"));
			doc.add(new Paragraph("                                       "));
			doc.add(new Paragraph("NANDINI DETAILs : "));
			doc.add(new Paragraph("GUB MOB APP : xerox123LUCKYNUM8"));
			doc.add(new Paragraph("GUB MOB APP TRXNCTION : surname@123"));
			
			//closes the document  
			doc.close();
			//closes the output stream  
			fos.close();
			System.out.println("Password Protected File Generated.");
		}
		//catch the exception if any   
		catch (Exception e) {
			//prints the occurred exception   
			e.printStackTrace();
		}
	}
}