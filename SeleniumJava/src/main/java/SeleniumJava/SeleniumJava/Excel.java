package SeleniumJava.SeleniumJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel 
{
    public static void main( String[] args ) throws IOException
    {
       File file=new File("C:\\Users\\Laksh\\Desktop\\Test.xls");
       FileInputStream inputStream=new FileInputStream(file);
       HSSFWorkbook workbook=new HSSFWorkbook(inputStream);
       HSSFSheet sheet=workbook.getSheetAt(0);
       HSSFRow row=sheet.getRow(0);
//       HSSFCell cell=row.getCell(5);
//       String address=cell.getStringCellValue();
//       System.out.println(address);
       int rowcount = sheet.getLastRowNum();
      
       
       int colcount = row.getLastCellNum()-1;
       System.out.println(rowcount);
       for(int i=1;i<=rowcount;i++) {
    	   
    		   String firstname = sheet.getRow(i).getCell(0).getStringCellValue(); 
        	   System.out.println("firstname :"+firstname);
        	   String lastname = sheet.getRow(i).getCell(1).getStringCellValue(); 
        	   System.out.println("lastname :"+lastname);
        	   String mail = sheet.getRow(i).getCell(2).getStringCellValue(); 
        	   System.out.println("mail :"+mail);
        	   String phone = sheet.getRow(i).getCell(3).getStringCellValue(); 
        	   System.out.println("phone :"+phone);
        	   String address = sheet.getRow(i).getCell(4).getStringCellValue(); 
        	   System.out.println("address :"+address);
        	   System.out.println("firstname");
        	   System.out.println(firstname);
    	HSSFCell cell=sheet.getRow(i).createCell(6);
    	cell.setCellValue("Salem");
    }
       FileOutputStream outputStream=new FileOutputStream(file);
   	workbook.write();
    }
    
}
