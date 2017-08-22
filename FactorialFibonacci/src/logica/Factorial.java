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
public class Factorial {
    
    private int factorial;
    private String listaFactorial;
    
    //Obtiene a través de un loop el valor factorial y a su vez
    //genera una lista del resto de la serie de factoriales
    public void calcularFactorial(int n){
        int fact = 1;
        String lista = "";
        for(long i = 1 ; i<=n; i++){
            if(i!=n){
                lista += i + ", ";
            } else {
                lista += i;
            }
            fact *= i;
        }
        this.factorial = fact;
        this.listaFactorial = lista;
    }

    //Setters y Getters para factorial y listaFactorial
    public int getFactorial() {
        return factorial;
    }

    public String getListaFactorial() {
        return listaFactorial;
    }
    
}
