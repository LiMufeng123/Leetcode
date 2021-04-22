import java.util.HashSet;
import java.util.PriorityQueue;

public class 丑数264 {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long>heap = new PriorityQueue<>();
        HashSet<Long>hashSet = new HashSet<>();
        //heap.add(1);//此种方式容器满了会出异常
        heap.offer(1L);//此种方式容器满了会返回false
        hashSet.add(1L);

        int []factors = {2,3,5};
        long ugly = 0;
        for(int i=0; i<n; i++){
           ugly = heap.poll();
           for(var factor:factors){
               if(hashSet.add(ugly*factor)){
                   heap.add(ugly*factor);
               }
           }
        }
        return (int)ugly;
    }
}
