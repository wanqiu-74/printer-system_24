package experiment.text2_5;

public class Student {
        private String name;
        private int age;
        private String id;

        // 构造方法
        public Student(String name, int age, String id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        // 获取学生信息的方法
        public String getInfo() {
            return "学号: " + id + ", 姓名: " + name + ", 年龄: " + age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
