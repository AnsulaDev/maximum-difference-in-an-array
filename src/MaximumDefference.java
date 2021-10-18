 class MaximumDefference {
    static int maximumdiff(int a[],int n){
        int res = a[1]- a[0];
        int minval = a[0];
        for(int j =0;j<n-1;j++){
            res = Math.max(res,a[j] - minval);
            minval = Math.min(minval,a[j]);
        }
        return res;
    }
    public static void main(String args[]){
        int a[]={2,3,10,6,4,8,1};
        int n = 7;
        System.out.println(maximumdiff(a,n));
    }
}
