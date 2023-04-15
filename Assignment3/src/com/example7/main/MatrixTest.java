package com.example7.main;

import java.util.Scanner;

public class MatrixTest {
	Matrix a=new Matrix();
	Matrix b=new Matrix();
	private Scanner sc=new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Enter no. of rows in Matrix A:");
		a.setRows(sc.nextInt());
		System.out.println("Enter no. of columns in Matrix A:");
		a.setColumns(sc.nextInt());
		System.out.println("Enter elements of Matrix A:");
		int[][] arr=new int[a.getRows()][a.getColumns()];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		a.setMatrix(arr);
		printMatrix(arr);
		System.out.println("Enter no. of rows in Matrix B:");
		b.setRows(sc.nextInt());
		System.out.println("Enter no. of columns in Matrix B:");
		b.setColumns(sc.nextInt());
		System.out.println("Enter elements of Matrix B:");
		arr=new int[b.getRows()][b.getColumns()];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		b.setMatrix(arr);
		printMatrix(arr);
	}
	public void addMatrix() {
		if((a.getRows()==b.getRows())&&(a.getColumns()==b.getColumns())) {
			int[][] arr=new int[a.getRows()][a.getColumns()];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=a.getMatrix()[i][j]+b.getMatrix()[i][j];
				}
			}
			System.out.println("Addition of Matrices is:");
			MatrixTest.printMatrix(arr);
		}
		else {
			System.out.println("No. of rows and columns of both matrices are different. Try again!");
		}
	}
	public void subMatrix() {
		if((a.getRows()==b.getRows())&&(a.getColumns()==b.getColumns())) {
			int[][] arr=new int[a.getRows()][a.getColumns()];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=a.getMatrix()[i][j]-b.getMatrix()[i][j];
				}
			}
			System.out.println("Substraction of Matrices is:");
			MatrixTest.printMatrix(arr);
		}
		else {
			System.out.println("No. of rows and columns of both matrices are different. Try again!");
		}
	}
	public void multiMatrix() {
		if((a.getRows()==b.getColumns())&&(a.getColumns()==b.getRows())) {
			int[][] arr=new int[a.getRows()][b.getColumns()];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					for(int k=0;k<arr[i].length;k++) {	
					arr[i][j]+=a.getMatrix()[i][k]*b.getMatrix()[k][j];
				}
			}
		}
		System.out.println("Multiplication of Matrices is:");
		MatrixTest.printMatrix(arr);
		}
		else {
			System.out.println("No. of rows and columns of both matrices are different. Try again!");
		}
	}
	public void transMatrix() {
		System.out.println("Transpose of Matrix A:");
		int[][] arr=new int[a.getColumns()][a.getRows()];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=a.getMatrix()[j][i];
			}
		}
		MatrixTest.printMatrix(arr);
		System.out.println("Transpose of Matrix B:");
		arr=new int[b.getColumns()][b.getRows()];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=b.getMatrix()[j][i];
			}
		}
		MatrixTest.printMatrix(arr);
	}
	public static void printMatrix(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public int showMenu() {
		System.out.println("0. Exit");
		System.out.println("1. Accept Record");
		System.out.println("2. Addition");
		System.out.println("3. Substraction");
		System.out.println("4. Multiplication");
		System.out.println("5. Transpose");
		System.out.println("Enter your choice:");
		return sc.nextInt();
	}
}
