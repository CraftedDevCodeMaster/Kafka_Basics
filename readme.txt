Kafka 3.9.1 Setup on Windows (CMD/PowerShell)

✅ Prerequisites:
- Java JDK 8 or 11 installed
- JAVA_HOME environment variable set
- Kafka downloaded and extracted

Step 1: Download Kafka
1. Visit https://kafka.apache.org/downloads.html
2. Download: kafka_2.12-3.9.1.tgz (asc, sha512)
3. Extract using 7-Zip or WinRAR
4. Move the extracted folder to:
   C:\kafka_2.12-3.9.1

Note for Windows Users:
- Avoid long paths. Place Kafka directly in C:\
- Windows command line limit: 8191 characters
- Helps avoid "input line is too long" error

Step 2: Start Zookeeper
Open CMD or PowerShell and run:

cd C:\kafka_2.12-3.9.1
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Step 3: Start Kafka Broker (in new window)

cd C:\kafka_2.12-3.9.1
.\bin\windows\kafka-server-start.bat .\config\server.properties

Step 4: Test Kafka

Create topic:
.\bin\windows\kafka-topics.bat --create --topic my-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

List topics:
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

Kafka REST Producer API Example:
http://localhost:8080/kafka/api/produceMsg?message="Hi Praveen"

Summary Commands:
cd C:\kafka_2.12-3.9.1
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties
