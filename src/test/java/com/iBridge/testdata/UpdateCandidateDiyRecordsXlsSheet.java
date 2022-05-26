package com.iBridge.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import com.iBridge.utilities.RandomStrings;

public class UpdateCandidateDiyRecordsXlsSheet {
	public void updateCandidateRecords() {
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")
					+ "/src/test/java/com/iBridge/testdata/bulk_upload_format_ExcelDiy.xls");

			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet = workbook.getSheetAt(0);
			Cell cell = null;
			Cell cell1 = null;

			Cell cell2 = null;
			Cell cell3 = null;

			Cell cell4 = null;
			Cell cell5 = null;

			Cell cell6 = null;
			Cell cell7 = null;

			// Update the value of cell
			cell = sheet.getRow(1).getCell(0);
			cell4 = sheet.getRow(1).getCell(1);
			cell6 = sheet.getRow(1).getCell(2);
			cell1 = sheet.getRow(1).getCell(4);

			String firstName1 = RandomStrings.randomeStringCandidateFirstName();
			cell.setCellValue(firstName1);

			String middleName1 = RandomStrings.randomeStringCandidateMiddleName();
			cell4.setCellValue(middleName1);

			String lastName1 = RandomStrings.randomeStringCandidateLastName();
			cell6.setCellValue(lastName1);

			String email1 = RandomStrings.randomeStringUpdateCandidateEmail();
			cell1.setCellValue(email1 + "@mailinator.com");

			// Update the value of cell
			cell2 = sheet.getRow(2).getCell(0);
			cell5 = sheet.getRow(2).getCell(1);
			cell7 = sheet.getRow(2).getCell(2);
			cell3 = sheet.getRow(2).getCell(4);

			String firstName2 = RandomStrings.randomeStringCandidateFirstName();
			cell2.setCellValue(firstName2);
			try {

				File output = new File("firstName2.txt");
				FileWriter writer = new FileWriter(output);
				writer.write(firstName2);
				writer.flush();
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			String middleName2 = RandomStrings.randomeStringCandidateMiddleName();
			cell5.setCellValue(middleName2);
			try {

				File output = new File("middleName2.txt");
				FileWriter writer = new FileWriter(output);
				writer.write(middleName2);
				writer.flush();
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			String lastName2 = RandomStrings.randomeStringCandidateLastName();
			cell7.setCellValue(lastName2);

			String email2 = RandomStrings.randomeStringUpdateCandidateEmail();
			cell3.setCellValue(email2 + "@mailinator.com");
			file.close();

			FileOutputStream outFile = new FileOutputStream(new File(System.getProperty("user.dir")
					+ "/src/test/java/com/iBridge/testdata/bulk_upload_format_ExcelDiy.xls"));
			workbook.write(outFile);
			outFile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
