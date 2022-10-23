import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int numeroInteiro = 0;
        while(true){
            try {
                numeroInteiro = scanner.nextInt();
                //System.out.println(numeroInteiro);
                sum += numeroInteiro;
                avg++;
            }
            catch (java.util.InputMismatchException e){
                System.out.print("SUM = " + sum + " AVG = " + (int) Math.ceil(((float)sum/avg)));
                break;
            }
        }
    }
}