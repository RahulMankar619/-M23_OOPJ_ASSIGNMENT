package com.example7.main;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixTest matrixTest=new MatrixTest();
		int choice;
		while((choice=matrixTest.showMenu())!=0) {
			switch(choice) {
			case 1: matrixTest.acceptRecord();break;
			case 2:matrixTest.addMatrix();break;
			case 3: matrixTest.subMatrix();break;
			case 4: matrixTest.multiMatrix();break;
			case 5: matrixTest.transMatrix();break;	
			}
		}

	}

}
