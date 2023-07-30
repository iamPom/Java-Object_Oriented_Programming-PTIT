// code:
// name:
package Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 *
 * @author Pom
 */
public class IOFile {
    public static <T> List<T> doc(String file) {
        List <T> list = new ArrayList<>();
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
            list =(List<T>)o.readObject();
            o.close();
        } catch (FileNotFoundException ex) {          
        } catch (IOException ex) {           
        } catch (ClassNotFoundException ex) {           
        }
        return list;
    }
    
    public static <T> void viet(String file, List<T> arr){
        try {
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(arr);
            o.close();
        } catch (FileNotFoundException ex) {           
        } catch (IOException ex) {          
        }        
    }   
}




