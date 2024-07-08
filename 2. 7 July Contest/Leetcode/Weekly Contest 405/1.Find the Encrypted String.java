//learned from leetcode solutions
class Solution {
  //s = "dart", k = 3
    public String getEncryptedString(String s, int k) {
        size = s.length();  // size = 4
        k %= size;  // k = 3 % 4 = 3
        s = s + s;  // s = "dart" + "dart" = "dartdart"
        return s.substring(k, k + size);  // s.substring(3, 3 + 4) = s.substring(3, 7) = "tdar"
    }
}
