static long fact(int n) {
    if(n==0){
        return 1;
    }
    long x=1;
    for(int i=1; i<=n; i++){
        x=x*i;
    }
    return x;
}
