class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if( k == nums.length){
            return nums;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));

        for(int n : map.keySet()){
            pq.add(n);
            if(pq.size() > k){
                pq.remove();
            }
        }   

        int [] arr = new int [k];

        for(int i=0;i<k;i++){
            arr[i] = pq.remove();
        }

        return arr;
    }
}