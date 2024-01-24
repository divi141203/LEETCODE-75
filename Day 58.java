class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        cs(res, k, n, 1, new ArrayList<>());
        return res;
    }
    private void cs(List<List<Integer>> res, int k, int n, int i, List<Integer> c){
        if(n == 0 && k == 0)
        {
            res.add(new ArrayList<>(c));
        }
        if(i > n || k == 0 || i == 10)
        {
            return;
        }
        c.add(i);
        cs(res, k - 1, n - i, i + 1, c);
        c.remove(c.size() - 1);
        cs(res, k, n, i + 1, c);
    }
}
