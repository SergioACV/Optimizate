/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;

class Microondas extends Electrodomesticos{
    
    
    private final double EnergiaGastadaMes = 3;
    ArrayList<Object[]> Consejos2= new ArrayList<>();
    
    Object[][] ConsejosFaciles ={
        {"No la abras antes de tiempo",3},
        {"Calienta varias cosas",3},
        {"Bajale a los minutos de calentamiento",2},
                                 
    };
    Object[][] ConsejosNeveraModerados = {
        {"Usa Recipientes Circulares",10},
        {"Limpia el microondas",8},
        {"Comprueba que el microondas este en buen estado",5}
    };
    
    Object[][] ConsejosNeveraComplejos ={
        {"Compra papel Stretch para calentar tu comida",15},
        {"Usa vidrio Pirex para calentar tu comida",12},
         
    };
    
    
    public Microondas(){
        
         //Crear la imagen con su direccion de memoria
        Imagen = miPantalla.getImage("src/Graphics/Microondas.png");
        
        //crear la imagen como un Image Icon para diferentes aplicaciones
        Icono = new ImageIcon(Imagen);
    }
    //Si la persona es ahorradora, el porcentaje de ahorro es mayor
    

    
    
}
