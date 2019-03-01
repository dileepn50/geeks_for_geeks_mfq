package Strings;

public class DistinctString {
    public static void main(String[] args) {
        String inputString = "bdaefgabegc";
        char input[] = inputString.toCharArray();

        int visited[] = new int[256];
        for (int i = 0; i < visited.length; i++)
            visited[i] = -1;
        int currentLength = 0;
        int maxLength = -1;
        int posIndex;
        for (int i = 0; i < input.length; i++) {
            posIndex = visited[input[i]];
            if (posIndex == -1 || posIndex < (i - currentLength)) {
                currentLength++;
            }
            else {
                if (currentLength > maxLength)
                    maxLength = currentLength;

                currentLength = i - posIndex;

            }
            visited[input[i]] = i;

        }
        System.out.println("max length = " + maxLength);

    }
} 