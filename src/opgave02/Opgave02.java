package opgave02;

public class Opgave02 {
    public static void main(String[] args) {

        checkParantheses("((()))");
        checkParantheses("(()))");

    }

    public static boolean checkParantheses(String input) {

        int[] temp = new int[6];

        for (char c : input.toCharArray()) {
            if (c == '(') {
                temp[0]++;
            }
            if (c == ')' && temp[0] > temp[1]) {
                temp[1]++;
            }
            if (c == '[') {
                temp[2]++;
            }
            if (c == ']' && temp[2] > temp[3]) {
                temp[3]++;
            }
            if (c == '{' ) {
                temp[4]++;
            }
            if (c == '}' && temp[4] > temp[5]) {
                temp[5]++;
            }
        }

        if (temp[0] == temp[1] && temp[2] == temp[3] && temp[4] == temp[5]) {
            System.out.println("Rigtig");
            return true;
        } else {
            System.out.println("Forkert");
            return false;
        }
    }
}
