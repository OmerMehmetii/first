import java.util.*;



class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int a = A.length;
        if(!(a>=1&&a<=100000)){
           
           return 0;
        }
        Arrays.sort(A);
        if(A[0]<-1000000||A[a-1]>1000000){
            
            return 0;
        }
        if((A[a-1]<0)|(A[a-1]==0)|A[0]>1){
        return 1;
        }
        for(int i=0;i<a;i++){
            if(i==0&&i==a-1&&(A[i]>1)){
                return 1;
            }
            else if((A[i]>0)&&(a>i+1)&&(A[i+1]>A[i]+1)){
                return A[i]+1;
            }
            else if(A[i]==0&&a>i+1&&(A[i+1]>=2)){
                return 1;
            }
          
            else if(( A[i]>0)&&(i==a-1)){
                return A[i]+1;
            }
            else if((A[i]<0)&&(a>i+1)&&A[i+1]>=2){
            return 1;
            }
           

        }
        return 1;

    }
}
