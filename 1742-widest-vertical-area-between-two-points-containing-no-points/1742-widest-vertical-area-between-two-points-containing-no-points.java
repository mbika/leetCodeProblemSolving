class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
         Arrays.sort(points, Comparator.comparingInt((pointComp) -> pointComp[0]));
        int widestVerticalWidth = 0;
        // Iterate through the sorted points and find the maximum gap
        for(int i = 1;i< points.length;i++){
             widestVerticalWidth = Math.max(widestVerticalWidth,points[i][0] - points[i-1][0]);
        }

        return widestVerticalWidth;
    }
}