/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Carlos G. Anguiano
 */
public class Fibonacci {
    
    private int fibonacci;
    private String listaFibonacci;
    
    public void calcularFibonacci(int n){
        int fib = 0;
        int n1 = 0;
        int n2 = 1;
        String lis = "0, 1, ";
        for(int i=1; i<n-1; i++){
            fib = n1 + n2;
            if(i!=n-2){
                lis += fib + ", ";
            } else {
                lis += fib;
            }
            n1 = n2;
            n2 = fib;
        }
        this.fibonacci = fib;
        this.listaFibonacci = lis;
    }

    public int getFibonacci() {
        return fibonacci;
    }

    public String getListaFibonacci() {
        return listaFibonacci;
    }
    
}
