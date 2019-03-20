<?php

class Aritmetica {
    
    public function sumar() {
        $arg = func_get_args();
        $c=0;
        if(is_int($arg[0])and(is_int($arg[1]))){
            $c=(int)$arg[0]+(int)$arg[1];
        }
        if(is_float($arg[0])and(is_int($arg[1]))){
            $c=(float)$arg[0]+(int)$arg[1];
        }
        if(is_int($arg[0])and(is_float($arg[1]))){
            $c=(int)$arg[0]+(float)$arg[1];
        }
        if(is_float($arg[0])and(is_float($arg[1]))){
            $c=(float)$arg[0]+(float)$arg[1];
        }           
        return $c;
    }
    
    public function restar() {
        $arg = func_get_args();
        $c=0;
        if(is_int($arg[0])and(is_int($arg[1]))){
            $c=(int)$arg[0]-(int)$arg[1];
        }
        if(is_float($arg[0])and(is_int($arg[1]))){
            $c=(float)$arg[0]-(int)$arg[1];
        }
        if(is_int($arg[0])and(is_float($arg[1]))){
            $c=(int)$arg[0]-(float)$arg[1];
        }
        if(is_float($arg[0])and(is_float($arg[1]))){
            $c=(float)$arg[0]-(float)$arg[1];
        }           
        return $c;
    }

    public function multiplicar() {
        $arg = func_get_args();
        $c=0;
        if(is_int($arg[0])and(is_int($arg[1]))){
            $c=(int)$arg[0]*(int)$arg[1];
        }
        if(is_float($arg[0])and(is_int($arg[1]))){
            $c=(float)$arg[0]*(int)$arg[1];
        }
        if(is_int($arg[0])and(is_float($arg[1]))){
            $c=(int)$arg[0]*(float)$arg[1];
        }
        if(is_float($arg[0])and(is_float($arg[1]))){
            $c=(float)$arg[0]*(float)$arg[1];
        }           
        return $c;
    }

    public function dividir() {
        $arg = func_get_args();
        $c=0;
        if($arg[1]!=0){
            if(is_int($arg[0])and(is_int($arg[1]))){
                $c=(int)$arg[0]/(int)$arg[1];
            }
            if(is_float($arg[0])and(is_int($arg[1]))){
                $c=(float)$arg[0]/(int)$arg[1];
            }
            if(is_int($arg[0])and(is_float($arg[1]))){
                $c=(int)$arg[0]/(float)$arg[1];
            }
            if(is_float($arg[0])and(is_float($arg[1]))){
                $c=(float)$arg[0]/(float)$arg[1];
            }
        }
        else{$c="Error de division por cero";}     
        return $c;
    }
   
}
 $A= new Aritmetica();
 echo "   3 + 6   = ".$A->sumar(3,6)."<br>";
 echo " 3.5 + 6   = ".$A->sumar(3.5,6)."<br>";
 echo "   3 + 6.5 = ".$A->sumar(3,6.5)."<br>";
 echo " 3.5 + 6.5 = ".$A->sumar(3.5,6.5)."<br>";

 echo "  3 - 6    = ".$A->restar(3,6)."<br>";
 echo "3.5 - 6    = ".$A->restar(3.5,6)."<br>";
 echo "  3 - 6.5  = ".$A->restar(3,6.5)."<br>";
 echo "3.5 - 6.5  = ".$A->restar(3.5,6.5)."<br>";

 echo "  3 * 6    = ".$A->multiplicar(3,6)."<br>";
 echo "3.5 * 6    = ".$A->multiplicar(3.5,6)."<br>";
 echo "  3 * 6.5  = ".$A->multiplicar(3,6.5)."<br>";
 echo "3.5 * 6.5  = ".$A->multiplicar(3.5,6.5)."<br>";

 echo "  3 / 6    = ".$A->dividir(3,6)."<br>";
 echo "3.5 / 6    = ".$A->dividir(3.5,6)."<br>";
 echo "  3 / 6.5  = ".$A->dividir(3,6.5)."<br>";
 echo "3.5 / 6.5  = ".$A->dividir(3.5,6.5)."<br>";

 echo "3.5 / 0  = ".$A->dividir(3.5,0)."<br>";
?>