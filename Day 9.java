class Solution {
    public int compress(char[] chars) {
      int i1=0,i2=0;
      while(i1<chars.length)
      {
          char c=chars[i1];
          int count=0;
          while(i1 < chars.length && chars[i1] == c)
          {
              i1++;
              count++;
          }
          chars[i2++]=c;
          if(count!=1)
          {
                for(char c:Integer.toString(count).toCharArray())
                    chars[i2++]=c;
          }
      }
      return i2;
    }
}
