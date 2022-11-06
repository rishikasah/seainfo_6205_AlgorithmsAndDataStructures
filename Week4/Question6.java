package Week4;
/*
 * Serialization is converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer,
 * or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 * Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your serialization/deserialization algorithm should work.
 * You need to ensure that a binary search tree can be serialized to a string, and this string can be deserialized to the original tree structure.
 * The encoded string should be as compact as possible.
 */
public class Question6 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return "";

        StringBuilder serializedString=new StringBuilder();
        dfs(root,serializedString);
        return serializedString.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0)
            return null;

        String encodedArray[]=data.split(" ");
        return createBinarySearchTree(encodedArray,0,encodedArray.length-1);
    }

    public void dfs(TreeNode root,StringBuilder str){
        if(root == null)
            return;

        str.append(root.val+" ");
        dfs(root.left, str);
        dfs(root.right, str);
    }

    public TreeNode createBinarySearchTree(String encArr[], int start, int end){
        if(start > end)
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(encArr[start]));

        int i;
        for(i=start; i<=end; i++){

            if(Integer.parseInt(encArr[i]) > Integer.parseInt(encArr[start]))
                break;
        }

        root.left = createBinarySearchTree(encArr,start+1,i-1);
        root.right = createBinarySearchTree(encArr, i, end);
        return root;
    }
}
