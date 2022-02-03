
package Clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;

class Nevera extends Electrodomesticos{
    
    private final double EnergiaGastadaMes = 44.64;

    ArrayList<Object[]> Consejos2= new ArrayList<>();
    
    
    Object[][] ConsejosModerados= {
        {"No te excedas con el frio, si esta muy alto, bajale",10},
        {"Limpia tu nevera UwU",8}, 
        {"Comprueba que tu nevera este en buen estado",5}
    };
    
    Object[][] ConsejosComplejos = {
            {"Si la puerta de tu nevera no cierra hermeticamente, mandala a arreglar",15},
            {"Si tu nevera esta en un lugar caliente, cambiala de lugar",12},
            {"Las neveras antiguas gastan mucha energia, si es el caso, cambiala por una nueva",30}};
    Object[][] ConsejosFaciles= {
        {"Si tu nevera esta llena, vaciala un poco",3}, 
        {"Descongela comida dentro del mismo congelador",3},
        {"Revisa si la puerta de tu nevera esta abierta",2}, 
        {"No introduzcas alimentos calientes",3}};;
    
    
    public Nevera(){
        
        super();
         //Crear la imagen con su direccion de memoria
        Imagen = miPantalla.getImage("src/Graphics/Nevera.png");
        
        //crear la imagen como un Image Icon para diferentes aplicaciones
        Icono = new ImageIcon(Imagen);
        
        
    }
    //Si la persona es ahorradora, el porcentaje de ahorro es mayor

    
}



