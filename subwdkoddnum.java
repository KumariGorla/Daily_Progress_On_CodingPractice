public class subwdkoddnum {
    public static void main(String[] args) {
        //Brute force time complexity O(n^3) and space complexity O(1)
        int arr[] = {2,4,6,8};
        int n = arr.length;
        int oddcnt = 0;
        //for(int i = 0;i<n;i++){
        //    int temp = 0;
        //    for(int j = i;j<n;j++){
        //        for(int k = i;k<=j;k++){
        //            temp+=arr[k];
        //        }
        //        if(temp%2!=0){
        //            oddcnt++;
        //        }
        //        //System.out.println();
        //    }
        //}
        //System.out.println(oddcnt);

        //Optimal way time complexity O(n) and space complexity O(1)
        int l = 0,k=1;
        int res = 0;
        for(int r= 0;r<n;r++){
            if(arr[r]%2==1){
                oddcnt++;
            }
            while(oddcnt>k){
                if(arr[l]%2==1){
                    oddcnt--;
                }
                l++;

            }
            res += r-l+1;
        }
        System.out.println(res);
    } 
}
