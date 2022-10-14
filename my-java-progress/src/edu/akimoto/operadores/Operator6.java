package edu.akimoto.operadores;

public class Operator6 {
    public static void main(String[] args) {
        String concatenation ="?";

        concatenation = 1+1+1+"1";

        System.out.println(concatenation);

        concatenation = 1+"1"+1+1;

        System.out.println(concatenation);

        concatenation = 1+"1"+1+"1";

        System.out.println(concatenation);

        concatenation = "1"+1+1+1;

        System.out.println(concatenation);

        concatenation = "1"+(1+1+1);

        System.out.println(concatenation);
    }
}
