public class Python extends  Backend {
    String django(){
        return "Django in Python";
    }

    @Override
    public String toString() {
        return django();
    }
}
