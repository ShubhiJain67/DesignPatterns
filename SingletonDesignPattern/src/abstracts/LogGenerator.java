package abstracts;

public abstract class LogGenerator {
	public void catchData(String data) {
		System.out.println("Catching : " + data);
	}
	
	public void writeData(String data, String fileName) {
		System.out.println("Writing : " + data + " to file : " + fileName);
	}
	
	public abstract void getInstanceCount();
}
