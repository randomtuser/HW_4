package cinco;

import java.awt.*;

public class model {
    CircleDrawing c = new CircleDrawing();
    public  model(){
    }

    public void setCircleColor(Color color) {
        c.changeColor(color);
    }
    public void changeRadius(int  st) {
        c.changeRadius(st);
    }


}
