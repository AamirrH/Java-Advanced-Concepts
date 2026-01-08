//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Object, Reference and Classes In-Depth Logic
    Car carRef = new Car();
    // carRef stores the reference to the Car Object created in heap memory
    System.out.println(carRef); // Prints location of Car Object Car@8efb846
    Car carRef2 = carRef;
    System.out.println(carRef2); /* Prints location Car@8efb846 again,
    carRef actually stores the reference of actual Car Object
    created which looks something like Car@8efb846
    when we assign carRef2 to carRef we are actually assigning,
    carRef2 to the reference Patient@8efb846
    hence carRef2 and carRef now refer to the same object.
    */


}
