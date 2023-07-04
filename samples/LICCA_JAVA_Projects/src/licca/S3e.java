package licca;
public class S3e {
	public void sumProd(int n) {
		float sum = 0.0f;//C1
		float prod = 1.0f;
		int i;
		for (i = 1; i <= n; i++) {
			if (i % 2 == 0) sum = sum + i;
			prod = prod * i;
			foo(sum, prod);
		}
	}
	void foo (float sum, float prod) {}
}