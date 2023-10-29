package cinco;

public class app {
    public static void main(String[] args) {
        view v = new view();
        model m = new model();
        controler c = new controler(m,v);




    }
}
