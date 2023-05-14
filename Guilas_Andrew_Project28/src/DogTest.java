
public class DogTest {
	public static void main(String[] args) {
		// Dog dog = new Dog("Spike");
		// System.out.println(dog.getName() + " says " + dog.speak());
		
		Yorkshire yorkshire = new Yorkshire("Michael");
		System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
		System.out.println(yorkshire.getName() + "'s breed weight is " + yorkshire.avgBreedWeight());
		
		Labrador labrador = new Labrador("Clarice", "black");
		System.out.println(labrador.getName() + " says " + labrador.speak());
		System.out.println(labrador.getName() + "'s breed weight is " + labrador.avgBreedWeight());
	}
}