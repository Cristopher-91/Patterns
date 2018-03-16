package PatternComposite;

import java.util.ArrayList;
import java.util.List;

public class GeneralComposite implements Army {

    private List<Army> army = new ArrayList<>();

    public void gatherArmy(Army unit){
        army.add(unit);
    }

    @Override
    public void fight() {
        for (Army a:army
             ) {a.fight();
        }
    }

    public void say(){
        System.out.println("I am general");
    }
}
