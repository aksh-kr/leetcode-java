class Solution {
    public int longestConsecutive(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		//O(n)
		for(int i = 0; i < arr.length; i++) {
			
			int nm1 = arr[i] - 1;
			if(map.containsKey(nm1)) {
				
				map.put(arr[i], false);
			}else {
				map.put(arr[i], true);
			}
			
			int np1 = arr[i] + 1;
			
			if(map.containsKey(np1)) {
				map.put(np1, false);
			}
		}
		
		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		
		int maxLength = 0;
		int maxStartingNo = 0;
		
		//O(n)
		for(int key: keys) {
			
			if(map.get(key) == true) {
				
				int pstartingNo = key;
				int count = 0;
				
				while(map.containsKey(pstartingNo + count)) {
					count++;
				}
				
				if(count > maxLength) {
					maxLength = count;
					maxStartingNo = pstartingNo;
				}
			}
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		
		//O(n)
		for(int i = 0; i < maxLength; i++) {
			res.add(maxStartingNo + i);
		}
		
		return maxLength;
		
	}

}