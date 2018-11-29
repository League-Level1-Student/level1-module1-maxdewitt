
public class CatRunner {
public static void main(String[] args) {
	Cat kitten = new Cat("Bob");
	kitten.meow();
	kitten.printName();
	for (int i = 0; i < 9; i++) {
		kitten.kill();
		
	}
}
}
