public class S4a {
	public void sumProd(int n) {
		float prod = 1.0f;
		float sum = 0.0f;//C1
		int i;
		for (i = 1; i <= n; i++) {
			sum = sum + i;
			prod = prod * i;
			foo(sum, prod);
		}
	}
	void foo (float sum, float prod) {}
}