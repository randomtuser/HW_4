package cuatro;

import java.awt.*;

public class model {
    view v;
    public model(view v){
        this.v = v;
    }

    void change1(Color color){
        System.out.println("changing");
        v.setColors1(color);
    }
    void change2(Color color){
        System.out.println("changing");
        v.setColors2(color);
    }

}
