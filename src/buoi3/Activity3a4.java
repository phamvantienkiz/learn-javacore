package buoi3;

public class Activity3a4 {
    public static void main(String[] args) {
        String s = "Hello student in PlusPlus academy";
        String[] word = s.split(" ");
        String longestword = " ";
        for (int i = 0; i < word.length; i++) {
            for (int j = i +1; j <word.length ; j++) {
                if (word[i].length() >= word[j].length()); {
                    longestword = word[i];
                }
            }
        }
        System.out.println(longestword);

    }
}
