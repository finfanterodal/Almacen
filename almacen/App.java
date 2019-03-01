/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import Utilities.PedirDatos;

/**
 *
 * @author finfanterodal
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        
        int opcion,numEle;
        String aux;
        float prezo;
        Productos p1=new Productos();
        DataBase db=new DataBase();
        Almacen alm=new Almacen();
        //
        do{
        opcion=PedirDatos.intVal("1.Introducir datos."+"\n2.Total"+"\n8.Salir");
        switch (opcion) {
            case 1:
                p1.darValores();  
                p1.amosr();
                db.darValores();
                db.amosar();
                alm.darValores();
                alm.amosar();
                
                break;
            case 2:                
                aux=db.buscarRef(PedirDatos.StringVal("cod de producto"));                
                numEle=alm.buscarRef(aux);            
                prezo=p1.buscarRef(aux);
                System.out.println("Total prezo: "+(numEle*prezo));               
                break;
            default:
                throw new AssertionError();
        }
        }while(opcion!=8);
    }
    
}
