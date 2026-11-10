class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> s = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            // System.out.println(s.add(nums[i]));
            if(s.containsKey(nums[i])){
                return true;
            }else {
                s.put(nums[i],1);
            }
        }
        return false;
        // Set<Integer> s = new HashSet<>();
        // for(int i=0; i < nums.length; i++){
        //     // System.out.println(s.add(nums[i]));
        //     if(!s.add(nums[i])){
        //         return true;
        //     }
        // }
        // return false;
    }
}