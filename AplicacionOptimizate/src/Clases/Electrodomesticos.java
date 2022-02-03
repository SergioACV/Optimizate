
package Clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.ImageIcon;



class Electrodomesticos {
    
    //Electrodomesticos
    
    Nevera nevera;
    Microondas microondas;
    Lavadora lavadora;
    Bombillo bombillo;
    
    //Lista de consejos
    protected Object[][] ConsejosFaciles = new Object[3][3];
    protected Object[][] ConsejosComplejos= new Object[3][3];
    protected Object[][] ConsejosModerados= new Object[3][3];
    //Guardar los consejos por llave(nevera,Bombilla,Televisro,Lavadora,Ducha,Cafetera)
    HashMap<String,ArrayList> Consejos = new HashMap<>();
    //ArrayList para guardar los consejos
    protected ArrayList<Object[]> Consejos2;
    //Imagen para representar el objeto
    protected Image Imagen;
    //La imagen pero como un icono
    protected ImageIcon Icono ;
    //numero de aparatos
    int Numero_Electrodomesticos;
    //Herramienta necesaria para leer una imagen
    protected Toolkit miPantalla = Toolkit.getDefaultToolkit();
    //direccion de memoria de la imagen
    String DireccionDeMemoria;
    //entero para saber las horas de uso de electrodomesticos
    private int HorasDeUso; 
    //Booleano para saber si ahorra energia en su casa
    protected boolean Ahorra_Electrodomesticos;    //VARIABLE DE UNA SUPERCLASE
    //Booleano para saber si mensualmente paga caro el recibo
    protected boolean Recibo_Electrodomesticos;     //VARIABLE DE UNA SUPERCLASE
    //Si puede usar menos los electrodomesticos
    protected boolean UsarMenos_Electrodomesticos;  //VARIABLE DE UNA SUPERCLASE
    //Si los aparatos son ahorradores
    protected boolean Ahorradores_Electrodomesticos;  //VARIABLE DE UNA SUPERCLASE
    //Exigencia en el nivel de ahorro (1,2,3) 1 siendo el minimo y 3 el maximo
    protected int Exigencia_Electrodomesticos; //VARIABLE DE UNA SUPERCLASE
    //Enfocarse en electrodomesticos
    private boolean Enfocarse_Electrodomesticos;
    
    public Electrodomesticos(){
        this(1,false,1,false,false,false,false);
        
        
    }
    

    public Electrodomesticos(int HorasDeUso,boolean Enfocarse_Electrodomesticos,int Exigencia_Electrodomesticos , boolean Ahorradores_Electrodomesticos, boolean UsarMenos_Electrodomesticos, boolean Recibo_Electrodomesticos, boolean Ahorra_Electrodomesticos ){
        
        //Horas de uso
        this.HorasDeUso = HorasDeUso;
        
        //Enfocarse en electrodomesticos
        this.Enfocarse_Electrodomesticos = Enfocarse_Electrodomesticos;
        
        //Exigencia en el ahorro
        this.Exigencia_Electrodomesticos =Exigencia_Electrodomesticos ;
        
        
        //Si los aparatos son ahorradores
        this.Ahorradores_Electrodomesticos = Ahorradores_Electrodomesticos;  
        
        //Si usa menos los electrodomesticos
        this.UsarMenos_Electrodomesticos = UsarMenos_Electrodomesticos;
        
        //variable si el recibo llega alto
        this.Recibo_Electrodomesticos = Recibo_Electrodomesticos;
        
        //variable para saber si ahorra electrodomesticos
        this.Ahorra_Electrodomesticos = Ahorra_Electrodomesticos ;
        
        //Crear la imagen con su direccion de memoria
        Imagen = miPantalla.getImage("src/Graphics/Decodificador.png");
        
        //crear la imagen como un Image Icon para diferentes aplicaciones
        Icono = new ImageIcon(Imagen);
        
        //crear el ArrayList donde estaran los consejos
        Consejos2 = new ArrayList<>();
        
        //Configurar el numero de dispositivos
        Numero_Electrodomesticos = 0;
        
        //Configurar direccion de memoria de la imagen
        DireccionDeMemoria = "src/Graphics/Decodificador.png";
    }
    
    public void CrearConsejosTerminados(){
        
        ConfigurarListaDeConsejosIniciales(nevera);
        ConfigurarListaDeConsejosIniciales(bombillo);
        ConfigurarListaDeConsejosIniciales(lavadora);
        ConfigurarListaDeConsejosIniciales(microondas);
        
        Consejos.put("Nevera", nevera.Consejos2);
        Consejos.put("Bombillo", bombillo.Consejos2);
        Consejos.put("Lavadora", lavadora.Consejos2);
        Consejos.put("Microondas", microondas.Consejos2);
    }
    
