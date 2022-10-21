public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number){
        int last = number%10;
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 0;
        }
        while(number >= 10){
            number /= 10;
        }
        return last+number;
    }
}