/*
 * addition.java
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

public class addition {
	
	public static void main (String args[]) {
		int a,b,c;
		
		Scanner masukan = new Scanner(System.in);
		
		System.out.printf("Masukkan a: ");a=masukan.nextInt();
		System.out.printf("Masukkan b: ");b=masukan.nextInt();
		System.out.printf("Masukkan c: ");c=masukan.nextInt();
		
		System.out.printf("Hasil penjumlahan (a+b+c) = %d" , a+b+c);
	}
}
