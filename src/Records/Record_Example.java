package Records;

public record Record_Example(
        String name,
        String type,
        int number
){
    public String name(){
        return name + "Hussain";
    }

}

