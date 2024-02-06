import java.util.ArrayList;
import java.util.Random;

public class PasswordGenerator {
	private ArrayList<Character> password = new ArrayList<>();
	private int numOfChar;
	
	public PasswordGenerator(int numOfChar) {
		super();
		this.numOfChar = numOfChar;
	}
	
	public void passwordGeneration () {
		Random random = new Random();
		char[] asciTable = new char[92];
		for(int i = 0; i < asciTable.length; i++) {
			asciTable[i] = (char)(i+32);
		}
		
		for(int k = 0; k < numOfChar; k++) {
			int r = random.nextInt(asciTable.length);
			password.add(asciTable[r]);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Character ch : password) {
		    sb.append(ch);
		}
		String result = sb.toString();
		return result;
	}
		
}
