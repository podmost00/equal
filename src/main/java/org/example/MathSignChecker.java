package org.example;



public class MathSignChecker {
    static boolean checkSign(String eq) {
        for (int i = 1; i < eq.length(); i++) {
            char prevChar = eq.charAt(i - 1);
            char currentChar = eq.charAt(i);
            if (!eq.contains("=")){
            return false;
            }
            if (currentChar == '=' && i == eq.length()-1){
                return false;
            }
            if ((prevChar == '+' || prevChar == '-' || prevChar == '*' || prevChar == '/') && currentChar == '-'){

                prevChar = eq.charAt(i);
                currentChar = eq.charAt(i+1);
                if ((prevChar == '+' || prevChar == '-' || prevChar == '*' || prevChar == '/') &&
                        (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/')) {

                    return false;
                }
            } else {
                prevChar = eq.charAt(i-1);
                currentChar = eq.charAt(i);
                if ((prevChar == '+' || prevChar == '-' || prevChar == '*' || prevChar == '/') &&
                        (currentChar == '+' || currentChar == '*' || currentChar == '/')) {
                    return false;
                }
            }



        }
        return true;

    }


}

