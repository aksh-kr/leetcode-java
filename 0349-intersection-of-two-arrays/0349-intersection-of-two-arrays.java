class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<nums1.length; i++) {
            h.add(nums1[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int j=0; j<nums2.length; j++) {
            if(h.contains(nums2[j])){
                ans.add(nums2[j]);
                h.remove(nums2[j]);
            }    
        }
        
        int[] res = new int[ans.size()];
        for(int i=0; i<ans.size(); i++) {
            res[i] = ans.get(i);
        }
        
        return res;
    }
}