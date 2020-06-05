/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9algoritmos;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ferhammaren
 * 
 * 
 */
public class CarControl {
    private Car[] dtm;
    private int size=0;
//private ArrayList<Car> dtm;//=new ArrayList<>();
private HashMap table = new HashMap();
private Hashing as=new Hashing();
public CarControl(int size){
    dtm=new Car[size];
    System.out.println(dtm.length);
}

public void alta(String placas, String propietario, int year, int costo){
    Car n=new Car(placas,year,propietario,costo);
    int pos=as.hashCode(placas);
    System.out.println(pos);
//    if (true) {
//        
//    }
    dtm[pos]=n;
    size++;
}

public boolean eliminar(String placas){
    int search=as.hashCode(placas);
   
    if (dtm[search] == null) {
        return false;
    }else{
     dtm[search]=null;
     return true;
    }
    //dtm.remove(search);
    
}

public Car search(String placas){
  int search=as.hashCode(placas);
    if (dtm[search]==null) {
        return null;
    }else{
    return dtm[search];}
}

public void setProp(String placas,String name){
    int search=as.hashCode(placas);
    if (dtm[search]==null) {
        System.out.println("nope");
    }else{
        dtm[search].setPropietario(name);
    }
}
    public void setYear(String placas, int year){
         int search=as.hashCode(placas);
    if (dtm[search]==null) {
        System.out.println("nope");
    }else{
        dtm[search].setYear(year);
    }
    }
    
    
    public void setCosto(String placas, int costo){
         int search=as.hashCode(placas);
    if (dtm[search]==null) {
        System.out.println("nope");
    }else{
        dtm[search].setCosto(costo);
    }
    }
    
    
    
}
 




    

