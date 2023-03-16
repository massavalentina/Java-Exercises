package Clase4;

public class Clase4 {

    public static void temaMatriz() { 
        int numeros[][] = new 
        int[3][5]; 
        for(int i=0; i<3; i++){ 
            for(int j=0; j<5; j++){ 
                numeros[i][j] = 1; 
            } 
        } System.out.println(numeros[0][1]); 
    }


    public static float Promedio(
        int numerosaPromediar[]) { 
            int sumatoria; 
            float promedio; 
        sumatoria = Sumatoria(numerosaPromediar); 
        promedio = sumatoria /numerosaPromediar.length; 
        return promedio; 
    }


    private static int Sumatoria(
        int numerosaSumar[]) { 
            int sumatoria = 0; 
            for(int i=0; i<(numerosaSumar.length); i++){
                 sumatoria = sumatoria + numerosaSumar[i]; 
                } 
                return sumatoria; 
            }
            
            public static void main(String args[]) {
                 int numero1 = Integer.parseInt(args[0]); 
                 int numero2 = Integer.parseInt(args[1]); 
                 int numero3 = Integer.parseInt(args[2]); 
                 if (args[3] == "D"){
                      if (numero1 > numero2){
                           if (numero2 > numero3){
                                System.out.println(numero1); 
                                System.out.println(numero2); 
                                System.out.println(numero3); 
                            } 
                        } }
                    }
}

