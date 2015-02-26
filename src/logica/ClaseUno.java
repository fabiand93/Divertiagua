package logica;

public class ClaseUno {

  //Atributos
  private int a;
  private int b;
  private boolean c;
  private int d;

  public ClaseUno(int a, int b, boolean c, int d) {
    super();
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d+a;
  }

  public int metodo1(int a, int b, int d, boolean c) {
    int resultado = 0;

    this.c = !c;

    if (a < b) {
      d = a;
      if ( !this.c ) {
        d += this.b;
        a++;
        this.a += 2;
        this.b = this.d + 8;
      } else {
        d -= b;
        this.a--;
        this.d *= a;
      }

    }
    return resultado;
  }

  public static void main(String[] args) {
    ClaseUno objUno = new ClaseUno(6,5,false,3);
    objUno.metodo1(4, 9, 2, true);
    System.out.println(objUno.a);
    System.out.println(objUno.b);
    System.out.println(objUno.c);
    System.out.println(objUno.d);
    System.out.println("¡Buena suerte!");
  }
}
