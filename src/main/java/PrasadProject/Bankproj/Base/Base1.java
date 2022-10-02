package PrasadProject.Bankproj.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;

public class Base1 {

	WebDriver driver;
	  @BeforeSuite
	  public void beforeSuite() throws IOException {
		File propfile = new File("C:\\Prasad\\Javaclass\\Bankproj\\log4j.properties");
		  FileInputStream fiS =new FileInputStream(propfile);
		  Properties prop =new Properties();
		  prop.load(fiS);
//		  BasicConfigurator.configure();
//		  PropertyConfigurator.configure(".\\log4j.properties");
		  Logger log = Logger.getLogger(Base1.class);
		  System.setProperty("webdriver.chrome.driver", "C:\\Prasad\\selenium\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions(); 
		  options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/V4/");
		  log.debug("guru site opened");


}
		public static void screenShotMethod(String location,WebDriver driver) throws IOException
		{
			TakesScreenshot st1=((TakesScreenshot) driver);
			File scrFile=st1.getScreenshotAs(OutputType.FILE);
			File destFile=new File(location);
			FileUtils.copyFile(scrFile, destFile); 		
		}
		

		public static String readexcelbase(int i, int j, String file) throws IOException {
			FileInputStream rd1=new FileInputStream("C:\\Prasad\\selenium\\ProjectValues.xlsx");
			XSSFWorkbook book =new XSSFWorkbook(rd1);
			XSSFSheet sheet=book.getSheet(file);
			XSSFCell cell=sheet.getRow(i).getCell(j);
			cell.setCellType(CellType.STRING);
			String data=cell.toString();
			return data;
		}
		public static void writeexcelbase(int i, int j, String value, String file1) throws IOException {
			FileInputStream fs=new FileInputStream("C:\\Prasad\\selenium\\ProjectValues.xlsx");
			XSSFWorkbook wrkbook=new XSSFWorkbook(fs);
			XSSFSheet wrksheet=wrkbook.getSheet(file1);

			//ws.createRow(i);// get that row in which row we want to write the data
			wrksheet.getRow(i).createCell(j).setCellValue(value);
			fs.close();
			FileOutputStream os=new FileOutputStream("C:\\Prasad\\selenium\\ProjectValues.xlsx");

			wrkbook.write(os);
			os.close();
			
		}


	
}
