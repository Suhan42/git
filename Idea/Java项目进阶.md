# java

其实，Java 还是一个平台。Java 平台由 Java 虚拟机（Java Virtual Machine，JVM）和 Java 应用编程接口（Application Programming Interface，API）构成。Java 应用编程接口为此提供了一个独立于操作系统的标准接口，可分为基本部分和扩展部分。在硬件或操作系统平台上安装一个 Java 平台之后，Java 应用程序就可运行。

- JDK（Java Development Kid，Java 开发开源工具包），是针对 Java 开发人员的产品，是整个 Java 的核心，包括了 Java 运行环境 JRE、Java 工具和 Java 基础类库。
- JRE（Java Runtime Environment，Java 运行环境）是运行 JAVA 程序所必须的环境的集合，包含 JVM 标准实现及 Java 核心类库。
- JVM（Java Virtual Machine，Java 虚拟机）是整个 Java 实现跨平台的最核心的部分，能够运行以 Java 语言写作的软件程序。

层级关系：

**裸机 -> OS -> JVM虚拟机 -> JRE运行环境 -> JDK软件工具箱 -> IDE集成开发环境**

![img](http://c.biancheng.net/uploads/allimg/190903/5-1ZZ3131133G3.jpg)

之后再是各种IDE

![img](http://c.biancheng.net/uploads/allimg/190903/5-1ZZ3131223943.png)

## 分类SE EE ME

1. **Java SE**

Java SE（Java Platform Standard Edition，Java 平台标准版）以前称为 J2SE，它允许开发和部署在桌面、服务器、嵌入式环境和实时环境中使用的 Java 应用程序。Java SE 包含了支持 Java Web 服务开发的类，并为 Java EE 提供基础，如 Java 语言基础、JDBC 操作、I/O 操作、网络通信以及多线程等技术。图 1 所示为 Java SE 的体系结构。

2. **Java EE**

Java EE（Java Platform Enterprise Edition，Java 平台企业版）以前称为 J2EE。企业版本帮助开发和部署可移植、健壮、可伸缩且安全的服务器端 Java 应用程序。Java EE 是在 Java SE 基础上构建的，它提供 Web 服务、组件模型、管理和通信 API，可以用来实现企业级的面向服务体系结构（Service Oriented Architecture，SOA）和 Web 2.0 应用程序。

3. **Java ME**

Java ME（Java Platform Micro Edition，Java 平台微型版）以前称为 J2ME，也叫 K-JAVA。 Java ME 为在移动设备和嵌入式设备（比如手机、PDA、电视机顶盒和打印机）上运行的应用程序提供一个健壮且灵活的环境。

Java ME 包括灵活的用户界面、健壮的安全模型、丰富的内置网络协议以及对可以动态下载的联网和离线应用程序。基于 Java ME 规范的应用程序 只需编写一次就可以用于许多设备，而且可以利用每个设备的本机功能。

## JDK目录

- `bin`：提供 JDK 工具程序，包括 javac、java、javadoc、appletviewer 等可执行程序。
- `include`：存放用于本地访问的文件。
- `jre`：存放 Java 运行环境文件。
- `lib`：存放 Java 的类库文件，工具程序实际上使用的是 Java 类库。JDK 中的工具程序，大多也由 Java 编写而成。
- `src.zip`：Java 提供的 API 类的源代码压缩文件。如果需要查看 API 的某些功能是如何实现的，可以査看这个文件中的源代码内容。

### 访问控制权限

|           | 备注           | 同一类 | 一个包的类 | 子类 | 其他包的类 |
| --------- | -------------- | ------ | ---------- | ---- | ---------- |
| private   | 私有的         | True   | F          | F    | False      |
| default   | 默认，就是不写 | T      | True       | F    | F          |
| protected | 受保护的       | T      | T          | True | F          |
| public    | 公开的         | True   | T          | T    | True       |

# Java IDE

## IDEA和Eclipse工程结构的区别

**IDEA**左侧显示的是Project，一个Project可以有多个Modules（模块），如果想快速切换项目，File -> Open Recent

- ideaIU指的是IntelliJ IDEA Ultimate。IDEA最终版（商业版），付费使用。
- ideaIC指的是IntelliJ IDEA Community。IDEA社区版，免费使用。

**Eclipse**左侧显示的是workspace，一个workspace可以有多个Project，但Eclipse有Working Set，可以将Project分类显示，如果想快速切换项目，File -> Switch Workspace

# Maven

多模块



添加配置 **DarchetypeCatalog=internal**，添加原因：每次创建maven项目时， IDEA 要使用插件进行创建，这些插件当你创建新的项目时，它每次都会去中央仓库下载，这样使得创建比较慢。所以在创建maven项目时，应该让它找本地仓库中的插件进行项目的创建。



## 拿到maven要干什么

修改conf/settings.xml配置

1. 修改本地仓库的位置，就是Local repository

```xml
<!-- localRepository
   | The path to the local repository maven will use to store artifacts.
   |
   | Default: ${user.home}/.m2/repository
  <localRepository>/path/to/local/repo</localRepository>
  -->
  <localRepository>D:\\study\java\maven-repository</localRepository>
```

2. 修改下载方式，任选一个

```xml
<mirrors>
    <!-- mirror
     | Specifies a repository mirror site to use instead of a given repository. The repository that
     | this mirror serves has an ID that matches the mirrorOf element of this mirror. IDs are used
     | for inheritance and direct lookup purposes, and must be unique across the set of mirrors.
     |
    <mirror>
      <id>mirrorId</id>
      <mirrorOf>repositoryId</mirrorOf>
      <name>Human Readable Name for this Mirror.</name>
      <url>http://my.repository.com/repo/path</url>
    </mirror>
     -->
     <!-- 腾讯仓库 -->
     <mirror>
      <id>nexus-tencentyun</id>
      <mirrorOf>*</mirrorOf>
      <name>Nexus tencentyun</name>
      <url>http://mirrors.cloud.tencent.com/nexus/repository/maven-public/</url>
    </mirror>
    
        <!-- 阿里云仓库 -->
    <mirror>  
        <id>nexus-aliyun</id>  
        <mirrorOf>*</mirrorOf>    
        <name>Nexus aliyun</name>  
        <url>http://maven.aliyun.com/nexus/content/groups/public</url>  
    </mirror>


    
  </mirrors>
```

3. 添加Java的jdk版本（1.8）

注意新版本默认就是[jdk8](https://so.csdn.net/so/search?q=jdk8&spm=1001.2101.3001.7020)不需配置

```xml
<profile>
	<id>jdk-1.8</id>
	<activation>
		<activeByDefault>true</activeByDefault>
		<jdk>1.8</jdk>
	</activation>
	<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
		<maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
	</properties>
</profile>
```

4. 修改Maven环境变量的路径

5. 下载Maven中央仓库各种配置文件和类库到本地仓库

命令：**mvn help:system**

查看maven版本：**mvn -version**

## idea创建一个maven项目

1.修改maven设置

![setting](\img-project\setting.png)

配置maven的路径

![setting-maven](\img-project\setting-maven.png)

- maven home path：填写自己下载好的maven的位置（我的是放到了D盘）
- user setting file：是用来配置去哪下载依赖的jar包的settings.xml文件
- Local repository：是下载的jar包存放的本地仓库路径

2.创建maven项目

![newMaven](\img-project\newMaven.png)

接下来输入各类名称，填完后直接next下一步，名称具体含义如下图：

![maven2](\img-project\maven2.png)

添加配置 DarchetypeCatalog=internal，添加原因：每次创建maven项目时， IDEA 要使用插件进行创建，这些插件当你创建新的项目时，它每次都会去中央仓库下载，这样使得创建比较慢。所以在创建maven项目时，应该让它找本地仓库中的插件进行项目的创建。

```
DarchetypeCatalog=internal
```

![maven3](\img-project\maven3.png)

第一次加载maven项目比较慢，等待右下角的进度条加载结束，下面是刚建好的maven-web项目模板

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210316171955906.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3p6dmFy,size_16,color_FFFFFF,t_70)

上面的项目不完整，不能满足我们的开发需要，所以需要我们手动建设一些文件夹，需要兴建的文件夹我用红色标出，以下是maven项目的标准目录：

```
- src  
	- main    
		- java    
		- resources    
	- test    
		- java    
		- resources 
- target
```

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210316172809520.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3p6dmFy,size_16,color_FFFFFF,t_70)

把新建立的文件夹进行关联了，看清楚红色的关联对象，关联错了就得重新关联，这一定不能出错，关联方法如下图。
src/main/java 关联为 Sources Root
src/main/resources 关联为Resources Root
src/test/java 关联为Test Sources Root
src/test/resources 关联为 Test Resources Root

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210316180011625.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3p6dmFy,size_16,color_FFFFFF,t_70)

