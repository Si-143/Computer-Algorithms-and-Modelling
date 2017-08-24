package comp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author ts348
 */
public class Excel {

    public static void excel() {
        try {
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream("Test.xls");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
            }
            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
            HSSFSheet worksheet = workbook.getSheet("Test.xlsx");
            HSSFRow row1 = worksheet.getRow(0);
            HSSFCell cellA1 = row1.getCell(0);
            String a1Val = cellA1.getStringCellValue();
            HSSFCell cellB1 = row1.getCell(1);
            String b1Val = cellB1.getStringCellValue();
            HSSFCell cellC1 = row1.getCell(2);
            boolean c1Val = cellC1.getBooleanCellValue();
            HSSFCell cellD1 = row1.getCell(3);
            Date d1Val = cellD1.getDateCellValue();

            System.out.println("A1: " + a1Val);
            System.out.println("B1: " + b1Val);
            System.out.println("C1: " + c1Val);
            System.out.println("D1: " + d1Val);

        } catch (IOException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
