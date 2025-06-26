// Last updated: 6/26/2025, 10:42:37 PM
class Solution {
    public String convertToTitle(int n) {//701
        StringBuilder result=new StringBuilder();
        int i=26;
        while(n!=0){
            int temp=n%26;
            if(temp==0){temp=26;n--;}//2
            n=n/i;//1
            //++i;
            //if(n==26) result.append("Z");
            result.append(Character.toString(64+temp));//2
        }
        return result.reverse().toString();
    }
}