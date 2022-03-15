package com.pdfcreation.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class accessJson {
	
public static void main(String[] args) {
	//just a string

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your secret Github url \n");
	    // Connect to the URL using java's native library
	 try {
		 String sURL; //"https://raw.githubusercontent.com/vedpathakp127/SampleRepo1/main/sample.json";
		
		sURL = br.readLine(); 
		 URL url = new URL(sURL); 
	    HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
	    
	conn.setRequestMethod("GET");
	conn.connect();
	Scanner sc = new Scanner(url.openStream());
	String inline = null;
	while(sc.hasNext())
	{
	inline+=sc.nextLine();
	}
	System.out.println("\nJSON data in string format");
	System.out.println(inline);
	sc.close();
	
	




	    /*request.connect();

	    // Convert to a JSON object to print data
	    JsonParser jp = new JsonParser(); //from gson
	    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
	    JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
	    String zipcode = rootobj.get("zip_code").getAsString(); //just grab the zipcode
	    
*/
	 }catch(Exception e) {
		 
	 }
}

}
