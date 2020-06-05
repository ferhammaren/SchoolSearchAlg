/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9algoritmos;

/**
 *
 * @author Ferhammaren
 */
public class BusquedaBinaria {
 public  BusquedaBinaria(){
     
 }
 
 public String busqueda(int x,int n, int[] v){
     int izq=1;
     int der=n;
     int b=0;
     int cen=0;
     while(izq<=der&&b==0){
         cen=(izq+der)/2;
         if (x==v[cen]) {
             b=1;
         }
         else if(x>v[cen]){
             izq=cen+1;
             
         }
         else{
             der=cen-1;
         }
     }
     if (b==1) {
         return "El elemento esta en "+(cen+1);
     }
     else{
         return "El elemento no esta en el arreglo";
     }
 }
}
