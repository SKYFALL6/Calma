public class fibonacci {
    public static void main(String[]args){
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print(firstNumber + ", " + secondNumber);
        for (int i = 2; i < 50; i++){
            
            int thirdNumber= firstNumber+secondNumber;
            System.out.print(", " + thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        } 












    }
}
