package mult;
public class MatrizFloat extends MatrixOperation<Float>{
  @Override
  public Float adiciona(Float a, Float b)
  {
    return a + b;
  }
  @Override
  public Float multiplica(Float a, Float b)
  {
    return a * b;
  }
  @Override Float zero()
  {
    float x = 0;
    return x;
  }
}
