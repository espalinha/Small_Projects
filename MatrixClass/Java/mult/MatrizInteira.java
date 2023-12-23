package mult;
public class MatrizInteira extends MatrixOperation<Integer> {
  /*
   * Como MultMatrix tem os abstratos, precisamos colocar eles aqui
   */
  @Override
  public Integer adiciona(Integer a, Integer b)
  {
    return a + b;
  }
  @Override
  public Integer multiplica(Integer a, Integer b)
  {
    return a * b;
  }
  @Override Integer zero()
  {
    int x = 0;
    return x;
  }
}
