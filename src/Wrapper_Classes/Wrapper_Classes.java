
public class Wrapper_Classes {

    Integer number;
    Long bigNo;
    Boolean condition;
    /* These are some the Wrapper classes */
}
void main(){

    int num1 = 1000; //Primitive type
    Integer num2 = Integer.valueOf(num1); // Returns the reference of an Object with the value of num1, Boxing
    System.out.println(num2);
    int num3 = num2.intValue(); // Unboxing, Converting the object back to a primitive type.
    System.out.println(num3);

    //Autoboxing and Auto-unboxing :-
    int y = 890;
    Integer Y = y; // Autoboxing
    System.out.println("Wrapper type : "+Y);
    int z = Y; // Auto-Unboxing
    System.out.println("Primitive type : "+z);

    // Parsing using methods of Wrapper Classes
    String number = "51255";
    int convertedNum = Integer.parseInt(number);
    // A String is converted to a int/Integer
    System.out.println("String 51255 converted to an int: "+convertedNum);

    // int/Integer conversion to String :-
    Integer num4 = 34;
    String s = String.valueOf(num4);
    System.out.println("String : "+s);

    /* Similar methods exist for :-
    Long <-> String
    Boolean <-> String
    .
    .
    .
     */

    // Comparing Wrapper Objects
    Integer a = new Integer(10);
    Integer b = new Integer(10);
    System.out.println(a==b); // Prints False because it checks reference.
    System.out.println(a.equals(b)); // Prints true because it checks value not reference
    // Methods like, parseInt, valueOf return references of objects made in heap memory with values, passed as arguments to them.

    // IMPORTANT -> in Wrapper Classes, all types (String,Integer,Long...) CAN be NULL.






}
