class Aritmetica():
    def sumar(self,*args):
        if((type(args[0])==int)and(type(args[1])==int)):
            c=args[0]+args[1]
        if((type(args[0])==int)and(type(args[1])==float)):
            c=args[0]+args[1]
        if((type(args[0])==float)and(type(args[1])==int)):
            c=args[0]+args[1]
        if((type(args[0])==float)and(type(args[1])==float)):
            c=args[0]+args[1]
        return c
    
    def restar(self,*args):
        if((type(args[0])==int)and(type(args[1])==int)):
            c=args[0]-args[1]
        if((type(args[0])==int)and(type(args[1])==float)):
            c=args[0]-args[1]
        if((type(args[0])==float)and(type(args[1])==int)):
            c=args[0]-args[1]
        if((type(args[0])==float)and(type(args[1])==float)):
            c=args[0]-args[1]
        return c
    
    def multiplicar(self,*args):
        if((type(args[0])==int)and(type(args[1])==int)):
            c=args[0]*args[1]
        if((type(args[0])==int)and(type(args[1])==float)):
            c=args[0]*args[1]
        if((type(args[0])==float)and(type(args[1])==int)):
            c=args[0]*args[1]
        if((type(args[0])==float)and(type(args[1])==float)):
            c=args[0]*args[1]
        return c
    
    def dividir(self,*args):
        if(args[1]!=0):
            if((type(args[0])==int)and(type(args[1])==int)):
                c=args[0]/args[1]
            if((type(args[0])==int)and(type(args[1])==float)):
                c=args[0]/args[1]
            if((type(args[0])==float)and(type(args[1])==int)):
                c=args[0]/args[1]
            if((type(args[0])==float)and(type(args[1])==float)):
                c=args[0]/args[1]
        else:c="Error de division por cero"
        return c


a=Aritmetica()
print("   3 + 6   = ",a.sumar(3,6))
print(" 3.5 + 6   = ",a.sumar(3.5,6))
print("   3 + 6.5 = ",a.sumar(3,6.5))
print(" 3.5 + 6.5 = ",a.sumar(3.5,6.5))

print("  3 - 6    = ",a.restar(3,6))
print("3.5 - 6    = ",a.restar(3.5,6))
print("  3 - 6.5  = ",a.restar(3,6.5))
print("3.5 - 6.5  = ",a.restar(3.5,6.5))

print("  3 * 6    = ",a.multiplicar(3,6))
print("3.5 * 6    = ",a.multiplicar(3.5,6))
print("  3 * 6.5  = ",a.multiplicar(3,6.5))
print("3.5 * 6.5  = ",a.multiplicar(3.5,6.5))

print("  3 / 6    = ",a.dividir(3,6))
print("3.5 / 6    = ",a.dividir(3.5,6))
print("  3 / 6.5  = ",a.dividir(3,6.5))
print("3.5 / 6.5  = ",a.dividir(3.5,6.5))

print("3.5 / 0  = ",a.dividir(3.5,0))