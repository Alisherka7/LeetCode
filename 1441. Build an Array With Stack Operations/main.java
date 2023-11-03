class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        boolean check = false;
        int counter = 1;
        for(int i=0; i<target.length; i++){
            if(target[i] == counter){
                res.add("Push");
                counter++;
                System.out.println("counter->" + counter + "ind->" + target[i]);
            }else{
                while(target[i] != counter){
                    counter++;
                    res.add("Push");
                    res.add("Pop");
                }
                i--;
            }
        }
        return res;
    }
}
