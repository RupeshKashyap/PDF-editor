package com.rupesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rupesh.caller.CallerClass;

@SpringBootApplication
public class PdfEditorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfEditorApplication.class, args);
		
		CallerClass cc =  new CallerClass();
		
		cc.readPdf();
	}

}
