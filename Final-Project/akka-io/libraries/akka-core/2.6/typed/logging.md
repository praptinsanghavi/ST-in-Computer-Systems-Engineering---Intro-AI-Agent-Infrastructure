---
description: Logging options with Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:05:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/typed/logging.html
title: Logging • Akka Documentation
---

# Logging • Akka Documentation

> **Summary:** Logging options with Akka.

## Content

# Logging

You are viewing the documentation for the new actor APIs, to view the Akka Classic documentation, see [Classic Logging](../logging.html).

## Dependency

To use Logging, you must at least use the Akka actors dependency in your project, and configure logging via the SLF4J backend, such as Logback configuration.

sbt
```
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
}
```

## Introduction

[SLF4J](https://www.slf4j.org/) is used for logging and Akka provides access to an [org.slf4j.Logger](https://www.slf4j.org/api/org/slf4j/Logger.html) for a specific actor via the [`ActorContext`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html "akka.actor.typed.javadsl.ActorContext")[`ActorContext`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/ActorContext.html "akka.actor.typed.scaladsl.ActorContext"). You may also retrieve a `Logger` with the ordinary [org.slf4j.LoggerFactory](https://www.slf4j.org/api/org/slf4j/LoggerFactory.html).

To ensure that logging has minimal performance impact it’s important that you configure an asynchronous appender for the SLF4J backend. Logging generally means IO and locks, which can slow down the operations of your code if it was performed synchronously.

## How to log

The [`ActorContext`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html "akka.actor.typed.javadsl.ActorContext")[`ActorContext`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/ActorContext.html "akka.actor.typed.scaladsl.ActorContext") provides access to an [org.slf4j.Logger](https://www.slf4j.org/api/org/slf4j/Logger.html) for a specific actor.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/LoggingDocExamples.scala#L30-L33 "Go to snippet source")Behaviors.receive[String] { (context, message) =>
  context.log.info("Received message: {}", message)
  Behaviors.same
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/LoggingDocExamples.java#L32-L51 "Go to snippet source")public class MyLoggingBehavior extends AbstractBehavior<String> {

  public static Behavior<String> create() {
    return Behaviors.setup(MyLoggingBehavior::new);
  }

  private MyLoggingBehavior(ActorContext<String> context) {
    super(context);
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onMessage(String.class, this::onReceive).build();
  }

  private Behavior<String> onReceive(String message) {
    getContext().getLog().info("Received message: {}", message);
    return this;
  }
}
```

The `Logger` via the `ActorContext` will automatically have a name that corresponds to the [`Behavior`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") of the actor when the log is accessed the first time. The class name when using [`AbstractBehavior`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/AbstractBehavior.html "akka.actor.typed.javadsl.AbstractBehavior")[`AbstractBehavior`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/AbstractBehavior.html "akka.actor.typed.scaladsl.AbstractBehavior") or the class or object name where the `Behavior` is defined when using the functional style. You can set a custom logger name with the [`setLoggerName`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html#setLoggerName(java.lang.String) "akka.actor.typed.javadsl.ActorContext")[`setLoggerName`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/ActorContext.html#setLoggerName(name:String):Unit "akka.actor.typed.scaladsl.ActorContext") of the `ActorContext`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/LoggingDocExamples.scala#L37-L45 "Go to snippet source")Behaviors.setup[String] { context =>
  context.setLoggerName("com.myservice.BackendManager")
  context.log.info("Starting up")

  Behaviors.receiveMessage { message =>
    context.log.debug("Received message: {}", message)
    Behaviors.same
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/LoggingDocExamples.java#L55-L79 "Go to snippet source")public class BackendManager extends AbstractBehavior<String> {

  public static Behavior<String> create() {
    return Behaviors.setup(
        context -> {
          context.setLoggerName(BackendManager.class);
          context.getLog().info("Starting up");
          return new BackendManager(context);
        });
  }

  private BackendManager(ActorContext<String> context) {
    super(context);
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onMessage(String.class, this::onReceive).build();
  }

  private Behavior<String> onReceive(String message) {
    getContext().getLog().debug("Received message: {}", message);
    return this;
  }
}
```

The convention is to use logger names like fully qualified class names. The parameter to `setLoggerName` can be a `String` or a `Class`, where the latter is convenience for the class name.

When logging via the `ActorContext` the path of the actor will automatically be added as `akkaSource` Mapped Diagnostic Context (MDC) value. MDC is typically implemented with a [`ThreadLocal`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ThreadLocal.html "java.lang.ThreadLocal") by the SLF4J backend. To reduce performance impact, this MDC value is set when you access the [`log`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/ActorContext.html#log:org.slf4j.Logger "akka.actor.typed.scaladsl.ActorContext")[`getLog()`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html#getLog() "akka.actor.typed.javadsl.ActorContext") method so you shouldn’t cache the returned `Logger` in your own field. That is handled by `ActorContext` and retrieving the `Logger` repeatedly with the `log``getLog` method has low overhead. The MDC is cleared automatically after processing of current message has finished.

Note
The `Logger` is thread\-safe but the `log``getLog` method in `ActorContext` is not thread\-safe and should not be accessed from threads other than the ordinary actor message processing thread, such as [`Future`](http://www.scala-lang.org/api/2.13.8/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") callbacks.

It’s also perfectly fine to use a [Logger](https://www.slf4j.org/api/org/slf4j/Logger.html) retrieved via [org.slf4j.LoggerFactory](https://www.slf4j.org/api/org/slf4j/LoggerFactory.html), but then the logging events will not include the `akkaSource` MDC value. This is the recommended way when logging outside of an actor, including logging from [`Future`](http://www.scala-lang.org/api/2.13.8/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") callbacks.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/LoggingDocExamples.scala#L49-L57 "Go to snippet source")val log = LoggerFactory.getLogger("com.myservice.BackendTask")

Future {
  // some work
  "result"
}.onComplete {
  case Success(result) => log.info("Task completed: {}", result)
  case Failure(exc)    => log.error("Task failed", exc)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/LoggingDocExamples.java#L83-L99 "Go to snippet source")class BackendTask {
  private final Logger log = LoggerFactory.getLogger(getClass());

  void run() {
    CompletableFuture<String> task =
        CompletableFuture.supplyAsync(
            () -> {
              // some work
              return "result";
            });
    task.whenComplete(
        (result, exc) -> {
          if (exc == null) log.error("Task failed", exc);
          else log.info("Task completed: {}", result);
        });
  }
}
```

### Placeholder arguments

The log message may contain argument placeholders `{}`, which will be substituted if the log level is enabled. Compared to constructing a full string for the log message this has the advantage of avoiding superfluous string concatenation and object allocations when the log level is disabled. Some logging backends may also use these message templates before argument substitution to group and filter logging events.

It can be good to know that 3 or more arguments will result in the relatively small cost of allocating an array (vararg parameter) also when the log level is disabled. The methods with 1 or 2 arguments don’t allocate the vararg array.

When using the methods for 2 argument placeholders the compiler will often not be able to select the right method and report compiler error “ambiguous reference to overloaded definition”. To work around this problem you can use the `trace2`, `debug2`, `info2`, `warn2` or `error2` extension methods that are added by `import akka.actor.typed.scaladsl.LoggerOps` or `import akka.actor.typed.scaladsl._`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/LoggingDocExamples.scala#L64-L69 "Go to snippet source")import akka.actor.typed.scaladsl.LoggerOps

Behaviors.receive[String] { (context, message) =>
  context.log.info2("{} received message: {}", context.self.path.name, message)
  Behaviors.same
}
```

When using the methods for 3 or more argument placeholders, the compiler will not be able to convert the method parameters to the vararg array when they contain primitive values such as `Int`, and report compiler error “overloaded method value info with alternatives”. To work around this problem you can use the `traceN`, `debugN`, `infoN`, `warnN` or `errorN` extension methods that are added by the same `LoggerOps` import.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/LoggingDocExamples.scala#L73-L82 "Go to snippet source")import akka.actor.typed.scaladsl.LoggerOps

Behaviors.receive[String] { (context, message) =>
  context.log.infoN(
    "{} received message of size {} starting with: {}",
    context.self.path.name,
    message.length,
    message.take(10))
  Behaviors.same
}
```

If you find it tedious to add the import of `LoggerOps` at many places you can make those additional methods available with a single implicit conversion placed in a root package object of your code:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/myapp/package.scala#L8-L17 "Go to snippet source")import scala.language.implicitConversions
import akka.actor.typed.scaladsl.LoggerOps
import org.slf4j.Logger

package object myapp {

  implicit def loggerOps(logger: Logger): LoggerOps =
    LoggerOps(logger)

}
```

### Behaviors.logMessages

If you want very detailed logging of messages and signals you can decorate a [`Behavior`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") with [`Behaviors.logMessages`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/Behaviors.html#logMessages(akka.actor.typed.LogOptions,akka.actor.typed.Behavior) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.logMessages`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/Behaviors$.html#logMessages[T](logOptions:akka.actor.typed.LogOptions,behavior:akka.actor.typed.Behavior[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors").

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/LoggingDocExamples.scala#L89-L92 "Go to snippet source")import akka.actor.typed.LogOptions
import org.slf4j.event.Level

Behaviors.logMessages(LogOptions().withLevel(Level.TRACE), BackendManager())
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/LoggingDocExamples.java#L20-L104 "Go to snippet source")import org.slf4j.event.Level;

Behaviors.logMessages(LogOptions.create().withLevel(Level.TRACE), BackendManager.create());
```

## MDC

[MDC](https://logback.qos.ch/manual/mdc.html) allows for adding additional context dependent attributes to log entries. Out of the box, Akka will place the path of the actor in the the MDC attribute `akkaSource`.

One or more tags can also be added to the MDC using the [`ActorTags`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorTags$.html "akka.actor.typed.ActorTags")[`ActorTags`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorTags.html "akka.actor.typed.ActorTags") props. The tags will be rendered as a comma separated list and be put in the MDC attribute `akkaTags`. This can be used to categorize log entries from a set of different actors to allow easier filtering of logs:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/LoggingDocExamples.scala#L148 "Go to snippet source")context.spawn(myBehavior, "MyActor", ActorTags("processing"))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/LoggingDocExamples.java#L193 "Go to snippet source")context.spawn(myBehavior, "MyActor", ActorTags.create("processing"));
```

In addition to these two built in MDC attributes you can also decorate a [`Behavior`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") with [`Behaviors.withMdc`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/Behaviors.html#withMdc(java.lang.Class,java.util.Map,akka.japi.function.Function,akka.actor.typed.Behavior) "akka.actor.typed.javadsl.Behaviors")[`Behaviors.withMdc`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/Behaviors$.html#withMdc[T](staticMdc:Map[String,String],mdcForMessage:T=%3EMap[String,String])(behavior:akka.actor.typed.Behavior[T])(implicitevidence$4:scala.reflect.ClassTag[T]):akka.actor.typed.Behavior[T] "akka.actor.typed.scaladsl.Behaviors") or use the [org.slf4j.MDC](https://www.slf4j.org/api/org/slf4j/MDC.html) API directly.

The `Behaviors.withMdc` decorator has two parts. A static `Map` of MDC attributes that are not changed, and a dynamic `Map` that can be constructed for each message.

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/scala/docs/akka/typed/LoggingDocExamples.scala#L100-L106 "Go to snippet source")val staticMdc = Map("startTime" -> system.startTime.toString)
Behaviors.withMdc[BackendManager.Command](
  staticMdc,
  mdcForMessage =
    (msg: BackendManager.Command) => Map("identifier" -> msg.identifier, "upTime" -> system.uptime.toString)) {
  BackendManager()
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/java/jdocs/akka/typed/LoggingDocExamples.java#L132-L144 "Go to snippet source")Map<String, String> staticMdc = new HashMap<>();
staticMdc.put("startTime", String.valueOf(system.startTime()));

Behaviors.withMdc(
    BackendManager2.Command.class,
    staticMdc,
    message -> {
      Map<String, String> msgMdc = new HashMap<>();
      msgMdc.put("identifier", message.identifier());
      msgMdc.put("upTime", String.valueOf(system.uptime()));
      return msgMdc;
    },
    BackendManager2.create());
```

If you use the MDC API directly, be aware that MDC is typically implemented with a [`ThreadLocal`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ThreadLocal.html "java.lang.ThreadLocal") by the SLF4J backend. Akka clears the MDC if logging is performed via the [`log`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/ActorContext.html#log:org.slf4j.Logger "akka.actor.typed.scaladsl.ActorContext")[`getLog()`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html#getLog() "akka.actor.typed.javadsl.ActorContext") of the `ActorContext` and it is cleared automatically after processing of current message has finished, but only if you accessed `log``getLog()`. The entire MDC is cleared, including attributes that you add yourself to the MDC. MDC is not cleared automatically if you use a [Logger](https://www.slf4j.org/api/org/slf4j/Logger.html) via [LoggerFactory](https://www.slf4j.org/api/org/slf4j/LoggerFactory.html) or not touch `log``getLog()` in the `ActorContext`.

## SLF4J backend

To ensure that logging has minimal performance impact it’s important that you configure an asynchronous appender for the SLF4J backend. Logging generally means IO and locks, which can slow down the operations of your code if it was performed synchronously.

Warning
For production the SLF4J backend should be configured with an asynchronous appender as described here. Otherwise there is a risk of reduced performance and thread starvation problems of the dispatchers that are running actors and other tasks.

### Logback

`akka-actor-typed` includes a dependency to the `slf4j-api`. In your runtime, you also need a SLF4J backend. We recommend [Logback](https://logback.qos.ch/):

sbt
```
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.11"
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.11</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "ch.qos.logback:logback-classic:1.2.11"
}
```

Logback has flexible configuration options and details can be found in the [Logback manual](https://logback.qos.ch/manual/configuration.html) and other external resources.

One part that is important to highlight is the importance of configuring an [AsyncAppender](https://logback.qos.ch/manual/appenders.html#AsyncAppender), because it offloads rendering of logging events to a background thread, increasing performance. It doesn’t block the threads of the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") while the underlying infrastructure writes the log messages to disk or other configured destination. It also contains a feature which will drop `INFO` and `DEBUG` messages if the logging load is high.

A starting point for configuration of `logback.xml` for production:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/resources/logback-doc-prod.xml "Go to snippet source")<?xml version="1.0" encoding="UTF-8"?>
<configuration>

    <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <file>myapp.log</file>
        <immediateFlush>false</immediateFlush>
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>myapp_%d{yyyy-MM-dd}.log</fileNamePattern>
        </rollingPolicy>
        <encoder>
            <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
        </encoder>
    </appender>

    <appender name="ASYNC" class="ch.qos.logback.classic.AsyncAppender">
        <queueSize>8192</queueSize>
        <neverBlock>true</neverBlock>
        <appender-ref ref="FILE" />
    </appender>

    <root level="INFO">
        <appender-ref ref="ASYNC"/>
    </root>
</configuration>
```

Note that the [AsyncAppender](https://logback.qos.ch/apidocs/ch/qos/logback/classic/AsyncAppender.html) may drop log events if the queue becomes full, which may happen if the logging backend can’t keep up with the throughput of produced log events. Dropping log events is necessary if you want to gracefully degrade your application if only your logging backend or filesystem is experiencing issues. 

An alternative of the Logback `AsyncAppender` with better performance is the [Logstash async appender](https://github.com/logstash/logstash-logback-encoder#async-appenders).

The ELK\-stack is commonly used as logging infrastructure for production:

- [Logstash Logback encoder](https://github.com/logstash/logstash-logback-encoder)
- [Logstash](https://www.elastic.co/guide/en/logstash/current/index.html)
- [Elasticsearch](https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html)
- [Kibana](https://www.elastic.co/guide/en/kibana/current/index.html)

For development you might want to log to standard out, but also have all debug level logging to file, like in this example:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-actor-typed-tests/src/test/resources/logback-doc-dev.xml "Go to snippet source")<?xml version="1.0" encoding="UTF-8"?>
<configuration>

    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
            <level>INFO</level>
        </filter>
        <encoder>
            <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
        </encoder>
    </appender>

    <appender name="FILE" class="ch.qos.logback.core.FileAppender">
        <file>target/myapp-dev.log</file>
        <encoder>
            <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
        </encoder>
    </appender>

    <root level="DEBUG">
        <appender-ref ref="STDOUT"/>
        <appender-ref ref="FILE"/>
    </root>
</configuration>
```

Place the `logback.xml` file in `src/main/resources/logback.xml`. For tests you can define different logging configuration in `src/test/resources/logback-test.xml`.

#### MDC values

When logging via the [`log`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/ActorContext.html#log:org.slf4j.Logger "akka.actor.typed.scaladsl.ActorContext")[`getLog()`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html#getLog() "akka.actor.typed.javadsl.ActorContext") of the `ActorContext`, as described in [How to log](logging.html#how-to-log), Akka includes a few MDC properties:

- `akkaSource`: the actor’s path
- `akkaAddress`: the full address of the ActorSystem, including hostname and port if Cluster is enabled
- `akkaTags`: tags defined in the [`Props`](https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Props.html "akka.actor.typed.Props")[`Props`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Props.html "akka.actor.typed.Props") of the actor
- `sourceActorSystem`: the name of the ActorSystem

These MDC properties can be included in the Logback output with for example `%X{akkaSource}` specifier within the [pattern layout configuration](https://logback.qos.ch/manual/layouts.html#mdc):

```
  <encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} %X{akkaSource} - %msg%n</pattern>
  </encoder>

```

All MDC properties as key\-value entries can be included with `%mdc`:

```
  <encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} - %msg MDC: {%mdc}%n</pattern>
  </encoder>

```

## Internal logging by Akka

### Event bus

For historical reasons logging by the Akka internals and by classic actors are performed asynchronously through an event bus. Such log events are processed by an event handler actor, which then emits them to SLF4J or directly to standard out.

When `akka-actor-typed` and `akka-slf4j` are on the classpath this event handler actor will emit the events to SLF4J. The [`akka.event.slf4j.Slf4jLogger`](https://doc.akka.io/api/akka-core/2.6/akka/event/slf4j/Slf4jLogger.html "akka.event.slf4j.Slf4jLogger")[`akka.event.slf4j.Slf4jLogger`](https://doc.akka.io/japi/akka-core/2.6/akka/event/slf4j/Slf4jLogger.html "akka.event.slf4j.Slf4jLogger") and [`akka.event.slf4j.Slf4jLoggingFilter`](https://doc.akka.io/api/akka-core/2.6/akka/event/slf4j/Slf4jLoggingFilter.html "akka.event.slf4j.Slf4jLoggingFilter")[`akka.event.slf4j.Slf4jLoggingFilter`](https://doc.akka.io/japi/akka-core/2.6/akka/event/slf4j/Slf4jLoggingFilter.html "akka.event.slf4j.Slf4jLoggingFilter") are enabled automatically without additional configuration. This can be disabled by `akka.use-slf4j=off` configuration property.

In other words, you don’t have to do anything for the Akka internal logging to end up in your configured SLF4J backend.

### Log level

Ultimately the log level defined in the SLF4J backend is used. For the Akka internal logging it will also check the level defined by the SLF4J backend before constructing the final log message and emitting it to the event bus.

However, there is an additional `akka.loglevel` configuration property that defines if logging events with lower log level should be discarded immediately without consulting the SLF4J backend. By default this is at `INFO` level, which means that `DEBUG` level logging from the Akka internals will not reach the SLF4J backend even if `DEBUG` is enabled in the backend.

You can enable `DEBUG` level for `akka.loglevel` and control the actual level in the SLF4j backend without any significant overhead, also for production.

```
akka.loglevel = "DEBUG"

```

To turn off all Akka internal logging (not recommended) you can configure the log levels to be `OFF` like this.

```
akka {
  stdout-loglevel = "OFF"
  loglevel = "OFF"
}

```

The `stdout-loglevel` is only in effect during system startup and shutdown, and setting it to `OFF` as well, ensures that nothing gets logged during system startup or shutdown.

See [Logger names](logging.html#logger-names) for configuration of log level in SLF4J backend for certain modules of Akka.

### Logging to stdout during startup and shutdown

When the actor system is starting up and shutting down the configured `loggers` are not used. Instead log messages are printed to stdout (System.out). The default log level for this stdout logger is `WARNING` and it can be silenced completely by setting `akka.stdout-loglevel=OFF`.

### Logging of Dead Letters

By default messages sent to dead letters are logged at info level. Existence of dead letters does not necessarily indicate a problem, but they are logged by default for the sake of caution. After a few messages this logging is turned off, to avoid flooding the logs. You can disable this logging completely or adjust how many dead letters are logged. During system shutdown it is likely that you see dead letters, since pending messages in the actor mailboxes are sent to dead letters. You can also disable logging of dead letters during shutdown.

```
akka {
  log-dead-letters = 10
  log-dead-letters-during-shutdown = on
}

```

To customize the logging further or take other actions for dead letters you can subscribe to the [Event Stream](../event-bus.html#event-stream).

### Auxiliary logging options

Akka has a few configuration options for very low level debugging. These make more sense in development than in production.

You almost definitely need to have logging set to DEBUG to use any of the options below:

```
akka {
  loglevel = "DEBUG"
}

```

This config option is very good if you want to know what config settings are loaded by Akka:

```
akka {
  # Log the complete configuration at INFO level when the actor system is started.
  # This is useful when you are uncertain of what configuration is used.
  log-config-on-start = on
}

```

If you want unhandled messages logged at DEBUG:

```
akka {
  actor {
    debug {
      # enable DEBUG logging of unhandled messages
      unhandled = on
    }
  }
}

```

If you want to monitor subscriptions (subscribe/unsubscribe) on the ActorSystem.eventStream:

```
akka {
  actor {
    debug {
      # enable DEBUG logging of subscription changes on the eventStream
      event-stream = on
    }
  }
}

```

### Auxiliary remote logging options

If you want to see all messages that are sent through remoting at DEBUG log level, use the following config option. Note that this logs the messages as they are sent by the transport layer, not by an actor.

```
akka.remote.artery {
  # If this is "on", Akka will log all outbound messages at DEBUG level,
  # if off then they are not logged
  log-sent-messages = on
}

```

If you want to see all messages that are received through remoting at DEBUG log level, use the following config option. Note that this logs the messages as they are received by the transport layer, not by an actor.

```
akka.remote.artery {
  # If this is "on", Akka will log all inbound messages at DEBUG level,
  # if off then they are not logged
  log-received-messages = on
}

```

Logging of message types with payload size in bytes larger than the configured `log-frame-size-exceeding`.

```
akka.remote.artery {
  log-frame-size-exceeding = 10000b
}

```

### MDC values from Akka internal logging

Since the logging is done asynchronously, the thread in which the logging was performed is captured in MDC with attribute name `sourceThread`.

The path of the actor in which the logging was performed is available in the MDC with attribute name `akkaSource`.

The actor system name in which the logging was performed is available in the MDC with attribute name `sourceActorSystem`, but that is typically also included in the `akkaSource` attribute.

The address of the actor system, containing host and port if the system is using cluster, is available through `akkaAddress`.

For typed actors the log event timestamp is taken when the log call was made but for Akka’s *internal* logging as well as the classic actor logging is asynchronous which means that the timestamp of a log entry is taken from when the underlying logger implementation is called, which can be surprising at first. If you want to more accurately output the timestamp for such loggers, use the MDC attribute `akkaTimestamp`. Note that the MDC key will not have any value for a typed actor.

### Markers

Akka is logging some events with markers. Some of these events also include structured MDC properties. 

- The “SECURITY” marker is used for highlighting security related events or incidents.
- Akka Actor is using the markers defined in [`ActorLogMarker`](https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogMarker$.html "akka.actor.ActorLogMarker")[`ActorLogMarker`](https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogMarker.html "akka.actor.ActorLogMarker").
- Akka Cluster is using the markers defined in [`ClusterLogMarker`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterLogMarker$.html "akka.cluster.ClusterLogMarker")[`ClusterLogMarker`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterLogMarker.html "akka.cluster.ClusterLogMarker").
- Akka Remoting is using the markers defined in [`RemoteLogMarker`](https://doc.akka.io/api/akka-core/2.6/akka/remote/RemoteLogMarker$.html "akka.remote.RemoteLogMarker")[`RemoteLogMarker`](https://doc.akka.io/japi/akka-core/2.6/akka/remote/RemoteLogMarker.html "akka.remote.RemoteLogMarker").
- Akka Cluster Sharding is using the markers defined in [`ShardingLogMarker`](https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardingLogMarker$.html "akka.cluster.sharding.ShardingLogMarker")[`ShardingLogMarker`](https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardingLogMarker.html "akka.cluster.sharding.ShardingLogMarker").

Markers and MDC properties are automatically picked up by the [Logstash Logback encoder](https://github.com/logstash/logstash-logback-encoder).

The marker can be included in the Logback output with `%marker` and all MDC properties as key\-value entries with `%mdc`.

```
  <encoder>
    <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
  </encoder>

```

### Logger names

It can be useful to enable debug level or other SLF4J backend configuration for certain modules of Akka when troubleshooting. Those logger names are typically prefixed with the package name of the classes in that module. For example, in Logback the configuration may look like this to enable debug logging for Cluster Sharding: 

```
   <logger name="akka.cluster.sharding" level="DEBUG" />

    <root level="INFO">
        <appender-ref ref="ASYNC"/>
    </root>

```

Other examples of logger names or prefixes:

```
akka.cluster
akka.cluster.Cluster
akka.cluster.ClusterHeartbeat
akka.cluster.ClusterGossip
akka.cluster.ddata
akka.cluster.pubsub
akka.cluster.singleton
akka.cluster.sharding
akka.coordination.lease
akka.discovery
akka.persistence
akka.remote

```

## Logging in tests

Testing utilities are described in [Testing](testing-async.html#test-of-logging).

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor-typed_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-actor-typed_${versions.ScalaBinary}"
}
```

### Example 4: How to log

```scala
Behaviors.receive[String] { (context, message) =>
  context.log.info("Received message: {}", message)
  Behaviors.same
}
```

### Example 5: How to log

```java
public class MyLoggingBehavior extends AbstractBehavior<String> {

  public static Behavior<String> create() {
    return Behaviors.setup(MyLoggingBehavior::new);
  }

  private MyLoggingBehavior(ActorContext<String> context) {
    super(context);
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onMessage(String.class, this::onReceive).build();
  }

  private Behavior<String> onReceive(String message) {
    getContext().getLog().info("Received message: {}", message);
    return this;
  }
}
```

### Example 6: How to log

```scala
Behaviors.setup[String] { context =>
  context.setLoggerName("com.myservice.BackendManager")
  context.log.info("Starting up")

  Behaviors.receiveMessage { message =>
    context.log.debug("Received message: {}", message)
    Behaviors.same
  }
}
```

### Example 7: How to log

```java
public class BackendManager extends AbstractBehavior<String> {

  public static Behavior<String> create() {
    return Behaviors.setup(
        context -> {
          context.setLoggerName(BackendManager.class);
          context.getLog().info("Starting up");
          return new BackendManager(context);
        });
  }

  private BackendManager(ActorContext<String> context) {
    super(context);
  }

  @Override
  public Receive<String> createReceive() {
    return newReceiveBuilder().onMessage(String.class, this::onReceive).build();
  }

  private Behavior<String> onReceive(String message) {
    getContext().getLog().debug("Received message: {}", message);
    return this;
  }
}
```

### Example 8: How to log

```scala
val log = LoggerFactory.getLogger("com.myservice.BackendTask")

Future {
  // some work
  "result"
}.onComplete {
  case Success(result) => log.info("Task completed: {}", result)
  case Failure(exc)    => log.error("Task failed", exc)
}
```

### Example 9: How to log

```java
class BackendTask {
  private final Logger log = LoggerFactory.getLogger(getClass());

  void run() {
    CompletableFuture<String> task =
        CompletableFuture.supplyAsync(
            () -> {
              // some work
              return "result";
            });
    task.whenComplete(
        (result, exc) -> {
          if (exc == null) log.error("Task failed", exc);
          else log.info("Task completed: {}", result);
        });
  }
}
```

### Example 10: Placeholder arguments

```scala
import akka.actor.typed.scaladsl.LoggerOps

Behaviors.receive[String] { (context, message) =>
  context.log.info2("{} received message: {}", context.self.path.name, message)
  Behaviors.same
}
```

### Example 11: Placeholder arguments

```scala
import akka.actor.typed.scaladsl.LoggerOps

Behaviors.receive[String] { (context, message) =>
  context.log.infoN(
    "{} received message of size {} starting with: {}",
    context.self.path.name,
    message.length,
    message.take(10))
  Behaviors.same
}
```

### Example 12: Placeholder arguments

```scala
import scala.language.implicitConversions
import akka.actor.typed.scaladsl.LoggerOps
import org.slf4j.Logger

package object myapp {

  implicit def loggerOps(logger: Logger): LoggerOps =
    LoggerOps(logger)

}
```

### Example 13: Behaviors.logMessages

```scala
import akka.actor.typed.LogOptions
import org.slf4j.event.Level

Behaviors.logMessages(LogOptions().withLevel(Level.TRACE), BackendManager())
```

### Example 14: Behaviors.logMessages

```java
import org.slf4j.event.Level;

Behaviors.logMessages(LogOptions.create().withLevel(Level.TRACE), BackendManager.create());
```

### Example 15: MDC

```scala
context.spawn(myBehavior, "MyActor", ActorTags("processing"))
```

### Example 16: MDC

```java
context.spawn(myBehavior, "MyActor", ActorTags.create("processing"));
```

### Example 17: MDC

```scala
val staticMdc = Map("startTime" -> system.startTime.toString)
Behaviors.withMdc[BackendManager.Command](
  staticMdc,
  mdcForMessage =
    (msg: BackendManager.Command) => Map("identifier" -> msg.identifier, "upTime" -> system.uptime.toString)) {
  BackendManager()
}
```

### Example 18: MDC

```java
Map<String, String> staticMdc = new HashMap<>();
staticMdc.put("startTime", String.valueOf(system.startTime()));

Behaviors.withMdc(
    BackendManager2.Command.class,
    staticMdc,
    message -> {
      Map<String, String> msgMdc = new HashMap<>();
      msgMdc.put("identifier", message.identifier());
      msgMdc.put("upTime", String.valueOf(system.uptime()));
      return msgMdc;
    },
    BackendManager2.create());
```

### Example 19: Logback

```scala
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.11"
```

### Example 20: Logback

```xml
<dependencies&gt
  <dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.11</version>
  </dependency&gt
</dependencies>
```

### Example 21: Logback

```gradle
dependencies {
  implementation "ch.qos.logback:logback-classic:1.2.11"
}
```

### Example 22: Logback

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>

    <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <file>myapp.log</file>
        <immediateFlush>false</immediateFlush>
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>myapp_%d{yyyy-MM-dd}.log</fileNamePattern>
        </rollingPolicy>
        <encoder>
            <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
        </encoder>
    </appender>

    <appender name="ASYNC" class="ch.qos.logback.classic.AsyncAppender">
        <queueSize>8192</queueSize>
        <neverBlock>true</neverBlock>
        <appender-ref ref="FILE" />
    </appender>

    <root level="INFO">
        <appender-ref ref="ASYNC"/>
    </root>
</configuration>
```

### Example 23: Logback

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>

    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
            <level>INFO</level>
        </filter>
        <encoder>
            <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
        </encoder>
    </appender>

    <appender name="FILE" class="ch.qos.logback.core.FileAppender">
        <file>target/myapp-dev.log</file>
        <encoder>
            <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
        </encoder>
    </appender>

    <root level="DEBUG">
        <appender-ref ref="STDOUT"/>
        <appender-ref ref="FILE"/>
    </root>
</configuration>
```

### Example 24: MDC values

```text
<encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} %X{akkaSource} - %msg%n</pattern>
  </encoder>
```

### Example 25: MDC values

```text
<encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} - %msg MDC: {%mdc}%n</pattern>
  </encoder>
```

### Example 26: Log level

```text
akka.loglevel = "DEBUG"
```

### Example 27: Log level

```text
akka {
  stdout-loglevel = "OFF"
  loglevel = "OFF"
}
```

### Example 28: Logging of Dead Letters

```text
akka {
  log-dead-letters = 10
  log-dead-letters-during-shutdown = on
}
```

### Example 29: Auxiliary logging options

```text
akka {
  loglevel = "DEBUG"
}
```

### Example 30: Auxiliary logging options

```text
akka {
  # Log the complete configuration at INFO level when the actor system is started.
  # This is useful when you are uncertain of what configuration is used.
  log-config-on-start = on
}
```

### Example 31: Auxiliary logging options

```text
akka {
  actor {
    debug {
      # enable DEBUG logging of unhandled messages
      unhandled = on
    }
  }
}
```

### Example 32: Auxiliary logging options

```text
akka {
  actor {
    debug {
      # enable DEBUG logging of subscription changes on the eventStream
      event-stream = on
    }
  }
}
```

### Example 33: Auxiliary remote logging options

```text
akka.remote.artery {
  # If this is "on", Akka will log all outbound messages at DEBUG level,
  # if off then they are not logged
  log-sent-messages = on
}
```

### Example 34: Auxiliary remote logging options

```text
akka.remote.artery {
  # If this is "on", Akka will log all inbound messages at DEBUG level,
  # if off then they are not logged
  log-received-messages = on
}
```

### Example 35: Auxiliary remote logging options

```text
akka.remote.artery {
  log-frame-size-exceeding = 10000b
}
```

### Example 36: Markers

```text
<encoder>
    <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
  </encoder>
```

### Example 37: Logger names

```text
<logger name="akka.cluster.sharding" level="DEBUG" />

    <root level="INFO">
        <appender-ref ref="ASYNC"/>
    </root>
```

### Example 38: Logger names

```text
akka.cluster
akka.cluster.Cluster
akka.cluster.ClusterHeartbeat
akka.cluster.ClusterGossip
akka.cluster.ddata
akka.cluster.pubsub
akka.cluster.singleton
akka.cluster.sharding
akka.coordination.lease
akka.discovery
akka.persistence
akka.remote
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/actor/ActorLogMarker$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/ActorTags$.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.6/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/ClusterLogMarker$.html
- https://doc.akka.io/api/akka-core/2.6/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/slf4j/Slf4jLogger.html
- https://doc.akka.io/api/akka-core/2.6/akka/event/slf4j/Slf4jLoggingFilter.html
- https://doc.akka.io/api/akka-core/2.6/akka/remote/RemoteLogMarker$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogMarker.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/ActorTags.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/ClusterLogMarker.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/ShardingLogMarker.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/slf4j/Slf4jLogger.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/slf4j/Slf4jLoggingFilter.html
- https://doc.akka.io/japi/akka-core/2.6/akka/remote/RemoteLogMarker.html
- https://doc.akka.io/libraries/akka-core/2.6/common/circuitbreaker.html
- https://doc.akka.io/libraries/akka-core/2.6/event-bus.html
- https://doc.akka.io/libraries/akka-core/2.6/index-utilities.html
- https://doc.akka.io/libraries/akka-core/2.6/logging.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/logging.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/testing-async.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/typed/logging.html](https://doc.akka.io/libraries/akka-core/2.6/typed/logging.html)*