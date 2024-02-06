
public class PasswordGeneratorRunner {

	public static void main(String[] args) {
		PasswordGenerator generator = new PasswordGenerator(4); // Tworzenie obiektu generatora hasła z 10 znakami
        generator.passwordGeneration();
        String generatedPassword = generator.toString();
        System.out.println(generatedPassword);
	}

}
