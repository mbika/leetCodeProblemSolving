class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> numList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        for(Integer data : nums) numList.add(data);
        Collections.sort(numList);
        for(int i = 0;i < numList.size();i++){
            if(target == numList.get(i)){
                indexList.add(i);
            }
        }
        return indexList;
    }
}