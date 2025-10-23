package AlanveCevreHesap;

public class UcgenHesap {

	public static void main(String[] args) {
		double a,b,c,heron,alan;
		a=3;
		b=4;
		c=5;
		heron=(a+b+c)/2;
		alan=Math.pow(heron*(heron-a)*(heron-b)*(heron-c),0.5);
		System.out.println("a Kenarı="+a);
		System.out.println("b Kenarı="+b);
		System.out.println("c Kenarı="+c);
		System.out.println("Alan="+alan);
	}

}
