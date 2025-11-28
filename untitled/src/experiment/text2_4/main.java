package experiment.text2_4;

import experiment.text2_5.Student;

public class main {
        // 学生管理主程序
        public static void main(String[] args) {
            // 创建学生对象
            Student student1 = new Student("张三", 20, "2023001");
            Student student2 = new Student("李四", 21, "2023002");

            // 输出学生信息
            System.out.println("学生信息如下：");
            System.out.println(student1.getInfo());
            System.out.println(student2.getInfo());

            // 修改学生姓名并输出
            student1.setName("张三丰");
            System.out.println("\n修改后张三的信息：" + student1.getInfo());
        }
}
