import java.util.*;

class Solution {
    private static final int MOD = 1000000007;
    private static final int BASE = 31;
    private static Set<Long> computeHashes(String word, boolean isPrefix) {
        Set<Long> hashes = new HashSet<>();
        long hash = 0;
        long power = 1;

        if (isPrefix) {
            for (int i = 0; i < word.length(); i++) {
                hash = (hash + (word.charAt(i) - 'a' + 1) * power) % MOD;
                System.out.println(hash);
                hashes.add(hash);
                power = (power * BASE) % MOD;
            }
        } else {
            // Compute suffix hashes
            for (int i = word.length() - 1; i >= 0; i--) {
                hash = (hash + (word.charAt(i) - 'a' + 1) * power) % MOD;
                System.out.println(hash);
                hashes.add(hash);
                power = (power * BASE) % MOD; 
            }
        }
        return hashes;
    }
    public static long compute(String word,boolean isPrefix){
         long hash = 0;
        long power = 1;
            if (isPrefix) {
            for (int i = 0; i < word.length(); i++) {
                hash = (hash + (word.charAt(i) - 'a' + 1) * power) % MOD;
                power = (power * BASE) % MOD;
            }
        } else {
            // Compute suffix hashes
            for (int i = word.length() - 1; i >= 0; i--) {
                hash = (hash + (word.charAt(i) - 'a' + 1) * power) % MOD;
                power = (power * BASE) % MOD; 
            }
        }
            return hash;
    }
    public int countPrefixSuffixPairs(String[] words) {
        List<Set<Long>> prefixHashes = new ArrayList<>();
        List<Set<Long>> suffixHashes = new ArrayList<>();
        
        for (String word : words) {
            Set<Long> prefixHashSet = computeHashes(word, true);
            Set<Long> suffixHashSet = computeHashes(word, false);
            
            prefixHashes.add(prefixHashSet); 
            suffixHashes.add(suffixHashSet);
        }

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // long targetHashPrefix = computeHashes(words[i], true).iterator().next(); 
                // long targetHashSuffix = computeHashes(words[i], false).iterator().next();
                long targetHashPrefix=compute(words[i],true);
                long targetHashSuffix=compute(words[i],false);
                System.out.println(targetHashPrefix);
                System.out.println(targetHashSuffix);
                System.out.println("h99");
                if (prefixHashes.get(j).contains(targetHashPrefix) && suffixHashes.get(j).contains(targetHashSuffix)) {
                    count++;
                }
            }
        }

        return count;
    }
}
