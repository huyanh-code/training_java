package once;

public class Dictionary<K, V, I> {
    private K key;
    private V value;
    private I info;

    public Dictionary(K key, V value, I info){
        this.key =  key;
        this.value = value;
        this.info = info;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }
}
