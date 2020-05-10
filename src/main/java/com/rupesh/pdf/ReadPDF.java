package com.rupesh.pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.springframework.util.ResourceUtils;

public class ReadPDF {

	public void readPdf() throws IOException {
		File file = ResourceUtils.getFile("classpath:demo_pdf.pdf");
		System.out.println("reading pdf");
		
		System.out.println("file => "+file);
	
		//File is found
		System.out.println("File Found : " + file.exists());
		
		try (PDDocument document = PDDocument.load(file)) {

			document.getClass();

			if (!document.isEncrypted()) {

				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);

				PDFTextStripper tStripper = new PDFTextStripper();

				String pdfFileInText = tStripper.getText(document);
//				 System.out.println("Text:" + pdfFileInText);

				// split by whitespace
				String lines[] = pdfFileInText.split("\\r?\\n");
				for (String line : lines) {
					System.out.println(line);
				}

			}
		}
	}

}
