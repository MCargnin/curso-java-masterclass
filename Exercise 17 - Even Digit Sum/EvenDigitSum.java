public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int soma = 0;
        if(number < 0){
            return -1;
        }
        while(number > 0){
            if (number%2 == 0){
                soma += number%10;
            }
            number /= 10;
        }
        return soma;
    }
}