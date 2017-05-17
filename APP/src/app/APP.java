/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author Miguel Rangel
 */

class Objeto {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

public class APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int temp;
        int opt = 0;
        Objeto[] objetos = new Objeto[10];
        while(opt!=5){
            System.out.println("1.-Añadir\n2.-Ver\n3.-Editar\n4.-Eliminar\n5.-Salir");
            opt = sc.nextInt();
            sc = new Scanner(System.in);
            switch(opt){
                case 1:
                    if(index == 9){
                        System.out.println("Arreglo lleno");
                        break;                        
                    }
                    System.out.println("Inserte el nombre del objeto");
                    objetos[index] = new Objeto();
                    objetos[index].setNombre(sc.nextLine());
                    index++;
                    break;
                case 2:
                    if(index == 0){
                        System.out.println("Arreglo vacio");
                        break;                        
                    }if(index == 0)break;
                    for(int i = 0; i< index; i++){
                        System.out.println("Objeto " + (i+1) + " = " + objetos[i].getNombre());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el indice del elemento a modificar");
                    temp = sc.nextInt();
                    //sc = new Scanner(System.in);
                    if(temp<index){
                        System.out.println("Ingrese el nuevo nombre");
                        objetos[temp].setNombre(sc.nextLine());
                    }else{
                        System.out.println("Objeto no encontrado");
                    }
                    break;
                case 4: 
                    System.out.println("Ingrese el indice del elemento a eliminar");
                    temp = sc.nextInt();
                    if(temp<index){
                        for(int i = temp; i<index-1; i++){
                            objetos[i].setNombre(objetos[i+1].getNombre());
                        }
                        index--;
                        System.out.println("Elemento eliminado");
                    }else{
                        System.out.println("Objeto no encontrado");
                    }
                    break;
                case 5: break;
                default: ;
            }
        }
    }
    
}
