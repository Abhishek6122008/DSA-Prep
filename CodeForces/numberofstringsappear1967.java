public class numberofstringsappear1967 {
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            int len = Math.min(patterns[i].length(), word.length());
            for (int j = 0; j < len; j++) {
                if(word.charAt(j)==patterns[i].charAt(j)){
                    count++;
                }
            }
        }return count-1;
    }
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns,word));
    }
}
