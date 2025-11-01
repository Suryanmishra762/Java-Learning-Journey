class Animal{
    public void makeSound(){
        System.out.println("Sound");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}

class Bird extends Animal{
    public void makeSound(){
        System.out.println("Choo");
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal[] some = new Animal[3];
        some[0] = new Dog();
        some[1] = new Cat();
        some[2] = new Bird();
        
        for(int i = 0; i < some.length; i++){
            some[i].makeSound();
        }
    }
}
