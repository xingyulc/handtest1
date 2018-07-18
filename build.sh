#!/ur/bin/env bash
#将项目大书包成jar包
mvn clean package;
#分别运行各项目的jar
rm -rf out
for file in $(ls -F |grep "/$")
do
    echo "项目-$file:"
    java -jar $file/target/*.jar
done
