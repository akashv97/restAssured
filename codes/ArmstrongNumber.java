package codes;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        int num = 9474;
        System.out.println(num + " is an Armstrong number? " + isArmstrong(num));
    }
    
}
