package exercitiul1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lungime: ");
        int lungime = sc.nextInt();

        System.out.print("Latime: ");
        int latime = sc.nextInt();

        System.out.println("perimetrul este: "+(latime+latime+lungime+lungime));
        System.out.println("aria este :"+(latime*lungime));

        sc.close();


    }

}
