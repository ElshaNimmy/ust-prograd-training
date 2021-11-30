class Print<E> {

    public void displayArray(E[] array) {

        for (int i = array.length-1;i>=0; i--) {

            System.out.print(array[i]);
        }
    }
}

public class Reversearray {

    public static void main(String[] args) {

        Integer[] integerArray = new Integer[]{1, 2, 3};
        String[] stringArray = new String[]{"Hy", "Malayalam"};
        Print<Integer> ob1 = new Print<Integer>();
        Print<String> ob2 = new Print<String>();
        ob1.displayArray(integerArray);
        ob2.displayArray(stringArray);
    }
}
