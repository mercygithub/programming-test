import java.util.scanner;
class Main
{
  public static void main(String[]args)
    char operator;
  Double number1,number2,result;
  scanner input=new scanner(System.in);
  System.out.println("choose an operator:+,-,*,or,/");
  operator=input.next().charAt(0);
  system.out.println("enter first number");
  number1=input.nextDouble();
  System.out.println("enter second number");
  number2=input.nexrDouble();
  switch(operator)
  {
      case'+':
        result=number1+number2;
        System.out.println(number1+"+"+number2+"="+result);
      break;
      case'-':
        result=number1-number2;
        System.out.println(number1+"-"+number2+"="+result);
       break;
      case'*':
        result=number1*number2;
        System.out.println(number1+"*"+number2+"="+result);
      break;
      case'/':
         result=number1/number2;
         System.out.println(number1+"/"+number2+"="+result);
      break;
      default:
         System.out.println("Invalid operator!");
      break;
  }
  input.close();
}
}

      
