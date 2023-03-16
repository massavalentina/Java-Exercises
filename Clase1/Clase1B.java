package Clase1;

public class Clase1B {

    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;
        
        //     while(numeroInicio % 2 == 0 && numeroInicio < numeroFin ){
        //         System.out.println(numeroInicio++);
                
        //     }

        if(numeroInicio % 2 == 0){
            while(numeroInicio < numeroFin){
                System.out.println(numeroInicio++);
                numeroFin = numeroFin -2;
            } 
        }
    };

};