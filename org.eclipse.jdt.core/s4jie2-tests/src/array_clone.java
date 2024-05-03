class Foo {
	
	/**
	 * @pre | xs != null && xs.length >= 1 
	 * @post | xs[0] == -old(xs.clone())[0]
	 */
	static void negateFirst(int[] xs) {
		xs[0] = -xs[0];
	}

}