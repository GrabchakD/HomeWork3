/*
        Unix Path
        Given Unix directory path, like /a/..///b/./c/. Your task is to simplified it to /b/c.

        Format
        Input
        { long path as String }

        Output
        { simplifyed path }

        Examples
        /home/ --> /home
        /.. --> / - there is no parrent directory for root directory.
        /.data --> /.data
        /.... --> /.... - it just name of file that contains only dots.
        /home/./a/../b --> /home/b
*/

import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        String input = "/home/a/../dgrabchak";
        String[] result = simplifiedInput(input).toArray(new String[0]);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    public static Stack<String> simplifiedInput(String input) {
        char[] arr = input.toCharArray();
        StringBuilder simplArr = new StringBuilder();
        Stack<String> stack = new Stack<>();


        for (int i = 0; i < arr.length; i++) {
            simplArr.append(arr[i]);

            if (arr[i] == '/') {
                if (simplArr.toString().equals("/./")) {
                    simplArr.delete(0, simplArr.length());
                } else if (simplArr.toString().equals("//")) {
                    simplArr.delete(0, simplArr.length() - 1);
                } else if (simplArr.toString().equals("/../")) {
                    simplArr.delete(0, simplArr.length() - 1);
                    stack.pop();
                } else {
                    stack.push(String.valueOf(simplArr));
                    if (simplArr.length() == 1) {
                        continue;
                    } else {
                        simplArr.delete(0, simplArr.length() - 1);
                    }
                }
            }
        }

        stack.push(String.valueOf(simplArr));

        return stack;
    }
}