void foo(float sum, float prod) {}
void main(int n) {
	float sum = 0.0;//C1
	float prod = 1.0;
	int i;
	for (i = 1; i <= n; i++) {
		sum = sum + i;
		prod = prod * i;
		if (n % 2 == 0){ 
			foo(sum, prod);
		}
	}
}