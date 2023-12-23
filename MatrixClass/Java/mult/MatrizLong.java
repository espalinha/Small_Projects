package mult;
public class MatrizLong extends MatrixOperation<Long>{
  @Override
  public Long adiciona(Long a, Long b)
  {
    return a + b;
  }
  @Override
  public Long multiplica(Long a, Long b)
  {
    return a * b;
  }

  @Override Long zero()
  {
    long x = 0;
    return x;
  }
}
