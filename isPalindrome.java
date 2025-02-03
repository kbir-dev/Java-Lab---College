class isPalindrome {
    static boolean isPalindrome(String x){
        String S = x;
        int n = S.length();
        for(int i = 0; i < n / 2; i++){
            if(S.charAt(i) != S.charAt(n - i - 1)){
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args){
        String name = "NaraN";
        System.out.println(name + " is palindrome: " + isPalindrome(name));
    }
}