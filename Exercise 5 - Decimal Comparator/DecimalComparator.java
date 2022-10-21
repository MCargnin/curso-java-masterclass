public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){
        int aux1 = (int)(num1*1000);
        int aux2 = (int)(num2*1000);
        if (aux1 == aux2){
            return true;
        }
        return false;
    }
}