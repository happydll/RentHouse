package rentHouseNLayeredAppJava.core.logging.fileOperations;

import java.io.File;
import java.io.IOException;

public class FileOperations implements Operations {

	public void create(String filename) {
		try {
			File file = new File("Logs.log");
			if (file.createNewFile()) { // ilk defa oluşturulursa
				System.out.println("Log dosyası Oluşturuldu: " + file.getName());
			} else {
				// dosya zaten varsa
				System.out.println("Log dosyası zaten var!");
			}
		}

		catch (IOException e) {
			System.out.println("Bir hata oluştu");
			e.printStackTrace();
		}
	}

	public void delete(String filename) {
		File file = new File("logs.log");
		
		if(file.delete()) {
			System.out.println("Log dosyası silindi: " + file.getName());
		}
		else {
			System.out.println("Log dosyası silinemedi.");
		}
	}

}
