package Clase1;

class Clase1C {

    // public static void main(String[] args) {

    //     int numeroInicio = 5;
    //     int numeroFin = 14;
        
    //     //     while(numeroInicio % 2 == 0 && numeroInicio < numeroFin ){
    //     //         System.out.println(numeroInicio++);
                
    //     //     }

    //     if(numeroInicio % 2 == 0){
    //         while(numeroInicio < numeroFin){
    //             System.out.println(numeroInicio++);
    //             numeroFin = numeroFin -2;
    //         } 
    //     }
    // };


        public static void main(String[] args){
            int numeroInicio = 8;
            int numeroFin= 16;
            boolean soloPares= false;

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
};