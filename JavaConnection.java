package week4.day1;

public class JavaConnection implements DatabaseConnection {
	public void connect() {
		System.out.println("connect");
	}

	public void disconnect() {
	System.out.println("disconnect");
	}

	public void executeUpdate() {
		System.out.println("executeUpdate");
	}
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
}
}