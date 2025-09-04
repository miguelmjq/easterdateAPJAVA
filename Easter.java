// Miguel Mirabal Q
// Will take a year and calculate the date that Easter falls on that year
public class Easter {
    public static void main(String[] args){
        //declaring vars
        int a,r;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int k;
        int m;
        int n;
        int p;
        int y=2026;

        //defining vars
        a = y%19;
        System.out.println("a = " + a);
        b = y/100;
        System.out.println("b = " + b);
        c = y%100;
        System.out.println("c = " + c);
        d = b/4;
        System.out.println("d = " + d);
        e = b%4;
        System.out.println("e = " + e);
        f = (b+8)/25;
        System.out.println("f = " + f);
        g = ((b-f)+1)/3;
        System.out.println("g = " + g);
        h = (19*a+b-d-g+15)%30;
        System.out.println("h = " + h);
        i = c/4;
        System.out.println("i = " + i);
        k = c%4;
        System.out.println("k = " + k);
        r = (32+2*e+2*i-h-k)%7;
        System.out.println("r = " + r);
        m = (a+11*h+22*r)/451;
        System.out.println("m = " + m);
        n = (h + r - 7 * m + 114)/31;
        System.out.println("n = " + n);
        p = (h + r - 7 * m + 114)%31;
        System.out.println("p = " + p);

        //final sentence
        System.out.println("Easter in "+y + " falls on " + n + "/"+ (p+1));
    }
}
