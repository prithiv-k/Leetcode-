class Solution {
    public boolean isValid(String s) {
      if(s.length()<3){
        return false;
      }
      int v=0;
      int cons=0;
      List<Character> li=new ArrayList<>();
      li.add('a');
      li.add('e');
      li.add('i');
      li.add('o');
      li.add('u');
      li.add('A');
      li.add('E');
      li.add('I');
      li.add('O');
      li.add('U');
      int no=0;
      int dig=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z'){
        if(li.contains(s.charAt(i))){
            v++;
        }else{
            cons++;
        }
    } else if(s.charAt(i)=='@'||s.charAt(i)=='#'||s.charAt(i)=='$'){
        no++;
    }
    else{
         dig++;
    }
}return v!=0 && cons!=0 && no==0;

}
}
