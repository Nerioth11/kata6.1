package kata6;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MailReader {
    private final String pathName;

    public MailReader(String path) {
        this.pathName = path;
    }
    
    public ArrayList<Person> getArrayList () {
        ArrayList<Person> emailList = new ArrayList<>();
        
        try {
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));        
            
            String mail;
            Integer id = 0;
            while ((mail = fileIn.readLine()) != null){
                if (!mail.contains("@"))
                    continue;
                
                //emailList.add(mail);
                emailList.add(new Person(id++, mail));
            }
        }
        catch (Exception e){
            System.out.println("Fichero no existe " + e);
        }
        
        return emailList;
    }
}
