public class SumOddRange {
    public static boolean isOdd (int number){
        if(number > 0 && number%2 != 0){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        int total = 0;
        if(start > end || start <= 0 || end <= 0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(isOdd(i)){
                total += i;
            }
        }
        return total;
    }
}