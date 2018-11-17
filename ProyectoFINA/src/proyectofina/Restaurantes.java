/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofina;

public class Restaurantes {
    
    private String nombrePlatillo;
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;
    private int precio;

    public Restaurantes(String nombrePlatillo,int precio) {
        this.nombrePlatillo = nombrePlatillo;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
        this.precio = precio;
    }

    public Restaurantes(String ingrediente1, String ingrediente2, String ingrediente3) {
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3=ingrediente3;
    }
    
    @Override
    public String toString() {
        if(ingrediente3!=null){
            
        return  ingrediente1 + ", " + ingrediente2 + ", " + ingrediente3 ;
        
        }
        else{
        return  nombrePlatillo + " Precio: " +precio+"\n";
        }   
    }    
}
