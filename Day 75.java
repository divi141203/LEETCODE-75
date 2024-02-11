class StockSpanner {
  public int next(int price) {
    int a = 1;
    while (!stack.isEmpty() && stack.peek().getKey() <= price)
    {
      a += stack.pop().getValue();
    }
    stack.push(new Pair<>(price, a));
    return a;
  }
  private Stack<Pair<Integer, Integer>> stack = new Stack<>();
}
