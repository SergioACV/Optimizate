/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author sergio andres
 */
class Bombillo extends Electrodomesticos{
    
    
    private final double EnergiaGastadaMes = 21.6;
    ArrayList<Object[]> Consejos2= new ArrayList<>();
    
    Object[][] ConsejosFaciles ={
        {"Apaga las luces al salir de la habitacion",3},
        {"Ilumina tu casa con luz natural",3}
                        
    };
    Object[][] ConsejosNeveraModerados = {
        {"Concientiza a los demas de apagar las luces",10},
        {"Sustituye tus bombillos antiguos por unos led",8},
    };
    
    Object[][] ConsejosNeveraComplejos ={
        {"Usa reguladores de intensida de luz a los niveles mas bajos",20},
        {"Se muy estricto con las horas de uso",12},
         
    };
    
    
    public Bombillo(){
        super();
         //Crear la imagen con su direccion de memoria
        Imagen = miPantalla.getImage("src/Graphics/Bombillo.png");
        
        //crear la imagen como un Image Icon para diferentes aplicaciones
        Icono = new ImageIcon(Imagen);
    }
    //Si la persona es ahorradora, el porcentaje de ahorro es mayor
    
    
    
}

