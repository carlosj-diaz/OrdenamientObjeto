package ordenamientoobjeto;

import javax.swing.JOptionPane;

/**
 *
 * @author carlos diaz
 */
public class OrdenamientoObjeto {

    
    public static void main(String[] args) {
       
        Estudiantes[] arrayEstudiantes = new Estudiantes[5];
        arrayEstudiantes[0] = new Estudiantes ("Juan", "Garcia", "123", 5, 5.0);
        arrayEstudiantes[1] = new Estudiantes ("Carlos", "Diaz", "1234", 3, 4.8);
        arrayEstudiantes[2] = new Estudiantes ("Arley", "Cortez", "12345", 4, 4.5);
        arrayEstudiantes[3] = new Estudiantes ("Sebastian", "Alarcon", "123456", 2, 4.2);
        arrayEstudiantes[4] = new Estudiantes ("Pedro", "Polania", "1234567", 1, 2.0);
        
    
    
     int temp;
        for(int i=1;i<arrayEstudiantes.length;i++){
            for(int j=0;j<arrayEstudiantes.length;j++){
                if(arrayEstudiantes[j].getNota()<arrayEstudiantes[j+1].getNota()){
                    temp=arrayEstudiantes[j].getPuesto();
                    arrayEstudiantes[j].setPuesto(arrayEstudiantes[j+1].getPuesto());
                    arrayEstudiantes[j+1].setPuesto(temp);
                }
            }
        }
    for (int x=0; x < arrayEstudiantes.length; x++){
        JOptionPane.showMessageDialog(null, arrayEstudiantes[x].imprimir());
        }
    }
    
}