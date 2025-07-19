class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if(nums == null | nums.length == 0 | k <= 0 ){
           return new int[0];

        }

        int n = nums.length;
        int[] result = new int[nums.length - k + 1];
        int r =0;
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i<n; i++){

            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }

           while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= k-1){
                 result[r++] = nums[dq.peekFirst()];
            }


        }
        return result;
        
    }
}