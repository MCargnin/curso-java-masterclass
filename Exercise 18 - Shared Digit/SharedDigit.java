public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }
        int aux1 = num1;
        int aux2 = num2;
        while(aux1 > 0){
            aux2 = num2;
            while (aux2 > 0){
                if(aux1%10 == aux2%10){
                    return true;
                }
                aux2 /= 10;
            }
            aux1 /= 10;
        }
        return false;
    }
}