Input: red = 2, blue = 4

Output: 3






class Solution {
    // Helper function to determine maximum height of triangle using given a and b
    int solve(int a, int b) {
        int cur = 1; // Shuruaat mein current step 1 se start karenge
        while (true) {
            if ((cur & 1) != 0) { // Check karte hain ki cur odd hai ya nahi
                if (a < cur) return cur - 1; // Agar a cur se chhota hai, to cur-1 return karo
                else a -= cur; // Nahi to a mein se cur minus kar do
                cur++; // cur ko increment kar do
            } else { // cur even hai
                if (b < cur) return cur - 1; // Agar b cur se chhota hai, to cur-1 return karo
                else b -= cur; // Nahi to b mein se cur minus kar do
                cur++; // cur ko increment kar do
            }
        }
    }

    // Function to find the maximum height of the triangle
    public int maxHeightOfTriangle(int a, int b) {
        // Dono cases check karte hain: (a, b) aur (b, a), aur jo maximum result ho usko return karte hain
        return Math.max(solve(a, b), solve(b, a));
    }
}
