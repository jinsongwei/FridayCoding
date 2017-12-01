public class Encoding {

    public String encode(String input){
        String res = "";
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            res += Character.toString((char)('z' - c + 'a'));
        }
        return res;
    }
}
