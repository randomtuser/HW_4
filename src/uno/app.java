package uno;


public class app {
    public static void main(String[] args) {

        model m = new model();
        view v = new view(m);
        lowerPanel lower = new lowerPanel(m);
        controler c = new controler(v, m);


    }
}
