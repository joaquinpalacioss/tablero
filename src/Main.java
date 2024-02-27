public class Main {
    public static void main(String[] args) {
        //Declaramos las variables de tipo entero en las que ponemos el tamaño de la matriz
        int c = 8;
        int f = 8;
    //Declaramos una matriz ya que se necesita un array bidimensional para representar columnas y filas
    String[][] tablero = new String[f][c];
// iniciamos un bucle for en el que vamos a recorrer las columnas , empezaría en la columna 0 y continuaria hasta el final del tamaño que elegimos en la variable c
        for (int columna = 0; columna < tablero.length; columna++) {
            //con este for recorremos las filas, este finaliza antes de regresar al anterior,  es decir la columna es 0 y lo que incrementa son las filas
            //hasta el tamaño que elegimos en la variable f, luego pasa a la columna 1 y así sucesivamente
            for (int fila=0; fila< tablero[columna].length; fila++) {
            //con este if vemos si el resto de la sumatoria entre la columna y fila es 0,si es 0 a esa casilla la llamaremos roja
                if( (columna + fila) % 2 == 0){
                tablero[columna][fila] = " ROJO ";
            }
                // de lo contrario si el resultado no es 0 a esa casilla la llamaremos azul
                else{
                    tablero[columna][fila] = " AZUL ";
                }
            }
            }
        //este for lo utilizaremos para imprimir en consola el tablero el cual utiliza la misma lógica en cuanto al tamaño de las columnas y filas , como también el llenado
            for (int columna=0; columna < tablero.length; columna++) {
                for (int fila =0; fila < tablero[columna].length; fila++){
                    //acá imprimimos según la posición en la que estemos parados el valor de la columna y fila, ejemplo columna 0  y fila 0 es rojo
                    System.out.print(tablero[columna][fila]);
                }
                //con esto añadimos un salto de linea para que se distingan las filas y se distinga el tablero
                System.out.println("");
            }


        }

    }
