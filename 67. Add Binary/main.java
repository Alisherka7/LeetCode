class Solution {
    public String addBinary(String a, String b) {
        int c = 0;
        StringBuilder str = new StringBuilder();
        for(int i = a.length() -1, j = b.length()-1; i>=0 || j>=0; i--, j--){
            int num1 = i<0 ? 0 : a.charAt(i) - '0';
            int num2 = j<0 ? 0 : b.charAt(j) - '0';
            switch(num1 + num2 + c){
                case 0:
                case 2:
                    str.append('0');
                    break;
                case 1:
                case 3:
                    str.append('1');
                    break;
                    
            }
            c = (num1 + num2 + c) > 1 ? 1 : 0;
        }
        if( c > 0) str.append('1');
        return str.reverse().toString();
        
    }
}
