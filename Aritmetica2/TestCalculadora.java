import java.util.Scanner;
public class TestCalculadora{
 
  public static void main(String[] args){
    Aritmetica cal = new Aritmetica();
 
    int menu = 0;
    int opcion;
    float op1;
    float op2;
    Scanner sc = new Scanner(System.in);
    do{
      printMenu();
      System.out.print("Elija una Opcion:");
      opcion = sc.nextInt();
      sc.nextLine();
      switch(opcion){
        case 1:
          System.out.print("Primer valor: ");
          op1 = sc.nextFloat();
          System.out.print("\nSegundo valor: ");
          op2 = sc.nextFloat();
          System.out.println(cal.sumar(op1, op2));
          menu = 0;
          break;
         case 2:
          System.out.print("Primer valor: ");
          op1 = sc.nextFloat();
          System.out.print("\nSegundo valor: ");
          op2 = sc.nextFloat();
          System.out.println(cal.restar(op1, op2));
          menu = 0;
          break;
         case 3:
          System.out.print("Primer valor: ");
          op1 = sc.nextFloat();
          System.out.print("\nSegundo valor: ");
          op2 = sc.nextFloat();
          System.out.println(cal.multiplicar(op1, op2));
          menu = 0;
          break;
          case 4:
          System.out.print("Primer valor: ");
          op1 = sc.nextFloat();
          System.out.print("\nSegundo valor: ");
          op2 = sc.nextFloat();
          if(op2!=0){
             System.out.println(cal.dividir(op1, op2));
             }
          else{System.out.println("Error de division por cero");}
          menu = 0;
          break;
        case 5:
          System.out.println("Progama Cerrado");
          menu = 5;
          break;
      }
    }while(menu == 0);
  }
 
  public static void printMenu(){
    System.out.println("\nCalculadora");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
  }
}