class Solution {
    class Pair implements Comparable<Pair>{
        char i;
        int j;
        Pair(char i,int j){
            this.i=i;
            this.j=j;
        }
        public int compareTo(Pair o){
            return o.j-this.j;
        }
    }
    public String frequencySort(String s) {
       HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))==false){
                hm.put(s.charAt(i),1);
            }else{
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(Character key:hm.keySet()){
            pq.add(new Pair(key,hm.get(key)));
        }
        StringBuilder str=new StringBuilder("");
        while(pq.size()>0){
            Pair rem=pq.remove();
            for(int i=0;i<rem.j;i++){
                str.append(rem.i);
            }
        }
        return str.toString();
    }
}
