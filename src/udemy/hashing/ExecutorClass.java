package udemy.hashing;

public class ExecutorClass {
	public static void main(String[] args) {
		// DirectChaining dc = new DirectChaining(12);
		LinearProbing dc = new LinearProbing(5);
		dc.insert("ram");
		dc.insert("ramvir");
		dc.insert("rampal");
		dc.insert("ramnath");
		//dc.display();
		dc.search("rampal");
		dc.delete("rampal");
		dc.display();
	}

}
