class Solution {
    public int pivotInteger(int n) {
        int fs= 0;
        int ts=(n*(n+1))/2; 
    for (int i=1;i<=n;i++) {
            fs+=i;
            int bs=ts-fs;
            if (fs==bs+i) {
                return i;
            }
        }
        return -1;
    }
}
