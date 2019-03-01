package Strings;

public class BalancedParantheses {
    public static void main(String[] args) {
        String parenthesesString = "[()]{}{[()()]()}";
        parenthesesMatching(parenthesesString);
    }

    private static void parenthesesMatching(String parenthesesString) {
        char stack[] = new char[parenthesesString.length()];
        int top = -1;
        for (int index = 0; index < parenthesesString.length(); index++) {
            char character = parenthesesString.charAt(index);
            if (character == '{' || character == '(' || character == '[')
                stack[++top] = character;
            else {
                if (top == -1) {
                    System.out.println("parentheses are not matching 1 ");
                    return;
                }
                char removedCharacter = stack[top--];
                if (!((character == '}' && removedCharacter == '{')
                        || (character == ')' && removedCharacter == '(')
                        || (character == ']' && removedCharacter == '['))) {
                    System.out.println("parentheses are not matching 2");
                    return;
                }
            }
        }
        if (top == -1)
            System.out.println("matching ");
        else System.out.println("not matching ");
    }

} 