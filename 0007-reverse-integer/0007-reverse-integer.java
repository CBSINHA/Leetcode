class Solution {
    public int reverse(int x) {
        try{
        boolean negative=false;
        if(x<0){x=x*-1;
        negative=true;}
        StringBuilder sb=new StringBuilder();
        sb.append(x);
        sb.reverse();
        // int left=0,right=sb.length()-1;
        // while(left<right){
        //     char temp=sb.charAt(left);
        //     sb.setCharAt(left,sb.charAt(right));
        //     sb.setCharAt(right,temp);
        //     left++;
        //     right--;
        // }
        x=Integer.valueOf(sb.toString());
        if(negative==true)return x*-1;
        else
        return x;
        }
        catch(Exception e){
            return 0;
        }
    }
}