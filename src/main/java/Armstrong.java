public class Armstrong {

    public boolean checkArmStrongNumber(int num){
        int digit = 0;
        int tmp = num;
        // find number of digits.
        while(tmp != 0){
            digit++;
            tmp /= 10;
        }
        tmp = num;
        int total = 0;
        while(tmp != 0){
            total += Math.pow(tmp % 10, digit);
            tmp /= 10;
        }
        if(total == num)
            return true;
        return false;
    }
}
