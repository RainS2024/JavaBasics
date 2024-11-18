package Java_Hackathon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Q33.Using a poi library , 
//add hyperlink to the cell data in a xl file.
public class Q33 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Dirpath= System.getProperty("user.dir");
		System.out.print(Dirpath);
		File file = new File (Dirpath + "/Resources/Jan2024.xlsx");
		FileOutputStream fo = new FileOutputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Custom Links");
		XSSFCell cell;
		
		CreationHelper helper=wb.getCreationHelper();
		XSSFCellStyle linkstyle = wb.createCellStyle();
		XSSFFont linkfont = wb.createFont();
		linkfont.setUnderline(XSSFFont.U_SINGLE);
linkstyle.setFont(linkfont);
cell = sheet.createRow(1).createCell(2);
cell.setCellValue("Link");
XSSFHyperlink link =(XSSFHyperlink)helper.createHyperlink(HyperlinkType.URL);
link.setAddress("https://tekarch.com/");
cell.setHyperlink(link);
cell.setCellStyle(linkstyle);
wb.write(fo);
	}

}
