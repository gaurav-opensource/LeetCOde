


public class onlypractice {
    public static void main(String[] args) {
        String[] str = {"main", "main", "maiaa"};
        StringBuilder ans = new StringBuilder();

        int len = str.length;
        String first = str[0];
        String last = str[len - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                System.out.println("Longest common prefix: " + ans.toString());
                break; // Exit the loop when characters don't match
            }
            ans.append(first.charAt(i));
        }

       
    }
}
