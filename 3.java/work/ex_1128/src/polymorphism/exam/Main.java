package polymorphism.exam;

public class Main {
	public static void main(String[] args) {
		Animal[] zoo = {new Animal(), new Dog(), new Cat()};
		
		for(Animal animal : zoo) {
			animal.sound();
		}
		
		AnimalTrainer trainer = new AnimalTrainer();
		
		trainer.train(zoo[1]);
		trainer.train(zoo[2]);
	}
}
