import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        //1,3,-1,-3,5,3,6,7
        //k:3
        int len = nums.length;
        int []res = new int[len-k+1];
        int index = 0;
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0; i<k; i++){
            while(!deque.isEmpty()&&deque.peekLast()<nums[i])
                deque.removeLast();
            deque.offer(nums[i]);
        }
        res[index] = deque.peekFirst();
        for(int j=k; j<len; j++){
            while(!deque.isEmpty()&&deque.peekLast()<nums[j])
                deque.removeLast();
            deque.offer(nums[j]);
            res[++index] = deque.peekFirst();
        }
        return res;


    }

    public static void main(String[] args) {
        int []nums = {1,3,-1,-3,5,3,6,7};
        int []res = SlidingWindow.maxSlidingWindow(nums,3);
        for (var i:res)
            System.out.println(i);
    }
}
