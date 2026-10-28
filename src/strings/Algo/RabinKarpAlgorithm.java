package strings.Algo;

public class RabinKarpAlgorithm {
    public static void main(String[] args) {

    }
    //Rabin Karp Algorithm

    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(m > n) return -1;
        int base =256;
        int mod = 101;
        int h  =1;
        for(int i = 0 ; i < m-1; i++ ){
            h = (h * base)% mod;
        }

        // Initial window hash
        int windowHash = 0;
        int patternHash = 0;
        for(int i =0 ; i<m;i++){
            windowHash = (base * windowHash + haystack.charAt(i))%mod;
            patternHash = (base * patternHash + needle.charAt(i))%mod;
        }

        if( windowHash == patternHash){
            int j  =0 ;
            while(j < m){
                if(haystack.charAt(j) != needle.charAt(j)){
                    break;
                }
                j++;
            }
            if(j==m){
                return 0;
            }
        }
        // Solve for the next windows
        for(int i = 1; i <= (n-m); i++){
            windowHash = (windowHash - haystack.charAt(i-1) * h) % mod;
            windowHash = (windowHash * base + haystack.charAt(i+m-1)) % mod;
            if(windowHash < 0){
                windowHash+=mod;
            }
            if( windowHash == patternHash){
                int j  =0 ;
                while(j < m){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                    j++;
                }
                if(j==m){
                    return i;
                }
            }
        }
        return -1;
    }
}
