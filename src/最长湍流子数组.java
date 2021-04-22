public class 最长湍流子数组 {
    public int maxTurbulenceSize(int[] arr) {
        //维护一个长度不定的窗口，找到该窗口的最大值。
        //abcdefg
        //要求a-b  b-c  c-d  d-e 。。。互相异号
        int len = arr.length;
        if(len == 1)    return 1;
        int left = 0;
        int right = 1;
        int count = 0;
        if(arr[left]!=arr[right])     count = 2;
        else{
            count = 1;
            left++;
        }

        for(; right<len-1; right++){
            int num1 = arr[right-1] - arr[right];
            int num2 = arr[right] - arr[right+1];
            if(num1*num2<0)     count++;
            else if(num1*num2==0) {
                left = right+1;
                count = 1;
            }
            else{
                left = right;
                count = 2;
            }
            count = Math.max(count,right-left+1);
        }
            return count;
    }
}
