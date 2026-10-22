class Solution {
    public int arrangeCoins(int n) {
        long lo =0 , hi = n;
        while(lo<=hi){
                 long mid = (lo+hi)/2;
                 long coine = mid *(mid+1)/2;
                 if (coine == n){
                    return (int)mid;
                 }
                 else if(coine < n){
                    lo = mid +1;
                 }
                 else{
                    hi = mid - 1;
                 
        }
    }
    return (int) hi;
        
    }
}