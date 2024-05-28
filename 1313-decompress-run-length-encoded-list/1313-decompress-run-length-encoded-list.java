class Solution {
    public int[] decompressRLElist(int[] nums) {
       List<Integer> intList = new ArrayList<>();
        
        // Iterate through the nums array with a step of 2 to process pairs
        for (int i = 0; i < nums.length; i += 2) {
            int frequency = nums[i];
            int val = nums[i + 1];
            
            // Add the value to intList frequency times
            for (int j = 0; j < frequency; j++) {
                intList.add(val);
            }
        }
        
        // Convert intList to an array
        int[] resArray = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            resArray[i] = intList.get(i);
        }
        
        return resArray;
    }
}