package standart;

import java.util.ArrayList;

import sorts.BubbleSort;
import sorts.InsertionSort;
import sorts.MergeSort;
import sorts.QuickSort;
import sorts.SelectionSort;
import sorts.SelectionSortStable;

public class TestMain {

	static int tries;
	static int length;
	static int size;

	static long timeStart;
	static long timeEnd;

	static ArrayList<Long> timeSelectionSort = new ArrayList<Long>();
	static ArrayList<Long> timeSelectionSortStable = new ArrayList<Long>();
	static ArrayList<Long> timeBubbleSort = new ArrayList<Long>();
	static ArrayList<Long> timeInsertionSort = new ArrayList<Long>();
	static ArrayList<Long> timeQuickSort = new ArrayList<Long>();
	static ArrayList<Long> timeMergeSort = new ArrayList<Long>();


	public static void main(String[] args) {
		
		tries = AbbreviationScanner.scanner("Anzahl der Versuche: ");
		length = AbbreviationScanner.scanner("Länge des Arrays: ");
		size = AbbreviationScanner.scanner("Größe der zu sortierenden Zahlen: ");

		int[] arr = Array.createArray(length);
		int[] arrSelection = Array.createArray(length);
		int[] arrSelectionStable = Array.createArray(length);
		int[] arrBubble = Array.createArray(length);
		int[] arrInsertion = Array.createArray(length);
		int[] arrQuick = Array.createArray(length);
		int[] arrMerge = Array.createArray(length);

		for (int i = 0; i < tries; i++) {

			arr = Array.fillArray(arr, size);
			arrSelection = arr.clone();
			arrSelectionStable = arr.clone();
			arrBubble = arr.clone();
			arrInsertion = arr.clone();
			arrQuick = arr.clone();

			timeStart = System.currentTimeMillis();
			SelectionSort.sort(arrSelection);
			timeEnd = System.currentTimeMillis();
			timeSelectionSort.add(timeEnd - timeStart);

			timeStart = System.currentTimeMillis();
			BubbleSort.sort(arrBubble);
			timeEnd = System.currentTimeMillis();
			timeBubbleSort.add(timeEnd - timeStart);

			timeStart = System.currentTimeMillis();
			SelectionSortStable.sort(arrSelectionStable);
			timeEnd = System.currentTimeMillis();
			timeSelectionSortStable.add(timeEnd - timeStart);

			timeStart = System.currentTimeMillis();
			InsertionSort.sort(arrInsertion);
			timeEnd = System.currentTimeMillis();
			timeInsertionSort.add(timeEnd - timeStart);

			timeStart = System.currentTimeMillis();
			QuickSort.sort(arrQuick, 0, arrQuick.length - 1);
			timeEnd = System.currentTimeMillis();
			timeQuickSort.add(timeEnd - timeStart);
			
			timeStart = System.currentTimeMillis();
			MergeSort.sort(0,arrMerge.length-1,arrMerge);
			timeEnd = System.currentTimeMillis();
			timeMergeSort.add(timeEnd - timeStart);
		}
		Prints.printout(tries, CalculateAverage.calculateAllZaehler(tries),
				CalculateAverage.calculateAllVZaehler(tries), Times.timer(timeSelectionSort),
				Times.timer(timeSelectionSortStable), Times.timer(timeBubbleSort), Times.timer(timeInsertionSort),
				Times.timer(timeQuickSort), Times.timer(timeMergeSort));
	}
}
