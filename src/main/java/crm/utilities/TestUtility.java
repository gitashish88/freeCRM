package crm.utilities;

import java.io.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//make sure all the apache poi jar files versions are matching to get it worked. excluding openxml4j & commons-io

public class TestUtility {

	public static String sheetPath = "C:\\Users\\ashis\\eclipse-workspace\\InterviewPractice\\cogmento\\src\\main\\java\\crm\\artifacts\\cogmentoData.xlsx";

	static Workbook workbook;
	static Sheet sheet;
	static FileInputStream fis = null;

	public static Object[][] getTestData(String sheetname) {

		try {
			fis = new FileInputStream(sheetPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = workbook.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		//System.out.println(sheet.getLastRowNum() + "-----" + sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return data;
	}
}
