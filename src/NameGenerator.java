
public class NameGenerator {

	public static void main(String[] args) {
		String[] firstNames = { "Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah", "William" };
		String[] lastNames = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};
		
		for(int i = 0; i < firstNames.length; i++) {
			for(int j = 0; j < lastNames.length; j++) {
				String firstName = firstNames[i];
				String lastName = lastNames[j];
				
				System.out.println(firstName + " " + lastName + ";");
			}
		}
	}

}
