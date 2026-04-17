class optimalslidwdoddk {
    public static int atmostk(int arr[],int k){
        int n1 = arr.length;
        int l1 = 0;
        int temp1 = 0;
        int res1 = 0;
        for(int r = 0;r<n1;r++){
            if(arr[r]%2==1){
                temp1++;
            }
            while(temp1>k){
                if(arr[l1]%2==1){
                    temp1--;
                }
                l1++;
                
            }
            res1+=r-l1+1;
            
        }
        return res1;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,1,1};
        
        int k = 3;
        int res = atmostk(arr,k)-atmostk(arr,k-1);
        System.out.println(res);
    }
}