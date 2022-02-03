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
class Lavadora extends Electrodomesticos{
    
    
    private final double EnergiaGastadaMes = 4.4;
    ArrayList<Object[]> Consejos2 = new ArrayList<>();
    
    Object[][] ConsejosFaciles ={
        {"Lee las instrucciones de la lavadora y siguelas estrictamente",3},
        {"Acumula la mayor cantidad de ropa hasta cuando creas conveniente lavar",3},
        {"Seca tu ropa al aire libre, evita la secadora",3},
        
                        
    };
    Object[][] ConsejosNeveraModerados = {
        {"Utiliza un buen detergente que use menos agua",10},
        {"Lava con agua fria",8},
        {"Usa programas cortos para lavar tu ropa de diario",8},
        {"Saca tu ropa apenas termine de lavar, asi no se arruga y evitas usar la plancha",3}
    };
    
    Object[][] ConsejosNeveraComplejos ={
        {"Si tu lavadora es muy antigua, consigue una eficiente",20},
        {"Manten la lavadora en buenas condiciones",12},
        {"Limpia el fitro",10}
         
    };
    
    
    public Lavadora(){
        
         //Crear la imagen con su direccion de memoria
        Imagen = miPantalla.getImage("src/Graphics/Lavadora.png");
        
        //crear la imagen como un Image Icon para diferentes aplicaciones
        Icono = new ImageIcon(Imagen);
    }
    //Si la persona es ahorradora, el porcentaje de ahorro es mayor
    
    
    
}

