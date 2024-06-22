class Solution {
    public int countStudents(int[] stu, int[] sw) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int n = stu.length;
        for (int i = n- 1; i >= 0; i--) {
            st.push(sw[i]);
        }
        for (int i = 0; i < n ; i++) {
            q.add(stu[i]);
        }
        int j = 0;
        while (j <= n && !st.isEmpty()) {
            if (st.peek() == q.peek()) {
                st.pop();
                q.remove();
                j = 0;
            } else {
                q.add(q.remove());
                j++;
            }
        }
        return st.size();
    }
}