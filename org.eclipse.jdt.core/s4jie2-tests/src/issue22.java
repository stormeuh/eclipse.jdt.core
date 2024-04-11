/** 
 * @invar | foo()
 * @invar | foo()
 */
class Foo {
    boolean foo() { return true; }
}

class Main {
    public static void main(String[] args) { new Foo().foo(); }
}