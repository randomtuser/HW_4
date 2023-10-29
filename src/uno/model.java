package uno;



import java.util.HashSet;

public class model {
    HashSet<String> all ;
    public model(){
        all = new HashSet<String>();
        System.out.println("resetam");
    }
    public void add(String cineText, String peliText){
        System.out.println("ADDIND TO THE SET");
        all.add(cineText +" " + peliText);
        for (String fruit : all)
            System.out.println(fruit);


        }




}
