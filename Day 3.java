class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> x = new ArrayList<Boolean>();
        int a = candies.length;
        int b = 0;
        for (int i = 0; i < a; i++) 
        {
            if(candies[i]>=b)
            {
                b = candies[i];
            }
        }
        for(int i = 0;i < a;i++)
        {
            x.add(candies[i]+extraCandies>=b);
        }
        return x;
    }
}
