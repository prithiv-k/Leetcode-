class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char i:letters){
            if(target<i){
                return i;
            }
        }return letters[0];
    }
}