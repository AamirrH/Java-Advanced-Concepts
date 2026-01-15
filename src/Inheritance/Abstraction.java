package Inheritance;

abstract class Animal{

    public boolean exists(){
        return true;
    }
    public abstract void makeSound();

}
class Elephant extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Elephant trumps");
    }
}
class Lion extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Lion roars");
    }
}










public class Abstraction {
    void main(){
        Animal a = new Elephant();
        a.makeSound();
        System.out.println(a.exists());
        Animal b = new Lion();
        b.makeSound();
        Elephant e = new Elephant();
        e.makeSound();
    }
}
