package chapter4.local_class;

class A { protected char a = 'a'; }
class B { protected char b = 'b'; }

public class LocalClassTest extends A {
    private char c = 'c'; // Private fields visible to local class
    public static char d = 'd';
    public void createLocalObject(final char e, char h) // h not final; not usable by local class before JDK 8, but valid in JDK 8 and later
    {
        final char f = 'f';
        char i = 'i'; // i not final; not usable by local class before JDK 8, but valid in JDK 8 and later
        class Local extends B
        {
            char g = 'g';
            public void printVars()
            {
                // All of these fields and variables are accessible to this class
                System.out.println(g); // (this.g) g is a field of this class
                System.out.println(f); // f is a final local variable
                System.out.println(e); // e is a final local parameter
                System.out.println(d); // (LocalClassTest.this.d) d field of containing class
                System.out.println(c); // (LocalClassTest.this.c) c field of containing class
                System.out.println(b); // b is inherited by this class
                System.out.println(a); // a is inherited by the containing class
                // The next field were not accesible before JDK 8, but in JDK 8 and later it is OK
                System.out.println(i);
                System.out.println(h);
            }
        }
        Local l = new Local(); // Create an instance of the local class
        l.printVars(); // and call its printVars() method.
    }

    public static void main(String[] args) {
        LocalClassTest lc = new LocalClassTest();
        lc.createLocalObject('e', 'h');
    }
}