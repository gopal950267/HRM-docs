package package2;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read
{
public static void main(String arg[]) throws Exception
{
	FileInputStream file=new FileInputStream("C:\\Users\\QAPLANET1\\Desktop\\abc.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet  Sh=wb.getSheet("Sheet1");
	XSSFRow rw=Sh.getRow(1);
	XSSFCell cel=rw.getCell(3);
	System.out.println(cel);
	
}
}
