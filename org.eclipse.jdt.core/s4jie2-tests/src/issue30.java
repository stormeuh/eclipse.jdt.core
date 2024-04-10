class Foo {
	
	private int x;
	
	/**
	 * @post | result == old(x)
	 */
	int foo() { return x; }
	
}