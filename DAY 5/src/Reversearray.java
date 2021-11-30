class Print<E>{
    public void displayArray(E[] array){
        Object[] newArray = new Object[array.length];

        for (int i = 0; i <array.length ; i++)

        {
            newArray[i]=array[array.length-i-1];
        }
        for (int i = 0; i <newArray.length ; i++)

        {
            System.out.print(newArray[i]);
        }
    }
}
public class Reversearray {

    public static void main(String[] args) {

        Integer[] integerArray = {1,2,3};
        String[] stringArray = {"Hy","Malayalam"};
        Print<Integer> ob1 = new Print<Integer>();
        Print<String> ob2 =new Print<String>();
        ob1.displayArray(integerArray);
        ob2.displayArray(stringArray);
    }
}