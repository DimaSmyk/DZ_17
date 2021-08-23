package selfwork17.task03;

public class RemoveStr {
    public static void main(String[] args) {
        String base = "Hello there";
        String remove = "e";
        String newBase = base.replace(remove,"");
        System.out.println(newBase);
    }
}
