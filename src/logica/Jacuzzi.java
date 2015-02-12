 package logica;

 import java.lang.Math;
 //Esta clase representa un jacuzzi.
  public class Jacuzzi { //El nombre de la clase
      public int diametro; //diametro del jacuzzi
      public int profundidad; //profundidad del jacuzzi
      private float volumen;
      //Constructor: cuando se cree un objeto jacuzzi se ejecutará el código que incluyamos en el constructor
      public Jacuzzi (int i, int j, float k) {
          this.diametro=i;
          this.profundidad=j;
          this.volumen=0;
      } //Cierre del constructor … el código continúa …
      public void setVolumen(float valorVolumen){
    	  this.volumen= (float) (Math.PI*((diametro/2)^3)*profundidad);
    	  System.out.println(volumen);
      }
      public void imprimir(float volumen){
    	  System.out.println(volumen);
      }
      
}
