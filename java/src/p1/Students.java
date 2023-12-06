package p1;

import java.util.ArrayList;

public class Students {

    public ArrayList<String> myList;

    public Students() {

        this.myList = new ArrayList<String>();
        // create an ArrayList called studentList, which initially holds []

        // add students to the ArrayList
        this.myList.add("John");
        this.myList.add("Lily");
        this.myList.add("Samantha");
        this.myList.add("Samantha3");
        this.myList.add("Lily");
        this.myList.add("Tony");

        // remove John from the ArrayList, then Lily
        this.myList.remove(0);


        this.myList.remove("Lily");
        System.out.println(this.myList.remove("Lily"));
        System.out.println(this.myList.remove("Lily"));

        if (this.myList.contains("Lily")) {
            System.out.println("CONT");
        }else{
            System.out.println("NOT");
        }



        // studentList now holds [Samantha, Tony]

        System.out.print(this.myList);

        for (String one : myList) {
            System.out.println(one);
        }


        System.out.println(myList.size());


    }
}
