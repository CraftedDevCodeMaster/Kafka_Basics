Here is your complete Kafka setup and Spring Boot API usage guide bundled into **one clean `README.md` file**. You can copy the content below and save it as `README.md` in your project folder.

---

### ✅ Full `README.md` — All in One File

```markdown
# 🧰 Kafka 3.9.1 Setup & Spring Boot Kafka API (Windows)

## ✅ Prerequisites
- Java JDK 8 or 11 installed  
- `JAVA_HOME` environment variable is set  
- Kafka 3.9.1 downloaded and extracted  

---

## 📦 Step 1: Download & Setup Kafka
1. Visit: [https://kafka.apache.org/downloads.html](https://kafka.apache.org/downloads.html)  
2. Download: `kafka_2.12-3.9.1.tgz`  
3. Extract using **7-Zip** or **WinRAR**  
4. Move the extracted folder to:

```

C:\kafka\_2.12-3.9.1

````

> ⚠️ **Note for Windows Users:**
> - Avoid deep directory structures. Place Kafka directly in `C:\`  
> - Windows CMD character limit: **8191 characters**  
> - Prevents `input line is too long` errors  

---

## 🚀 Step 2: Start Zookeeper

Open **Command Prompt** or **PowerShell** and run:

```bash
cd C:\kafka_2.12-3.9.1
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
````

---

## 🚀 Step 3: Start Kafka Broker

Open a **new CMD or PowerShell window** and run:

```bash
cd C:\kafka_2.12-3.9.1
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

---

## 🧪 Step 4: Kafka Topic Operations

### ✅ Create a Topic

```bash
.\bin\windows\kafka-topics.bat --create --topic my-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
```

### ✅ List Topics

```bash
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
```

---

## 🌐 Kafka REST API (Spring Boot)

Once your **Spring Boot application** is running on `localhost:8080`:

### ➤ Send a message to Kafka:

```http
http://localhost:8080/kafka/api/produceMsg?message=Hi%20Praveen
```

> This sends `"Hi Praveen"` to Kafka via the REST API.

---

## 🧾 Summary of All Commands

```bash
cd C:\kafka_2.12-3.9.1

# Start Zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start Kafka Broker (in new window)
.\bin\windows\kafka-server-start.bat .\config\server.properties

# Create Topic
.\bin\windows\kafka-topics.bat --create --topic my-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

# List Topics
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
```

---

## 📌 Notes

* Kafka config file: `config/server.properties`
* Zookeeper config file: `config/zookeeper.properties`
* REST API URL format:

  ```
  http://localhost:8080/kafka/api/produceMsg?message=YourMessageHere
  ```

---

```

✅ Just copy and paste this into a file named `README.md`. Let me know if you want me to include your Spring Boot code or `application.properties` setup as well.
```
