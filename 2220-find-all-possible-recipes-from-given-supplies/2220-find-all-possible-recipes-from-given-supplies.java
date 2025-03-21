class Solution {
    static class Pair {
        String key;
        int value;

        Pair(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        PriorityQueue<Pair> indegree = new PriorityQueue<>(Comparator.comparingInt(p -> p.value));

        for (String supply : supplies) {
            indegree.add(new Pair(supply, 0));
        }

        Map<String, List<String>> outdegree = new HashMap<>();
        Map<String, Integer> m = new HashMap<>();

        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            List<String> ingList = ingredients.get(i);
            m.put(recipe, ingList.size());

            for (String ingredient : ingList) {
                outdegree.putIfAbsent(ingredient, new ArrayList<>());
                outdegree.get(ingredient).add(recipe);
            }
        }

        List<String> ans = new ArrayList<>();

        while (!indegree.isEmpty()) {
            Pair entry = indegree.poll();
            String item = entry.key;
            int num = entry.value;

            if (m.containsKey(item) && num == 0) {
                ans.add(item);
            }

            if (outdegree.containsKey(item)) {
                List<String> dependentRecipes = outdegree.get(item);
                for (String recipe : dependentRecipes) {
                    int count = m.get(recipe);
                    m.put(recipe, count - 1);
                    if (count - 1 == 0) {
                        indegree.add(new Pair(recipe, 0)); 
                    }
                }
            }
        }
        return ans;
    }

}
