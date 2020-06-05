/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9algoritmos;

import java.util.Objects;

/**
 *
 * @author Ferhammaren
 */
public class Hashing {
   // String placas;
    int hash;
    public Hashing(){
    }
    
    public int hashCode(String placas){
          int hash1 = 600011;
        int code=Objects.hashCode(placas);
        hash = code%hash1;
        if (hash<0) {
            hash=hash+600011;
        }
        return hash;
    }
    
}
