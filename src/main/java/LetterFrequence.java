public class LetterFrequence {
    public int[] listFrequences(String input){
        //index 0 is 'a', 1 is 'b' ... 25 is 'z'
        int[] res = new int[26];
        String lowers = input.toLowerCase();
        for(int i=0;i<lowers.length();i++){
            char c = lowers.charAt(i);
            if(c - 'a' >= 0 && 'z' - c <= 25){
                res[c - 'a']++;
            }
        }
        return res;
    }
}
