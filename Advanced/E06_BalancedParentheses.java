package _01_StacksAndQueues_E06_BalancedParentheses;
//createdByBibiloto@16.01.2021

import java.util.ArrayDeque;
import java.util.Scanner;

public class E06_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parentheses = scanner.nextLine();
        ArrayDeque<Character> openParentheses = new ArrayDeque<>();

        //String lookupTableOpen = "([{"; // може да се ползва в иф-овете с lookupTableOpen.contains вместо да се изброяват..

        boolean areBalanced = true;
        //четем стринга чар по чар. ако е отворена скоба, добавяме в стека
        for (int i = 0; i < parentheses.length(); i++) {
            char currentParenthesis = parentheses.charAt(i);

            if (currentParenthesis == '(' || currentParenthesis == '[' || currentParenthesis == '{') {
                openParentheses.push(currentParenthesis);

                //ако е затворена скоба, проверяваме стека дали е празен
            } else if ((currentParenthesis == ')') || (currentParenthesis == ']') || (currentParenthesis == '}')) {
                if (openParentheses.isEmpty()) {
                    areBalanced = false; // ако е празен - неСаБалансирани

                    // иначе, проверяваме дали затворената скоба отговаря на последната отворена от стека
                } else {
                    char currentOpen = openParentheses.pop();
                    if ((currentParenthesis == ')' && currentOpen != '(')
                            || (currentParenthesis == ']' && currentOpen != '[')
                            || (currentParenthesis == '}' && currentOpen != '{')) {
                        areBalanced = false;
                    }
                }
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
        //с тернарен оператор:
//        String output = areBalanced ? "YES" : "NO";
//        System.out.println(output);
    }
}


/*

{[()]}

{[(])}

{{[[(())]]}}

[()][(())]

))]

(())]]
 */
