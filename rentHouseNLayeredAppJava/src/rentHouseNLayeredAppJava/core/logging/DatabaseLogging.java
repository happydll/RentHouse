package rentHouseNLayeredAppJava.core.logging;

public class DatabaseLogging implements Logging {

	public void log(String data) {
		//veritabanı işlemleri
		
		System.out.println("İşlem veritabanına loglandı: " +data);
	}
}
