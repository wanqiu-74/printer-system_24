# 打印机系统（printer-system_24）
基于Java和Spring的打印机模拟系统，支持不同墨水（彩色/灰色）和纸张（A4/B5）的组合使用，通过依赖注入实现组件解耦。

## 功能说明
- 定义`Ink`接口（彩色/灰色实现）和`Paper`接口（A4/B5实现）。
- `Printer`类通过依赖注入整合墨水和纸张，实现打印功能。
- 基于Spring配置文件动态切换组件（无需修改代码）。

## 技术栈
- Java 8+
- Spring Framework（依赖注入）
- Maven（项目构建，可选）

## 使用方法
1. 配置`spring-config.xml`选择墨水（GreyInk/ColorInk）和纸张（A4Paper/B5Paper）。
2. 运行`App`类的`main`方法，打印预设文本。

## 许可证
[MIT](LICENSE)
