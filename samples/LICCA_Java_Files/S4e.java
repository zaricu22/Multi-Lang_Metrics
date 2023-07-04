public class S4e {
	public void sumProd(int n) {
		float sum = 0.0f;//C1
		float prod = 1.0f;
		int i = 1;
		if (i <= n) {
			sum = sum + i;
			prod = prod * i;
			foo(sum, prod);
		}
	}
	void foo (float sum, float prod) {}
}