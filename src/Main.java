import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution{
    public static int maxAscilString(String[] stringList){
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i < stringList.length; i++) {
            int sum = 0;
            for(int j=0; j< stringList[i].length(); j++) {
                int code = stringList[i].charAt(j);
                sum+=code;
            }
            numbers.add(sum);
        }

        //　最大値を調べる
        int index = maxSum(numbers);

        return index;
    }

    private static int maxSum(List<Integer> numbers) {
        int max = numbers.get(0);
        int maxNumberIndex = 0;
        for(int i=0; i < numbers.size(); i++) {
            if(max < numbers.get(i)) {
                max = numbers.get(i);
                maxNumberIndex = i;
            }
        }

        return maxNumberIndex;
    }
}

