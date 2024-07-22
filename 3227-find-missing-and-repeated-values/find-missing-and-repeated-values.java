class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        int n=grid.length * grid[0].length;
        int tot=(n*(n+1))/2;
        int r=grid.length;
        int c=grid[0].length;
        int sum=0;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!li.contains(grid[i][j])){
                li.add(grid[i][j]);
                sum+=grid[i][j];
                }else{
                    ans[0]=grid[i][j];
                }
            }
        }int mis=tot-sum;
        ans[1]=mis;
return ans;
    }
}