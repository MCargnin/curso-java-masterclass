public class PerfectNumber {
    public static boolean isPerfectNumber(int num){
        int perf = 0;
        if(num<1){
            return false;
        }
        for(int i=1; i<num; i++){
            if(num%i == 0){
                perf += i;
            }
        }
        if (perf == num){
            return true;
        }
        return false;
    }
}