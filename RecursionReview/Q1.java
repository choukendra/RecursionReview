class Q1 {
/*
252, 105 (Our two starting numbers)
147, 105 (252 – 105 to get 147)
42, 105 (147 – 105 to get 42)
42, 63 (105 – 42 to get 63)
42, 21 (63 – 42 to get 21)
21, 21 (42 – 21 to get 21) 
    */
   public int a, b;
   public Q1() {
        this.a = 252;
        this.b = 105;
    }
    
    public String toString(){
        
    }
   //helper
    public int gcd(int a, int b){
        //gcf for den
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0){
            System.out.println("Error: 0");
            return 1;
        }
        if(a == b) return a; 
        
            if(a > b){
                a = a - b;
                //call function
                int gcd = gcd(this.a, this.b);
            }else{
                b = b - a;
                //call function 
                int gcd = gcd(this.a, this.b); 
            }
          return a;  
        }
        
    
        
    
}