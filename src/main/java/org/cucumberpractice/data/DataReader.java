package org.cucumberpractice.data;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataReader {

    public static String getCellData(String sheetName, int row, int column) throws IOException {

        FileInputStream fis = new FileInputStream("src/main/resources/Cucumber_TestData.xlsx");

        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheet(sheetName);
        return sheet.getRow(row).getCell(column).getStringCellValue();



//         Sheet sheet = wb.getSheetAt(0);
//
//
//        System.out.println("Reading file: " + fis);
//        for (Row row1 : sheet) {
//            for (Cell cell : row1) {
//                switch (cell.getCellType()) {
//                    case STRING:
//                        System.out.print(cell.getStringCellValue() + "\t");
//                        break;
//                    case NUMERIC:
//                        System.out.print(cell.getNumericCellValue() + "\t");
//                        break;
//                    default:
//                        System.out.print("?\t");
//                }
//            }
//            System.out.println();
//        }
//
//        wb.close();
//
//
//        return sheetName;
    }
}
