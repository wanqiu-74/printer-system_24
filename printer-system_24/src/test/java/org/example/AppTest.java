package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.ink.Ink;
import org.example.paper.Paper;
import org.springframework.context.ApplicationContext;

public class AppTest extends TestCase{
    private ApplicationContext context;
    private Printer printer;
    private Ink ink;
    private Paper paper;

    // JUnit3必须的构造方法
    public AppTest(String testName) {
        super(testName);
    }

    // 构建测试套件（JUnit3固定写法）
    public static TestSuite suite() {
        return new TestSuite(AppTest.class);
    }

    // 测试前置初始化（每个测试方法执行前调用）
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        // 初始化Spring容器
        context = new ClassPathXmlApplicationContext("spring-config.xml");
        // 从容器获取注入后的Bean
        printer = (Printer) context.getBean("printer");
        ink = (Ink) context.getBean("ink");
        paper = (Paper) context.getBean("paper");
    }

    // 测试后置清理（每个测试方法执行后调用）
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        // 关闭Spring容器，释放资源
        ((ClassPathXmlApplicationContext) context).close();
    }

    // 测试1：依赖注入是否成功
    public void testDependencyInjection() {
        assertNotNull("Printer注入失败", printer);
        assertNotNull("Ink注入失败", ink);
        assertNotNull("Paper注入失败", paper);
    }

    // 测试2：墨水颜色配置是否正确
    public void testInkColor() {
        String colorInfo = ink.getColorInfo();
        assertTrue("颜色信息错误", colorInfo.contains("灰色") && colorInfo.contains("128,128,128"));
    }

    // 测试3：A4纸换行规则（10字/行）
    public void testA4LineBreak() {
        String testText = "1234567890abcdef"; // 16字符
        printer.print(testText);
        String content = paper.getContent();
        // 验证前10字符后是否有换行符
        assertTrue("换行规则未生效", content.contains("1234567890\r\n"));
    }

    // 测试4：A4纸分页规则（80字符/页）
    public void testA4PageBreak() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append("a"); // 80个字符
        }
        printer.print(sb.toString());
        String content = paper.getContent();
        // 验证是否包含分页符
        assertTrue("分页规则未生效", content.contains("=========="));
    }
}
