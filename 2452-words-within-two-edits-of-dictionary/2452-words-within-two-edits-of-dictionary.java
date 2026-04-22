class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String>res=new ArrayList<>();
        for(String q:queries){
            for(String d:dictionary){
                int left=2;
                for(int i=0;i<q.length();i++){
                    if(q.charAt(i)!=d.charAt(i)){
                        left--;
                        if(left<0) break;
                    }
                }
                if(left>=0){
                    res.add(q);
                    break;
                }
            }
        }
        return res;
    }
}