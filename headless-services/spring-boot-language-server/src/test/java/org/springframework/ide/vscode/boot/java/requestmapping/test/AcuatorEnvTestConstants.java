/*******************************************************************************
 * Copyright (c) 2018 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.vscode.boot.java.requestmapping.test;

public class AcuatorEnvTestConstants {

	// Kebab Case: `server.servlet.context-path`
	// REAL `/env` from actuator data from a Boot 2.x JSON from an actual running app that contains 3 different definitions for server context path.
	public static final String BOOT_2x_ENV_CONTEXT_PATH_KEBAB_CASE = "{\"activeProfiles\":[],\"propertySources\":[{\"name\":\"server.ports\",\"properties\":{\"local.server.port\":{\"value\":8080}}},"
			// context-path defined in command line args
			+ "{\"name\":\"commandLineArgs\",\"properties\":{\"spring.output.ansi.enabled\":{\"value\":\"always\"},\"server.servlet.context-path\":{\"value\":\"/pathfromcommandlineargs\"}}}"
			// Ignore this line. Extra information not needed for context path tests
			+ ",{\"name\":\"servletContextInitParams\",\"properties\":{}},{\"name\":\"systemProperties\",\"properties\":{\"com.sun.management.jmxremote.authenticate\":{\"value\":\"false\"},\"java.runtime.name\":{\"value\":\"Java(TM) SE Runtime Environment\"},\"sun.boot.library.path\":{\"value\":\"/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib\"},\"java.vm.version\":{\"value\":\"25.144-b01\"},\"gopherProxySet\":{\"value\":\"false\"},\"java.vm.vendor\":{\"value\":\"Oracle Corporation\"},\"java.vendor.url\":{\"value\":\"http://java.oracle.com/\"},\"java.rmi.server.randomIDs\":{\"value\":\"true\"},\"path.separator\":{\"value\":\":\"},\"java.vm.name\":{\"value\":\"Java HotSpot(TM) 64-Bit Server VM\"},\"file.encoding.pkg\":{\"value\":\"sun.io\"},\"user.country\":{\"value\":\"CA\"},\"sun.java.launcher\":{\"value\":\"SUN_STANDARD\"},\"sun.os.patch.level\":{\"value\":\"unknown\"},\"PID\":{\"value\":\"46108\"},\"com.sun.management.jmxremote.port\":{\"value\":\"62402\"},\"java.vm.specification.name\":{\"value\":\"Java Virtual Machine Specification\"},\"user.dir\":{\"value\":\"/Users/nierajsingh/sts4dev/rt-boot-java-ls/demoWithConditionalsboot20\"},\"java.runtime.version\":{\"value\":\"1.8.0_144-b01\"},\"java.awt.graphicsenv\":{\"value\":\"sun.awt.CGraphicsEnvironment\"},\"java.endorsed.dirs\":{\"value\":\"/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/endorsed\"},\"os.arch\":{\"value\":\"x86_64\"},\"java.io.tmpdir\":{\"value\":\"/var/folders/hj/ykvzmmmj4wl5tk959bdfss5w0000gp/T/\"},\"line.separator\":{\"value\":\"\\n\"},\"java.vm.specification.vendor\":{\"value\":\"Oracle Corporation\"},\"os.name\":{\"value\":\"Mac OS X\"},\"sun.jnu.encoding\":{\"value\":\"UTF-8\"},\"spring.beaninfo.ignore\":{\"value\":\"true\"},\"java.library.path\":{\"value\":\"/Users/nierajsingh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.\"},\"java.specification.name\":{\"value\":\"Java Platform API Specification\"},\"java.class.version\":{\"value\":\"52.0\"},\"sun.management.compiler\":{\"value\":\"HotSpot 64-Bit Tiered Compilers\"},\"os.version\":{\"value\":\"10.13.6\"},\"http.nonProxyHosts\":{\"value\":\"local|*.local|169.254/16|*.169.254/16\"},\"user.home\":{\"value\":\"/Users/nierajsingh\"},\"catalina.useNaming\":{\"value\":\"false\"},\"user.timezone\":{\"value\":\"America/Vancouver\"},\"java.awt.printerjob\":{\"value\":\"sun.lwawt.macosx.CPrinterJob\"},\"file.encoding\":{\"value\":\"UTF-8\"},\"java.specification.version\":{\"value\":\"1.8\"},\"catalina.home\":{\"value\":\"/private/var/folders/hj/ykvzmmmj4wl5tk959bdfss5w0000gp/T/tomcat.703612320943979832.8080\"},\"java.class.path\":{\"value\":\"/Users/nierajsingh/sts4dev/rt-boot-java-ls/demoWithConditionalsboot20/target/classes:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.1.0.RELEASE/spring-boot-starter-web-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter/2.1.0.RELEASE/spring-boot-starter-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot/2.1.0.RELEASE/spring-boot-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.1.0.RELEASE/spring-boot-autoconfigure-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.1.0.RELEASE/spring-boot-starter-logging-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/nierajsingh/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/nierajsingh/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.11.1/log4j-to-slf4j-2.11.1.jar:/Users/nierajsingh/.m2/repository/org/apache/logging/log4j/log4j-api/2.11.1/log4j-api-2.11.1.jar:/Users/nierajsingh/.m2/repository/org/slf4j/jul-to-slf4j/1.7.25/jul-to-slf4j-1.7.25.jar:/Users/nierajsingh/.m2/repository/javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar:/Users/nierajsingh/.m2/repository/org/yaml/snakeyaml/1.23/snakeyaml-1.23.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.1.0.RELEASE/spring-boot-starter-json-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.7/jackson-databind-2.9.7.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.7/jackson-core-2.9.7.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.9.7/jackson-datatype-jdk8-2.9.7.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.9.7/jackson-datatype-jsr310-2.9.7.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.9.7/jackson-module-parameter-names-2.9.7.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.1.0.RELEASE/spring-boot-starter-tomcat-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.12/tomcat-embed-core-9.0.12.jar:/Users/nierajsingh/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/9.0.12/tomcat-embed-el-9.0.12.jar:/Users/nierajsingh/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.12/tomcat-embed-websocket-9.0.12.jar:/Users/nierajsingh/.m2/repository/org/hibernate/validator/hibernate-validator/6.0.13.Final/hibernate-validator-6.0.13.Final.jar:/Users/nierajsingh/.m2/repository/javax/validation/validation-api/2.0.1.Final/validation-api-2.0.1.Final.jar:/Users/nierajsingh/.m2/repository/org/jboss/logging/jboss-logging/3.3.2.Final/jboss-logging-3.3.2.Final.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/classmate/1.4.0/classmate-1.4.0.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-web/5.1.2.RELEASE/spring-web-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-beans/5.1.2.RELEASE/spring-beans-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-webmvc/5.1.2.RELEASE/spring-webmvc-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-aop/5.1.2.RELEASE/spring-aop-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-context/5.1.2.RELEASE/spring-context-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-expression/5.1.2.RELEASE/spring-expression-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-web-services/2.1.0.RELEASE/spring-boot-starter-web-services-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/com/sun/xml/messaging/saaj/saaj-impl/1.5.0/saaj-impl-1.5.0.jar:/Users/nierajsingh/.m2/repository/javax/xml/soap/javax.xml.soap-api/1.4.0/javax.xml.soap-api-1.4.0.jar:/Users/nierajsingh/.m2/repository/org/jvnet/mimepull/mimepull/1.9.10/mimepull-1.9.10.jar:/Users/nierajsingh/.m2/repository/org/jvnet/staxex/stax-ex/1.8/stax-ex-1.8.jar:/Users/nierajsingh/.m2/repository/javax/xml/ws/jaxws-api/2.3.1/jaxws-api-2.3.1.jar:/Users/nierajsingh/.m2/repository/javax/xml/bind/jaxb-api/2.3.1/jaxb-api-2.3.1.jar:/Users/nierajsingh/.m2/repository/javax/activation/javax.activation-api/1.2.0/javax.activation-api-1.2.0.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-oxm/5.1.2.RELEASE/spring-oxm-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/ws/spring-ws-core/3.0.4.RELEASE/spring-ws-core-3.0.4.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/ws/spring-xml/3.0.4.RELEASE/spring-xml-3.0.4.RELEASE.jar:/Users/nierajsingh/.m2/repository/commons-io/commons-io/2.5/commons-io-2.5.jar:/Users/nierajsingh/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-core/5.1.2.RELEASE/spring-core-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-jcl/5.1.2.RELEASE/spring-jcl-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-actuator/2.1.0.RELEASE/spring-boot-starter-actuator-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/2.1.0.RELEASE/spring-boot-actuator-autoconfigure-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-actuator/2.1.0.RELEASE/spring-boot-actuator-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/io/micrometer/micrometer-core/1.1.0/micrometer-core-1.1.0.jar:/Users/nierajsingh/.m2/repository/org/hdrhistogram/HdrHistogram/2.1.9/HdrHistogram-2.1.9.jar:/Users/nierajsingh/.m2/repository/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.jar\"},\"user.name\":{\"value\":\"nierajsingh\"},\"com.sun.management.jmxremote\":{\"value\":\"\"},\"java.vm.specification.version\":{\"value\":\"1.8\"},\"sun.java.command\":{\"value\":\"******\"},\"java.home\":{\"value\":\"/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre\"},\"sun.arch.data.model\":{\"value\":\"64\"},\"user.language\":{\"value\":\"en\"},\"java.specification.vendor\":{\"value\":\"Oracle Corporation\"},\"awt.toolkit\":{\"value\":\"sun.lwawt.macosx.LWCToolkit\"},\"com.sun.management.jmxremote.ssl\":{\"value\":\"false\"},\"java.vm.info\":{\"value\":\"mixed mode\"},\"java.version\":{\"value\":\"1.8.0_144\"},\"java.ext.dirs\":{\"value\":\"/Users/nierajsingh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java\"},\"sun.boot.class.path\":{\"value\":\"/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/classes\"},\"java.awt.headless\":{\"value\":\"true\"},\"java.vendor\":{\"value\":\"Oracle Corporation\"},\"catalina.base\":{\"value\":\"/private/var/folders/hj/ykvzmmmj4wl5tk959bdfss5w0000gp/T/tomcat.703612320943979832.8080\"},\"spring.application.admin.enabled\":{\"value\":\"true\"},\"java.security.egd\":{\"value\":\"file:/dev/./urandom\"},\"file.separator\":{\"value\":\"/\"},\"java.vendor.url.bug\":{\"value\":\"http://bugreport.sun.com/bugreport/\"},\"sun.io.unicode.encoding\":{\"value\":\"UnicodeBig\"},\"sun.cpu.endian\":{\"value\":\"little\"},\"java.rmi.server.hostname\":{\"value\":\"localhost\"},\"socksNonProxyHosts\":{\"value\":\"local|*.local|169.254/16|*.169.254/16\"},\"ftp.nonProxyHosts\":{\"value\":\"local|*.local|169.254/16|*.169.254/16\"},\"sun.cpu.isalist\":{\"value\":\"\"}}},"
			// context path defined in ENV VAR
			+ "{\"name\":\"systemEnvironment\",\"properties\":{\"SERVER_SERVLET_CONTEXT_PATH\":{\"value\":\"/pathfromenvironment\",\"origin\":\"System Environment Property \\\"SERVER_SERVLET_CONTEXT_PATH\\\"\"},\"JAVA_STARTED_ON_FIRST_THREAD_46095\":{\"value\":\"1\",\"origin\":\"System Environment Property \\\"JAVA_STARTED_ON_FIRST_THREAD_46095\\\"\"},\"PATH\":{\"value\":\"/usr/bin:/bin:/usr/sbin:/sbin\",\"origin\":\"System Environment Property \\\"PATH\\\"\"},\"SHELL\":{\"value\":\"/bin/bash\",\"origin\":\"System Environment Property \\\"SHELL\\\"\"},\"JAVA_STARTED_ON_FIRST_THREAD_45890\":{\"value\":\"1\",\"origin\":\"System Environment Property \\\"JAVA_STARTED_ON_FIRST_THREAD_45890\\\"\"},\"JAVA_MAIN_CLASS_46108\":{\"value\":\"com.example.demo.DemoApplication\",\"origin\":\"System Environment Property \\\"JAVA_MAIN_CLASS_46108\\\"\"},\"USER\":{\"value\":\"nierajsingh\",\"origin\":\"System Environment Property \\\"USER\\\"\"},\"TMPDIR\":{\"value\":\"/var/folders/hj/ykvzmmmj4wl5tk959bdfss5w0000gp/T/\",\"origin\":\"System Environment Property \\\"TMPDIR\\\"\"},\"SSH_AUTH_SOCK\":{\"value\":\"/private/tmp/com.apple.launchd.Edc0D0QqVQ/Listeners\",\"origin\":\"System Environment Property \\\"SSH_AUTH_SOCK\\\"\"},\"DISPLAY\":{\"value\":\"/private/tmp/com.apple.launchd.8djHo5qh6H/org.macosforge.xquartz:0\",\"origin\":\"System Environment Property \\\"DISPLAY\\\"\"},\"XPC_FLAGS\":{\"value\":\"0x0\",\"origin\":\"System Environment Property \\\"XPC_FLAGS\\\"\"},\"APP_ICON_45890\":{\"value\":\"../Resources/sts4.icns\",\"origin\":\"System Environment Property \\\"APP_ICON_45890\\\"\"},\"JAVA_MAIN_CLASS_46095\":{\"value\":\"org.eclipse.equinox.launcher.Main\",\"origin\":\"System Environment Property \\\"JAVA_MAIN_CLASS_46095\\\"\"},\"__CF_USER_TEXT_ENCODING\":{\"value\":\"0x1F6:0x0:0x52\",\"origin\":\"System Environment Property \\\"__CF_USER_TEXT_ENCODING\\\"\"},\"Apple_PubSub_Socket_Render\":{\"value\":\"/private/tmp/com.apple.launchd.wiuBp605jW/Render\",\"origin\":\"System Environment Property \\\"Apple_PubSub_Socket_Render\\\"\"},\"LOGNAME\":{\"value\":\"nierajsingh\",\"origin\":\"System Environment Property \\\"LOGNAME\\\"\"},\"XPC_SERVICE_NAME\":{\"value\":\"org.springframework.boot.ide.branding.sts4.24084\",\"origin\":\"System Environment Property \\\"XPC_SERVICE_NAME\\\"\"},\"HOME\":{\"value\":\"/Users/nierajsingh\",\"origin\":\"System Environment Property \\\"HOME\\\"\"}}},"
		    // context path defined in applicationConfi
			+ "{\"name\":\"applicationConfig: [file:./application.properties]\",\"properties\":{\"server.servlet.context-path\":{\"value\":\"/pathfromapplicationconfig\",\"origin\":\"URL [file:./application.properties]:1:28\"}}}]}\n";


	// Camel Case: `server.servlet.contextPath`
	// REAL `/env` from actuator data from a Boot 2.x JSON from an actual running app that contains 3 different definitions for server context path.
	public static final String BOOT_2x_ENV_CONTEXT_PATH_CAMEL_CASE = "{\"activeProfiles\":[],\"propertySources\":[{\"name\":\"server.ports\",\"properties\":{\"local.server.port\":{\"value\":8080}}},"
				// context-path defined in command line args
				+ "{\"name\":\"commandLineArgs\",\"properties\":{\"spring.output.ansi.enabled\":{\"value\":\"always\"},\"server.servlet.contextPath\":{\"value\":\"/pathfromcommandlineargs\"}}}"
				// Ignore this line. Extra information not needed for context path tests
				+ ",{\"name\":\"servletContextInitParams\",\"properties\":{}},{\"name\":\"systemProperties\",\"properties\":{\"com.sun.management.jmxremote.authenticate\":{\"value\":\"false\"},\"java.runtime.name\":{\"value\":\"Java(TM) SE Runtime Environment\"},\"sun.boot.library.path\":{\"value\":\"/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib\"},\"java.vm.version\":{\"value\":\"25.144-b01\"},\"gopherProxySet\":{\"value\":\"false\"},\"java.vm.vendor\":{\"value\":\"Oracle Corporation\"},\"java.vendor.url\":{\"value\":\"http://java.oracle.com/\"},\"java.rmi.server.randomIDs\":{\"value\":\"true\"},\"path.separator\":{\"value\":\":\"},\"java.vm.name\":{\"value\":\"Java HotSpot(TM) 64-Bit Server VM\"},\"file.encoding.pkg\":{\"value\":\"sun.io\"},\"user.country\":{\"value\":\"CA\"},\"sun.java.launcher\":{\"value\":\"SUN_STANDARD\"},\"sun.os.patch.level\":{\"value\":\"unknown\"},\"PID\":{\"value\":\"46108\"},\"com.sun.management.jmxremote.port\":{\"value\":\"62402\"},\"java.vm.specification.name\":{\"value\":\"Java Virtual Machine Specification\"},\"user.dir\":{\"value\":\"/Users/nierajsingh/sts4dev/rt-boot-java-ls/demoWithConditionalsboot20\"},\"java.runtime.version\":{\"value\":\"1.8.0_144-b01\"},\"java.awt.graphicsenv\":{\"value\":\"sun.awt.CGraphicsEnvironment\"},\"java.endorsed.dirs\":{\"value\":\"/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/endorsed\"},\"os.arch\":{\"value\":\"x86_64\"},\"java.io.tmpdir\":{\"value\":\"/var/folders/hj/ykvzmmmj4wl5tk959bdfss5w0000gp/T/\"},\"line.separator\":{\"value\":\"\\n\"},\"java.vm.specification.vendor\":{\"value\":\"Oracle Corporation\"},\"os.name\":{\"value\":\"Mac OS X\"},\"sun.jnu.encoding\":{\"value\":\"UTF-8\"},\"spring.beaninfo.ignore\":{\"value\":\"true\"},\"java.library.path\":{\"value\":\"/Users/nierajsingh/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.\"},\"java.specification.name\":{\"value\":\"Java Platform API Specification\"},\"java.class.version\":{\"value\":\"52.0\"},\"sun.management.compiler\":{\"value\":\"HotSpot 64-Bit Tiered Compilers\"},\"os.version\":{\"value\":\"10.13.6\"},\"http.nonProxyHosts\":{\"value\":\"local|*.local|169.254/16|*.169.254/16\"},\"user.home\":{\"value\":\"/Users/nierajsingh\"},\"catalina.useNaming\":{\"value\":\"false\"},\"user.timezone\":{\"value\":\"America/Vancouver\"},\"java.awt.printerjob\":{\"value\":\"sun.lwawt.macosx.CPrinterJob\"},\"file.encoding\":{\"value\":\"UTF-8\"},\"java.specification.version\":{\"value\":\"1.8\"},\"catalina.home\":{\"value\":\"/private/var/folders/hj/ykvzmmmj4wl5tk959bdfss5w0000gp/T/tomcat.703612320943979832.8080\"},\"java.class.path\":{\"value\":\"/Users/nierajsingh/sts4dev/rt-boot-java-ls/demoWithConditionalsboot20/target/classes:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.1.0.RELEASE/spring-boot-starter-web-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter/2.1.0.RELEASE/spring-boot-starter-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot/2.1.0.RELEASE/spring-boot-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.1.0.RELEASE/spring-boot-autoconfigure-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.1.0.RELEASE/spring-boot-starter-logging-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/nierajsingh/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/nierajsingh/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.11.1/log4j-to-slf4j-2.11.1.jar:/Users/nierajsingh/.m2/repository/org/apache/logging/log4j/log4j-api/2.11.1/log4j-api-2.11.1.jar:/Users/nierajsingh/.m2/repository/org/slf4j/jul-to-slf4j/1.7.25/jul-to-slf4j-1.7.25.jar:/Users/nierajsingh/.m2/repository/javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar:/Users/nierajsingh/.m2/repository/org/yaml/snakeyaml/1.23/snakeyaml-1.23.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.1.0.RELEASE/spring-boot-starter-json-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.7/jackson-databind-2.9.7.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.7/jackson-core-2.9.7.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.9.7/jackson-datatype-jdk8-2.9.7.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.9.7/jackson-datatype-jsr310-2.9.7.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.9.7/jackson-module-parameter-names-2.9.7.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.1.0.RELEASE/spring-boot-starter-tomcat-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.12/tomcat-embed-core-9.0.12.jar:/Users/nierajsingh/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/9.0.12/tomcat-embed-el-9.0.12.jar:/Users/nierajsingh/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.12/tomcat-embed-websocket-9.0.12.jar:/Users/nierajsingh/.m2/repository/org/hibernate/validator/hibernate-validator/6.0.13.Final/hibernate-validator-6.0.13.Final.jar:/Users/nierajsingh/.m2/repository/javax/validation/validation-api/2.0.1.Final/validation-api-2.0.1.Final.jar:/Users/nierajsingh/.m2/repository/org/jboss/logging/jboss-logging/3.3.2.Final/jboss-logging-3.3.2.Final.jar:/Users/nierajsingh/.m2/repository/com/fasterxml/classmate/1.4.0/classmate-1.4.0.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-web/5.1.2.RELEASE/spring-web-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-beans/5.1.2.RELEASE/spring-beans-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-webmvc/5.1.2.RELEASE/spring-webmvc-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-aop/5.1.2.RELEASE/spring-aop-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-context/5.1.2.RELEASE/spring-context-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-expression/5.1.2.RELEASE/spring-expression-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-web-services/2.1.0.RELEASE/spring-boot-starter-web-services-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/com/sun/xml/messaging/saaj/saaj-impl/1.5.0/saaj-impl-1.5.0.jar:/Users/nierajsingh/.m2/repository/javax/xml/soap/javax.xml.soap-api/1.4.0/javax.xml.soap-api-1.4.0.jar:/Users/nierajsingh/.m2/repository/org/jvnet/mimepull/mimepull/1.9.10/mimepull-1.9.10.jar:/Users/nierajsingh/.m2/repository/org/jvnet/staxex/stax-ex/1.8/stax-ex-1.8.jar:/Users/nierajsingh/.m2/repository/javax/xml/ws/jaxws-api/2.3.1/jaxws-api-2.3.1.jar:/Users/nierajsingh/.m2/repository/javax/xml/bind/jaxb-api/2.3.1/jaxb-api-2.3.1.jar:/Users/nierajsingh/.m2/repository/javax/activation/javax.activation-api/1.2.0/javax.activation-api-1.2.0.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-oxm/5.1.2.RELEASE/spring-oxm-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/ws/spring-ws-core/3.0.4.RELEASE/spring-ws-core-3.0.4.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/ws/spring-xml/3.0.4.RELEASE/spring-xml-3.0.4.RELEASE.jar:/Users/nierajsingh/.m2/repository/commons-io/commons-io/2.5/commons-io-2.5.jar:/Users/nierajsingh/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-core/5.1.2.RELEASE/spring-core-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/spring-jcl/5.1.2.RELEASE/spring-jcl-5.1.2.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-starter-actuator/2.1.0.RELEASE/spring-boot-starter-actuator-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/2.1.0.RELEASE/spring-boot-actuator-autoconfigure-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/org/springframework/boot/spring-boot-actuator/2.1.0.RELEASE/spring-boot-actuator-2.1.0.RELEASE.jar:/Users/nierajsingh/.m2/repository/io/micrometer/micrometer-core/1.1.0/micrometer-core-1.1.0.jar:/Users/nierajsingh/.m2/repository/org/hdrhistogram/HdrHistogram/2.1.9/HdrHistogram-2.1.9.jar:/Users/nierajsingh/.m2/repository/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.jar\"},\"user.name\":{\"value\":\"nierajsingh\"},\"com.sun.management.jmxremote\":{\"value\":\"\"},\"java.vm.specification.version\":{\"value\":\"1.8\"},\"sun.java.command\":{\"value\":\"******\"},\"java.home\":{\"value\":\"/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre\"},\"sun.arch.data.model\":{\"value\":\"64\"},\"user.language\":{\"value\":\"en\"},\"java.specification.vendor\":{\"value\":\"Oracle Corporation\"},\"awt.toolkit\":{\"value\":\"sun.lwawt.macosx.LWCToolkit\"},\"com.sun.management.jmxremote.ssl\":{\"value\":\"false\"},\"java.vm.info\":{\"value\":\"mixed mode\"},\"java.version\":{\"value\":\"1.8.0_144\"},\"java.ext.dirs\":{\"value\":\"/Users/nierajsingh/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java\"},\"sun.boot.class.path\":{\"value\":\"/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/classes\"},\"java.awt.headless\":{\"value\":\"true\"},\"java.vendor\":{\"value\":\"Oracle Corporation\"},\"catalina.base\":{\"value\":\"/private/var/folders/hj/ykvzmmmj4wl5tk959bdfss5w0000gp/T/tomcat.703612320943979832.8080\"},\"spring.application.admin.enabled\":{\"value\":\"true\"},\"java.security.egd\":{\"value\":\"file:/dev/./urandom\"},\"file.separator\":{\"value\":\"/\"},\"java.vendor.url.bug\":{\"value\":\"http://bugreport.sun.com/bugreport/\"},\"sun.io.unicode.encoding\":{\"value\":\"UnicodeBig\"},\"sun.cpu.endian\":{\"value\":\"little\"},\"java.rmi.server.hostname\":{\"value\":\"localhost\"},\"socksNonProxyHosts\":{\"value\":\"local|*.local|169.254/16|*.169.254/16\"},\"ftp.nonProxyHosts\":{\"value\":\"local|*.local|169.254/16|*.169.254/16\"},\"sun.cpu.isalist\":{\"value\":\"\"}}},"
				// context path defined in ENV VAR
				+ "{\"name\":\"systemEnvironment\",\"properties\":{\"SERVER_SERVLET_CONTEXT_PATH\":{\"value\":\"/pathfromenvironment\",\"origin\":\"System Environment Property \\\"SERVER_SERVLET_CONTEXT_PATH\\\"\"},\"JAVA_STARTED_ON_FIRST_THREAD_46095\":{\"value\":\"1\",\"origin\":\"System Environment Property \\\"JAVA_STARTED_ON_FIRST_THREAD_46095\\\"\"},\"PATH\":{\"value\":\"/usr/bin:/bin:/usr/sbin:/sbin\",\"origin\":\"System Environment Property \\\"PATH\\\"\"},\"SHELL\":{\"value\":\"/bin/bash\",\"origin\":\"System Environment Property \\\"SHELL\\\"\"},\"JAVA_STARTED_ON_FIRST_THREAD_45890\":{\"value\":\"1\",\"origin\":\"System Environment Property \\\"JAVA_STARTED_ON_FIRST_THREAD_45890\\\"\"},\"JAVA_MAIN_CLASS_46108\":{\"value\":\"com.example.demo.DemoApplication\",\"origin\":\"System Environment Property \\\"JAVA_MAIN_CLASS_46108\\\"\"},\"USER\":{\"value\":\"nierajsingh\",\"origin\":\"System Environment Property \\\"USER\\\"\"},\"TMPDIR\":{\"value\":\"/var/folders/hj/ykvzmmmj4wl5tk959bdfss5w0000gp/T/\",\"origin\":\"System Environment Property \\\"TMPDIR\\\"\"},\"SSH_AUTH_SOCK\":{\"value\":\"/private/tmp/com.apple.launchd.Edc0D0QqVQ/Listeners\",\"origin\":\"System Environment Property \\\"SSH_AUTH_SOCK\\\"\"},\"DISPLAY\":{\"value\":\"/private/tmp/com.apple.launchd.8djHo5qh6H/org.macosforge.xquartz:0\",\"origin\":\"System Environment Property \\\"DISPLAY\\\"\"},\"XPC_FLAGS\":{\"value\":\"0x0\",\"origin\":\"System Environment Property \\\"XPC_FLAGS\\\"\"},\"APP_ICON_45890\":{\"value\":\"../Resources/sts4.icns\",\"origin\":\"System Environment Property \\\"APP_ICON_45890\\\"\"},\"JAVA_MAIN_CLASS_46095\":{\"value\":\"org.eclipse.equinox.launcher.Main\",\"origin\":\"System Environment Property \\\"JAVA_MAIN_CLASS_46095\\\"\"},\"__CF_USER_TEXT_ENCODING\":{\"value\":\"0x1F6:0x0:0x52\",\"origin\":\"System Environment Property \\\"__CF_USER_TEXT_ENCODING\\\"\"},\"Apple_PubSub_Socket_Render\":{\"value\":\"/private/tmp/com.apple.launchd.wiuBp605jW/Render\",\"origin\":\"System Environment Property \\\"Apple_PubSub_Socket_Render\\\"\"},\"LOGNAME\":{\"value\":\"nierajsingh\",\"origin\":\"System Environment Property \\\"LOGNAME\\\"\"},\"XPC_SERVICE_NAME\":{\"value\":\"org.springframework.boot.ide.branding.sts4.24084\",\"origin\":\"System Environment Property \\\"XPC_SERVICE_NAME\\\"\"},\"HOME\":{\"value\":\"/Users/nierajsingh\",\"origin\":\"System Environment Property \\\"HOME\\\"\"}}},"
			    // context path defined in applicationConfi
				+ "{\"name\":\"applicationConfig: [file:./application.properties]\",\"properties\":{\"server.servlet.contextPath\":{\"value\":\"/pathfromapplicationconfig\",\"origin\":\"URL [file:./application.properties]:1:28\"}}}]}\n";


}
