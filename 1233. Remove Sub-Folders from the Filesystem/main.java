class Solution {

    static class TrieNode {

        boolean isEndOfFolder;
        HashMap<String, TrieNode> children;

        TrieNode() {
            this.isEndOfFolder = false;
            this.children = new HashMap<>();
        }
    }

    TrieNode root;

    Solution() {
        this.root = new TrieNode();
    }

    public List<String> removeSubfolders(String[] folder) {
        // Build Trie from folder paths
        for (String path : folder) {
            TrieNode currentNode = root;
            String[] folderNames = path.split("/");

            for (String folderName : folderNames) {
                // Skip empty folder names
                if (folderName.equals("")) continue;
                // Create new node if it doesn't exist
                if (!currentNode.children.containsKey(folderName)) {
                    currentNode.children.put(folderName, new TrieNode());
                }
                currentNode = currentNode.children.get(folderName);
            }
            // Mark the end of the folder path
            currentNode.isEndOfFolder = true;
        }

        // Check each path for subfolders
        List<String> result = new ArrayList<>();
        for (String path : folder) {
            TrieNode currentNode = root;
            String[] folderNames = path.split("/");
            boolean isSubfolder = false;

            for (int i = 0; i < folderNames.length; i++) {
                // Skip empty folder names
                if (folderNames[i].equals("")) continue;

                TrieNode nextNode = currentNode.children.get(folderNames[i]);
                // Check if the current folder path is a subfolder of an
                // existing folder
                if (nextNode.isEndOfFolder && i != folderNames.length - 1) {
                    isSubfolder = true;
                    break; // Found a sub-folder
                }

                currentNode = nextNode;
            }
            // If not a sub-folder, add to the result
            if (!isSubfolder) result.add(path);
        }

        return result;
    }
}
