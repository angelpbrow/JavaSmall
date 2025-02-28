int sumNumbers( int n){
    int i = 1;
    int sum = 0;
    while (i <= n) {
        sum = sum + i;
        i++;
    }
    return sum;
}
sumNumbers(5);
sumNumbers(11);
sumNumbers(23);
sumNumbers(5683);
sumNumbers(106839);