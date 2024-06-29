class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
                List<List<Integer>> resultList = new ArrayList<>();
        for(int i = 0;i<groupSizes.length;i++){
            if(groupSizes[i] > 0){
                int size = groupSizes[i];
                List<Integer> tempList = new ArrayList<>();
                for(int j = 0;j< groupSizes.length && tempList.size() < size ;j++){
                    if(groupSizes[j] == size){
                        tempList.add(j);
                        groupSizes[j] = 0;
                    }
                }
                if(tempList.size() > 0) resultList.add(tempList);
            }
        }
        return resultList;
    }
}