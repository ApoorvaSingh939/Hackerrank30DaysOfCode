class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        // n has no divisors other than itself
        if(n == 1){
            return n;
        }
        
        // Find and sum divisors:
        int half = n/2;
        int sum = n;
        do{
            if(n % half == 0){
                sum += half;
            }
        }while( half-- > 1 );
        
        return sum;
    }
}
