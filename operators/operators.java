package operators;
public class operators {
    public static void main(String[] args) {
        int a = 9, b = 3;

        //Arithematic operations (+, - , * , / , %)
        System.out.println (" Arithematic operations (+, - , * , / , %)" );
        System.out.println ("a + b = " + (a + b));
        System.out.println ("a - b = " + (a - b));
        System.out.println ("a * b = " + (a * b));
        System.out.println ("a / b = " + (a / b));
        System.out.println ("a % b = " + (a % b));

        //Relatonal Algebra (==, !=, >, <, >=, <=)
        System.out.println ("Relatonal Algebra (==, !=, >, <, >=, <=)");
        System.out.println ("a == b : " + (a == b));
        System.out.println ("a >= b : " + (a >= b));
        System.out.println ("a <= b : " + (a <= b));
        System.out.println ("a > b : " + (a > b));
        System.out.println ("a < b> : " + (a < b));
        System.out.println ("a != b : " + (a != b));

        //Logical Operators (&&, ||, !)
        System.out.println("Logical Operators (&&, ||, !)");
        boolean x = true , y = false;
        System.out.println("x && y : "+ (x && y ));
        System.out.println("x || y : "+ (x || y ));
        System.out.println("!x : "+ (!x ));

        System.out.println("Assignment Operators (=, +=, -=, *=, /=, %=)");
        int c = 7;
        System.out.println("c = " + c);
        c += 3;
        System.out.println("c += 3 : " + c);
        c -= 2;
        System.out.println("c -= 2 : " + c);
        c *= 2;
        System.out.println("c *= 2 : " + c);
        c /= 4;
        System.out.println("c /= 4 : " + c);
        c %= 3;
        System.out.println("c %= 3 : " + c);

        System.out.println("Unary Operators (+, -, ++, --, !)");
        System.out.println("+c : " + (+c));
        System.out.println("-c : " + (-c));
        System.out.println("c++ : " + (c++));
        System.out.println("++c : " + (++c));
        System.out.println("c-- : " + (c--));
        System.out.println("--c : " + (--c));
        System.out.println("!true : " + (!true));

        System.out.println("Ternary Operator (condition ? value_if_true : value_if_false)");
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
    }
    
}