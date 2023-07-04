public class S4d {
	public void sumProd(int n) {
		float sum = 0.0f;//C1
		float prod = 1.0f;
		int i = 0;
		while (i <= n) {
			sum = sum + i;
			prod = prod * i;
			foo(sum, prod);
			i++;
		}
	}
	void foo (float sum, float prod) {}
}