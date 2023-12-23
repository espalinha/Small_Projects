package mult;

import java.lang.reflect.Array;

public abstract class MatrixOperation<Type extends Number> 
{
  /*
   * Necessário ter, pois não sabemos o tipo, e ele será definido na hora
   * Ele pode ser String, char, então precisamos disso para nao dá problema.
   */
  abstract Type adiciona(Type a, Type b); //Vai ser definido quando alguma outra classe usar
  abstract Type multiplica(Type a, Type b);
  abstract Type zero();
  /*
   * Vai fazer a multiplica1tiplicação de forma generica, vamos usar Inheritence para fazer isso
   */
  public Type[][] multiplicaMatriz(Class<Type> clazz , Type[][] matrizA, Type[][] matrizB)
  {
    int a = matrizA.length;
    int b = matrizB.length;
    int c = matrizA[0].length;
    int d = matrizB[0].length;

    /*
     * IMPORTANTE !!!!!!!!!!!!
     * 
     * Extremamente importante para criarmos arrays dos tipo que queremos
     */
    @SuppressWarnings("unchecked")
    Type[][] matrizC = (Type[][]) Array.newInstance(clazz, a, d); 
    if(b != c)  return null;
    for(int i = 0; i < a; i++)
    {
      for(int j = 0; j < d; j++)
      {
        matrizC[i][j] = zero(); //Importante, se não, não funciona para os tipos Long, Double, Float
        for(int k = 0; k < c; k++)
        {
          matrizC[i][j] = adiciona(matrizC[i][j], multiplica((Type) matrizA[i][k], (Type) matrizB[k][j]));
        }
      }
    }

    return matrizC;
  }
}
