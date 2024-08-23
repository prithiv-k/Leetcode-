class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        int arr[]=new int[n];
        char [] c=new char[n];

        /*for(int i=0;i<n;i++){
            c[i]=s.charAt(i);
        }
        for(int i=0;i<n;i++){
            int ct=1;
            char x=s.charAt(i);
            for(int j=0;j<n;j++){
                if(i!=j && x == s.charAt(j)){
                    ct++;
                }
            }
            arr[i]=ct;
        }
        String ans="";
        for(int i=0;i<n;i++){ 
            int ct=1;
            for(int j=0;j<n-i-1;j++){ 

                if(arr[j]>arr[j+1]||arr[j]==arr[j+1]&&c[j]>c[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    char y=c[j];
                    c[j]=c[j+1];
                    c[j+1]=y;

                }
            }
        }
        for(int i=c.length-1;i>=0;i--){
            ans+=c[i];
        }return ans;
        */
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        String ans="";
        while(!hm.isEmpty()){
            int max=0;
            char k='\0';
         for(Map.Entry<Character,Integer> entry:hm.entrySet()) {
           if(max<entry.getValue()){
               max=entry.getValue();
                k=entry.getKey();
        }
         }
        for(int i=0;i<max;i++){
            ans+=k;
        }
        hm.remove(k);


        } 
        
    return ans;
}
}