也可以右键项目，然后选择Open Module Settings打开项目配置页面更改，关联方法如下图。

![在这里插入图片描述](https://img-blog.csdnimg.cn/2021031618354646.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3p6dmFy,size_16,color_FFFFFF,t_70)

以下是关联之后的maven-web项目的目录，配置完成

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210316180629449.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3p6dmFy,size_16,color_FFFFFF,t_70)



## Maven目录结构

具有公共目录布局允许用户熟悉Maven项目从一个到另一个。

Maven定义了一个标准的目录结构。

```
- src  
	- main    
		- java    
		- resources    
		- webapp  
	- test    
		- java    
		- resources 
- target
```

- src 目录是源代码和测试代码的根目录。
- main 目录是与源代码相关的根目录到应用程序本身，而不是测试代码。
- test 目录包含测试源代码。
- main和test下的 java 目录包含Java代码的应用程序本身是在main和用于测试的Java代码。
- resources 目录包含您项目所需的资源。
- target 目录由Maven创建。它包含所有编译的类，JAR文件等。
- 当执行 mvn clean 命令时，Maven将清除目标目录。
- webapp 目录包含Java Web应用程序，如果项目是Web应用程序。
- webapp 目录是Web应用程序的根目录。webapp目录包含 WEB-INF 目录。

