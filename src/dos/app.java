package dos;


public class app {

    public static void main(String[] args) {
         view v;
         controler c;
         model m;

        v = new view();
        m = new model();
        c = new controler(v,m);




    }
}
