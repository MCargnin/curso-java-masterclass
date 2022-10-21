public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int aux = number;
        int n = 0;
        while(aux != 0){
            reverse *=10;
            reverse += aux%10;
            aux /= 10;
            n++;
        }
        for(int i=0; i<=n; i++){
            if(number%10 != reverse%10){
                return false;
            }
            number /= 10;
            reverse /= 10;
        }
        return true;
    }
}