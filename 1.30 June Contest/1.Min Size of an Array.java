// if there is a dominating element, then it will eat up rest of the el
// if there is no dominating el, then by observation
// every el will probably eat up other el
// thus n = even, ans is 0 else 1


//GFG contest

class Solution {
    public static int MinSize(int n, int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0; i<n; i++)
        {
             map.put(a[i], map.getOrDefault(a[i], 0)+1);
             max = Math.max(max, map.get(a[i]));
        }
        
        if(max > n/2)
        return max-(n-max);
        
        return (n&1)==0 ?  0 : 1;
    }
}
