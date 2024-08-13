package CommonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class commonmethods {
      
	public  WebDriver launchBrowser(String browsername) {
		 WebDriver driver = null;
		if(browsername.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		return driver;
	}
	public void navigatetourl(WebDriver driver,String url) {
		maximizewindow(driver);
		driver.get(url);
		
	}

	public void maximizewindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void closebrowser(WebDriver driver) {
		driver.close();
	}
	
	public static Map<String, String> readExcel(int sheetIndex) {
		String excelFilePath = "D:\\\\vijay\\\\test files\\\\newsheet.xlsx";
		Map<String, String> dataMap = new HashMap<>();

		try (FileInputStream fis = new FileInputStream(excelFilePath); Workbook workbook = new XSSFWorkbook(fis)) {

			Sheet sheet = workbook.getSheetAt(sheetIndex); // assuming data is on the first sheet

			Row headerRow = sheet.getRow(0);
			Row valueRow = sheet.getRow(1);

			for (int i = 0; i < headerRow.getPhysicalNumberOfCells(); i++) {
				String columnName = headerRow.getCell(i).getStringCellValue();
				String cellValue = valueRow.getCell(i).toString();
				dataMap.put(columnName, cellValue);
			}

		 } catch (IOException ex) {
			ex.printStackTrace();
		}
		return dataMap;
	}
}

