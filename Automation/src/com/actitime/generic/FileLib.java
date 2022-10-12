package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyData(String path,String key) throws IOException {
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	public String getExelData(String path,String SheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		fis.close();
		return data;
	}
	public void setExelData(String path,String SheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	
		FileOutputStream fos= new FileOutputStream(path);
		wb.write(fos);
		
		fis.close();
		fos.flush();
		fos.close();
		
		
	}
}

