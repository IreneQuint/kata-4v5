package kata.pkg4v5;

public class MainHistogramBuilder {
    
    public static Histogram<String> build(ArrayList <String> mail){
        Histogram<String> histogram = new Histogram<>();
        for(String mail : mails){
            histogram.increment(new Mail(mail).getDomain()));
        }
        
        return histogram;
    }
}
