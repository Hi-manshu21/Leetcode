class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int count = 1;
        int data = -1;
        while(count <= k){
            data = pq.remove();
            count++;
        }
        return data;
    }
}