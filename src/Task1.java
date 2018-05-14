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

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        String input = "([)]";
        inputCheck(input);
    }

    public static void inputCheck(String input) {
        char[] arr = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        char temp;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[' )
            {
                stack.push(arr[i]);
            }

            if(arr[i]==')' ||arr[i]=='}' ||arr[i]==']') {

                if(stack.isEmpty()) {
                    System.out.println("Output isn’t correct");
                    break;
                }

                temp = stack.pop();

                if((temp == '(' && arr[i] == ')') || (temp == '{' && arr[i] == '}') || (temp == '[' && arr[i] == ']')) {

                } else {
                    System.out.println("Output isn’t correct");
                    break;
                }
            }
        }
        System.out.println("Output is correct");
    }
}