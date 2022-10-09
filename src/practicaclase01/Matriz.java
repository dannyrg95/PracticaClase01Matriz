    //La clase Matriz esta compuesta por tres componentes:
//Atributos: Que describen mi objeto
//Contructor: Para inicializar mis atributos
//Metodos: Describen los comportamientos de mi objeto
package practicaclase01;

public class Matriz {

    //Atributos
    //Una matriz tiene Filas y Columnas
    private int i; //Filas
    private int j; //Columnas
    private int matrix[][];

    //Constructor
    public Matriz(int i, int j) {
        this.i = i;
        this.j = j;
        //Construir Matriz
        //this. se refiere al Atributo como tal
        this.matrix = new int[this.i][this.j];
    }

    //Getter and Setters 
    //Get: Me devuelven el valor
    //Set: Dan un valor
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] Matrix) {
        this.matrix = Matrix;
    }

    //Metodos
    //Llenar la Matriz
    //Void: No retorna un valor
    //Int: Debe llevar un return y devolver un valor de tipo entero
    public void llenarMatriz() {
        for (int x = 0; x < this.matrix.length; x++) { //X representa la Fila 0 hasta el tamaño de mi Matriz / this.matrix.length me devuelve la cantidad de filas que tiene mi Matriz
            for (int y = 0; y < this.matrix[x].length; y++) { //Y representa las Columnas / this.matrix[x].length me dice la cantidad de columnas que tiene esa fila
                if (x % 2 == 0) { // (x % 2 == 0) es el algoritmo para saber cuando un numero es par o impar / 0 es par / 1 es impar
                    this.matrix[x][y] = -(int) (Math.random() * 9 + 1); /// Math.random()*9+1 / Metodo para generar numeros random hasta el 9 y que vaya de 1 en 1 y agregue el menos mediante el int
                } else {
                    this.matrix[x][y] = (int) (Math.random() * 9 + 1); // Mismo metodo pero agrega el numero positivo
                }

            }
        }

    }

    //Imprimir la Matriz
    public void imprimirMatriz() {
        for (int x = 0; x < this.matrix.length; x++) { //Filas
            System.out.print("|");
            for (int y = 0; y < this.matrix[x].length; y++) { //Columnas
                System.out.print(this.matrix[x][y]);
                if (y!= this.matrix[x].length-1) System.out.print("\t");
                }
                System.out.println("|");
            }
        }
    
    //Suma Total de la Matriz

    public int sumaTotalMatriz() {
        int suma = 0;
        for (int x = 0; x < this.matrix.length; x++) { //Filas
            for (int y = 0; y < this.matrix[x].length; y++) { //Columnas
                suma = suma + this.matrix[x][y];
            }
        }
        return suma;
    }

    public int suma2FilaMatriz() {
        int suma = 0;
        for (int x = 0; x < this.matrix.length; x++) { //Filas
            for (int y = 0; y < this.matrix[x].length; y++) { //Columnas
                if (x == 1) { //Para asegurarnos de sumar la Fila 2 (Fila 1 es 0, Fila 2 es 1, etc)
                    suma = suma + this.matrix[x][y];
                }
            }
        }
        return suma;
    }

    public int suma3ColumnaMatriz() {
        int suma = 0;
        for (int x = 0; x < this.matrix.length; x++) { //Filas
            for (int y = 0; y < this.matrix[x].length; y++) { //Columnas
                if (y == 2) { //Para asegurarnos de sumar la Columna 2 (Columna 1 es 0, Columna 2 es 1, etc)
                    suma = suma + this.matrix[x][y];
                }
            }
        }
        return suma;
    }

    public int sumaDiagonalMatriz() {
        int suma = 0;
        for (int x = 0; x < this.matrix.length; x++) { //Filas
            for (int y = 0; y < this.matrix[x].length; y++) { //Columnas
                if (x == y) { //Para asegurarnos de sumar en diagonal X tiene que ser igual a Y
                    suma = suma + this.matrix[x][y];
                }
            }
        }
        return suma;
    }
}
