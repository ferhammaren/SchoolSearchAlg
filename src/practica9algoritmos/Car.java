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
public class Car {
    private String placas;
    private String propietario;
    private int year;
    private int costo;
    private int hash;
private double tenencia;
    
    public Car(String placas, int year,String propietario, int costo) {
        this.placas = placas;
        this.propietario = propietario;
        this.year = year;
        this.costo = costo;
  
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public int hashCode() {
     Hashing ha=new Hashing();
     return ha.hashCode(placas);
    }

    public void newHash(int diff){
       hash= hashCode()+3;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (!Objects.equals(this.hashCode(), other.hashCode())) {
            return false;
        }
        return true;
    }

    
    public void setTenencia(){
     
    }
    
    public double getTenencia(){
         double costo=getCosto();
        if (costo<=260000) {
            tenencia=0;
        }else{
           double dep1=2013-getYear();
           double dep=.10*dep1;
            tenencia=(costo-(costo*dep));
        }
        return tenencia;
    }


    @Override
    public String toString() {
        return "Car{" + "placas=" + placas + ", propietario=" + propietario + ", year=" + year + ", costo=" + costo + '}';
    }
    
    
}
