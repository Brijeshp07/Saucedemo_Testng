package Utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	
	public static String getCellValue(String sheetName, int row, int column) {
		String value = "";
        try {
        	FileInputStream fis = new FileInputStream(new File("testdata/credentials.xlsx"));
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheet(sheetName);
            Row r = sheet.getRow(row);
            Cell c = r.getCell(column);

            if (c.getCellType() == CellType.STRING) {
                value = c.getStringCellValue();
            } else if (c.getCellType() == CellType.NUMERIC) {
                value = String.valueOf((int) c.getNumericCellValue());
            }

            workbook.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Error reading Excel: " + e.getMessage());
        }
        return value.trim();
        }
 }
