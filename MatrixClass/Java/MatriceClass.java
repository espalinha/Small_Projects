import mult.MatrizFloat;
import mult.MatrizInteira;
import mult.MatrizLong;
import mult.MatrizDouble;

public class MatriceClass
{
  public static void main(String[] args) {
    genericPrint<Integer> gpint = new genericPrint<Integer>();
    System.out.println("-----------------  Int  ----------------------");
    MatrizInteira mint = new MatrizInteira();
    Integer[][] a = {{1, 2}, {1, 2}};
    Integer[][] b = {{1, 2}, {1, 2}}; 
    gpint.Print(a);
    gpint.Print(b);
    Integer[][] c = mint.multiplicaMatriz(Integer.class, a, b);
    gpint.Print(c);

    System.out.println();
    System.out.println("-----------------  Long  ----------------------");
    System.out.println();
    genericPrint<Long> gpLong = new genericPrint<Long>();
    MatrizLong mlong = new MatrizLong(); 
    long x = 1, y = 2;
    Long[][] s = {{x, y}, {x, y}};
    Long[][] u = {{x, y}, {x, y}};
    gpLong.Print(s);
    gpLong.Print(u);
    Long[][] t = mlong.multiplicaMatriz(Long.class, s, u);
    gpLong.Print(t);

    System.out.println();
    System.out.println("-----------------  Double  ----------------------");
    System.out.println();
    MatrizDouble mdouble = new MatrizDouble();
    genericPrint<Double> gpDouble = new genericPrint<Double>();
    Double p = 1.0, o = 2.0;
    Double[][] i = {{p, o}, {p, o}};
    Double[][] j = {{p, o}, {p, o}};
    gpDouble.Print(i);
    gpDouble.Print(j);
    Double[][] k = mdouble.multiplicaMatriz(Double.class, i, j);
    gpDouble.Print(k);

    System.out.println();
    System.out.println("-----------------  Float  ----------------------");
    System.out.println();
    MatrizFloat mFloat = new MatrizFloat();
    genericPrint<Float> gpFloat = new genericPrint<Float>();
    Float w = 1.0f, q = 2.0f;
    Float[][] l = {{w, q}, {w, q}};
    Float[][] m = {{w, q}, {w, q}};
    gpFloat.Print(l);
    gpFloat.Print(m);
    Float[][] n = mFloat.multiplicaMatriz(Float.class, l, m);
    gpFloat.Print(n);
  }
}