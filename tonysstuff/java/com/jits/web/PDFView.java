package com.jits.web;

 
import java.text.NumberFormat;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.jits.core.Confirmation;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class PDFView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document,
			PdfWriter arg2, HttpServletRequest arg3, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		 
		Confirmation confirm = (Confirmation) model.get("confirmation");
		System.out.println(confirm);
		response.setContentType("application/pdf");
        document.open();
		 
        Font title = new Font( Font.TIMES_ROMAN, 50);
        document.add(new Paragraph("JITS Receipt", title));
 
        Font font = new Font( Font.TIMES_ROMAN, 18);
        document.add(new Paragraph(confirm.getDeliveryType(), font));
        
        Table table = new Table(2);
        table.addCell(new Phrase("TrackingNumber", font));
        table.addCell(new Phrase(new Long(confirm.getTrackingNumber()).toString(), font));
        
        table.addCell(new Phrase("Cost", font));
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String fDate = format.format(confirm.getCost());
        table.addCell(new Phrase(fDate, font));
        
        table.addCell(new Phrase("Carrier", font));
        table.addCell(new Phrase(confirm.getCarrierDescription(), font));
        
        table.addCell(new Phrase("Priority", font));
        table.addCell(new Phrase(confirm.getPriority(), font));
 
        table.addCell(new Phrase("Date", font));
        table.addCell(new Phrase(confirm.getDate(), font));
 
		document.add(table);
		
		document.add(new Paragraph("Thank you for Using JITS", font));
		
		document.close();
	}

}
