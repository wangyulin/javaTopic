package com.wyl.doctest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;  
  
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;  
import com.lowagie.text.rtf.RtfWriter2;  

public class SimpleTable {


	public static void main(String[] a) throws IOException, DocumentException {
        OutputStream out = new FileOutputStream("testImages.docx"); 
        Document document = new Document(PageSize.A4);  
        RtfWriter2.getInstance(document, out);  
        document.open();  
        Image img = Image.getInstance("/Users/wangyulin/Desktop/1.jpeg");  
        img.setAbsolutePosition(0, 0);//  
        document.add(img);  
        document.close();  
        System.out.println("ok"); 
	}

}