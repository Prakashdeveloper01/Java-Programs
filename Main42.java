public class Main42 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        animal.eat();
        animal.behaviour();
        
        cat.eat();
        cat.behaviour();
        
        dog.eat();
        dog.behaviour();
    }
}
