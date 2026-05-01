class TrieNode {
    Map<Character,TrieNode> children;
    boolean endOfWord;
    TrieNode(){
        this.children = new HashMap<>();
        this.endOfWord = false;
    }
}

class PrefixTree {
    TrieNode root;
    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for(int i=0;i< word.length();i++){
            if(!cur.children.containsKey(word.charAt(i))){
                cur.children.put(word.charAt(i),new TrieNode());
            }
            cur = cur.children.get(word.charAt(i));
        }
        cur.endOfWord = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for(int i=0;i<word.length();i++){
            if(!cur.children.containsKey(word.charAt(i))){
                return false;
            }
            cur = cur.children.get(word.charAt(i));
        }
        return cur.endOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for(int i=0;i<prefix.length();i++){
            if(!cur.children.containsKey(prefix.charAt(i))){
                return false;
            }
            cur = cur.children.get(prefix.charAt(i));
        }
        return true;
    }
}
