package com.example7.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Matrix {
	@Setter @Getter private int rows;
	@Setter @Getter private int columns;
	@Setter @Getter private int[][] matrix=new int[rows][columns];	
}
