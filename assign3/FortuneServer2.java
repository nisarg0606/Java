package assign3;

import java.util.ArrayList;
import java.util.List;

public class FortuneServer2 {
    private static final int PORT = 28084;
    private List<FortuneEntry> fortunes;

    public FortuneServer2() {
        fortunes = new ArrayList<>();
        FortuneServr fortuneServr = new FortuneServr();
        fortuneServr.parseFortunes();
    }

public void run(int pos){
    
}
}
