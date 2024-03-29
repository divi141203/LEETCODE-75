class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList();
        Arrays.sort(products);
        String subs="";
        for(int i=0;i<searchWord.length();i++)
        {
            List<String> ians = new ArrayList();
            subs += searchWord.charAt(i);
            for(int j=0;j<products.length;j++)
            {
                if(products[j].startsWith(subs))
                {
                    ians.add(products[j]);
                    if(ians.size()==3)
                      break;
                }
            }
            ans.add(ians);
        }
        return ans;
    }
}
