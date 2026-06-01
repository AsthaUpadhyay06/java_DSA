   int n=7;
        int r=3;
        int ncr=fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);
        int npr=fact(n)/fact(n-r);
        System.out.println(npr);
    }
    public static int fact(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f*=i;

        }
        return f;