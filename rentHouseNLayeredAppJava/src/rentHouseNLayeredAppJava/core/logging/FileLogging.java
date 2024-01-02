package rentHouseNLayeredAppJava.core.logging;

import rentHouseNLayeredAppJava.core.logging.fileOperations.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogging implements Logging {

	public void log(String data) {

		File file = new File("logs.log");

		if (file.exists()) {
			
			try {
				FileWriter writer = new FileWriter("logs.log", true);
				
				Date now = new Date();
				
				writer.write(now + " - " + data +"\n");
				writer.close();
				System.out.println("İşlem dosyaya loglandı: " + data);
			} catch (Exception e) {
				System.out.println("Bir hata oluştu.");
				e.printStackTrace();
			}
			
		} else {
			FileOperations fileOperations = new FileOperations();
			fileOperations.create("Logs.log");
			
			try {
				FileWriter writer = new FileWriter("logs.log", true);
				
				Date now = new Date();
				
				writer.write(now + " - " + data + "\n");
				writer.close();
				System.out.println("İşlem dosyaya loglandı: " + data);
			} catch (Exception e) {
				System.out.println("Bir hata oluştu.");
				e.printStackTrace();
			}
		}

	}

}