如果按照目录结构，你不需要指定你的源代码的目录，测试代码，资源文件等。

**目录结构**：

这里是最重要的目录:

| **目录**           | **商店**                                                     |
| ------------------ | ------------------------------------------------------------ |
| src/main/java      | 应用程序/库源                                                |
| src/main/resources | 应用程序/库资源                                              |
| src/main/config    | 配置文件                                                     |
| src/main/scripts   | 应用程序/库脚本                                              |
| src/main/webapp    | 应用程序/库脚本...                                           |
| src/test/java      | 测试源                                                       |
| src/test/resources | 测试资源                                                     |
| src/assembly       | 汇编描述符                                                   |
| src/site           | Site                                                         |
| target             | The target directory is used to store all output of the build. |
| LICENSE.txt        | 项目许可证                                                   |
| NOTICE.txt         | 通知和归因                                                   |
| README.txt         | 项目的自述                                                   |

在项目根目录的顶部有pom.xml文件和任何属性，maven.xml。

另外，还有文本文件用户在接收时立即读取来源:README.txt，LICENSE.txt等。

这个结构有两个子目录: src 和 target 。

src 目录包含所有源建筑项目的材料，其场地等。

它包含每个类型的子目录: main 用于主构建工件， test 用于单元测试代码和 resources ， site 等。

在源目录中， main 和 test 有一个目录为java的语言，在其下有正常的包层次，一个用于资源。

下面的资源被复制到目标类路径。

如果工件构建有其他贡献源，他们将在其他子目录下:例如 src / main / antlr 将包含Antlr语法定义文件。

## maven中的groupId和artifactld到底指的什么

groupId和artifactId被统称为“坐标”是为了保证项目唯一性而提出的，如果你要把你项目弄到maven本地仓库去，你想要找到你的项目必须根据这两个id去查找。

groupId一般分为多个段，这里我只说两段，第一段为域，第二段为公司名称。

域又分为org、com、cn等等许多，其中org为非营利组织，com为商业组织。

举个apache公司的tomcat项目例子：这个项目的groupId是org.apache，它的域是org（因为tomcat是非营利项目），公司名称是apache，artifactId是tomcat。

比如我创建一个项目，我一般会将groupId设置为cn.snowin,cn表示域为中国，snowin是我个人姓名缩写，artifactId设置为testProj，表示这个项目名称是testProj。

依照这个设置，你的包结构最好是cn.snowin.testProj打头的。
如果有个StudentDao，它的全路径就是cn.snowin.testProj.dao.StudentDao

## 一键清除maven仓库中下载失败的jar包

再给大家推荐一个使用的小脚本，可以一键清除maven仓库中下载失败的jar包
1.脚本代码

```basic
set REPOSITORY_PATH=你的maven仓库全路径
rem 正在搜索...
for /f "delims=" %%i in ('dir /b /s "%REPOSITORY_PATH%\*lastUpdated*"') do (
    del /s /q %%i
)
rem 搜索完毕
pause
```

2.操作步骤
1.将上述代码粘贴到记事本中，让后再修改记事本格式为.bat格式，如下图：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190916144348645.png)

