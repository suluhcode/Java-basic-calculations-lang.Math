/*
 * calculation.java
 * 
 * Copyright 2014 adesuluh <adesuluh@adesuluh-Satellite-L645D>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.Scanner;
import java.lang.Math; 

public class calculation {
	
	public static void main (String args[]) {
		int a,b;
		float c;
		
		Scanner masukkan = new Scanner(System.in);
		
		System.out.printf("Masukkan a:");a=masukkan.nextInt();
		System.out.printf("Masukkan b:");b=masukkan.nextInt();
		
		System.out.printf("Hasil penjumlahanan: %d\n", a+b);
		System.out.printf("Hasil perkalian: %d\n", a*b);
		
		c=(float)(a)/(float)(b);
		System.out.printf("Hasil pembagian: %5.2f\n",c);
		
		c=(int)Math.pow(a,b);
		System.out.printf("Hasil pemangkatan: %.0f",c);
	}
}










