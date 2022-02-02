class Solution {
    public String reversePrefix(String word, char ch) {
       /* int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }else{
            String s = word.substring(0,index+1);
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            return sb.toString()+word.substring(index+1,word.length());
        }*/
        int index = word.indexOf(ch);
        if (index >= 0) {
            char[] arr = word.toCharArray();
            int left = 0, right = index;
            while (left < right) {
                arr[left]^= arr[right];
                arr[right]^= arr[left];
                arr[left]^= arr[right];
                left++;
                right--;
            }
            word = new String(arr);
        }
        return word;
    }
}


