package Advanced_Java_Day9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSheetReadWrite {

	public static void readsingledata() throws IOException {
		String Dirpath= System.getProperty("user.dir");
		FileInputStream fi = new FileInputStream(new File (Dirpath + "/Resources/Jan2024.xlsx"));
		XSSFWorkbook wb =new XSSFWorkbook(fi);
		XSSFSheet sheet =wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell=row.getCell(1);
		if(cell.getCellType()==CellType.STRING) {
		System.out.print(cell.getStringCellValue());
		
	}
		wb.close();
		fi.close();
		System.out.println("\nCompleted");
	}
	public static void ReadingandwritingfileusingReader() throws IOException {
	String Dirpath= System.getProperty("user.dir");
	File myfile = new File (Dirpath + "/Resources/Data1.txt");
	FileReader rd = new FileReader(myfile);
	int ch;
	StringBuilder sb= new StringBuilder();
	String sb1 = sb.toString();
	String[]sb2=sb1.split(" ");
	while ((ch=rd.read())!=-1) {
		System.out.print((char)ch);	
		sb.append((char) ch);
		//System.out.println("Reversing the sentence by words");
		for (int i=sb2.length-1;i>=0;i--) {
			System.out.print(sb2[i] + " ");	
	}
	}}
	
	//System.out.println();
	//System.out.println("-------------");
	//System.out.print(sb);
	//System.out.println();
	
	
	
	
	public static void readalldata() throws IOException {
		String Dirpath= System.getProperty("user.dir");
		FileInputStream fi = new FileInputStream(new File (Dirpath + "/Resources/Jan2024.xlsx"));
		XSSFWorkbook wb =new XSSFWorkbook(fi);
		XSSFSheet sheet =wb.getSheet("Sheet1");
		Iterator<Row>rowit =sheet.rowIterator();
		while(rowit.hasNext()) {
			Row row= rowit.next();
			Iterator<Cell> cellit=row.cellIterator();
			while(cellit.hasNext()) {
				Cell cell=cellit.next();
					switch(cell.getCellType()) {
			case STRING:
			System.out.println(cell.getStringCellValue() + "\t");
			break;
			case NUMERIC:
			System.out.println(cell.getNumericCellValue() + "\t");
			break;
			case BOOLEAN:
			System.out.println(cell.getBooleanCellValue() + "\t");
			break;
			case FORMULA:
			System.out.println(cell.getCellFormula() + "\t");
			break;
			case BLANK:
			System.out.println("Blank" + "\t");
			break;
			default:
			System.out.println("Unknown" + "\t");
		}
					fi.close();
	}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//readalldata();
		ReadingandwritingfileusingReader();
}
}
