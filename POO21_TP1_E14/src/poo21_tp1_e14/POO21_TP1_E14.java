/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo21_tp1_e14;

import java.util.Arrays;

/**
 *
 * @author blaslopez@gmail.com
 */
public class POO21_TP1_E14 {
    
    private static char sopa[][];
    
    private static char caracterAleatorio(){
        // 65 ≤ A[i, j] ≤ 90 (Código ASCCII)
        return ' ';
    }
    
    private static char obtener(int f, int c){
        return sopa[f][c];
    }
    
    private static void establecer(int f, int c, char car){
        sopa[f][c] = car;
    }
    
    private static boolean coordenadaValida(int f, int c){
        return ( (f<=8)&&(c<=10) );
    }
    
    private static boolean buscarNorte(String p,int f, int c){
        //...
    }
    private static boolean buscarPalabra(String p,int f, int c){
        return ((coordenadaValida(f,c)&&( buscarNorte(p,f,c) || buscarSur(p,f,c) ...     )));
    }
            
    private static char[][] crearSopa(int m, int n){
        char s[][];
        int f,c;
        
        s = new char[m][n];
        for(f=0;f<m;f++)
            for(c=0;c<n;c++){
                s[f][c] = caracterAleatorio();
            }
        
        return s;
    }
    
    private static char[] devolver(int n){
        char res[];
        res = new char[n];
        Arrays.fill(res,' ');
        return res;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sopa de letras");
        sopa = crearSopa(8,10);
       
        
    }
    
}
