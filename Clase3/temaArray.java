package Clase3;

    public class temaArray{

    public static void temaArrays() { 
        
        int numeros[] = new int[3]; 

        numeros[0] = 1; 
        numeros[1] = 37; 
        numeros[2] = 16; 

        int mayor = numeros[0] = 1; 
        int menor = numeros[0] = 1; 
        int sumatoria = 0; 
        int promedio; 
        for(int i=0; i<(numeros.length); i++){ 
            if (numeros[i] > mayor) { mayor = numeros[i]; 
                } if (numeros[i] < menor) { menor = numeros[i]; 
                    } sumatoria = sumatoria + numeros[i]; 
        } 
        
        for (int numero : numeros){ 
            if (numero < menor) { 
                menor =numero; 
        } 
        if (numero > mayor) { 
            mayor =numero; 
        } 
        sumatoria = sumatoria + numero; 
    } promedio = sumatoria /numeros.length; 

    System.out.println(menor); 
    System.out.println(mayor); 
    System.out.println(sumatoria); 
    System.out.println(promedio); 

    }

    public static void ordenar(){ 
        int numeros[] = {15,18,6,14,20}; 
        int aux; 
        int j; 
        int nuevaPosicion; 
        for(int i=1; i<(numeros.length); i++){ // Identifica posicion del elemento en el paso 
            j = i-1; 
            while(numeros[i] < numeros[j] && j >=0) { 
                j=j-1; 
                if (j == -1){ 
                    break; 
                } 
            } nuevaPosicion = j+1; // Desplazar el vector 
            if (nuevaPosicion < i) { 
                aux = numeros[i]; 
                for(int k=i; k>nuevaPosicion; k--){ 
                    numeros[k] = numeros[k - 1]; 
                } 
                numeros[nuevaPosicion] = aux; 
            } 
        } for(int i=0; i<(numeros.length); i++){ 
            System.out.println(numeros[i]);
        } 
    }

}