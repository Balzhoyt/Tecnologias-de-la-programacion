public class Aritmetica {
    
    public int sumar(int a,int b) {
        return a+b;
    }
    public float sumar(float a,float b) {
        return a+b;
    }
    public float sumar(int a,float b) {
        return a+b;
    }
    public float sumar(float a,int b) {
        return a+b;
    }
   
    public int restar(int a,int b) {
        return a-b;
    }
    public float restar(float a,float b) {
        return a-b;
    }
    public float restar(int a,float b) {
        return a-b;
    }
    public float restar(float a,int b) {
        return a-b;
    }
    
    public int multiplicar(int a,int b) {
        return a*b;
    }
    public float multiplicar(float a,float b) {
        return a*b;
    }
    public float multiplicar(int a,float b) {
        return a*b;
    }
    public float multiplicar(float a,int b) {
        return a*b;
    }
    
    public int dividir(int a,int b) {
        return a/b;
    }
    public float dividir(float a,float b) {
        return a/b;
    }
    public float dividir(int a,float b) {
        return a/b;
    }
    public float dividir(float a,int b) {
       float r;
        if(b!=0){
           r= a/b;
        }
        else{r=0.0;}
        return r;
    }

    public static void main(String[] args) {
        Aritmetica a=new Aritmetica();
        
        System.out.println("   3 + 6   = "+a.sumar(3,6));
        System.out.println(" 3.5 + 6   = "+a.sumar(3.5f,6));
        System.out.println("   3 + 6.5 = "+a.sumar(3,6.5f));
        System.out.println(" 3.5 + 6.5 = "+a.sumar(3.5f,6.5f));

        System.out.println("  3 - 6    = "+a.restar(3,6));
        System.out.println("3.5 - 6    = "+a.restar(3.5f,6));
        System.out.println("  3 - 6.5  = "+a.restar(3,6.5f));
        System.out.println("3.5 - 6.5  = "+a.restar(3.5f,6.5f));

        System.out.println("  3 * 6    = "+a.multiplicar(3,6));
        System.out.println("3.5 * 6    = "+a.multiplicar(3.5f,6));
        System.out.println("  3 * 6.5  = "+a.multiplicar(3,6.5f));
        System.out.println("3.5 * 6.5  = "+a.multiplicar(3.5f,6.5f));

        System.out.println("  3 / 6    = "+a.dividir(3,6));
        System.out.println("3.5 / 6    = "+a.dividir(3.5f,6));
        System.out.println("  3 / 6.5  = "+a.dividir(3,6.5f));
        System.out.println("3.5 / 6.5  = "+a.dividir(3.5f,6.5f));
    }
   
}

