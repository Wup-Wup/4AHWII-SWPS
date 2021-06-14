package standart;

import java.util.HashMap;

import sorts.*;

public class CalculateAverage {

	public static HashMap<String, Long> calculateAllZaehler(int tries) {

		HashMap<String, Long> zaehler = new HashMap<String, Long>();

		zaehler.put("SelectionSort", averageZaehler(tries, SelectionSort.getZaehlerSSort()));
		zaehler.put("SelectionSortStable", averageZaehler(tries, SelectionSortStable.getZaehlerSSSort()));
		zaehler.put("BubbleSort", averageZaehler(tries, BubbleSort.getZaehlerBSort()));
		zaehler.put("InsertionSort", averageZaehler(tries, InsertionSort.getZaehlerISort()));
		zaehler.put("QuickSort", averageZaehler(tries, QuickSort.getZaehlerQSort()));
		zaehler.put("MergeSort", averageZaehler(tries, MergeSort.getZaehlerMSort()));

		return zaehler;
	}

	public static HashMap<String, Long> calculateAllVZaehler(int tries) {

		HashMap<String, Long> zaehler = new HashMap<String, Long>();

		zaehler.put("SelectionSort", averageZaehler(tries, SelectionSort.getZaehlerVSSort()));
		zaehler.put("SelectionSortStable", averageZaehler(tries, SelectionSortStable.getZaehlerVSSSort()));
		zaehler.put("BubbleSort", averageZaehler(tries, BubbleSort.getZaehlerVBSort()));
		zaehler.put("InsertionSort", averageZaehler(tries, InsertionSort.getZaehlerVISort()));
		zaehler.put("QuickSort", averageZaehler(tries, QuickSort.getZaehlerVQSort()));
		zaehler.put("MergeSort", averageZaehler(tries, MergeSort.getZaehlerVMSort()));


		return zaehler;
	}

	public static long averageZaehler(int tries, long zaehler) {

		zaehler = zaehler / tries;

		return zaehler;
	}
}
