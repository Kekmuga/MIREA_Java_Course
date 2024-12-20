package Pract_24.Task1;

public class ConcreteFact implements ComplexAbstarcFact {
    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex CreateComplex(int real, int imaginary) {
        return new Complex(real, imaginary);
    }
}