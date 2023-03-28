package org.example;

public class BreacketsChecker {
    static boolean checkBrackets(String eq) {
        int counter = 0;
        for (int i = 0; i < eq.length(); i++) {
            char currentChar = eq.charAt(i);
            if (currentChar == '(') {
                counter++;
            } else if (currentChar == ')') {
                counter--;
                if (counter < 0) {
                    return false;
                }
            }
        }
        return counter == 0;
    }
}

