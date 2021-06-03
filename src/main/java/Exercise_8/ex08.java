/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Write a program to evenly divide pizzas. Prompt for the number of people,
 the number of pizzas, and the number of slices per pizza.
 Ensure that the number of pieces comes out even.
 Display the number of pieces of pizza each person should get.
 If there are leftovers, show the number of leftover pieces.

Example Output
How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.
 */
package Exercise_8;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nHow many people? ");
        int people = input.nextInt();

        System.out.print("\nHow many pizzas do you have? ");
        int pizzas = input.nextInt();

        System.out.print("\nHow many slices per pizza? ");
        int slices = input.nextInt();

        System.out.printf("\n%d people with %d pizzas (%d slices)\n", people, pizzas, pizzas * slices);
        System.out.printf("Each person gets %d pieces of pizza\n", (pizzas * slices) / people);
        System.out.printf("There are %d leftover pieces", (pizzas * slices) % people);
    }
}
