int sumNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum = sum + 1;
    }
    return sum;
}
int sumNumbersTo10(){
    return sumNumbers(10);
}
sumNumbersTo10();