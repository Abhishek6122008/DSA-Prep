class Solution {
    public boolean containsDuplicate(int[] nums) {
        //initializa hashset :>
        HashSet<Integer> seenNumbers = new HashSet<>();

        //we do itteration woooo
        for(int num : nums){
            //check if element is on thye HashSet
            if (seenNumbers.contains(num)){
                return true; //we found duplicate hehe
            }
            //add element to hashset
            seenNumbers.add(num);
        }
        return false;
    
    }
}