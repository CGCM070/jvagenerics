package generics.parametrizar;

public class ParImpl <K,V,U> implements Par<K,V> {

    private K clave;
    private V valor;
    private U otro;


    public ParImpl(K clave, V valor, U otro) {
        this.clave = clave;
        this.valor = valor;
        this.otro = otro;
    }

    public ParImpl( K clave, V valor) {
        this.valor = valor;
        this.clave = clave;
    }

    @Override
    public K getClave() {
        return clave;
    }

    public ParImpl<K, V, U> setClave(K clave) {
        this.clave = clave;
        return this;
    }

    public U getOtro() {
        return otro;
    }

    public ParImpl<K, V, U> setOtro(U otro) {
        this.otro = otro;
        return this;
    }

    @Override
    public V getValor() {
        return valor;
    }

    public ParImpl<K, V, U> setValor(V valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {
        return "ParImpl{" +
                "clave=" + clave +
                ", valor=" + valor +
                ", otro=" + otro +
                '}';
    }
}
