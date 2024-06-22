class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Queue<Integer>li=new LinkedList<>();
        Arrays.sort(deck);
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            li.add(i);
        }
        for(int i=0;i<n;i++){
            ans[li.poll()]=deck[i];
            li.add(li.poll());
        }

        return ans;
    }
}