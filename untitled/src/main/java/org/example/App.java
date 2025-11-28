package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 加载Spring容器，自动完成依赖注入
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Printer printer = (Printer) context.getBean("printer");

        // 测试打印
        printer.print("三月七日，沙湖道中遇雨。雨具先去，同行皆狼狈，余独不觉。已而遂晴，故作此词。" +
                "莫听穿林打叶声，何妨吟啸且徐行。"+
                "竹杖芒鞋轻胜马，谁怕？一蓑烟雨任平生。" +
                "料峭春风吹酒醒，微冷，山头斜照却相迎。" +
                "回首向来萧瑟处，归去，也无风雨也无晴。");
    }
}
