class Solution {
    class Pair{
        int a;
        int b;
        double div;
        Pair(int a,int b){
            this.a=a;
            this.b=b;
            div=(double)a/b;
        }
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(a.div, b.div)
        );
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double div=(double) arr[i]/arr[j];
                Pair p=new Pair(arr[i],arr[j]);
                pq.offer(p);
            }
        }
        while(k-->1){
            pq.poll();
        }
        Pair x=pq.poll();
        return new int[]{x.a,x.b};
    }
}