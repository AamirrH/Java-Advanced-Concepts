package Basics;

class Language{
   int x = 10; // This is allowed and this is an executable statement ( declaration + value assign)
   int y;
   y = 34; // This is not allowed.
    {
       y = 34; // This is an instantiation block and this is also an executable statement, allowed.
    }
  System.out.println() // Not allowed. needs a method, constructor or a block.
  Language(){
  System.out.println("Hello"); // Allowed, since inside a constructor.
       x = 12; // Allowed, since inside a constructor.
    }
   public void method(){
       System.out.println("method"); // Allowed since inside a method.
       x = 24; // Allowed since inside a method.
   }

}
