package edu.akimoto.anatomiaclasses;

//Métodos
public class MyClass3 {
    public static void main (String [] args) {

        String firstName = "Samuel";
        String middleName = "Akimoto";

        String completeName = completeName(firstName, middleName);
        System.out.println(completeName);
    }
    public static String completeName (String firstName, String middleName) {

        return firstName.concat(" ").concat(middleName);
    }

}
