class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        Stack<int[]> a = new Stack<>();
        int res=0;
        for(int[] i : intervals)
        {
            if(!a.isEmpty() && i[0]< a.peek()[1])
            {
                res++;
            }
            else
            {
                a.push(i);
            }
        }
    return res;
    }
}
