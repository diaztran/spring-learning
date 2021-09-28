package com.diazcode.springin5steps.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Mark that this class is a Spring Bean (Component)
@Component
//By default, it is a singleton
//Now we change it to prototype so every instance of it will be different one-by-one
//@Scope("prototype") : hardcoded "prototype" was not good for practice, we should follow the following snippet
//Each container is a bean, then it has life cycle -> it has @PostConstruct @
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchimpl {
	
	//	Mark that this is a dependency of class
//	@Autowired
	@Autowired
	@Qualifier("quick")
	SortingAlgorithm sortingAlgorithm;
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public BinarySearchimpl() {
	}
	
	//	public BinarySearchimpl(SortingAlgorithm sortingAlgorithm) {
//		this.sortingAlgorithm = sortingAlgorithm;
//	}
	
	
	public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
		this.sortingAlgorithm = sortingAlgorithm;
		System.out.println("Setter was called!!!");
	}
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//Firstly, we need to search the given array
		int sortedNumbers[] = this.sortingAlgorithm.sort(numbers);
		//Searching for input number
		
		return - 3;
	}
	
	@PostConstruct
	public void onPostConstruct(){
		LOGGER.info("BinarySearchimpl constructed!");
	}
	
	@PreDestroy
	public void onPreDestroy(){
		LOGGER.info("BinarySerachimpl pre destroyed!");
	}
}

