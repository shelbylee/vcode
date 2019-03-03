package:
	mvn package -D maven.test.skip=true
	mkdir -p release
	cp -f vcode-judger/target/vcode-judger-jar-with-dependencies.jar release/vcode-judger.jar
	cp -f vcode-remote-judger/target/vcode-remote-judger-jar-with-dependencies.jar release/vcode-remote-judger.jar
	cp -f vcode-server/target/vcode-server-jar-with-dependencies.jar release/vcode-server.jar
	cp -f vcode-spider/target/vcode-spider-jar-with-dependencies.jar release/vcode-spider.jar

test:
	echo test

clean:
	mvn clean

docker:
	docker build -t sduwh/vcode .

docker-deploy:
	docker ps