    //Si el usuario ahorra
    public void ConfigurarAhorraElectrodomesticos(boolean x){   
        Ahorra_Electrodomesticos = x; 
    }
    //Saber si el recibo de la luz le llega caro
    public void ConfigurarReciboElectrodomesticos(boolean x){
        Recibo_Electrodomesticos = x;
    }
    //Si puede usar menos los electrodomesticos
    public void ConfigurarUsarMenosElectrodomesticos(boolean x){
        UsarMenos_Electrodomesticos = x;
    }
    //Configurar si los electrodomesticos son ahorradores
    public void ConfigurarAhorradoresElectrodomesticos(boolean x){
        Ahorradores_Electrodomesticos = x;
    }
    //configurar que tanto va a ser la exigencia en los consejos
    public void ConfigurarExigenciasElectrodomesticos(int x){
        Exigencia_Electrodomesticos = x;
    }
    //boleano para configurarse en un electronico
    public void ConfigurarEnfocarseElectrodomesticos(boolean x){
        Enfocarse_Electrodomesticos = x;
    }
    //Configurar horas de uso
    public void ConfigurarHorasDeUso(int x){      
        HorasDeUso = x;
    }
    //Configurar numero total de electrodomesticos
    public void ConfigurarNumeroDeElectrodomesticos(int numero){  
        Numero_Electrodomesticos = numero;
    }
    //COnfigura La Imagen del electronico en caso de que se cambie la direccion de memoria
    public void configurarImagenElectrodomestico(String direccionDeMemoria){
        
        boolean flag = true;
        
        Scanner sc = new Scanner(System.in);
        
        while(flag){
            
            DireccionDeMemoria = sc.nextLine();
            try{
                Imagen = miPantalla.getImage(direccionDeMemoria);
                flag= false;
            }catch(Exception e){
                
                System.out.println("Direccion Incorrecta. Vuelva e intente");
            }
            
        }  
        
        ConfigurarImageIconElectrodomestico();
    }
    
    //Configura el ImageIcon
    private void ConfigurarImageIconElectrodomestico(){
        Icono = new ImageIcon(Imagen); 
    }
    
 
    //GETTERS
    
        
    public boolean ObtenerAhorraElectrodomesticos(){
        return Ahorra_Electrodomesticos ;  
    }
    
    public boolean ObtenerReciboElectrodomesticos(){
        return Recibo_Electrodomesticos;
    }
    
    public boolean ObtenerUsarMenosElectrodomesticos(){
        return UsarMenos_Electrodomesticos;
    }
    
    public boolean ObtenerAhorradoresElectrodomesticos(){
        return Ahorradores_Electrodomesticos ;
    }
    
    public int ObtenerExigenciasElectrodomesticos(){
        return Exigencia_Electrodomesticos ;
    }
    public boolean ObtenerEnfocarseElectrodomesticos(){
        return Enfocarse_Electrodomesticos;
    }
 
    //Configurar horas de uso
    public int ObtenerHorasDeUso(){      
        return HorasDeUso ;
    }
    
    
    //Configurar numero total de electrodomesticos
    public int ObtenerNumeroDeElectrodomesticos(){  
        return Numero_Electrodomesticos;
    }
    
    //COnfigura La Imagen del electronico en caso de que se cambie la direccion de memoria
    public Image ObtenerImagen(String direccionDeMemoria){
        
        return Imagen;
  
    }
    
    //Configura el ImageIcon
    private ImageIcon ObtenerImageIcon(){
        
        return Icono ;
        
    }
    //AJUSTAR LA LISTA DE CONSEJOS SEGUN LAS NECESIDADES
    

