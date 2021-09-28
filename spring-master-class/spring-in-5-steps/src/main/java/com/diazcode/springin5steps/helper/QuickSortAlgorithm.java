package com.diazcode.springin5steps.helper;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
//@Primary
public class QuickSortAlgorithm implements SortingAlgorithm {
	@Override
	public int[] sort(int[] numbers) {
		return new int[0];
	}
}
