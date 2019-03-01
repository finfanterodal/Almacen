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
public class Almacen {
    //
    private String ref;
    private int unidades;
    ArrayList<Almacen> alm= new ArrayList<>();
     //

    public Almacen(String ref, int unidades) {
        this.ref = ref;
        this.unidades = unidades;
    }

    public Almacen() {
    }
    //

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    //
    public void darValores() {
        alm.add(new Almacen(PedirDatos.StringVal("ref producto en Almacen"), PedirDatos.intVal("unidades producto en almacen")));
    }

    public int buscarRef(String ref) {
        int numUds = 0;
        for (Almacen lista : alm) {
            if (ref.equals(lista.getRef())) {
                numUds = lista.getUnidades();
            } else {
                numUds = 0;
            }
        }
        return numUds;
    }

    public void amosar() {
        System.out.println("\nDatos Almacen");
        for (Almacen ele : alm) {
            System.out.println(ele);
        }
    }

    @Override
    public String toString() {
        return "referencia=" + ref + ", Unidades=" + unidades;
    }
    
}
