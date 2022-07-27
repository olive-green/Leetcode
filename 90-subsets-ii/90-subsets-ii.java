class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
  // sorting
  Arrays.sort(nums);
  
  List<List<Integer>> result = new ArrayList<>();
  List<Integer> numList = new ArrayList<>();
  result.add(new ArrayList<>());
  subsets(0, nums, numList, result, true);
  return result;
}

private void subsets(int offset, int[] nums, List<Integer> numList, List<List<Integer>> result, boolean isPicked) {
  // base case
  if (offset >= nums.length) {
    return;
  }
  int val = nums[offset];
  // duplicate checking (convert && to ||)
  if (offset == 0 || nums[offset - 1] != nums[offset] || isPicked == true) {
    // pick
    numList.add(val);
    subsets(offset + 1, nums, numList, result, true);
    result.add(new ArrayList<>(numList));  // add to the result list
    numList.remove(numList.size() - 1);
  }
  // not pick
  subsets(offset + 1, nums, numList, result, false);
}
}