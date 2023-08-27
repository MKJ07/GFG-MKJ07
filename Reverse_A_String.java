class Reverse_A_String{
    public static String reverseWord(String str)
    {
        int l=str.length();
        String str1="";
        for(int i=l-1;i>=0;i--){
            str1+=str.charAt(i);
            
        }
        return str1;
        // Reverse the string str
        /*We can use this way also */
        // String s="";
        // int n=str.length();
        // for(int i=0;i<n;i++){
        //     s+=str.charAt(n-i-1);
        // }
        // return s;
    }
    public static void main(String[] args) {
        String s="Geeks";
        // Reverse_A_String t=new Reverse_A_String();
        System.out.println(reverseWord(s));

    }
}