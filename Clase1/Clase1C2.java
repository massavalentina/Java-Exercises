package Clase1;

public class Clase1C2 {

  
   

    public static void main(String[] args){
        int numeroInicio = 3;
        int numeroFin= 15;
        boolean soloPares= true;

        if(soloPares){
            if (numeroFin % 2 == 1){
                numeroFin = numeroFin -1 ;
            }
        }
        else {
            if (numeroFin % 2 == 0) {
                numeroFin = numeroFin -1 ;
            }
        }
        
    } 
}
