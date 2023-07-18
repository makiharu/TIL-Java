import java.util.Arrays;

class Solution{
    public static String maxOfPairSum(int[] arr1, int[] arr2, int x){
        if(arr1.length == 0) {
            return "no pair";
        }

        if(arr2.length == 0) {
            return "no pair";
        }

        int[] newArr = new int[arr1.length * arr2.length];
        int index = 0;
        for(int i=0; i< arr1.length; i++) {
            for(int j=0; j< arr2.length; j++) {
                newArr[index] = arr1[i] + arr2[j];
                index++;
            }
        }

        // xより小さい最大値
        int max = newArr[0];
        boolean flg = false;
        for(int i=0; i < newArr.length; i++) {
            if(max < newArr[i] && newArr[i] < x) {
                max = newArr[i];
                flg = true;
            }
        }

        if(flg) {
            return String.valueOf(max);
        } else {
            return "no pair";
        }
    }
}

