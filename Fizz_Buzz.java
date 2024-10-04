public class Fizz_Buzz {
    public static void main(String[] args) {
        int NUMERO_MAXIMO=100;
        for (int i = 1; i <= NUMERO_MAXIMO; i++) {

            if (i % 3 == 0 && i % 5 == 0){

            System.out.println("fizzbuzz");
            System.out.println("------------------------");
            

            }else if(i % 5 == 0){

                System.out.println("buzz");
                System.out.println("------------------------");

            }else if (i % 3 == 0){

                System.out.println("fizz");
                System.out.println("------------------------");}
               

                else {System.out.println(i);
                    System.out.println("------------------------");
                    
            }

        }
    }
}    

 