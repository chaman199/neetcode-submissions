class TrieNode{
    Map<Character,TrieNode> children = new HashMap<>();
    boolean endOfWord = false;
}

class WordDictionary {

    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode cur = root;
        for(int i=0;i<word.length();i++){
            if(!cur.children.containsKey(word.charAt(i))){
                cur.children.put(word.charAt(i),new TrieNode());
            }
            cur = cur.children.get(word.charAt(i));
        }
        cur.endOfWord = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        return searchRec(word,cur);
    }

    public boolean searchRec(String word, TrieNode node){
        TrieNode cur = node;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='.'){
                for(Map.Entry<Character,TrieNode> entry: cur.children.entrySet()){
                    if(searchRec(word.substring(i+1),entry.getValue())){
                        return true;
                    }
                }
            }
            if(!cur.children.containsKey(word.charAt(i))){
                return false;
            }
            cur = cur.children.get(word.charAt(i));
        }
        return cur.endOfWord;
    }
}
