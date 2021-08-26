class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>(); // will use autoboxing to convert int to Integer, bool to Boolean
        
        // loop over numbers in the array
        for(int i=0; i<nums.length; i++){
            
            int theNum = nums[i]; // the number to check
            
            // check if it's in the hashmap already, if so, return false
            Boolean isADuplicate = hm.get(theNum);
            
            if(isADuplicate == null){ // number hasn't been seen before
                hm.put(theNum, Boolean.TRUE);
            } else if (isADuplicate){
                return true;
            }  
        }
        return false;
    }
}

// preliminary thinking:
// we want to return true as soon as we find a duplicate, no need to continue
// otherwise we need to go all the way to the end and return false
// if we use a hashmap we will get O(1) insert and update so the problem will be worst case O(N)
// O(N) is the best we can do because no matter what we need to check every number to confidently return true if there are no duplicates

// edge cases
// 1) the nums array is empty: not possible due to problem invariant
// 2) the nums[i] is negative, not a problem, autoboxing will preserve the minus sign
