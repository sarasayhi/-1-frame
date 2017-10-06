package com.bk.safetyBK.start.module.resourceManage.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
/*
	@Test
	public void getByAreaIdAndPage() {
		Sort sort = new Sort(Sort.Direction.ASC,"id");
		Pageable pageable = new PageRequest(1,5,sort);
		List<Device> devices = deviceRepository.getDeviceByAreaIdAndPage(555L, pageable);
		Iterator<Device> iterator = devices.iterator();
		System.out.println("yes");
		if(devices.isEmpty()){
			System.out.println("mygod");
		}
		while (iterator.hasNext()) {
			Device d = iterator.next();
			System.out.print(d.toString());
		}
	}

	@Test
	public void getByNameAndPage() {
		Sort sort = new Sort(Sort.Direction.ASC,"id");
		Pageable pageable = new PageRequest(1,5,sort);
		List<Device> devices = deviceRepository.getDeviceByNameAndPage("10.", pageable);
		Iterator<Device> iterator = devices.iterator();
		System.out.println("yes");
		while (iterator.hasNext()) {
			Device d = iterator.next();
			System.out.print(d.toString());
		}
	}*/
}