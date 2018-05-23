/*Bracket validation
        Given a string containing brackets ‘(’, ‘)’, ‘{’, ‘}’, ‘[’ and ‘]’,
        determine if the input string is valid.
        The brackets must close in the correct order.

        Format
        Input
        {string}

        Output
        { is correct | isn’t correct }

        Example 1
        Input ()[({(())})]
        Output is correct

        Example 2
        Input ([)]
        Output isn’t correct*/

package HomeWork3WithTest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        inputCheck(input);
    }

    public static String inputCheck(String input) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);

            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return "Output isn`t correct";
                }
            }
        }
        return "Output is correct";
    }
}