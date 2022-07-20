package lenguaje;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Archivo {
    JFileChooser seleccionar=new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("txt","Txt", "TXT");
    

    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    boolean error=false;
    
    Archivo(){
        seleccionar.setFileFilter(filter);
        
    }

  public String Abrir(File Archivo){
        String documento="";
        int c=1;
        char caracter=' ';
        try{
            
            entrada=new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                 caracter=(char) ascci;
                documento+=caracter;
            }
            error=false;
                
            
        }catch(Exception e){
            error=true;
        }
        return documento;
    }
      
  
  public String Guardar(File archivo, String documento){
        String mensaje=null;
        try{
            salida=new FileOutputStream(archivo);
            byte[] bytxt=documento.getBytes();
            salida.write(bytxt);;
            mensaje="Archivo Guardado";
            error=true;
        }catch(Exception e){
            error=true;
        }
        return mensaje;
        
    }
  
  public String accionAbrir(){
      String documento="";
      if(seleccionar.showDialog(null, "Selecciona el archivo")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    documento=Abrir(archivo);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no es compatible");
                    documento= "";
                }
                
            }
            seleccionar.setCurrentDirectory(archivo);
        }
        return documento;
        
  }
  
    public void accionGuardar(String texto){
        String documento="";
        
      if(seleccionar.showDialog(null,"Guardar")==JFileChooser.APPROVE_OPTION){
             
            archivo=seleccionar.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                 documento=texto;
                String mensaje=Guardar(archivo, documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null, mensaje);
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }else
                JOptionPane.showMessageDialog(null, "No se pudo guardar el documento de texto");
        }
        
  }
    
 
}
