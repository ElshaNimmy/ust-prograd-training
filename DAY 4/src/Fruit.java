public interface Fruit {
    void shape();
    void color();
    default void show(){
        System.out.println("Fruits are good for health");
    }
}
