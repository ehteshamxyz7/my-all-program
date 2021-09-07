package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
				private Address address;
				@Autowired
				@Qualifier("address")
				public Address getAddress() {
				System.out.println("setting values");
					return address;
					
				}
			
				public void setAddress(Address address) {
					System.out.println("setting values");
					this.address = address;
				}

				public Emp() {
					super();
				}
				
				public Emp(Address address) {
					super();
					this.address = address;
					System.out.println("inside constructor");
				}

				@Override
				public String toString() {
					return "Emp [address=" + address + "]";
				}
				
				
	
		

}
 