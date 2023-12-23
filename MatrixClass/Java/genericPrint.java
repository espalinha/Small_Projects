public class genericPrint<Type> {
  public void Print(Type[][] lista)
  {
    int N = lista.length;
    int M = lista[0].length;
    for(int i = 0; i < N; i++)
    {
      for(int j = 0; j < M; j++)
      {
        System.out.print(lista[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
  
}
