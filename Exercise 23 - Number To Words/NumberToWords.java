public class NumberToWords {
    public static void numberToWords(int num){
        if(num<0){
            System.out.println("Invalid Value");
        }
        int rev = reverse(num);
        for (int i=0; i<getDigitCount(num);i++){
            switch(rev%10){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");
                    break;
            }
            rev /= 10;
        }

    }
    public static int reverse(int num){
        int reverseNumber = 0;

        while (num != 0) {
            reverseNumber = (reverseNumber * 10) + (num % 10);
            num /= 10;
        }
        return reverseNumber;
    }
    public static int getDigitCount(int num){
        if(num<0){
            return -1;
        }
        int aux = 1;
        while(num > 9){
            num /= 10;
            aux++;
        }
        return aux;
    }
}