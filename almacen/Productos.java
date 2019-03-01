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
public class Productos {
    //
    private String ref;
    private float prezo;
    ArrayList<Productos> prd = new ArrayList<>();
    //
    public Productos(String ref, float prezo) {
        this.ref = ref;
        this.prezo = prezo;
    }

    public Productos() {
        
    }
    //
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void darValores() {
        prd.add(new Productos(PedirDatos.StringVal("ref Producto"), PedirDatos.floatVal("Prezo Producto")));
    }
    //

    public float buscarRef(String ref) {
        float prezo = 0f;
        for (Productos lista : prd) {
            if (ref.equals(lista.getRef())) {
                prezo = lista.getPrezo();
            } else {
                break;
            }
        }
        return prezo;
    }
        public void amosr() {
        System.out.println("\nDatos Productos");
        for (Productos ele : prd) {
            System.out.println(ele);
        }
    }

    @Override
    public String toString() {
        return  "referencia=" + ref + " prezo=" + prezo;
    }
        
        
}
