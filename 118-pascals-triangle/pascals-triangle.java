class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> li=new ArrayList<>();
        int arr[][]=new int[n][n];      
        for(int i=0;i<n;i++){
            List <Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    row.add(li.get(i-1).get(j-1)+li.get(i-1).get(j));
                }
            }li.add(row);
        }return li;
    }
}