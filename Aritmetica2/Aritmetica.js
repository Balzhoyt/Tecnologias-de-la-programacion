class Aritmetica {
    
    sumar() {
        var arg=arguments;
        var c='error';
        if((typeof(arg[0])=='number') && (typeof(arg[1])=='number')){
            c=arg[0]+arg[1];
        }
       return c;
    }

    restar() {
        var arg=arguments;
        var c='error';
        if((typeof(arg[0])=='number') && (typeof(arg[1])=='number')){
            c=arg[0]-arg[1];
        }
       return c;
    }
   
    multiplicar() {
        var arg=arguments;
        var c='error';
        if((typeof(arg[0])=='number') && (typeof(arg[1])=='number')){
            c=arg[0]*arg[1];
        }
       return c;
    }

    dividir() {
        var arg=arguments;
        var c='error';
        if(arg[1]!=0){
            if((typeof(arg[0])=='number') && (typeof(arg[1])=='number')){
                c=arg[0]/arg[1];
            }
        }
        else {c='Error de division por cero';}
       return c;
    }
}
a=new Aritmetica();

 console.log("   3 + 6   = "+a.sumar(3,6))
 console.log(" 3.5 + 6   = "+a.sumar(3.5,6))
 console.log("   3 + 6.5 = "+a.sumar(3,6.5))
 console.log(" 3.5 + 6.5 = "+a.sumar(3.5,6.5))

 console.log("  3 - 6    = "+a.restar(3,6))
 console.log("3.5 - 6    = "+a.restar(3.5,6))
 console.log("  3 - 6.5  = "+a.restar(3,6.5))
 console.log("3.5 - 6.5  = "+a.restar(3.5,6.5))

 console.log("  3 * 6    = "+a.multiplicar(3,6))
 console.log("3.5 * 6    = "+a.multiplicar(3.5,6))
 console.log("  3 * 6.5  = "+a.multiplicar(3,6.5))
 console.log("3.5 * 6.5  = "+a.multiplicar(3.5,6.5))

 console.log("  3 / 6    = "+a.dividir(3,6))
 console.log("3.5 / 6    = "+a.dividir(3.5,6))
 console.log("  3 / 6.5  = "+a.dividir(3,6.5))
 console.log("3.5 / 6.5  = "+a.dividir(3.5,6.5))

 console.log("3.5 / 0  = "+a.dividir(3.5,0))