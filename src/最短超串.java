import java.util.HashMap;

public class 最短超串 {
    public int[] shortestSeq(int[] big, int[] small) {
        int []res = {};
        int smallLen = small.length;
        int bigLen = big.length;
        int left = 0;
        int right = 0;
        int minLen = bigLen;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<smallLen; i++){
            map.putIfAbsent(small[i],1);
        }
        while(right<bigLen){
            if(map.containsKey(big[right])&&(map.get(big[right])>0)){
                map.replace(big[right],map.get(big[right])-1);
                smallLen--;
            }
            while(smallLen==0){
                if(right-left<minLen){
                    minLen = right - left;
                    res = new int[]{left, right};
                }
                if(map.containsKey(big[left])){
                    map.replace(big[left],map.get(big[left])+1);
                    smallLen++;
                }
                left++;
            }
            right++;
        }

        return res;
    }
}
