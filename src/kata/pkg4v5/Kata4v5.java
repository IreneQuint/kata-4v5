package kata.pkg4v5;

import java.util.ArrayList;

public class Kata4v5 {

    public static void main(String[] args) {
        String pathname = "C:\\Users\\usuario";
        ArrayList <String> mailList = MainReader.read(pathname);
        Histogram<String> histogram = MainHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
