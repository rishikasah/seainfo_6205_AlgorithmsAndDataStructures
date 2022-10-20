package Week3;

import java.util.ArrayList;
import java.util.List;

/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */
class GenerateParenthesis {
 
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        depthFirstSearch(n, n, "", result);
        return result;
    }

    // l holds - all "("
    // r holds - all ")"
    public void depthFirstSearch(int left, int right, String path, List<String> result) {
        if (left <= right) {
            if (left == 0 && right == 0) { 
                result.add(path);
                return;  // backtracking
            }
        if (left < 0 || right < 0) {
            return;  // backtracking
        }
        depthFirstSearch(left-1, right, path+"(", result);
        depthFirstSearch(left, right-1, path+")", result);
    }
}
}