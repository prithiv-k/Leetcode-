class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        Stack<String> fin = new Stack<>();
        String arr[] = path.split("/");
        for (int i = 0; i < arr.length; i++) {
            if (!st.isEmpty() && arr[i].equals("..")) {
                st.pop();
            } else if (arr[i].equals(".")) {
                continue;
            } else if (!arr[i].equals("..")&&!arr[i].equals("")) {
                st.push(arr[i]);
            }
        }
        while (!st.isEmpty()) {
            fin.add(st.pop());
        }
        String ans = "";

        while (!fin.isEmpty()) {
            ans += "/" + fin.pop();
        }
        if(ans.length()==0){
            return "/";
        }
        return ans;
    }
}