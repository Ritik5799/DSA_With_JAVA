class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void solve(int[] nums, int i, List<Integer> al, List<List<Integer>> res) {
        if (i == nums.length) {
            res.add(new ArrayList<>(al)); // add a copy
            return;
        }

        // Include nums[i]
        al.add(nums[i]);
        solve(nums, i + 1, al, res);
        al.remove(al.size() - 1); // backtrack

        // Exclude nums[i]
        solve(nums, i + 1, al, res);
    }
}
