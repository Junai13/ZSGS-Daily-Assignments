 public static int utopianTree(int n) {
    // Write your code here
        int result =0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                result +=1;
            }else{
                result *=2;
            }
        }
        return result;

    }

}
