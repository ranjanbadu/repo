package com.pagefactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.BaseClass;

public class Flight_detailsPage extends BaseClass {
	public Flight_detailsPage() {
		PageFactory.initElements(driver, this);
	}

	Workbook book;
	Sheet sheet;
	XSSFWorkbook wb;
	XSSFSheet st;
	static ArrayList<String> add;

	@FindBy(xpath = "//h3[1]//span[1]")
	@CacheLookup
	private WebElement verifydate;
	
	public String getVerifydate() {
		return verifydate.getText();
	}


	public String getVerifydetails() {
		return verifydetails.getText();
	}


	public Workbook getBook() {
		return book;
	}

	public Sheet getSheet() {
		return sheet;
	}

	public XSSFWorkbook getWb() {
		return wb;
	}

	public XSSFSheet getSt() {
		return st;
	}

	public static ArrayList<String> getAdd() {
		return add;
	}

	@FindBy(xpath = "//div[@id='taxAndFeeInclusiveDivHeader']//span[@class='price-summary uppercase price-summary-header']")
	@CacheLookup
	private WebElement verifydetails;
	
	public ArrayList<String> listdata() {
		return add;
	}

	@SuppressWarnings("rawtypes")
	public ArrayList<String> getFlightdetails(String sheetName, String excel_path) {
		ArrayList<String> list = new ArrayList<String>();
		FileInputStream file = null;
		try {
			file = new FileInputStream(excel_path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				try {
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
					list.add(data[i][k].toString());
				} catch (Exception e) {
					continue;
				}
			}
		}
		return list;
	}

	@SuppressWarnings("rawtypes")
	public ArrayList getValue() {
		ArrayList<String> tt = new ArrayList<String>();
		String first = "//tr[@name='0_0_0_";
		String sec = "']";
		String one = "/td[";
		String two = "]";
		for (int i1 = 0; i1 < 25; i1++) {
			String name = first + i1 + sec;

			if (driver.findElements(By.xpath(name)).size() != 0) {

				for (int k = 0; k < 4; k++) {
					int num = k + 1;
					String fin = one + num + two;
					String depart = driver.findElement(By.xpath(name + fin)).getText();
					tt.add(depart);

				}

			}
		}
		return tt;
	}

	public void create_Data() {
		wb = new XSSFWorkbook();
		st = wb.createSheet("data");
		String src = "C:\\Users\\Admin\\eclipse-workspace\\Spicejet\\src\\main\\java\\com\\data\\Save.xlsx";
		st.createRow(0).createCell(0).setCellValue("DEPART");
		st.getRow(0).createCell(1).setCellValue("ARRIVE");
		st.getRow(0).createCell(2).setCellValue("SPICSAVER");
		st.getRow(0).createCell(3).setCellValue("SPICEMAX");
		add = new ArrayList<String>();
		String first = "//tr[@name='0_0_0_";
		String sec = "']";
		String one = "/td[";
		String two = "]";
		for (int i1 = 0; i1 < 25; i1++) {
			String name = first + i1 + sec;

			if (driver.findElements(By.xpath(name)).size() != 0) {
				st.createRow(i1 + 1).createCell(0).setCellValue("nan");
				for (int k = 0; k < 4; k++) {
					int num = k + 1;
					String fin = one + num + two;
					String depart = driver.findElement(By.xpath(name + fin)).getText();

					st.getRow(i1 + 1).createCell(k).setCellValue(depart);
					add.add(depart);

				}

			}
		}
		FileOutputStream file = null;
		try {
			file = new FileOutputStream(src);
			wb.write(file);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	/*
	 * public void removeEmptyRows(XSSFSheet sheet) {
	 * 
	 * Boolean isRowEmpty = Boolean.FALSE; for(int i = 0; i <=
	 * sheet.getLastRowNum(); i++){ if(sheet.getRow(i)==null){ isRowEmpty=true;
	 * sheet.shiftRows(i + 1, sheet.getLastRowNum()+1, -1); i--; continue; } for(int
	 * j =0; j<sheet.getRow(i).getLastCellNum();j++){ if(sheet.getRow(i).getCell(j)
	 * == null || sheet.getRow(i).getCell(j).toString().trim().equals("")){
	 * isRowEmpty=true; }else { isRowEmpty=false; break; } } if(isRowEmpty==true){
	 * sheet.shiftRows(i + 1, sheet.getLastRowNum()+1, -1); i--; } } }
	 */

}
