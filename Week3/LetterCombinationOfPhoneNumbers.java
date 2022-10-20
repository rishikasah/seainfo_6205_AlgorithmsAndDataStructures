package Week3;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. 
 * Return the answer in any order. A mapping of digits to letters (just like on the telephone buttons) is given below. 
 * Note that 1 does not map to any letters.
 */
class LetterCombinationOfPhoneNumbers {
    
    public List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<String>();
        if(digits == null || digits.length() == 0) 
            return resultList;
        int length = digits.length();
        //create all  strings  
        String[] letters = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //get the first number's string index
        int start = digits.charAt(0)-'2';
        combinationHelper(digits, resultList, new String(), letters, length, start,0);
        return resultList;
    }
    
    private void combinationHelper(String digits, List<String> resultList, String str, String[] letters, int length,int start, int index){
        
        if(length==0){
           
            String strCpy = new String(str);
            resultList.add(strCpy);
            return;
        }
        
        for(int i=0;i<letters[start].length();i++){
            str+=letters[start].charAt(i);
            //keep old start
            int old = start;
            //update start
            if(index < digits.length()-1)
             start  = digits.charAt(index+1)-'2';
             combinationHelper(digits, resultList, str, letters, length-1, start, index+1);
            //remove last
            str= str.substring(0, str.length()-1);
            //return to old start
            start = old;
        }
    }
}
