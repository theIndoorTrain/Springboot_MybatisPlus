package com.xm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xm.mapper.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisPlusApplicationTests {
	@Autowired
	private StudentMapper studentMapper;

	@Test
	public void contextLoads() {
		System.out.println(studentMapper.selectById(1));
	}

}
