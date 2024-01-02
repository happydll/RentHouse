package rentHouseNLayeredAppJava.entities;

public class Product {

	//bizim ürünlerimiz ev
	
	private int id; // ilan idsi
	private String name; // ilan isimi
	private String address; // ev adresi
	private double unitPrice; // fiyat
	private double field; // alan m2 cinsinden
	private String numberOfRoom; // oda sayısı
	private String buildingsType;  // ev apartman mı müstakil mi
	private double buildingAge;  // bina yaşı
	private double floorLocation; // kaçıncı kat
	private String furnitureStatus; // eşyalı mı eşyasız mı
	private String explanation; // ilan açıklaması
	
	
	public Product(int id, String name, String address, double unitPrice, double field, String numberOfRoom,
			String buildingsType, double buildingAge, double floorLocation, String furnitureStatus,
			String explanation) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.unitPrice = unitPrice;
		this.field = field;
		this.numberOfRoom = numberOfRoom;
		this.buildingsType = buildingsType;
		this.buildingAge = buildingAge;
		this.floorLocation = floorLocation;
		this.furnitureStatus = furnitureStatus;
		this.explanation = explanation;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		if(address != null) {
			address= address.toLowerCase();
		}
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public double getField() {
		return field;
	}


	public void setField(double field) {
		this.field = field;
	}


	public String getNumberOfRoom() {
		return numberOfRoom;
	}


	public void setNumberOfRoom(String numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}


	public String getBuildingsType() {
		return buildingsType;
	}


	public void setBuildingsType(String buildingsType) {
		this.buildingsType = buildingsType;
	}


	public double getBuildingAge() {
		return buildingAge;
	}


	public void setBuildingAge(double buildingAge) {
		this.buildingAge = buildingAge;
	}


	public double getFloorLocation() {
		return floorLocation;
	}


	public void setFloorLocation(double floorLocation) {
		this.floorLocation = floorLocation;
	}


	public String getFurnitureStatus() {
		return furnitureStatus;
	}


	public void setFurnitureStatus(String furnitureStatus) {
		this.furnitureStatus = furnitureStatus;
	}


	public String getExplanation() {
		return explanation;
	}


	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
}
