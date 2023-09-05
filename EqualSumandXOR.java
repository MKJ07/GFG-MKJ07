public class EqualSumandXOR {
    public int countValues(int n)
	{
        //Your code here
        int cnt=0;
        for(int i=0;i<=n;i++){
            if((n+i)==(n^i)){
                cnt++;
            }
        }
        return cnt;
        
	}

    public static void main(String[] args) {
        int n=12;
        EqualSumandXOR t=new EqualSumandXOR();
        System.out.println(t.countValues(n));
    }
}
