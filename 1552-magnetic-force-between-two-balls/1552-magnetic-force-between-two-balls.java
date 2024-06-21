class Solution {
    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int n=pos.length;
        int i=0;
        int j=1000000000;
        int ans=-1;
        
        while(i<=j){
            int mid=(i+j)/2;
            int pt=pos[0];
            int moves=1;
            for(int k=1;k<n;k++){
                if(pos[k]-pt >= mid){
                    pt=pos[k];
                    moves+=1;
                }
            }
            if(moves>=m){
                ans=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }

        }return ans;
        
    }
}