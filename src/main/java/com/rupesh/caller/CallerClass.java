package com.rupesh.caller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.rupesh.pdf.ReadPDF;

public class CallerClass {
	
//	@Autowired private ReadPDF readPdf;
	
	
	 ReadPDF readPdf = new  ReadPDF ();
	
	public void readPdf() {
	
	try {
		readPdf.readPdf();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
