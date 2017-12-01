import sun.jvm.hotspot.utilities.Assert;

public class Main {
    public static void main(String[] args) {
//        Singleton s = Singleton.getSingleton();
//        testMostOccurrence();
//        testArmStrongNumber();
//        testEncoding();
        testLetterFrequence();
    }

    public static void testMostOccurrence(){
        MostOccurrence m = new MostOccurrence();
        int nums[] = {1,1,1,2,2,2,2,6,0};
        System.out.println(m.findMostOccurrence(nums));
    }

    public static void testArmStrongNumber(){
        int number = 153;
        Armstrong a = new Armstrong();
        System.out.println(a.checkArmStrongNumber(number));
    }

    public static void testEncoding(){
        String test1 = "a";
        String test2 = "z";
        String test3 = "acd";
        Encoding e = new Encoding();
        System.out.println(e.encode(test1));
        System.out.println(e.encode(test2));
        System.out.println(e.encode(test3));

        assert e.encode(test1).equals("z");
        assert e.encode(test2).equals("a");
        assert e.encode(test3).equals("zxw");
    }

    public static void testLetterFrequence(){
        String test = "Hello there! Apple!";
        LetterFrequence lf = new LetterFrequence();
        int[] res = lf.listFrequences(test);
        for(int n : res){
            System.out.println(n);
        }
    }
}
