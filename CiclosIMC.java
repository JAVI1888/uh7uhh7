package ejer2;
import javax.swing.JOptionPane;
public class CiclosIMC {
    public static void main (String Javi[]){
        float peso, estatura, IMC;
        peso=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu peso"));
        estatura=Float.parseFloat(JOptionPane.showInputDialog("Ingresa tu estatura"));
        IMC= (peso/(estatura * estatura));
        
        if (IMC>18.49){
            System.out.println("Tu peso es bajo");
        }else if (IMC>=18.50&&IMC<=24.99){
            System.out.println("Tu peso es normal");
            
        }else if (IMC>=25&&IMC<=29.99){
            System.out.println("Tu peso es normal");
            
        
           
        }else if (IMC>=30&&IMC<=34.99){
            System.out.println("Tienes obecidad Grado 1");
            
        }else if (IMC>=35&&IMC<=39.99){
            System.out.println("Tienes obecidad Grado 2");
            
            
        }else{
         System.out.println("Obecida morbida");
    }
    
        
    }
    
}
