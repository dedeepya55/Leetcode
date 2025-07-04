class Solution {
  public boolean checkValidString(final String s) {
    int low = 0;  
    int high = 0;

    for (final char c : s.toCharArray()) {
      switch (c) {
        case '(':
          ++low;
          ++high;
          break;
        case ')':
          low = Math.max(0, --low);
          --high;
          break;
        case '*':
          low = Math.max(0, --low);
          ++high;
          break;
      }
      if (high < 0)
        return false;
    }

    return low == 0;
  }
}