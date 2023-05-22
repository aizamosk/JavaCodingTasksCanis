package week1;

public class lastDigit {

    public boolean lastDigit(int a, int b, int c) {
        a= a%=10;
        b%=10;
        c%=10;

        return a==b|| b==c||c==a;
    }

}
