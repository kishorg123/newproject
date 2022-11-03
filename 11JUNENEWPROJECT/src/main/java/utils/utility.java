package utils;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	WebDriver driver;
	
	public static void capturescreeshot(WebDriver driver) throws IOException {
		Random Randomnum = new Random();
		int Randomid=Randomnum.nextInt(100);
		DateFormat dateformat = new SimpleDateFormat("dd-MM-YYYY");
		Date date = new Date();
		//String file1="file";
		String date1 = dateformat.format(date);
		String filename="test"+"-"+Randomid+"-"+date1+".jpg";
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\classscreenshot\\test001"+filename);
		FileHandler.copy(scr, dest);
		
	}
	
	public static String fetchexceldata(String data, int rowco,int cellno ) throws IOException {
		FileInputStream File = new FileInputStream("C:\\Users\\User\\Desktop\\projectdata.xlsx");
	 data = (String) WorkbookFactory.create(File).getSheet("Sheet1").getRow(rowco).getCell(cellno).getStringCellValue();
		//String cellno = WorkbookFactory.create(File).getSheet("Sheet1").getRow(num1).getCell(num2+1).getStringCellValue();
		//System.out.println(rowno);
		//System.out.println(cellno);
		return data;
	}
	



}
