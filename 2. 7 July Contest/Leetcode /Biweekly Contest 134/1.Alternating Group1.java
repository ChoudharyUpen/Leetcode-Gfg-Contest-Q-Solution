class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int count=0;
      //The first if condition checks the group formed by the last tile, the first tile, and the second tile:
        if(colors[n-1]!=colors[0] && colors[0]!=colors[1]){
            count++;
        }
      //The second if condition checks the group formed by the second last tile, the last tile, and the first tile:
        if(colors[n-1]!=colors[0] && colors[n-1]!=colors[n-2]){
            count++;
        }
        for(int i=1;i<n-1;i++){
          //For each tile, it checks if it forms an alternating group with its left and right neighbors:
            if(colors[i]!=colors[i-1] && colors[i]!=colors[i+1]){
                count++;
            }
        }
        return count;
    }
}
