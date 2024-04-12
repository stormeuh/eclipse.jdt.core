package foo_nofsc4j;

/**
 * @invar | false
 */
class Foo {
    /**
	 * @pre | false
	 */
	void foo() {}
}

class FooTest {
	@org.junit.jupiter.api.Test
	void testFoo() {
		new Foo().foo();
	}
}