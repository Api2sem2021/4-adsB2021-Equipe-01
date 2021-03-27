package br.com.iacit.sisata.exports;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EscritorExcel {
	
	public byte[] getAta() throws IOException, URISyntaxException {
		// Abertura do arquivo excel
		//String path = "C:\\Users\\wesley\\eclipse-workspace\\PI-Teste\\src\\files\\template_java.xlsx";
		
		String fileName = "templates/template.xlsx";		
		ClassLoader classLoader = getClass().getClassLoader();
        //InputStream inputStream = classLoader.getResourceAsStream(fileName);
        URL resource = classLoader.getResource(fileName);
        File file = new File(resource.toURI());
		FileInputStream arquivo = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
		XSSFFont wbFont;
		wbFont = workbook.createFont();
		wbFont.setCharSet(XSSFFont.DEFAULT_CHARSET);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
		Cell numero = sheet.getRow(1).getCell(1);
		numero.setCellValue("ATA N�.: 01/21");
		
		Cell data = sheet.getRow(1).getCell(3);
		data.setCellValue("DATA: 24/03/2021");
		
		Cell horaInicio = sheet.getRow(2).getCell(3);
		horaInicio.setCellValue("IN�CIO: 08:00");
		
		Cell horaFim = sheet.getRow(2).getCell(4);
		horaFim.setCellValue("FIM: 10:00");
		
		Cell local = sheet.getRow(3).getCell(3);
		local.setCellValue("LOCAL: Pr�dio da empresa ABC");
		
		Cell nomeProjeto = sheet.getRow(7).getCell(1);
		nomeProjeto.setCellValue("Projeto: XYZ123");
		
		Cell nomeParticipante1 = sheet.getRow(9).getCell(1);
		nomeParticipante1.setCellValue("Fulano");
		
		Cell areaParticipante1 = sheet.getRow(9).getCell(3);
		areaParticipante1.setCellValue("AAAA");
		
		Cell emailParticipante1 = sheet.getRow(9).getCell(4);
		emailParticipante1.setCellValue("fulano@aaaa.com");
		
		Cell telefoneParticipante1 = sheet.getRow(9).getCell(5);
		telefoneParticipante1.setCellValue("55(12)XXXXX-XXXX");
		
		Cell nomeParticipante2 = sheet.getRow(10).getCell(1);
		nomeParticipante2.setCellValue("Beltrano");
		
		Cell areaParticipante2 = sheet.getRow(10).getCell(3);
		areaParticipante2.setCellValue("BBBB");
		
		Cell emailParticipante2 = sheet.getRow(10).getCell(4);
		emailParticipante2.setCellValue("beltrano@bbbb.com");
		
		Cell telefoneParticipante2 = sheet.getRow(10).getCell(5);
		telefoneParticipante2.setCellValue("55(11)XXXXX-XXXX");
		
		Cell conteudoPauta = sheet.getRow(13).getCell(1);
		conteudoPauta.setCellValue("*Todo conte�do da reuni�o*");
		
		Cell observaoes = sheet.getRow(15).getCell(1);
		observaoes.setCellValue("Observa��es:\r\n"
				+ "1 - Deve ser disponibilzada c�pia da Ata de Reuni�o para os participantes e envolvidos;\r\n"
				+ "2 - O campo PRAZO deine as datas de entrega das solicita��es por parte dos respons�veis "
				+ "definidos no campo RESPONS�VEL.");
		
		Cell idAssunto1 = sheet.getRow(18).getCell(1);
		idAssunto1.setCellValue(1);
		
		Cell nomeAssunto1 = sheet.getRow(18).getCell(2);
		nomeAssunto1.setCellValue("ASSUNTO ABC");
		
		Cell responsavelAssunto1 = sheet.getRow(18).getCell(4);
		responsavelAssunto1.setCellValue("Fulano");
		
		Cell prazoAssunto1 = sheet.getRow(18).getCell(5);
		prazoAssunto1.setCellValue("XX/XX/XXXX");

		Cell idAssunto2 = sheet.getRow(19).getCell(1);
		idAssunto2.setCellValue(2);
		
		Cell nomeAssunto2 = sheet.getRow(19).getCell(2);
		nomeAssunto2.setCellValue("ASSUNTO XYZ");
		
		Cell responsavelAssunto2 = sheet.getRow(19).getCell(4);
		responsavelAssunto2.setCellValue("Beltrano");
		
		Cell prazoAssunto2 = sheet.getRow(19).getCell(5);
		prazoAssunto2.setCellValue("YY/YY/YYYY");
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		workbook.write(bos);
		

		/*
        //InputStream inputStream = classLoader.getResourceAsStream(fileName);
        URL resource2 = getClass().getClassLoader().getResource("templates/template2.xlsx");
        File file2 = new File(resource2.getPath());
		try (FileOutputStream stream = new FileOutputStream(file2)) {
		    stream.write(bos.toByteArray());
		}
		*/
		
		return bos.toByteArray();
	
	}

}