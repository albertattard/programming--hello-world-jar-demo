## Hello World JAR Demo

A simple Java program that is used to demonstrate how to run a Jar file using the `java -jar` command. The Java program
is a simple program that prints _Hello World_ ascii art.

```
  _   _        _  _          _    _               _      _
 | | | |      | || |        | |  | |             | |    | |
 | |_| |  ___ | || |  ___   | |  | |  ___   _ __ | |  __| |
 |  _  | / _ \| || | / _ \  | |/\| | / _ \ | '__|| | / _` |
 | | | ||  __/| || || (_) | \  /\  /| (_) || |   | || (_| |
 \_| |_/ \___||_||_| \___/   \/  \/  \___/ |_|   |_| \__,_|
```

The Jar file can download
from [here](https://github.com/albertattard/programming--hello-world-jar-demo/releases/download/v1.0.0/hello-world-jar-demo.jar)
, or using [cURL](https://curl.se/), as shown next.

```shell
$ curl --location \
   https://github.com/albertattard/programming--hello-world-jar-demo/releases/download/v1.0.0/hello-world-jar-demo.jar \
   --output hello-world-jar-demo.jar
```

The program requires [Java 16](https://openjdk.java.net/projects/jdk/16/) or newer to run, which can be setup
using [SDKMAN](https://sdkman.io/). The following command starts the program.

```shell
$ java -jar hello-world-jar-demo.jar
```
