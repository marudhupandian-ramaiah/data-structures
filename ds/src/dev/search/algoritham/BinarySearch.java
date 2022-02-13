package dev.search.algoritham;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		System.out.println("No of elements : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int array[] = new int[count];
		System.out.printf("Enter %d elements in sorted order ", count);

		for (int index = 0; index < count; index++) {
			array[index] = scanner.nextInt();
		}

		System.out.println("Element to be searched : ");
		int elementToFind = scanner.nextInt();

		int result = search(array, 0, array.length - 1, elementToFind);
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index : " + result);
		}

	}

	private static int search(int[] array, int first, int last, int elementToFind) {

		if (last >= first) {

			int mid = (first + last) / 2;

			if (array[mid] == elementToFind) {
				return mid;
			} else if (array[mid] > elementToFind) {
				return search(array, first, mid - 1, elementToFind);
			} else {
				return search(array, mid + 1, last, elementToFind);
			}
		}

		return -1;

	}

}
