class Quux {
	
	int a;
	
	int getA() { return a; }
	
}

class Bar {
	
	int y;
	
	int getY() { return y; }
	
}

class Foo extends Bar {
	
	static int s;
	static Quux sq;
	static int getS() { return s; }
	
    int x;
	Quux z;
    
    int getX() { return x; }
    
    /**
     * @pre | this.x > 0
     * @pre | x > 0
     * @pre | this.getX() > 0
     * @pre | getX() > 0
     * @pre | super.y > 0
     * @pre | super.getY() > 0
     * @pre | z.a > 0
     * @pre | z.getA() > 0
     * @pre | s > 0 // This is OK
     * @pre | sq.a > 0 // This is OK
     * @pre | getS() > 0 // This is OK
     * 
     * @throws IllegalArgumentException | this.x > 0
     * @may_throw IllegalArgumentException | this.x > 0
     * @inspects | this, z
     * @mutates | this, z
     * @mutates_properties | this.getX(), z.getA()
     * 
     * @post | old(this.x) > 0
     * @post | old(x) > 0
     * @post | old(this.getX()) > 0
     * @post | old(getX()) > 0
     * @post | old(super.y) > 0
     * @post | old(super.getY()) > 0
     * @post | old(z.a) > 0
     * @post | old(z.getA()) > 0
     * @post | old(s > 0) // This is OK
     * @post | old(sq.a > 0) // This is OK
     * @post | old(getS()) > 0 // This is OK
     */
    Foo() {}
    
}