package threenovmber;

public class SingletonModel {
    public static void main(String[] args) {
        SingletonEx ex1 = SingletonEx.getInstance();
        SingletonEx ex2 = SingletonEx.getInstance();
        System.out.println(ex1);                // both object same object address threenovmber.SingletonEx@4dd8dc3
        System.out.println(ex2);
    }
}
