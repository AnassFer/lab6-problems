package problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the capacity of the library: ");
        int n = scan.nextInt();

        Library lib = new Library(n);


    }

}
