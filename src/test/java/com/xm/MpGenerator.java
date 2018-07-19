package com.xm;

import org.junit.Test;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MpGenerator {
	
	@Test
	public void create() {
		
		String tableName = "user";
		
		/**
		 * 配置：
		 * 1.全局配置
		 * 2.数据源配置
		 * 3.策略配置
		 * 4.包名策略配置
		 * 5.整合配置
		 */
		
		//1.全局配置
		GlobalConfig globalConfig = new GlobalConfig();
		globalConfig
			  //设置代码生成路径
			   .setOutputDir("F:\\xm\\springboot\\Springboot_MybatisPlus\\src\\main\\java")
			   //设置作者
			   .setAuthor("xm")
			   //设置二级缓存的开闭
			   .setEnableCache(false)
			   //设置数据库id自增
			   .setIdType(IdType.AUTO)
			   //设置覆盖更新
			   .setFileOverride(true)
			   //设置去I
			   .setServiceName("%sService")
			   //设置生产结果映射map
			   .setBaseResultMap(true);
		
		//2.数据源配置
	   DataSourceConfig dataSourceConfig = new DataSourceConfig();
	   dataSourceConfig
	   			//设置数据库类型
	   			.setDbType(DbType.MYSQL)
	   			.setUrl("jdbc:mysql://10.1.51.31:3306/xm?useSSL=true")
	   			.setUsername("root")
	   			.setPassword("cube1501")
	   			.setDriverName("com.mysql.jdbc.Driver");
	   
	   //3.策略配置
	   StrategyConfig strategyConfig = new StrategyConfig();
	   strategyConfig
	   		//开启全局大写命名
	   		.setCapitalMode(true)
	   		//开启下划线转换
	   		.setDbColumnUnderline(true)
	   		//开启驼峰命名
	   		.setNaming(NamingStrategy.underline_to_camel)
	   		.setEntityLombokModel(true)
	   		.setInclude(tableName);
	   
	   //4.包名策略配置
	   PackageConfig packageConfig = new PackageConfig();
	   packageConfig
	   		.setParent("com.xm")
	   		.setController("controller")
	   		.setEntity("pojo")
	   		.setMapper("mapper")
	   		.setService("service")
	   		.setServiceImpl("service.impl")
	   		.setXml("mapper.xml");
	   
	   //5.整合配置
	   AutoGenerator autoGenerator = new AutoGenerator();
	   autoGenerator
	   		.setGlobalConfig(globalConfig)
	   		.setDataSource(dataSourceConfig)
	   		.setStrategy(strategyConfig)
	   		.setPackageInfo(packageConfig);
	   
	   autoGenerator.execute();
		
	}

}
