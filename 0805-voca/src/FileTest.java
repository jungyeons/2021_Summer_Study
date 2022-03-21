import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public void createFile() {
		Filewriter fw;
		try {
			fw = new FileWriter("c:/rose/test2.txt");
	     String data = "티라노\r\n";
	     fw.write(data);
	     data = "사우루스\r\n";
	     fw.write(data);
	     data = "어떤 맛일까? 냠냠\r\n";
	     fw.write(data);
	     fw.close();
	     System.out.println("정상 실행");
			
		} catch (IOException e) {
		     e.printStackTrace();
		  }
		
	}

}
