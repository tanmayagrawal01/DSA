class Solution {
    public int findlength(int num) {
        return (int) Math.floor(Math.log10(num)) + 1;
    }

    public List<Integer> sequentialDigits(int low, int high) {
        String str = "123456789";
        int min=findlength(low),max=findlength(high);
        List<Integer>res=new ArrayList<>();
        for(int i=min;i<=max;i++){
            for(int j=0;j<10-i;j++){
                String s=str.substring(j,j+i);
                int a=Integer.valueOf(s);
                if(a>high) return res;
                else if(a<low) continue;
                else res.add(a);
                // System.out.println(a);
            }
        }
        return res;
    }
}