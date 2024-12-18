class MedianFinder {
    Queue<Integer> q1 = new PriorityQueue<>(); // right
    Queue<Integer> q2 = new PriorityQueue<>(Comparator.reverseOrder()); // left
    public int count = 0;
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(count == 0)  // first Element 
        {
            q2.offer(num);
            count++;
        }
        else if(count % 2 == 0)  // comming odd element means has to enter in left 
        {
            int min = q1.peek();
            if(num > min) 
            {
              q1.poll();
              q2.offer(min);
              q1.offer(num);
            }
            else
            {
               q2.offer(num);
            }
            count++;
        } 
        else if(count % 2 != 0) // comming even element will wnter in right 
        {
         int max = q2.peek();
         if(num < max)
         {
           q1.offer(max);
           q2.poll();
           q2.offer(num);
         }
         else{
            q1.offer(num);
         }
         count++;
        }
    }
    
    public double findMedian() {
        if(count == 1)
        {
            return (double) q2.peek();
        }
        else if(count % 2 != 0)  // odd element 
        return (double) q2.peek();
        else {
            double d = ((double)q1.peek() + (double)q2.peek())/(double)2;
            return d;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */