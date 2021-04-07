package madlib;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       String adj1;
       String national;
       String person;
       String noun;
       String adj2;
       String noun2;
       String adj3;
       String adj4;
       String plurnoun;
       String noun3;
       String number;
       String shapes;
       String food;
       String food2;
       String number2;
       String Answer;
       	System.out.println("Hello Github hopefully this appears through Jenkins test 3")
        Scanner op = new Scanner(System.in);

        System.out.println("Hello Welcome to my very bad MadLib.");
        System.out.println("");

        System.out.println("Please enter an adjective.");
        adj1 = op.next();

        System.out.println("Please enter a nationality. ");
        national = op.next();

        System.out.println("Please enter a person.");
        person = op.next();

        System.out.println("Please enter a noun.");
        noun = op.next();

        System.out.println("Please enter an adjective.");
        adj2 = op.next();

        System.out.println("Please enter a noun.");
        noun2 = op.next();

        System.out.println("Please enter an adjective.");
        adj3 = op.next();

        System.out.println("Please enter an adjective.");
        adj4 = op.next();

        System.out.println("Please enter a plural noun.");
        plurnoun = op.next();

        System.out.println("Please enter a noun.");
        noun3 = op.next();

        System.out.println("Please enter a number.");
        number = op.next();

        System.out.println("Please enter a shape.");
        shapes = op.next();

        System.out.println("Please enter an food.");
        food = op.next();

        System.out.println("Please enter an food.");
        food2 = op.next();

        System.out.println("Please enter a number.");
        number2 = op.next();

        System.out.println("Are you ready for the MadLib?  (yes/no)");
        Answer =  op.next();


        if (Answer == "yes"){
            System.out.println("okay here goes...");
        } else System.out.println("Too bad, here it goes...");

        System.out.println("");
        System.out.println("");

        System.out.println("Pizza was invented by a " + adj1 + " " + national );
        System.out.println("chef named " + person + "." + " " + "To make Pizza, you need" );
        System.out.println("to take a lump of " + noun + ", and make a thin, round " );
        System.out.println(adj2 + " " + noun2 + ". " + "Then you cover it with " );
        System.out.println(adj3 + " sauce, " + adj4 + " cheese, and fresh " );
        System.out.println("chopped " + plurnoun + ". Next you have to bake it in a very " );
        System.out.println("hot " + noun3 + ". " + "When it is done, cut it into " + number );
        System.out.println(shapes + ". Some kids like " + food + " pizza the" );
        System.out.println("best, but my favorite is the " + food2 + " pizza. if I could, I");
        System.out.println("would eat pizza " + number2 + " times a day!");




    }
}