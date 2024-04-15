class Foo {
	static int getValue() { return 42; }
	
	/**
	 * @pre | getValue() >= 0
	 */
	Foo() {}
}