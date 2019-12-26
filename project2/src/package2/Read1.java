package package2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Read1 {

	public static void main(String[] args) throws Exception
	{
		
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\QAPLANET1\\Desktop\\abc.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
	  XSSFSheet sh=wb.getSheet("Sheet1");
	  XSSFRow rw=sh.getRow(1);
     XSSFCell cel=rw.getCell(3);
   cel.setCellType(CellType.STRING);
   cel.setCellValue("qaplanet");
   System.out.println("helo");
   FileOutputStream fos=new FileOutputStream("C:\\Users\\QAPLANET1\\Desktop\\sample.xlsx");
   wb.write(fos);
   fos.close();
}
}
