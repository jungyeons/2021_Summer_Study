import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public void createFile() {
		Filewriter fw;
		try {
			fw = new FileWriter("c:/rose/test2.txt");
	     String data = "Ƽ���\r\n";
	     fw.write(data);
	     data = "���罺\r\n";
	     fw.write(data);
	     data = "� ���ϱ�? �ȳ�\r\n";
	     fw.write(data);
	     fw.close();
	     System.out.println("���� ����");
			
		} catch (IOException e) {
		     e.printStackTrace();
		  }
		
	}

}
