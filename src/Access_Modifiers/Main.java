package Access_Modifiers;
import Access_Modifiers.ExamplePublicClass;

public class Main {

    void main(){
        ExamplePublicClass examplePublicClass = new ExamplePublicClass();
        examplePublicClass.languageVersion=23;
        examplePublicClass.language="Kotlin";
        System.out.println("Protected Modifier : "+examplePublicClass.languageVersion);
        System.out.println("Public Modifier : "+examplePublicClass.language);
        ExamplePublicClass.doSomething(examplePublicClass);

        // Protected and Public Modifiers can also be set using an reference variable.




        // Throws a compile time error, since it has private access, within the same class.
        //System.out.println("Private Modifier : "+examplePublicClass.languageCompiler);
    }



}
