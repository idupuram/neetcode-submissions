class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> s = new Hashtable<>();
        for(int i=0; i < nums.length; i++){
            if(!s.containsKey(nums[i])){
                s.put(nums[i],1);
            }else {
                 return true;
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