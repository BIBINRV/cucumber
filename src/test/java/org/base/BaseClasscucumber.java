package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasscucumber {
	public static WebDriver driver;
	Select s;
	Actions a;
	public void browserconfigchrome() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	public void openurl(String url) {
		driver.get(url);
	}
	public void maximizewindow() {
		driver.manage().window().maximize();
	}
	public WebElement locatebyxpath(String xpathExpression) {
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;

	}

	public WebElement locatebyid(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public WebElement locatebyname(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}
	public void inputText(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void click(WebElement element) {
		element.click();
	}
	public void mouseoveraction(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void draganddrop(WebElement s,WebElement d) {
		a = new Actions(driver);
		a.dragAndDrop(s,d).perform();

	}
	public void rightclick(WebElement right) {
		a = new Actions(driver);
		a.contextClick(right).perform();

	}
	public void doubleclick(WebElement doublec) {
		a = new Actions(driver);
		a.doubleClick(doublec).perform();
	}
	public void simplealert() {

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	public void Confirmalert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void promptalert(String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.dismiss();
	}
	public void Takesscreenshot() {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
	}
	public void dropdownbyvalue(WebElement drop,String value) {
		s = new Select(drop);
		s.selectByValue(value);
	}
	public void dropdownbyIndex(WebElement drop,int value) {
		s = new Select(drop);
		s.selectByIndex(value);
	}
	public void dropdownbytext(WebElement drop,String value) {
		s = new Select(drop);
		s.selectByVisibleText(value);
	}
	public void deselectbyIndex(WebElement drop,int value) {
		s = new Select(drop);
		s.deselectByIndex(value);
	}
	public void deselectbyvalue(WebElement drop,String value) {
		s = new Select(drop);
		s.deselectByValue(value);
	}
	public void deselectbytext(WebElement drop,String value) {
		s = new Select(drop);
		s.deselectByVisibleText(value);
	}
	public String getthetext(WebElement element) {
		String text = element.getText();
		return text;

	}
	public String gettheattribute(WebElement element,String value) {

		String attribute = element.getAttribute(value);
		return attribute;

	}
	public void getTheTitle(String title) {
    title=driver.getTitle();
	}
	private void switchToFrameByIndex(int index) {
driver.switchTo().frame(index);
	
	}
	private void SwitchToFrameById(String value) {
driver.switchTo().frame(value);
	}
	public String ExcelRead(String path,String sheet1,int rowindex,int cellindex) throws IOException {
		String value = null;
		File f= new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook Workbook = new XSSFWorkbook(stream);
		Sheet sheet = Workbook.getSheet(sheet1);	
			Row row = sheet.getRow(rowindex);

				Cell cell = row.getCell(cellindex);
				CellType type = cell.getCellType();
				System.out.println("cellType:"+type);

				switch (type) {
				case STRING:
					value = cell.getStringCellValue();
					System.out.println(value);

					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyy");
						value = dateFormat.format(date);
						System.out.println(value);

					} else {
						double numvalue = cell.getNumericCellValue();
						BigDecimal decimal = BigDecimal.valueOf(numvalue);
						value = decimal.toString();
						System.out.println(value);
					}

					break;

				default:
					break;
				}
				return value;

	}
	public void insertValueByJavascript() {
JavascriptExecutor executor=(JavascriptExecutor)driver;
	}

	public void closebrowser() {
driver.quit();
	}
	


		

}
