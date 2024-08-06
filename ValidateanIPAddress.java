public class ValidateanIPAddress {
    public boolean isValid(String str) {
        String st[]=str.split("\\.");
        int n=st.length;
        if(n!=4)
            return false;
        for(int i=0;i<n;i++){
            int temp=st[i].length();
            if(temp==0)
                return false;
            int num=Integer.parseInt(st[i]);
            if(temp>1 && st[i].charAt(0)=='0'){
                return false;
            }
            if(num<0 || num>255)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // Test cases for various edge cases
        String[] testCases = {
            "192.168.1.1",      // Valid
            "0.0.0.0",          // Valid
            "255.255.255.255",  // Valid
            "256.100.100.100",  // Invalid: first section > 255
            "192.168.300.1",    // Invalid: third section > 255
            "192.168.1",        // Invalid: missing section
            "192.168.1.1.1",    // Invalid: extra section
            "192..168.1.1",     // Invalid: empty section
            "192.168..1",       // Invalid: empty section
            "192.168.1.",       // Invalid: trailing dot
            "192.168.01.1",     // Invalid: leading zero
            "192.168.001.1",    // Invalid: leading zeros
            "010.0.0.0",        // Invalid: leading zero
            "01.01.01.01",      // Invalid: leading zeros
            "1.1.1.1",          // Valid
            "127.0.0.1",        // Valid: loopback address
            "192.168.1.01",     // Invalid: leading zero
            "000.000.000.000",  // Invalid: leading zeros
        };
        ValidateanIPAddress obj=new ValidateanIPAddress();
        for (String testCase : testCases) {
            boolean isValid = obj.isValid(testCase);
            System.out.println("IPv4 address: " + testCase + " is valid: " + isValid);
        }
    }
}
