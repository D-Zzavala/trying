/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying;

import java.util.ArrayList;
import java.util.Scanner;

public class Trying {

    static Scanner read = new Scanner(System.in);
    static boolean Tf = false;
    static ArrayList list = new ArrayList();

    public static void main(String[] args) {
        while (Tf) {
            System.out.println("Opciones:");
            System.out.println("1. Add");
            System.out.println("2. List");
            System.out.println("3. Remove");
            System.out.println("0. Salir");
            int op = read.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Add");
                    mod();
                    break;
                }
                case 2: {
                    System.out.println("List");
                    mod();
                    break;
                }
                case 3: {
                    System.out.println("Remove");
                    mod();
                    break;
                }
                case 0:
                    System.out.println("Salir");
                    mod();
                    break;
            }
        }
    }

    static void mod() {

    }

}
