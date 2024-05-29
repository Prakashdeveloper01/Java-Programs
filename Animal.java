class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
    
    void behaviour() {
        System.out.println("Animal behaviour varies...");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat is eating...");
    }
    
    
    void behaviour() {
        System.out.println("Cat behaviour: Meowing and Purring...");
    }
}

class Dog extends Animal {
  
    void eat() {
        System.out.println("Dog is eating...");
    }
    void behaviour() {
        System.out.println("Dog behaviour: Barking and Wagging tail...");
    }
}


