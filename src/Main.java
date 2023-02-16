public class Main {


    public static void main(String[] args) {
        Backend [] backends = {new Java(),new Python(),new CSharp()};
        for (Backend b:backends) {
            System.out.println(b.toString());
            System.out.println(b.getClass());
            boolean isIt = b instanceof Backend;
            System.out.println(isIt);

        }
        Java java = new Java();
boolean is = java instanceof Backend;
        System.out.println(is);


    }
}