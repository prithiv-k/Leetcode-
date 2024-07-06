class Solution {
    public int garbageCollection(String[] gar, int[] tra) {
        int p=0;
        int m=0;
        int g=0;
        
        int mp=-1;
        int mg=-1;
        int mm=-1;
       for(int i=0;i<gar.length;i++){
          String s=gar[i];
            for(int k=0;k<s.length();k++){
            if(s.charAt(k)=='M'){
                m++;
                mm=i;
            
            }else if(s.charAt(k)=='G'){
                g++;
                mg=i;
                
            }else{
                p++;
                mp=i;
                
            }
        }
        }for(int i=0;i<mm;i++){
            m+=tra[i];
        }for(int i=0;i<mp;i++){
            p+=tra[i];
        }for(int i=0;i<mg;i++){
            g+=tra[i];
        }return m+p+g;
    }
}