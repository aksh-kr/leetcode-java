class Solution {
    public int numberOfBeams(String[] bank) {
        int[] rowOneCount = new int[bank.length];
        int beams = 0;
        for(int i=0; i<bank.length; i++) {
            int oneCount = 0;
            for(char c : bank[i].toCharArray()){
                if(c == '1'){
                    oneCount++;
                }
            }
            rowOneCount[i] = oneCount;
        }
        
        int[] filteredArray = Arrays.stream(rowOneCount).filter(num -> num != 0).toArray(); 
        for(int i=1; i<filteredArray.length; i++) {
            beams += filteredArray[i]*filteredArray[i-1];
        }
        return beams;
    }
}