public class DiagonalStar {
    public static void printSquareStar(int num){
        if(num<5){
            System.out.print("Invalid Value");
        }
        else{
            for(int j=1;j<=num;j++){
                for(int i=1;i<=num;i++){
                    if(i==1 || i==num || j==1 || j==num || i==j || j==(num-i+1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}