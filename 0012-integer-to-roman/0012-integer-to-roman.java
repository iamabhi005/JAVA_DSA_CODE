class Solution {
     public int getVal(char ch){
            switch(ch)
            {
                case 'I':return 1;
                case 'V':return 5;
                case 'X':return 10;
                case 'L':return 50;
                case 'C':return 100;
                case 'D':return 500;
                case 'M':return 1000;
                 default: return 0;
            }
     }
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] symbole = {"M", "CM", "D", "CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
ans.append(symbole[i]);
num -= values[i];
            }
        }
    return ans.toString();
   }
}