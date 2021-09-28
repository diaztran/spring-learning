package com.seancode.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LOLCharController {
	@GetMapping("/chars")
	public List<LOLChamp> onReturnAllCharDetails(){
		return Arrays.asList(
				new LOLChamp("00001Y", "Yasou", 6300),
				new LOLChamp("00001R", "Renekton", 4800),
				new LOLChamp("00001A", "Ahri", 3150),
				new LOLChamp("00001L", "Lux", 1350),
				new LOLChamp("00002A", "Ashe", 450),
				new LOLChamp("00001M", "Miss Fortune",3150));
	}
}
