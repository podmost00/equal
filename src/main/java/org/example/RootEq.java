package org.example;

import java.util.*;

public class RootEq {
    static Scanner scan = new Scanner(System.in);

    static void RootEqCheacker (String eq){
        System.out.println("Бажаєте ввести корінь?");
        System.out.println("1. Так");
        System.out.println("2. Ні");
        int choose = scan.nextInt();
        if (choose == 1){

            System.out.println("Введіть корінь");
            String root = scan.next();
            List<String> list = new ArrayList<>();
            String left = "";
            String right = "";
            list = List.of(eq.split(""));
            for (String s : list) {
                if (Objects.equals(s, "=")) {
                    break;
                }
                if (!Objects.equals(s, "x")) {
                    left = left + s;
                } else {
                    left = left + root;
                }

            }
            int counter = 0;
            for (String s : list) {
                if (Objects.equals(s, "=")){
                    counter++;
                    continue;
                }
                if (counter == 1){
                    right = right + s;

                }

            }
            String expressionText = left;
            List<Lexeme> lexemes = LexemeBuffer.lexAnalyze(expressionText);
            LexemeBuffer lexemeBuffer = new LexemeBuffer(lexemes);
            boolean trueRoot = (LexemeBuffer.expr(lexemeBuffer)) == Integer.parseInt(right);
            if(trueRoot){
                DataBase.addRoot(root);
                System.out.println("Корінь рівняння вірний, збереженно до бази даних");
            } else {
                System.out.println("Число не є коренем рівняння");
            }

        } else {
            return;
        }
    }
}







