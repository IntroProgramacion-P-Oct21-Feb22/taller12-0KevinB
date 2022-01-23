/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema00 {

    public static void main(String[] args) {
        int[] datos = {10, 2, 4, 1};
        System.out.printf("%d\n", misterio(datos, datos.length)); 
        // envia el arreglo y el tamaño del arreglo
    }

    public static int misterio(int[] arreglo, int tamanio) {
        // el proceso realiza la suma de los elementos del arreglo
        if (tamanio == 1) { // si el arreglo tiene tamaño de 1 presentara el 
                            // unico valor
            
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
            // retorna el arreglo en la posicion x - 1 y le suma la funcion 
            // enviandole el arreglo y la posicion
        }
    }

}


    

