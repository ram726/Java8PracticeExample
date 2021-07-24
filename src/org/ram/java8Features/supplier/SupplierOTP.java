package org.ram.java8Features.supplier;
import java.util.function.Supplier;

public class SupplierOTP {
	public static void main(String[] args) {
		Supplier<String> s1=()->{String otp="";
			for(int i=0;i<7;i++) {
				otp+=(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println("OTP is: "+s1.get());
	}
}