    public  void ConfigurarListaDeConsejosIniciales(Nevera tipo){

        //Hacer filtro de los consejos segun la encuesta

        //Si la persona se considera ahorradora 
        int ahorro1 = 1;
        int ahorro2 = 1;
        if(Ahorra_Electrodomesticos){
            ahorro1 = 2;
            ahorro2 = 5;    
        }if(UsarMenos_Electrodomesticos){
            ahorro1 = 3;
            ahorro2 = 6;
        }
        if(Ahorradores_Electrodomesticos){
            ahorro1 = 3;
            ahorro2 = 7;
        }   
        if (HorasDeUso > 13){
            Exigencia_Electrodomesticos = 2;
        }
        //Si puede dejar de usar un aparato o Si son ahorradores

        if(Ahorra_Electrodomesticos || UsarMenos_Electrodomesticos || Ahorradores_Electrodomesticos){
            
            for(int a =0; a<3;a++){
              tipo.ConsejosFaciles[a][1] = (int) tipo.ConsejosFaciles[a][1] *ahorro1;
            }
  
            for(int a =0; a<3;a++){
                tipo.ConsejosComplejos[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                 tipo.ConsejosModerados[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo_Electrodomesticos){
            if(Exigencia_Electrodomesticos == 1 ){
                                                 
            
                for(Object[] a:tipo.ConsejosFaciles){
                     tipo.Consejos2.add(a);
                }

                for(int a =0; a<tipo.ConsejosModerados.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }    
            
            }else if(Exigencia_Electrodomesticos == 2){

                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosComplejos.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            }else if(Exigencia_Electrodomesticos==3){
            
                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            
            
            }
        }else{
            for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosModerados[a]);
            }
            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
            }
        }
        
    }
     public  void ConfigurarListaDeConsejosIniciales(Microondas tipo){

        //Hacer filtro de los consejos segun la encuesta

        //Si la persona se considera ahorradora 
        int ahorro1 = 1;
        int ahorro2 = 1;
        if(Ahorra_Electrodomesticos){
            ahorro1 = 2;
            ahorro2 = 5;    
        }if(UsarMenos_Electrodomesticos){
            ahorro1 = 3;
            ahorro2 = 6;
        }
        if(Ahorradores_Electrodomesticos){
            ahorro1 = 3;
            ahorro2 = 7;
        }   
        //Si puede dejar de usar un aparato o Si son ahorradores

        if(Ahorra_Electrodomesticos || UsarMenos_Electrodomesticos || Ahorradores_Electrodomesticos){
            
            for(int a =0; a<3;a++){
              tipo.ConsejosFaciles[a][1] = (int) tipo.ConsejosFaciles[a][1] *ahorro1;
            }
  
            for(int a =0; a<3;a++){
                tipo.ConsejosComplejos[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                 tipo.ConsejosModerados[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo_Electrodomesticos){
            if(Exigencia_Electrodomesticos == 1 ){
                                                 
            
                for(Object[] a:tipo.ConsejosFaciles){
                     tipo.Consejos2.add(a);
                }

                for(int a =0; a<tipo.ConsejosModerados.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }    
            
            }else if(Exigencia_Electrodomesticos == 2){

                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosComplejos.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            }else if(Exigencia_Electrodomesticos==3){
            
                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            
            
            }
        }else{
            for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosModerados[a]);
            }
            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
            }
        }
        
    }
      public  void ConfigurarListaDeConsejosIniciales(Bombillo tipo){

        //Hacer filtro de los consejos segun la encuesta

        //Si la persona se considera ahorradora 
        int ahorro1 = 1;
        int ahorro2 = 1;
        if(Ahorra_Electrodomesticos){
            ahorro1 = 2;
            ahorro2 = 5;    
        }if(UsarMenos_Electrodomesticos){
            ahorro1 = 3;
            ahorro2 = 6;
        }
        if(Ahorradores_Electrodomesticos){
            ahorro1 = 3;
            ahorro2 = 7;
        }   
        //Si puede dejar de usar un aparato o Si son ahorradores

        if(Ahorra_Electrodomesticos || UsarMenos_Electrodomesticos || Ahorradores_Electrodomesticos){
            
            for(int a =0; a<3;a++){
              tipo.ConsejosFaciles[a][1] = (int) tipo.ConsejosFaciles[a][1] *ahorro1;
            }
  
            for(int a =0; a<3;a++){
                tipo.ConsejosComplejos[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                 tipo.ConsejosModerados[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo_Electrodomesticos){
            if(Exigencia_Electrodomesticos == 1 ){
                                                 
            
                for(Object[] a:tipo.ConsejosFaciles){
                     tipo.Consejos2.add(a);
                }

                for(int a =0; a<tipo.ConsejosModerados.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }    
            
            }else if(Exigencia_Electrodomesticos == 2){

                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosComplejos.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            }else if(Exigencia_Electrodomesticos==3){
            
                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            
            
            }
        }else{
            for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosModerados[a]);
            }
            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
            }
        }
        
    }
       public  void ConfigurarListaDeConsejosIniciales(Lavadora tipo){

        //Hacer filtro de los consejos segun la encuesta

        //Si la persona se considera ahorradora 
        int ahorro1 = 1;
        int ahorro2 = 1;
        if(Ahorra_Electrodomesticos){
            ahorro1 = 2;
            ahorro2 = 5;    
        }if(UsarMenos_Electrodomesticos){
            ahorro1 = 3;
            ahorro2 = 6;
        }
        if(Ahorradores_Electrodomesticos){
            ahorro1 = 3;
            ahorro2 = 7;
        }   
        //Si puede dejar de usar un aparato o Si son ahorradores

        if(Ahorra_Electrodomesticos || UsarMenos_Electrodomesticos || Ahorradores_Electrodomesticos){
            
            for(int a =0; a<3;a++){
              tipo.ConsejosFaciles[a][1] = (int) tipo.ConsejosFaciles[a][1] *ahorro1;
            }
  
            for(int a =0; a<3;a++){
                tipo.ConsejosComplejos[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                 tipo.ConsejosModerados[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo_Electrodomesticos){
            if(Exigencia_Electrodomesticos == 1 ){
                                                 
            
                for(Object[] a:tipo.ConsejosFaciles){
                     tipo.Consejos2.add(a);
                }

                for(int a =0; a<tipo.ConsejosModerados.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }    
            
            }else if(Exigencia_Electrodomesticos == 2){

                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosComplejos.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            }else if(Exigencia_Electrodomesticos==3){
            
                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            
            
            }
        }else{
            for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosModerados[a]);
            }
            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
            }
        }
        
    }
      
   
}


