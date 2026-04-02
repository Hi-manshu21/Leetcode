class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        int num1 = pq.remove();
        int num2 = pq.remove();

        int result = (num1-1)*(num2-1);
        return result;
    }
}