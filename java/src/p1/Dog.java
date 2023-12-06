package p1;

public class Dog{
    public String name;

    public void speak(String name){
        // Prints the instance variable named name
        System.out.println(this.name);

        // Prints the local variable named name
        System.out.println(name);

    }
}

