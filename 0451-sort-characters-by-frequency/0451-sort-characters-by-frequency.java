class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i : s.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Character>list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b)->map.get(b)-map.get(a));
        StringBuilder sb = new StringBuilder();
        for(char i : list){
            for(int j =0 ;j<map.get(i);j++){
                sb.append(i);
            } 
        }
        return sb.toString();
    }
}







// class Solution {
//     public String frequencySort(String s) {
//         Map<Character, Integer> map=new HashMap<>();

//         StringBuilder sb= new StringBuilder();
        
//         // Count frequency
//         for(char c: s.toCharArray()){
//             map.put(c,map.getOrDefault(c,0)+1);
//         }
//          // Find maximum frequency
//         int max=0;
//         for(Map.Entry<Character,Integer> entry : map.entrySet()){
//             if(entry.getValue()>max){
//                 max=entry.getValue();
//             }
//         }
        

//         // Build result from highest frequency to lowest
//          for (int i = max; i > 0; i--) {

//             for (Map.Entry<Character, Integer> entry : map.entrySet()) {

//                 if (entry.getValue() == i) {

//                     for (int j = 0; j < i; j++) {
//                         sb.append(entry.getKey());
//                     }
//                 }
//             }
//         }

//         return sb.toString();
//     }
// }