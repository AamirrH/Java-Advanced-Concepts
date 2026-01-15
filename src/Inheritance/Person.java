package Inheritance;

public class Person {

    private int id;

    public String name;

    protected int age;

    public String ethnicity;

    public Person(int id, String name, int age, String ethnicity) {
        System.out.println("Parents Constructor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.ethnicity = ethnicity;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void details(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ethnicity: " + ethnicity);
    }




}
class Asian extends Person{

    public int intelligence;

    public Asian(int id, String name, int age,String ethnicity,int intelligence) {
        System.out.println("Child Constructor called");
        this.intelligence = intelligence;
        super(id, name, age, ethnicity);
    }

    public void AsianPower(){
        System.out.println("Maximum Intelligence, HARVARD");
    }


}
class Main{
    static void main(String[] args) {

        Person person1 = new Asian(2,"Shiko Moto",23,"Japanese",124);
        /*person1 contains the address of an Asian Object Created and person1 points to it.
        we can say that the Asian Object created is also a Person.
        Every Asian is a Person, but not every Person is an Asian.
        But since the Reference is a person it can only access what's common between the
        Person class and Asian class, that is the Person Methods, fields and constructors.
         */
        person1.getId();
        person1.details();


    }
}