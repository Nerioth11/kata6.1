
package kata6;

import java.util.ArrayList;

public class DominioHistogramBuilder {
    public static <T> Histogram <String> execute (ArrayList dominios){

        Histogram<String> histogram = new Histogram<>();
        for (int i = 0; i < dominios.size(); i++) {
            histogram.increment(dominios.get(i).toString());
        }
        return histogram;        
    }
}

