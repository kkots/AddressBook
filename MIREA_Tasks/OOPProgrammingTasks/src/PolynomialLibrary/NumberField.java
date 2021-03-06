package PolynomialLibrary;

public abstract class NumberField<N> {
	public abstract N add(N x);//n1+n2
	public abstract N power(int x);//n^x
	public abstract N multiply(N x);//a*n
	public abstract N getZero();//0
}
