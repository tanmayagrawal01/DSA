class Solution {
    public List<String> generated(String word, HashSet<String> set) {
        List<String> l = new ArrayList<>();
        int n = word.length();
        for (int i = 0; i < n; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                String w = word.substring(0, i) + ch + word.substring(i + 1, n);
                if (set.contains(w))
                    l.add(w);
            }
        }
        return l;
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord))
            return 0;
        Queue<String> q = new LinkedList<>();
        int level = 0;
        q.offer(beginWord);
        if (set.contains(beginWord)) {
            set.remove(beginWord);
        }
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String word = q.poll();
                if (word.equals(endWord)) return level + 1;
                List<String> l = generated(word, set);
                for(String str:l){
                    q.offer(str);
                    set.remove(str);
                }
            }
            level++;
        }
        return 0;
    }
}