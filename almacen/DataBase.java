/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import Utilities.PedirDatos;
import java.util.ArrayList;

/**
 *
 * @author finfanterodal
 */
public class DataBase {
    //
  
    private  String ref;
    private String cod;
    ArrayList<DataBase> bd = new ArrayList<>();
    //

    public DataBase(String ref, String cod) {
        this.ref = ref;
        this.cod = cod;
    }

    public DataBase() {
    }
    //

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    
    //
    
   public void darValores(){
       bd.add(new DataBase(PedirDatos.StringVal("ref producto en Base de Datos"),PedirDatos.StringVal("cod producto en Base de Dados")));
   }
   public String buscarRef(String codigo){
       String referencia="";
       for (DataBase lista : bd) {
            if (codigo.equals(lista.getCod())) {
               referencia=lista.getRef();
            }else{
               break;             
            }
       }
       return referencia;
   }
   
       public void amosar() {
        System.out.println("\nDatos base de datos");
        for (DataBase ele : bd) {
            System.out.println(ele);
        }
    }

    @Override
    public String toString() {
        return "referencia=" + ref + ", codigo=" + cod;
    }
   
       
}
