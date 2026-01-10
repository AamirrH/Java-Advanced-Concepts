
public enum EnumExample {
    /*Enum is a special keyword short for enumeration that allows us to create a list of
      constants grouped by their content: seasons, colors, states, etc
      Enums are basically a way to store a set of predefined values */
    // An Enum of different types of MOODS
    ANGRY(78), /* By creating an argument constructor we can assign another value
                           with the preset values of the enum       */
    SAD(67),
    HAPPY(54),
    DEPRESSED(4),
    MOTIVATED(100),
    FLIRTY(69);
    EnumExample(int moodScore) {
        this.moodScore = moodScore;
    }
    private final int moodScore;
}


void main() {
    EnumExample mood1 = EnumExample.FLIRTY;
    System.out.println(mood1.name());
    // Prints the current mood associated with mood1 variable of the enum.
    System.out.println(mood1.moodScore);
    // Prints the moodscore associated with that mood,
    // we can even change this value through a variable and setter method, unless not final.
    System.out.println(mood1.ordinal());
    /* Prints the number in which the mood is ordered, starting from 0
    0 - ANGRY
    1 - SAD
    2 - HAPPY
    3- DEPRESSED
    4 - MOTIVATED
    5 - FLIRTY
     */
    for (EnumExample mood : EnumExample.values()) {
        System.out.println(mood);
    }
    /* Prints all of the values of the enum with the help of EnumName.values() function.

     */
    // Switch case works best using an Enum
    switch(mood1){
        case MOTIVATED:
            System.out.println("I AM MOTIVATED");
            break;
        case DEPRESSED:
            System.out.println("I AM DEPRESSED");
            break;
        case FLIRTY:
            System.out.println("I AM FLIRTY");
            break;
        case SAD:
            System.out.println("I AM SAD");
            break;
        case ANGRY:
            System.out.println("I AM ANGRY");
            break;
        case HAPPY:
            System.out.println("I AM HAPPY");
            break;
    }

}


