class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[0];

        Arrays.sort(changed);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : changed) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] original = new int[n / 2];
        int idx = 0;

        for (int x : changed) {
            if (!map.containsKey(x)) continue;

            if (x == 0) {
                int count = map.get(0);
                if (count % 2 != 0) return new int[0];

                for (int i = 0; i < count / 2; i++) {
                    original[idx++] = 0;
                }
                map.remove(0);
            } 
            else {
                if (!map.containsKey(2 * x)) return new int[0];

                original[idx++] = x;
                map.put(x, map.get(x) - 1);
                map.put(2 * x, map.get(2 * x) - 1);

                if (map.get(x) == 0) map.remove(x);
                if (map.get(2 * x) == 0) map.remove(2 * x);
            }
        }

        return original;
    }
}
