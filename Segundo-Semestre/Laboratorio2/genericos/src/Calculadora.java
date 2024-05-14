public class Calculadora<E extends Number> implements Operable<E>{
    @Override
    public E suma(E a, E b) {
        return  (E) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    @Override
    public E resta(E a, E b) {
        return  (E) Double.valueOf(a.doubleValue() - b.doubleValue());
    }

    @Override
    public E multiplicacion(E a, E b) {
        return  (E) Double.valueOf(a.doubleValue() * b.doubleValue());
    }

    @Override
    public E division(E a, E b) {
        try {
            if(b.doubleValue() == 0){
                throw new ArithmeticException("No se puede dividir por 0");
            }
            return  (E) Double.valueOf(a.doubleValue() / b.doubleValue());
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
