■SpringBootをTomcatで動作させる方法

・jar作成からwar作成に変更
　　pom.xmlのpackagingをjarからwarに変更
　　　<packaging>war</packaging>

・tomcatを除外
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-tomcat</artifactId>
		<scope>provided</scope>
	</dependency>


■Eclipseでの起動方法
・PJを右クリック[実行][Spring Boot アプリケーション]を選択
・ブラウザで「http://localhost:9080」（application.propertiesでポート変更しているため）

