class SmallestInfiniteSet {
    boolean[] list;
    int nums;
    public SmallestInfiniteSet()
    {
        list = new boolean[1001];
        nums = 1;
    }
    public int popSmallest() {
        for(int x = nums; x < list.length; x++)
        {
            if(!list[x])
            {
                list[x] = true;
                nums = x;
                break;
            }
        }
        return nums;   
    }
    public void addBack(int num) 
    {
        list[num] = false;
        nums = Math.min(num, nums);        
    }
}