2.再修改你的本地仓库地址就行了

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190916144700476.png)

3.双击运行就能删除仓库中下载失败的jar包

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190916145437814.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQyMjgyMzIx,size_16,color_FFFFFF,t_70)

4.运行结束后，按任意键退出就行了



5.运行结束后,再次打开,会出现找不到文件字样,说明本次已经清理完毕了!

![在这里插入图片描述](https://img-blog.csdnimg.cn/2019091614560593.png)



# Spring

## 历史

- Jsp 默默扛下所有;
- MVC+三层架构分工明确，但开发成本及其高；
- EJB 重量级框架出现，走出一个困境，有进入另一个困境；
- Spring 春天来到，随之，SSH风生水起、称霸武林；
- SSM开始上位;
- SpringBoot 又一里程碑崛起,把"约定大于配置"思想玩儿的炉火纯青;
- SpringCloud 打包了微服务众多解决方案，应对互联网项目更加easy!

## spring，springMVC，springBoot关系

![spring](https://pic4.zhimg.com/80/v2-9c65f4004a1ed6727faa9f024ce8ba6b_720w.webp)

我们说到Spring，一般指代的是Spring Framework，它是一个开源的应用程序框架，提供了一个简易的开发方式，**通过这种开发方式，将避免那些可能致使代码变得繁杂混乱的大量的业务/工具对象，说的更通俗一点就是由框架来帮你管理这些对象，包括它的创建，销毁等**。

**Spring MVC**是Spring的一部分，Spring 出来以后，大家觉得很好用，于是按照这种模式设计了一个 MVC框架（一些用Spring 解耦的组件），**主要用于开发WEB应用和网络接口，它是Spring的一个模块，通过Dispatcher Servlet, ModelAndView 和 View Resolver，让应用开发变得很容易**。

初期的Spring通过代码加配置的形式为项目提供了良好的灵活性和扩展性，但随着Spring越来越庞大，其配置文件也越来越繁琐，太多复杂的xml文件也一直是Spring被人诟病的地方，特别是近些年其他简洁的WEB方案层出不穷，如基于Python或Node.Js，几行代码就能实现一个WEB服务器，对比起来，大家渐渐觉得Spring那一套太过繁琐，此时，Spring社区推出了**Spring Boot**，它的目的在于**实现自动配置，降低项目搭建的复杂度**。



其他spring

- Spring AOP：Spring AOP模块提供了满足AOP Alliance规范的实现，还整合了AspectJ这种AOP语言级的框架。通过AOP能降低耦合。
- Spring JDBC：提供了一个JBDC的样例模板，使用这些模板能消除传统冗长的JDBC编码还有必须的事务控制，而且能享受到Spring管理事务的好处。
- Spring MVC
- Spring ORM：提供与流行的“对象-关系”映射框架的无缝集成，包括hibernate、JPA、MyBatis等。而且可以使用Spring事务管理，无需额外控制事务。
- Spring JMS：用于JMS(Java Messaging Service)，提供一套“消息生产者、消息消费者”模板用于更加简单的使用JMS，JMS用于在两个应用程序之间，或分布式系统中发送消息，进行异步通信。
- OXM模块：提供了一个对Object/XML映射实现，将Java对象映射成XML数据，或者将XML数据映射成java对象，Object/XML映射实现包括JAXB、Castor、XMLBeans和XStream。
- Spring Test：Spring可以用非容器依赖的编程方式进行几乎所有的测试工作，支持JUnit和TestNG等测试框架。
- Spring security：权限控制

---

## MVC三层

MVC设计模式：Model-View-Controller简写

MVC是软件工程中的一种软件架构模式，它是一种分离业务逻辑与显示界面的设计方法，它把软件系统分为三个基本部分：模型（model）、视图（view）、控制器（controller）

- 模型 model：编写程序应用功能（实现算法等等），数据库管理，也就是实体类。用于数据的封装和数据的传输；
- 控制器 controller：对请求进行处理，负责请求转发，也就是事件，用于流程的控制；
- 视图 view：界面设计人员进行图形界面设计，也就是GUI组件，用于数据的展示；

最典型的MVC就是我们的JSP + Servlet + javabean的模式。

MVC框架的工作流程：

1. 用户通过View页面向服务端提出请求，可以是表单请求、超链接请求、AJAX请求等。

2. 服务端Controller控制器接收到请求后对请求进行解析，找到相应 的Model对用户请求进行处理。

3. Model处理后，将处理结果再交给Controller

4. Controller在接到处理结果后，根据处理结果找到要作为向客户端发回的响应View页面。页面经渲染（数据填充）后，再发送给客户端

![mvc](https://img-blog.csdnimg.cn/20201012103852892.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1RyYW5uZQ==,size_16,color_FFFFFF,t_70#pic_center)

## SSM四层

SSM框架是spring、spring MVC 、和mybatis框架的整合，是标准的MVC模式。使用spring实现业务对象管理，使用spring MVC负责请求的转发和视图管理，mybatis作为数据对象的持久化引擎。

- SpringMVC：作为 View 层的实现者，完成用户的请求接收功能。SpringMVC 的 Controller作为整个应用的控制器，完成用户请求的转发及对用户的响应。Spring MVC是主流的Web前端框架。

- MyBatis：作为 Dao 层的实现者，完成对数据库的增、删、改、查功能

- Spring：以整个应用大管家的身份出现。整个应用中所有 Bean 的生命周期行为，均由
  Spring 来管理。即整个应用中所有对象的创建、初始化、销毁，及对象间关联关系的维
  护，均由 Spring 进行管理。

![ssm](https://img-blog.csdnimg.cn/202010121107582.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1RyYW5uZQ==,size_16,color_FFFFFF,t_70#pic_center)

标准的SSM框架有四层，分别是

1. **持久层**：DAO层（mapper）
   DAO层：DAO层主要是做数据持久层的工作，负责与数据库进行联络的一些任务都封装在此，
   DAO层的设计首先是设计DAO的接口，
   然后在Spring的配置文件中定义此接口的实现类，
   然后就可在模块中调用此接口来进行数据业务的处理，而不用关心此接口的具体实现类是哪个类，显得结构非常清晰，
   DAO层的数据源配置，以及有关数据库连接的参数都在Spring的配置文件中进行配置。
2. **业务层**： Service层
   Service层：Service层主要负责业务模块的逻辑应用设计。 首先设计接口，再设计其实现的类
   接着再在Spring的配置文件中配置其实现的关联。这样我们就可以在应用中调用Service接口来进行业务处理。
   Service层的业务实现，具体要调用到已定义的DAO层的接口，
   封装Service层的业务逻辑有利于通用的业务逻辑的独立性和重复利用性，程序显得非常简洁。
3. **表现层**：Controller层（Handler层）
   Controller层：Controller层负责具体的业务模块流程的控制，
   在此层里面要调用Service层的接口来控制业务流程，
   控制的配置也同样是在Spring的配置文件里面进行，针对具体的业务流程，会有不同的控制器，我们具体的设计过程中可以将流程进行抽象归纳，设计出可以重复利用的子单元流程模块，这样不仅使程序结构变得清晰，也大大减少了代码量。
4. **View层**
   View层：此层与控制层结合比较紧密，需要二者结合起来协同工发。View层主要负责前台jsp页面的表示.

![ssm](https://img-blog.csdnimg.cn/20201012111919375.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1RyYW5uZQ==,size_16,color_FFFFFF,t_70#pic_center)

>DAO层，Service层这两个层次都可以单独开发，互相的耦合度很低，完全可以独立进行，这样的一种模式在开发大项目的过程中尤其有优势
>
>Controller，View层因为耦合度比较高，因而要结合在一起开发，但是也可以看作一个整体独立于前两个层进行开发。这样，在层与层之前我们只需要知道接口的定义，调用接口即可完成所需要的逻辑单元应用，一切显得非常清晰简单。
>
>Service逻辑层设计
>Service层是建立在DAO层之上的，建立了DAO层后才可以建立Service层，而Service层又是在Controller层之下的，因而Service层应该既调用DAO层的接口，又要提供接口给Controller层的类来进行调用，它刚好处于一个中间层的位置。
>每个模型都有一个Service接口，每个接口分别封装各自的业务处理方法。

## 另一种四层

1. model层
   - model层即数据库实体层，也被称为entity层，pojo层。
     一般数据库一张表对应一个实体类，类属性同表字段一一对应。
2. dao层
   - dao层即数据持久层，也被称为mapper层。
     dao层的作用为访问数据库，向数据库发送sql语句，完成数据的增删改查任务。
3. service层
   - service层即业务逻辑层。
     service层的作用为完成功能设计。
     service层调用dao层接口，接收dao层返回的数据，完成项目的基本功能设计。
4. controller层
   - controller层即控制层。
     controller层的功能为请求和响应控制。
     controller层负责前后端交互，接受前端请求，调用service层，接收service层返回的数据，最后返回具体的页面和数据到客户端。

## 三层架构

MVC 是在三层架构的基础上设计的一种框架型架构，三层架构是一种宏观的概念，而 MVC 就是一种比较具体的三层架构的框架实现。

之所以这样说，是因为它们二者使用范围不同：三层可以应用于任何语言、任何技术的应用程序；而MVC只是为了解决B-S应用程序视图层各部分的耦合关系。它们互不冲突，可以同时存在，也可根据情况使用其中一种。

1. **持久层** dao层
2. **业务层** service层
3. **表现层**  web层  MVC是表现层的一个设计模型

![three storey](https://img-blog.csdnimg.cn/20201012111347175.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1RyYW5uZQ==,size_16,color_FFFFFF,t_70#pic_center)



```
实际项目中的包命名结构，其实就是三层架构的体现：

xxx:代表公司名称       yyy：代表项目名称

com.xxx.yyy.dao　　　　　　dao层接口
com.xxx.yyy.dao.impl　　　　dao层实现
com.xxx.yyy.service　　　　service层接口
com.xxx.yyy.service.impl　　service层实现　　　　　　
com.xxx.yyy.web　　　　　　web层
com.xxx.yyy.util　　　　　　工具包
com.xxx.yyy.domain　　　　javabean
```

# IDEA快捷键

Shift两次: 包含各种文件、方法的搜索

Ctrl+Shift+F: 根据输入内容查找整个项目 或 指定目录内文件

Ctrl + Shift + R 根据输入内容替换对应内容，范围为整个项目 或 指定目录内文件

Alt+Enter:快速修复一些错误

Ctrl+Shift+向上、向下箭头 光标所在这一行上移或者下移

Shift+F6：文件、变量、方法重命名: 

Ctrl + Alt +← ：上一个下一个操作切换

Alt+F7 ： 方法、变量哪里被使用过 

Ctrl + F12 ：文件的结构列出变量和方法

Ctrl+Alt+V ： 光标在方法上，自动生成方法的返回值

Ctrl+D: 复制当前行到下一行

Ctrl + Shift + U：切换大小写

Ctrl+H： 类的继承关系

F2  反向 Shift+F2：快速定位错误

Ctrl + Alt + L 格式化代码，可以对当前文件和整个包目录使用

Ctrl+C 复制文件，如果在文件里面粘贴是粘贴文件名字，在硬盘位置粘贴是文件

Ctrl+C还可以复制光标所在的行

Ctrl+Shift+C 赋值文件的路径

Ctrl+Shift+V 可以列出来很多的复制的历史

Ctrl+X 剪切光标所在行， 也可以当删除

Ctrl + P 方法参数提示显示

Ctrl + U 前往当前光标所在的方法的父类的方法 / 接口定义

Shift + ↑、Shift + ↓、Shift + ←、Shift + →。  作用：上下左右移动光标并选中内容。

 

Ctrl + W 递进式选择代码块

Ctrl + Alt +T 作用：将代码包在一块内，如 try…catch、if else 等。

Ctrl + Shift + 左键单击 ： 把光标放在某个类变量上，按此快捷键可以直接定位到该类中

Ctrl+E : 列出最近操作的文件

Recent File 最近使用的文件

鼠标选中大段代码：点一下起始位置，然后按住Shift键，在结束为止点一下

左侧Project和右侧编辑区域跳转：

编辑区-->Project  Alt+1

Project-->编辑区  Esc

光标移到行首 Home (+ Shift, 并选中)

光标移到行尾 End （+ Shift, 并选择）

Ctrl + [ 移动光标到当前所在代码的花括号开始位置

查看类的继承结构：

1、右键Diagrams 图形展示

2、Type Hierarchy : F4 

```java
// postfix 后缀

public static void main1() {

  // 100.fori 100.福里

  for (int i = 0; i < 100; i++) {
   // new Date().sout new Date（）.sout

  System.out.println(new Date());

  }

  int[] array = {23, 45, 6};

  // array.iteri array.iteri

  for (int i : array) {

   // i.sout I.sout

    System.out.println(i); System.out.println（i）;

  }

  User user = new User("zs");

  // user.nn 用户.nn

  if (user != null) {
  

  }

}

public class User { 公共类用户 {

  private final String name;

  public User(String name) {

   // name.field 名称.字段

    this.name = name;

  }

}
```

