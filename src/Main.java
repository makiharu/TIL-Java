import java.util.ArrayList;

public class Main {
    public static void printArray(ArrayList<Integer> intArr) {
        for(int i=0; i < intArr.size(); i++) {
            System.out.println(intArr.get(i) + " ");
        }
        System.out.println();
    }

    public static void printFixedIntArray(int[] arr) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> dArr = new ArrayList<Integer>();
        dArr.add(2);
        dArr.add(2);
        dArr.add(3);
        dArr.add(4);
        dArr.add(1);
        dArr.add(-10);
        dArr.add(200);
        printArray(dArr);

        dArr.add(10);
        dArr.add(340);
        dArr.add(543);
        dArr.add(-23);
        printArray(dArr);

        // 固定配列にコピー
        int[] fixedArray = new int[dArr.size()];
        for(int i=0; i < dArr.size(); i++) {
            fixedArray[i] = dArr.get(i);
        }

        printFixedIntArray(fixedArray);
    }
}

