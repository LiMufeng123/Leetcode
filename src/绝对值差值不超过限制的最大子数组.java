import java.util.*;


public class  绝对值差值不超过限制的最大子数组 {
    public static int longestSubarray1(int[] nums, int limit){
        int left = 0;
        int right = 0;
        int max = 0;
        Deque<Integer>maxDeque = new LinkedList<>();//首元素的值最大，递减顺序排放
        Deque<Integer>minDeque = new LinkedList<>();//尾元素的值最大，递增顺序排放
        while(right<nums.length){
            while(!maxDeque.isEmpty()&&maxDeque.peekLast()<nums[right])
                maxDeque.removeLast();
            while(!minDeque.isEmpty()&&minDeque.peekLast()>nums[right])
                minDeque.removeLast();

            maxDeque.add(nums[right]);
            minDeque.add(nums[right]);
            right++;
            while(maxDeque.peekFirst()-minDeque.peekFirst()>limit){
                if(maxDeque.peekFirst()==nums[left])    maxDeque.removeFirst();
                if(minDeque.peekFirst()==nums[left])    minDeque.removeFirst();
                left += 1;
            }
            max = Math.max(max,right-left);


        }
        return max;

    }




    public static int longestSubarray(int[] nums, int limit) {
        //用一个有序map来维护一个滑动窗口
        int left = 0;
        int right = 0;
        int len = nums.length;
        int max = 0;
        //4,2,2,2,4,4,2,2
        TreeMap<Integer,Integer>map = new TreeMap<>();
        while(right<len){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1 );

            while(Math.abs(map.firstKey()-map.lastKey())>limit){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)
                    map.remove(nums[left]);
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;

    }

    public static void main(String[] args) {
        int []arr = {4,2,2,2,4,4,2,2};
        int res = longestSubarray1(arr,0);
        System.out.println(res);
    }
}
