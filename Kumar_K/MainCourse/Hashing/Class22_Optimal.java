package Kumar_K.MainCourse.Hashing;

public class Class22_Optimal {
    static void main(String[] args) {
        String s = "mononom";
        String t = "mon";
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];
        for(char c : s.toCharArray()){
            sFreq[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            tFreq[c - 'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++){
            if(tFreq[i] > 0){
                ans = Math.min(ans, sFreq[i] / tFreq[i]);
            }
        }
        System.out.println(ans);
    }
}
