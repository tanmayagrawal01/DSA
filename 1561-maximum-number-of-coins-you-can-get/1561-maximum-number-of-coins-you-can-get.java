class Solution {
    public int maxCoins(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        int c = arr.length/3;
        for(int i = arr.length-2;i>0;i-=2){
            if(c==0){
                return sum;
            }
            sum+=arr[i];
            System.out.print(arr[i]);
            c--;
        }
        return sum;
    }
}