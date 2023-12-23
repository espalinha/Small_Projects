package mult;
public class MatrizDouble extends MatrixOperation<Double> {    
  @Override
  public Double adiciona(Double a, Double b)
  {
    return a + b;
  }
  @Override
  public Double multiplica(Double a, Double b)
  {
    return a * b;
  }

  @Override Double zero()
  {
    double x = 0;
    return x;
  }
}
