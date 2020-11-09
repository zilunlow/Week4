//kalau berada pada package yg sama , tak perlu import
//package SemuaCircle.CircleKecil;
import SemuaCircle.CircleKecil.Circle;// or SemuaCircle.*; import class from package


public class DriverCircle{
	public static void main(String []args){
	//object or reference
	Circle bulat;
	bulat=new Circle();
	System.out.println("Print apa? "+bulat);//need call method toString or it will output memory location in hex code
									//bulat only without .toString()  also can  or bulat.toString()

	Circle bulat1=new Circle(76);//instantiate object -overloading constructor 1 parameter
	System.out.println("Print apa? "+bulat1);

	Circle bulat2=new Circle(6,8);//instantiate object -overloading constructor 2 parameter
	System.out.println("Print apa? "+bulat2);

	Circle bulat3=new Circle(6,8);//instantiate object -overloading constructor 3 parameter
	System.out.println("Print apa? "+bulat3);

	System.out.printf("Ukurlilit = %5.2f", UkurLilit(bulat3.getJejari()));

	System.out.printf("\nUkurlilit = %5.2f", bulat3.UkurLilit(5));//static method in class Circle

	System.out.println("\nLuas ialah "+Area(bulat3));

	//Method call
	System.out.println("Method Papar() = "+Papar());
	}

	//static method that return a reference(object)
	public static Circle Papar(){//it will execute toString()
		
		return new Circle();//create object
	}

	//call by reference static method that accept object as its parameter
	public static double Area(Circle b){
		return b.getJejari()*b.getJejari()*Math.PI;
	}

	public static double UkurLilit(double jejari){

		return 2*Math.PI*jejari;//2PI*r circumference
								//Math.pow(3);

	}




}





	//String is a reference
	// String s="FTMK 666";
	// System.out.println(s);


	
	// System.out.println(bulat1);
	// System.out.println(bulat2);
	// System.out.println("Jejari bulat1 = "+bulat1.getJejari());
	// System.out.println("Jejari bulat = "+bulat.getJejari());
	// bulat2.setJejari(35);
	// System.out.println("Jejari bulat2 = "+bulat2.getJejari());
	//System.out.format("Luas ialah %2.3f",bulat.KiraLuas());