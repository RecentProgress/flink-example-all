# Flink 组件

## 更多资源
- https://github.com/opensourceteams/flink-example-all

## JobManager
- 控制一个应用程序执行的主进程，也就是说，每个应用程序都会被一个不同的JobManager所控制执行
- JobManager会先接收到要执行的就用程序，这个应用程序会包括：作业图(JobGraph)、逻辑数据流图(logical dataflow graph)、和打包了所有的类库、和其它资源的jar包
- JobManager 会把JobGraph转换成一个物理层面的数据流图，这个图被叫做执行图(ExecutionGraph)，包含了所有可以并发执行的任务
- JobManager 会向资源管理器(ResourceManager)请求执行任务必要的资源，也就是任务管理器(TaskManager)上。而在运行过程中，JobManager会负责所有需要中央协调的操作，比如说检查点(checkppoints)的协调

## TaskManager
- Flink中的工作进程。通常在Flink中会有多个TaskManager运行，每一个TaskManager都包含了一定数量的插槽(slots)、插槽的数量限制了TaskManager能够执行的任务数量
- 启动后，TaskManager会向资源管理器注册它的插槽;收到资源管理器的指令后，TaskManager就会次一个或多个插槽提供给JobManager调用。JobManager就可以
　向插槽分配任务(tasks)来执行了。
- 在执行过程中，一个TaskManager可以跟其它运行同一应用程序的TaskManager交换数据