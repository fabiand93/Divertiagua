package logica;

//Esta clase representa un jacuzzi.
  public class Jacuzzi { //El nombre de la clase
      private float diametro; //diametro del jacuzzi
      private float profundidad; //profundidad del jacuzzi
      private int tipoTanque; // tipo de tanque 1 = pequeno, 2 = mediano, 3 = grande;

      //Constructor: cuando se cree un objeto jacuzzi se ejecutará el código que incluyamos en el constructor
      public Jacuzzi (float diametro, float profundidad) {
          this.diametro=diametro;
          this.profundidad=profundidad;

      } //Cierre del constructor … el código continúa …

      //Método para establecer la matrícula de un taxi
      public void setDiametro (float valorDiametro) {
          diametro = valorDiametro; //El diametro del objeto jacuzzi adopta el valor que contenga valorDiametro
      } //Cierre del método
      //Método para establecer la profundidad de un jacuzzi
      public void setProfundidad (float valorProfundidad) {
          profundidad = valorProfundidad; //La profundidad del objeto jacuzzi adopta el valor indicado
      } //Cierre del método
      public void setTipoTanque (int valorTipoTanque){
        tipoTanque =  valorTipoTanque; // Seleccion del tipo de tanque con el tamaño del tanque previamente identificado
      }
      //Método para obtener el diametro del objeto jacuzzi
      public float getDiametro () { return diametro; } //Cierre del método
      //Método para obtener la profundidad del objeto jacuzzi
      public float getProfundidad () { return profundidad; } //Cierre del método
      public int getTipoTanque () { return tipoTanque; } //Cierre del metodo

}
