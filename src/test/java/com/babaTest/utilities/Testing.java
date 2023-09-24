package com.babaTest.utilities;

import java.io.IOException;

import com.babaTest.testCases.BabaBaseLibrary;

public class Testing extends BabaBaseLibrary {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\mtali\\eclipse-workspace\\BabaTest\\src\\main\\resources\\webtable.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colnum = XLUtils.getCellCount(path, "Sheet1", 1);

		Object[][] logindata = new Object[rownum][colnum];

		for (int i = 1; i <= rownum; i++) {

			for (int j = 0; j < colnum; j++) {

				System.out.print(logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j) + "\t");

			}
			System.out.println();
		}
	}
}
