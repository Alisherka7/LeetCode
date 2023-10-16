class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = null;
        List<Integer> row = null;
        for(int i =0; i<= rowIndex; i++){
            row = new ArrayList<>();
            for(int j =0; j<= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }
            prev = row;
        }
        return row;
    }
}


// Second solution

class Solution {
   public  List<Integer> getRow(int rowIndex) {
        Integer[] a=new Integer[rowIndex+1];
        Arrays.fill(a,0);
        a[0]=1;
        for (int i=1;i<=rowIndex;i++)
        {
            for (int j=i;j>0;j--){
                a[j]=a[j]+a[j-1];
            }
        }
        return Arrays.asList(a);
    }
}
