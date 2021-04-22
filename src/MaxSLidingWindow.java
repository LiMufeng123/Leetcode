public class MaxSLidingWindow {
    public static int equalSubstring(String s, String t,int maxCost) {
        int len = s.length();
        int []differ = new int[len];

        for(int i = 0; i<len; i++){
             differ[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        //下面寻找differ数组小于给定值的最长子串
//        int curLen = 0;
          int finalLen = 0;

        int left = 0;
        int right = 0;
        int count = 0;
        while (right < len){

            if(count <= maxCost){//没达到指定值
                count += differ[right];
            }

            while(count > maxCost){
                count -= differ[left++];
            }
            finalLen = Math.max(finalLen,right - left + 1);
            //finalLen = Math.max(finalLen,curLen);
            right++;
        }
        return finalLen;
    }

    public static void main(String[] args) {
        int res = MaxSLidingWindow.equalSubstring("krrgw","zjxss",19);
        System.out.println(res);




    }
}
