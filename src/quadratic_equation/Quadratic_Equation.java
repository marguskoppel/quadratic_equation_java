package quadratic_equation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadratic_Equation {

    public static void main(String[] args) throws IOException {
        //Set up for input
        BufferedReader in
                = new BufferedReader(new InputStreamReader(System.in));

        //input three doubles for a, b, and c
        //try will catch error if input is not number
        try {
            System.out.print("Type value for 'a' ---> ");
            String input = in.readLine();
            double a = Double.parseDouble(input);

            System.out.print("Type value for 'b' ---> ");
            input = in.readLine();
            double b = Double.parseDouble(input);

            System.out.print("Type value for 'c' ---> ");
            input = in.readLine();
            double c = Double.parseDouble(input);

            //print the three inputs
            System.out.println("===========================\na = " + a
                    + ", b = " + b + ", c = " + c + "\n===========================");

            //create a Quadratic Equation object
            Quadratic quad
                    = new Quadratic(a, b, c);
            //calculate roots
            //first check a, so we don't divide by 0
            if (a == 0) {
                System.out.println("A = 0. Cannot divide by zero!");
            } //next check if disc < 0, using hasSolution()
            else if (quad.hasSolution() == false) {
                System.out.println("Discriminant < 0. No real solutions");
            } //finally calculate and print solutions
            else {
                double solution1 = quad.calculateSolution1();
                double solution2 = quad.calculateSolution2();
                System.out.println("X1 = " + solution1
                        + "\nX2 = " + solution2);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Incorect input");
            System.out.println("Please use numbers!\nNo letters, symbols or spaces");
        }
    }//main

}
