package Access_Modifiers;
/*This is a public class, and it should be accessible everywhere (Outside the package,
inside the package, in other classes that extend it or don't.
 */
public class ExamplePublicClass {

    public String language = "Java";

    protected int languageVersion  = 25;

    private String languageCompiler = "Java Compiler";

    public static void doSomething(ExamplePublicClass examplePublicClass) {
        examplePublicClass.languageCompiler="Kotlin Compiler";
        System.out.println("Doing Something...");
        System.out.println(examplePublicClass.languageCompiler);

    }

}
class BaseClass extends ExamplePublicClass{

    void main(){



    }




}

