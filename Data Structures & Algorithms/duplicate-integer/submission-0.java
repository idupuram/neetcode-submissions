class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i=0; i < nums.length; i++){
            // System.out.println(s.add(nums[i]));
            if(!s.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}