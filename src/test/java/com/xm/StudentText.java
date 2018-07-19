package com.xm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.xm.mapper.StudentMapper;
import com.xm.pojo.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentText {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Test
	/**
	 * 添加测试
	 */
	public void insertTest() {
		
		/**
		 * 测试失败：
		 * 原因分析：主键生成策略可能不一致
		 * 解决策略：1.实体主键上添加注解@TableId(type=IdType.AUTO)
		 *                      2.全局配置：
		 *                      	id-type: #主键类型  0:"数据库ID自增",
		 *                      									    1:"用户输入ID",
		 *                      										2:"全局唯一ID (数字类型唯一ID)", 
		 *                      										3:"全局唯一ID UUID";
		 */
		
		/**
		 *insert()
		 * @param Student entity：学生实体
		 * sql语句：INSERT INTO student ( `name` ) VALUES ( ? )
		 * return: Integer
		 */
		/*Student student = new Student();
		student.setName("烤鸡翅");
		Integer num = studentMapper.insert(student);
		System.out.println("更新行数："+num);*/
		
		/**
		 *insertAllColumn()
		 * @param Student entity：学生实体
		 * sql语句：INSERT INTO student ( `name` ) VALUES ( ? )
		 * return: Integer
		 */
		Student student = new Student();
		//student.setName("烤鸡翅");
		Integer num = studentMapper.insertAllColumn(student);
		System.out.println("更新行数："+num);
		
	}
	
	@Test
	/**
	 * 删除测试
	 */
	public void deleteTest() {
		/**
		 *deleteById()
		 * @param Serializable id：学生id
		 * sql语句：DELETE FROM student WHERE id=? 
		 * return: Integer
		 */
		/*Integer num = studentMapper.deleteById(22);
		System.out.println("更新行数："+num);*/
		
		/**
		 *deleteBatchId()
		 * @param Collection<? extends Serializable> idList：id组成的集合
		 * sql语句：DELETE FROM student WHERE id IN ( ? , ? , ? ) 
		 * return: Integer
		 */
		/*Integer num = studentMapper.deleteBatchIds(Arrays.asList(18,19,20));
		System.out.println(num);*/
		
		/**
		 *deleteByMap()
		 * @param Map<String, Object> columnMap: 字段名为key，值为value的map
		 * sql语句：DELETE FROM student WHERE name = ? AND id = ? 
		 * return: Integer
		 */
		Map<String,Object> map = new HashMap<>();
		map.put("name", "张大萨");
		map.put("id", "21");
		 Integer num = studentMapper.deleteByMap(map);
		 System.out.println(num);
	}
	
	@Test
	/**
	 * 更新测试
	 */
	public void updateTest() {
		
		/**
		 *updateById()
		 * @param Student entity：有id的学生实体
		 * sql语句：UPDATE student SET `name`=? WHERE id=?
		 * return: Integer
		 */
		/*Student student = new Student();
        student.setId(23);
		student.setName("寄生虫");
		Integer num = studentMapper.updateById(student);
		System.out.println("更新行数："+num);*/
		
		/**
		 *updateAllColumnById()
		 * @param Student entity：有id的学生实体
		 * sql语句：UPDATE student SET `name`=? WHERE id=?
		 * return: Integer
		 */
		Student student = new Student();
		student.setId(22);
		//student.setName("寄生虫");
		Integer num = studentMapper.updateAllColumnById(student);
		System.out.println("更新行数："+num);
	}
	
	@Test
	/**
	 * 查询测试
	 */
	public void selectTest() {
		/**
		 * selectById()
		 * @param Serializable id：主键ID
		 * sql语句：SELECT id,`name` FROM student WHERE id=?
		 * return: Student
		 */
		/*Student student = studentMapper.selectById(2);
		System.out.println(student);*/
		
		/**
		 * selectOne()
		 * @param Student entity: 学生实体
		 * sql语句：SELECT id,`name` FROM student WHERE `name`=? 
		 * return: Student
		 */
		/*Student student = new Student();
		student.setName("郭小明");
		Student student2 = studentMapper.selectOne(student);
		System.out.println(student2);*/
		
		/**
		 * selectByMap()
		 * @param Map<String, Object> columnMap: 字段名为key，值为value的map
		 * sql语句：SELECT id,`name` FROM student WHERE name = ? AND id = ?
		 * return: List 
		 */
		/*Map<String,Object> map = new HashMap<>();
		map.put("name", "郭小明");
		map.put("id", "2");
		List<Student> students = studentMapper.selectByMap(map);
		System.out.println(students);*/
		
		/**
		 * selectBatchIds()
		 * @param  Collection<? extends Serializable> idList：id组成的集合
		 * sql语句：SELECT id,`name` FROM student WHERE id IN ( ? , ? , ? , ? )
		 * return: List 
		 */
		List<Student> stutents = studentMapper.selectBatchIds(Arrays.asList(1,2,3,4));
		System.out.println(stutents);
	}

}
