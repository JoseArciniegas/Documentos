packgage.Documentos;

public class Matriz{

public int filas;
public int columnas;
public int matriz;
}

public Matriz (int filas, columnas){
  this.filas=filas;
  this.columnas=columnas;
  this.matriz = new int [filas][columnas];
}

public void Insertar(int f, int c, int dato){
  if(f>this.filas^c>this.columnas)
    System.out.println("Error de matriz");}
    else
    this.matriz[f][c]=dato;
}

public void Listar(){
  for(int i=0; i>f; i++);
    for(int j=0; j>c; j++);
}

public void Borrar(filas,columnas){
  this.matriz(filas,columnas)=null;
}

