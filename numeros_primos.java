public class numeros_primos {
    public static void main(String[]args){

        System.out.println("Números primos entre 1 y 100:");
        

            for (int i = 2; i <= 100; i++) {
            int contadorDivisores = 0;
            

                for (int j = 2; j < i; j++) { 
                    if (i % j == 0) { 
                     contadorDivisores++;
                     break;
                    }
                }
            
            if (contadorDivisores == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
        
    

