	class Solution {
       public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
       int row=Math.abs(sx-fx);
       int col=Math.abs(sy-fy);
       if(row==0 && col==0){
          return t>1 || t==0 ? true : false;
       } 
       if(row<=t && col<=t){
           return true;
       }
       if(row > col){
           if(row <= (Math.abs(t-col))){
               return true;
            }
        }
        if(col > row){
            if(col <= (Math.abs(t-row))){
               return true;
           }
       }
       return  false;
   }
  }
