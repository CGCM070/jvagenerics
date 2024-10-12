package generics.parametrizar;

public class Util {

    public static <k, V> boolean equals(Par<String, Integer> p1, Par<String, Integer> p2) {
        return p1.getClave().equals(p2.getClave()) && p1.getValor().equals(p2.getValor());
    }


    public static int obtener(Integer entrada) {
        return entrada;
    }

    public static int obtener(String entrada) {
        return entrada.length();
    }

    public static void main(String[] args) {


        Par<String, Integer> p1 = new ParImpl<>("uno", 1, 1.0);
        Par<String, Integer> p2 = new ParImpl<>("uno", 1, 1.0);
        System.out.println(Util.equals(p1, p2));
        System.out.println(Util.obtener(1));
        System.out.println(Util.obtener("Hola"));

    }


}
