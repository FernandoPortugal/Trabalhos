package ex_5_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LerArquivoObjeto {

    private static final String filepath= "Funcionario";
    
	protected String lerArquivoObjeto() {
 
        LerArquivoObjeto object = new LerArquivoObjeto();
      
       
		Funcionario f = (Funcionario) object.ReadObjectFromFile(filepath);
        String func = ""+f;
        return func;
    }
 
    public static void WriteObjectToFile(Object serObj) {
 
        try {
 
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("O objeto foi escrito");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }
    public Object ReadObjectFromFile(String filepath) {
        try {
        	 
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            Object obj = objectIn.readObject();
 
            System.out.println("O objeto foi lido");
            objectIn.close();
            return obj;
 
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}