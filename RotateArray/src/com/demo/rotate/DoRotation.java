package com.demo.rotate;

import java.util.ArrayList;
import java.util.Arrays;

public class DoRotation {

	public static void main(String[] args) {

		ArrayList<Integer> listInitial = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		Integer rotationNumber = 2;

		System.out.println("Initial list:" + listInitial);
		if (rotationNumber != null && rotationNumber > 0) {
			System.out.println("Start rotaion number:" + 0);
			doRotaion(listInitial, rotationNumber);
		}

		System.out.println("Final list:" + listInitial);
	}

	public static ArrayList<Integer> doRotaion(ArrayList<Integer> listInitial,
			Integer step) {
		if (step>0 && listInitial != null && listInitial.size() > 0) {
			Integer maxPosition = listInitial.size();
			// to do rotation by n position means that the element in the
			// position (maxPosition - n) will be at the end:
			// so to resolve rotation need to move the desired element with all
			// previous element
			for (Integer currentPosition = maxPosition - step - 1; currentPosition >= 0; currentPosition--) {
				// Look at the desired element and its position: current
				// position
				// then calculate next position it must be current position +
				// step
				Integer newPosition = currentPosition + step;
				// Switch elements by position
				listInitial = swichposition(listInitial, currentPosition,
						newPosition);
			}
		}
		return listInitial;

	}

	public static ArrayList<Integer> swichposition(
			ArrayList<Integer> listInitial, Integer currentPosition,
			Integer newPosition) {
		Integer objectA = listInitial.get(currentPosition);
		Integer objectB = listInitial.get(newPosition);
		//get element from the source and target position then do permutation
		listInitial.set(currentPosition, objectB);
		listInitial.set(newPosition, objectA);
		System.out.println("Rotaion===:" + listInitial);
		return listInitial;
	}

}
