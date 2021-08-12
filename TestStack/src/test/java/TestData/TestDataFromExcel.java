package TestData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataFromExcel {
	public static HashMap<String, String> getTestCaseData(String SheetName,String caseNum) throws IOException
	{
		String path = "C:\\Users\\Romero\\Downloads\\Nainital.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet(SheetName);
		int rowcount = sheet.getLastRowNum();
		int columncount  = sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(columncount);
		String data = "";
		String column_data = "";
		
		ArrayList al = new ArrayList();
		ArrayList cn = new ArrayList();
		Collections.addAll(cn, caseNum.split("C"));
		System.out.println("Split case name"+cn);
		String tempnum = (String) cn.get(1);
		int caseNumber = Integer.valueOf(tempnum); 
		LinkedList ll = new LinkedList();
		HashMap<String,String> mp = new HashMap<>(); 
		
		for(int i=caseNumber;i<=caseNumber;i++)
		{
			XSSFRow curRow = sheet.getRow(i);
			
			for(int j=0;j<columncount;j++)
			{	try 
				{
				data = curRow.getCell(j).toString();
				column_data = sheet.getRow(0).getCell(j).toString(); // to get column names
//				column_data = CellReference.convertNumToColString(j); //to get alphabetical column names
				mp.put(column_data, data);
				al.add(data);
				ll.add(data);
				//data = curRow.getCell(j).getStringCellValue();
				System.out.print(data+"	");
				}
			
				catch (NullPointerException ne)
				{
				 System.out.print("Null");
				 al.add("Null");
				 ll.add("Null");
				 mp.put(column_data, "Null");
				} 
				
			}
			System.out.println();
		}
		
		
	System.out.println("Stored Data in ArrayList: "+al);
	System.out.println("Stored Datain LinkedList: "+ll);
	System.out.println("Stored Datain HashMap: "+mp);
	return mp;
	}


}
