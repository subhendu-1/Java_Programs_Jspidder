

class PrimeNumber {
    public static void main(String[] args){
        rangee(5,20);
    }

    static boolean  isPrime(int n,int d){
        if(n%d == 0){
        return false;
            
        }else return true;
        return  isPrime(n, d-1);
    }

    static void rangee(int st,int ed){
        if(st > ed) return ;
        if(isPrime(st, st/2)){
            System.out.println(st);
        }
        rangee(st+1,ed);
    }
}
