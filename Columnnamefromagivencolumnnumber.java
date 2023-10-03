public class Columnnamefromagivencolumnnumber {
    static String colName (long n)
    {
        StringBuilder s1=new StringBuilder();
        while (n > 0) {
            n--; 
            char s = (char) ('A' + n % 26); 
            s1.append(s);
            n /= 26;
        }
        s1.reverse();
        return s1.toString();
        
    }
    public static void main(String[] args) {
        long n=526;
        System.out.println(colName(n));
    }
}
