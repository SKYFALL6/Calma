public class Fizz_Buzz {
    public static void main(String[] args) {
        int NUMERO_MAXIMO=100;
        for (int i = 1; i <= NUMERO_MAXIMO; i++) {

            if (i % 3 == 0 && i % 5 == 0){

            System.out.println("fizzbuzz");

            }else if(i % 5 == 0){

                System.out.println("buzz");

            }else if (i % 3 == 0){

                System.out.println("fizz");}

                else {System.out.println(i);
            }

        }
    }
}    

 