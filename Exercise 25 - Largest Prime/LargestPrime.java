public class LargestPrime {
    public static int getLargestPrime(int num){
        int aux = 1;
        int i = 1;
        while(num>1){
            if(num%i == 0){
                num /= i;
                aux = i;
                i = 1;
            }
            i++;
        }
        if(aux!=1){
            return aux;
        }
        return -1;
    }
}