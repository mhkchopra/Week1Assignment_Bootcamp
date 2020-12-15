package com.testtribe.week1;

	public class MethodAndVariable {
	
		public static void main(String[] args) { //static method
			
			MethodAndVariable localvar= new MethodAndVariable();

			localvar.a();
			localvar.b();
		}

		public void a() { //non-static method
			int a = 10;
			System.out.println(a);
			
			a--;
			System.out.println(a);
		}
		
		public void b() { //non- static method
			int a = 15;
			System.out.println(a);
			
			
			a--;
			System.out.println(a);
		}
	}

