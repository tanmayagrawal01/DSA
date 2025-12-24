class Solution {
    public String arrangeWords(String text) {
        String words[]=text.split(" ");
        Arrays.sort(words,(a,b)-> a.length()-b.length());
        StringBuilder sb=new StringBuilder();
        sb.append(words[0].substring(0, 1).toUpperCase() + words[0].substring(1).toLowerCase() +" ");
        for(int i=1 ;i<words.length;i++){
            sb.append(words[i].toLowerCase());
            if(i==words.length-1) break;
            sb.append(" ");
        }
        return sb.toString();
    }
}