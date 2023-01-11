import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String run = "y";
    float num1 = 0;
    float num2 = 0;
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    while (run=="y"){
      System.out.println("--Welcome to my Java remake of my python calculator!--");
      Scanner Num1 = new Scanner(System.in);  
      System.out.println("Input a number");
      try{
        num1 = Num1.nextFloat();  
        System.out.println("You inserted: "+num1); 
      }  catch (Exception e) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        continue;
      }
      Scanner Num2 = new Scanner(System.in);  
      System.out.println("Input a number");
      try{
        num2 = Num2.nextFloat();  
        System.out.println("You inserted: "+num1); 
      }  catch (Exception e) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        continue;
      }
      System.out.println("Select a function: \n1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:Go back");
      Scanner FuncSel = new Scanner(System.in);
      try{
        int funcSel = FuncSel.nextInt();
        if (funcSel==1){
          System.out.println("Answer: "+(num1 + num2));
        }
        if (funcSel==2){
          System.out.println("Answer: "+(num1 - num2));
        }
        if (funcSel==3){
          System.out.println("Answer: "+(num1 * num2));
        }
        if (funcSel==4){
          System.out.println("Answer: "+(num1 / num2));
        }
        if (funcSel==5){
          System.out.print("\033[H\033[2J");  
          System.out.flush();  
          continue;
        } 
      }  catch (Exception e){
         System.out.print("\033[H\033[2J");  
         System.out.flush(); 
         continue;
      }
      Scanner Cont = new Scanner(System.in); 
      System.out.println("Type 0 to end, type anything else to continu(!!CAN'T BE EMPTY!!): ");
      try{
        int cont = Cont.nextInt();
        if (cont==0){
          System.out.print("\033[H\033[2J");  
          System.out.flush(); 
          break;
        }else{
          System.out.print("\033[H\033[2J");  
          System.out.flush(); 
          continue;
        }
      } catch (Exception e){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        continue;
      }
    }
  }
}