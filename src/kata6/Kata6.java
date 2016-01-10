
package kata6;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Kata6 {

    public static void main(String[] args) {
 
        String nameFile = "emails.txt";
        
        
        MailReader mailReader = new MailReader(nameFile);
        ArrayList <Person> mailarray = mailReader.getArrayList();
        HistogramBuilder<Person> builder = new HistogramBuilder(mailarray);
        
        Histogram<String> domains = builder.build(new Attribute<Person, String>() {

            @Override
            public String get(Person item) {
                return item.getMail().split("@")[1];
            }
        });
        
        Histogram<Character> letters = builder.build(new Attribute<Person, Character>() {

            @Override
            public Character get(Person item) {
                return item.getMail().charAt(0);
            }
        });
        
        new HistogramDisplay(domains, "DOMINIOS").execute();
        new HistogramDisplay(letters, "CARACTER").execute();
        
        //Histogram<String> histo = MailHistogramBuilder.build(mailarray);
        //HistogramDisplay histogramDisplay = new HistogramDisplay(histo);
        //new histogramDisplay(histo).execute();
    }
    
}
