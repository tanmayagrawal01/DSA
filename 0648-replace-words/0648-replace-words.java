class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String>set=new HashSet<>(dictionary);
        String words[]=sentence.split(" ");
        HashSet<Integer>lengths=new HashSet<>();
        for(String i:dictionary){
            int len=i.length();
            lengths.add(len);
        }
        for(int i=0;i<words.length;i++){
            for(int j:lengths){
                if(words[i].length()<j) continue;
                String str=words[i].substring(0,j);
                if(set.contains(str)){
                    words[i]=str;
                }
            }
        }
        return String.join(" ", words);
    }
}