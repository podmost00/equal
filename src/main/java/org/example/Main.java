package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import static org.example.BreacketsChecker.checkBrackets;
import static org.example.DataBase.searchByRoot;
import static org.example.MathSignChecker.checkSign;
import static org.example.RootEq.RootEqCheacker;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        DataBase.DB();
        Scanner scan = new Scanner(System.in);
        int x = 0;

        String s ="";
        Scanner scanner = new Scanner(System.in);


        while (!"3".equals(s)){
            System.out.println("1. Ввести рівняння");
            System.out.println("2. Пошук рівнянь за коренем");
            System.out.println("3. Вихід");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Невірний вибір");
            }

            switch (x){
                case 1:
                    System.out.println("Введіть рівняння:");
                    String eq = scanner.nextLine();
                    if (checkBrackets(eq)) {
                        if (checkSign(eq)) {
                            System.out.println("Рівняння введено коректно");
                            DataBase.addEq(eq);
                            RootEqCheacker(eq);
                        } else {
                            System.out.println("Помилка в знаках");
                        }
                    } else {
                        System.out.println("Помилка з дужками");
                    }
                    break;
                case 2:
                    System.out.println("Введіть корінь для пошуку: ");
                    String search = scanner.nextLine();
                    searchByRoot(search);
                    break;
            }
        }
    }



    }







