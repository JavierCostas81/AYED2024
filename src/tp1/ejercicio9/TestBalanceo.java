package tp1.ejercicio9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class TestBalanceo {
    //Ejercicio 9a
    //Usé una pila (Stack<E>) para pushear cuando es un símbolo de apertura
    //y para popear cuando es un símbolo de cierre y comparar si coincide con su par de apertura
    //También se agrega balanceo cuando es el String nulo o blanco
    //y desbalanceo cuando no hay más símbolos de cierre pero la pila aún tiene de apertura.
    public static void main(String[] args) {
        for (String st: args) {
            if (estaBalanceado(st)) {
                System.out.println("El string " + st + " está balanceado");
            }
            else System.out.println("El string " + st + " no está balanceado");
        }

    }

    private static boolean estaBalanceado(String s) {
        Stack<Character> pilaControl = new Stack<>();
        boolean check = true;
        Set<Character> conjunto = new HashSet<>();
        conjunto.addAll(Arrays.asList( '(','[','{'));
        if (s.isBlank()) return true;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (conjunto.contains(c)) {
                pilaControl.push(c);
                }
            else {
                if (pilaControl.isEmpty()) return false;
                check = checkBalanceo(c,pilaControl.pop());
                }
            if (!check) return check;
            }
        return check && pilaControl.isEmpty();
    }

    private static boolean checkBalanceo(Character c, Character pop) {
        return
                ((c.equals(')') && pop.equals('(')) ||
                (c.equals(']') && pop.equals('[')) ||
                (c.equals('}') && pop.equals('{')));

    }
}