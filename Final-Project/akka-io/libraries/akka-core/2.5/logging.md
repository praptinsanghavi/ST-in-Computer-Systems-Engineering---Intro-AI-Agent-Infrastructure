---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/logging.html
title: Logging • Akka Documentation
---

# Logging • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Logging

## Dependency

To use Logging, you must at least use the Akka actors dependency in your project, and will most likely want to configure logging via the SLF4J module ([see below](logging.html#slf4j)), or use `java.util.logging` ([see below](logging.html#java-util-logging)).

sbt
```
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.32"
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_2.12</artifactId>
    <version>2.5.32</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "com.typesafe.akka:akka-actor_2.12:2.5.32"
}
```

## Introduction

Logging in Akka is not tied to a specific logging backend. By default log messages are printed to STDOUT, but you can plug\-in a SLF4J logger or your own logger. Logging is performed asynchronously to ensure that logging has minimal performance impact. Logging generally means IO and locks, which can slow down the operations of your code if it was performed synchronously.

## How to Log

Create a `LoggingAdapter` and use the `error`, `warning`, `info`, or `debug` methods, as illustrated in this example:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L13-L27 "Go to snippet source")import akka.event.Logging

class MyActor extends Actor {
  val log = Logging(context.system, this)
  override def preStart() = {
    log.debug("Starting")
  }
  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {
    log.error(reason, "Restarting due to [{}] when processing [{}]", reason.getMessage, message.getOrElse(""))
  }
  def receive = {
    case "test" => log.info("Received test")
    case x      => log.warning("Received unknown message: {}", x)
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L8-L11 "Go to snippet source")import akka.actor.*;
import akka.event.Logging;
import akka.event.LoggingAdapter;

```

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L158-L183 "Go to snippet source")class MyActor extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  @Override
  public void preStart() {
    log.debug("Starting");
  }

  @Override
  public void preRestart(Throwable reason, Optional<Object> message) {
    log.error(
        reason,
        "Restarting due to [{}] when processing [{}]",
        reason.getMessage(),
        message.isPresent() ? message.get() : "");
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("test", msg -> log.info("Received test"))
        .matchAny(msg -> log.warning("Received unknown message: {}", msg))
        .build();
  }
}

```

For convenience, you can mix in the `log` member into actors, instead of defining it as above.

```
class MyActor extends Actor with akka.actor.ActorLogging {
  ...
}

```

The first parameter to `Logging` `Logging.getLogger` could also be any `LoggingBus`, specifically `system.eventStream` `system.eventStream()`; in the demonstrated case, the actor system’s address is included in the `akkaSource` representation of the log source (see [Logging Thread, Akka Source and Actor System in MDC](logging.html#logging-thread-akka-source-and-actor-system-in-mdc)) while in the second case this is not automatically done. The second parameter to `Logging` `Logging.getLogger` is the source of this logging channel. The source object is translated to a String according to the following rules:

- if it is an Actor or ActorRef, its path is used
- in case of a String it is used as is
- in case of a class an approximation of its simpleName
- and in all other cases a compile error occurs unless an implicit `LogSource[T]` is in scope for the type in question the simpleName of its class

The log message may contain argument placeholders `{}`, which will be substituted if the log level is enabled. Giving more arguments than placeholders results in a warning being appended to the log statement (i.e. on the same line with the same severity). You may pass an array as the only substitution argument to have its elements be treated individually:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L206-L207 "Go to snippet source")val args = Array("The", "brown", "fox", "jumps", 42)
system.log.debug("five parameters: {}, {}, {}, {}, {}", args)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L151-L152 "Go to snippet source")final Object[] args = new Object[] {"The", "brown", "fox", "jumps", 42};
system.log().debug("five parameters: {}, {}, {}, {}, {}", args);
```

The Java `Class` of the log source is also included in the generated `LogEvent`. In case of a simple string this is replaced with a “marker” class `akka.event.DummyClassForStringSources` in order to allow special treatment of this case, e.g. in the SLF4J event listener which will then use the string instead of the class’ name for looking up the logger instance to use.

### Logging of Dead Letters

By default messages sent to dead letters are logged at info level. Existence of dead letters does not necessarily indicate a problem, but they are logged by default for the sake of caution. After a few messages this logging is turned off, to avoid flooding the logs. You can disable this logging completely or adjust how many dead letters are logged. During system shutdown it is likely that you see dead letters, since pending messages in the actor mailboxes are sent to dead letters. You can also disable logging of dead letters during shutdown.

```
akka {
  log-dead-letters = 10
  log-dead-letters-during-shutdown = on
}

```

To customize the logging further or take other actions for dead letters you can subscribe to the [Event Stream](event-bus.html#event-stream).

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

If you want very detailed logging of user\-level messages then wrap your actors’ behaviors with `akka.event.LoggingReceive` and enable the `receive` option:

```
akka {
  actor {
    debug {
      # enable function of LoggingReceive, which is to log any received message at
      # DEBUG level
      receive = on
    }
  }
}

```

If you want very detailed logging of all automatically received messages that are processed by Actors:

```
akka {
  actor {
    debug {
      # enable DEBUG logging of all AutoReceiveMessages (Kill, PoisonPill etc.)
      autoreceive = on
    }
  }
}

```

If you want very detailed logging of all lifecycle changes of Actors (restarts, deaths etc):

```
akka {
  actor {
    debug {
      # enable DEBUG logging of actor lifecycle changes
      lifecycle = on
    }
  }
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

If you want very detailed logging of all events, transitions and timers of FSM Actors that extend LoggingFSM:

```
akka {
  actor {
    debug {
      # enable DEBUG logging of all LoggingFSMs for events, transitions and timers
      fsm = on
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
akka {
  remote {
    # If this is "on", Akka will log all outbound messages at DEBUG level,
    # if off then they are not logged
    log-sent-messages = on
  }
}

```

If you want to see all messages that are received through remoting at DEBUG log level, use the following config option. Note that this logs the messages as they are received by the transport layer, not by an actor.

```
akka {
  remote {
    # If this is "on", Akka will log all inbound messages at DEBUG level,
    # if off then they are not logged
    log-received-messages = on
  }
}

```

If you want to see message types with payload size in bytes larger than a specified limit at INFO log level:

```
akka {
  remote {
    # Logging of message types with payload size in bytes larger than
    # this value. Maximum detected size per message type is logged once,
    # with an increase threshold of 10%.
    # By default this feature is turned off. Activate it by setting the property to
    # a value in bytes, such as 1000b. Note that for all messages larger than this
    # limit there will be extra performance and scalability cost.
    log-frame-size-exceeding = 1000b
  }
}

```

Also see the [logging options for TestKit](testing.html#actor-logging).

### Translating Log Source to String and Class

The rules for translating the source object to the source string and class which are inserted into the `LogEvent` during runtime are implemented using implicit parameters and thus fully customizable: create your own instance of `LogSource[T]` and have it in scope when creating the logger.

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L97-L112 "Go to snippet source")import akka.actor.ActorSystem
import akka.event.LogSource

object MyType {
  implicit val logSource: LogSource[AnyRef] = new LogSource[AnyRef] {
    def genString(o: AnyRef): String = o.getClass.getName
    override def getClazz(o: AnyRef): Class[_] = o.getClass
  }
}

class MyType(system: ActorSystem) {
  import MyType._
  import akka.event.Logging

  val log = Logging(system, this)
}
```

This example creates a log source which mimics traditional usage of Java loggers, which are based upon the originating object’s class name as log category. The override of `getClazz` is only included for demonstration purposes as it contains exactly the default behavior.

Note
You may also create the string representation up front and pass that in as the log source, but be aware that then the `Class[_]` which will be put in the `LogEvent` is `akka.event.DummyClassForStringSources`.

The SLF4J event listener treats this case specially (using the actual string to look up the logger instance to use instead of the class’ name), and you might want to do this also in case you implement your own logging adapter.

### Turn Off Logging

To turn off logging you can configure the log levels to be `OFF` like this.

```
akka {
  stdout-loglevel = "OFF"
  loglevel = "OFF"
}

```

The `stdout-loglevel` is only in effect during system startup and shutdown, and setting it to `OFF` as well, ensures that nothing gets logged during system startup or shutdown.

## Loggers

Logging is performed asynchronously through an event bus. Log events are processed by an event handler actor that receives the log events in the same order they were emitted.

Note
The event handler actor does not have a bounded inbox and is run on the default dispatcher. This means that logging extreme amounts of data may affect your application badly. This can be somewhat mitigated by using an async logging backend though. (See [Using the SLF4J API directly](#slf4j-directly))

You can configure which event handlers are created at system start\-up and listen to logging events. That is done using the `loggers` element in the [configuration](general/configuration.html). Here you can also define the log level. More fine grained filtering based on the log source can be implemented in a custom `LoggingFilter`, which can be defined in the `logging-filter` configuration property.

```
akka {
  # Loggers to register at boot time (akka.event.Logging$DefaultLogger logs
  # to STDOUT)
  loggers = ["akka.event.Logging$DefaultLogger"]
  # Options: OFF, ERROR, WARNING, INFO, DEBUG
  loglevel = "DEBUG"
}

```

The default one logs to STDOUT and is registered by default. It is not intended to be used for production. There is also an [SLF4J](logging.html#slf4j) logger available in the ‘akka\-slf4j’ module.

Example of creating a listener:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L78-L93 "Go to snippet source")import akka.event.Logging.Debug
import akka.event.Logging.Error
import akka.event.Logging.Info
import akka.event.Logging.InitializeLogger
import akka.event.Logging.LoggerInitialized
import akka.event.Logging.Warning

class MyEventListener extends Actor {
  def receive = {
    case InitializeLogger(_)                        => sender() ! LoggerInitialized
    case Error(cause, logSource, logClass, message) => // ...
    case Warning(logSource, logClass, message)      => // ...
    case Info(logSource, logClass, message)         => // ...
    case Debug(logSource, logClass, message)        => // ...
  }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L8-L11 "Go to snippet source")import akka.actor.*;
import akka.event.Logging;
import akka.event.LoggingAdapter;

import akka.event.Logging.InitializeLogger;
import akka.event.Logging.Error;
import akka.event.Logging.Warning;
import akka.event.Logging.Info;
import akka.event.Logging.Debug;

```

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L213-L244 "Go to snippet source")class MyEventListener extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            InitializeLogger.class,
            msg -> {
              getSender().tell(Logging.loggerInitialized(), getSelf());
            })
        .match(
            Error.class,
            msg -> {
              // ...
            })
        .match(
            Warning.class,
            msg -> {
              // ...
            })
        .match(
            Info.class,
            msg -> {
              // ...
            })
        .match(
            Debug.class,
            msg -> {
              // ...
            })
        .build();
  }
}
```

## Logging to stdout during startup and shutdown

When the actor system is starting up and shutting down the configured `loggers` are not used. Instead log messages are printed to stdout (System.out). The default log level for this stdout logger is `WARNING` and it can be silenced completely by setting `akka.stdout-loglevel=OFF`.

## SLF4J

Akka provides a logger for [SLF4J](http://www.slf4j.org/). This module is available in the ‘akka\-slf4j.jar’. It has a single dependency: the slf4j\-api jar. In your runtime, you also need a SLF4J backend. We recommend [Logback](http://logback.qos.ch/):

sbt
```
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-slf4j" % "2.5.32",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-slf4j_2.12</artifactId>
    <version>2.5.32</version>
  </dependency&gt
  <dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.3</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "com.typesafe.akka:akka-slf4j_2.12:2.5.32"
  implementation "ch.qos.logback:logback-classic:1.2.3"
}
```

You need to enable the Slf4jLogger in the `loggers` element in the [configuration](general/configuration.html). Here you can also define the log level of the event bus. More fine grained log levels can be defined in the configuration of the SLF4J backend (e.g. logback.xml). You should also define `akka.event.slf4j.Slf4jLoggingFilter` in the `logging-filter` configuration property. It will filter the log events using the backend configuration (e.g. logback.xml) before they are published to the event bus.

Warning
If you set the `loglevel` to a higher level than “DEBUG”, any DEBUG events will be filtered out already at the source and will never reach the logging backend, regardless of how the backend is configured.

```
akka {
  loggers = ["akka.event.slf4j.Slf4jLogger"]
  loglevel = "DEBUG"
  logging-filter = "akka.event.slf4j.Slf4jLoggingFilter"
}

```

One gotcha is that the timestamp is attributed in the event handler, not when actually doing the logging.

The SLF4J logger selected for each log event is chosen based on the `Class[_]` `Class` of the log source specified when creating the `LoggingAdapter`, unless that was given directly as a string in which case that string is used (i.e. `LoggerFactory.getLogger(c: Class[_])` `LoggerFactory.getLogger(Class c)` is used in the first case and `LoggerFactory.getLogger(s: String)` `LoggerFactory.getLogger(String s)` in the second).

Note
Beware that the actor system’s name is appended to a `String` log source if the LoggingAdapter was created giving an `ActorSystem` to the factory. If this is not intended, give a `LoggingBus` instead as shown below:

Scala

```
val log = Logging(system.eventStream, "my.nice.string")

```

Java

```
final LoggingAdapter log = Logging.getLogger(system.eventStream(), "my.string");

```

### Using the SLF4J API directly

If you use the SLF4J API directly in your application, remember that the logging operations will block while the underlying infrastructure writes the log statements.

This can be avoided by configuring the logging implementation to use a non\-blocking appender. Logback provides [AsyncAppender](http://logback.qos.ch/manual/appenders.html#AsyncAppender) that does this. It also contains a feature which will drop `INFO` and `DEBUG` messages if the logging load is high.

### Logging Thread, Akka Source and Actor System in MDC

Since the logging is done asynchronously the thread in which the logging was performed is captured in Mapped Diagnostic Context (MDC) with attribute name `sourceThread`. With Logback the thread name is available with `%X{sourceThread}` specifier within the pattern layout configuration:

```
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} %X{sourceThread} - %msg%n</pattern>
  </encoder>
</appender>

```
Note
It will probably be a good idea to use the `sourceThread` MDC value also in non\-Akka parts of the application in order to have this property consistently available in the logs.

Another helpful facility is that Akka captures the actor’s address when instantiating a logger within it, meaning that the full instance identification is available for associating log messages e.g. with members of a router. This information is available in the MDC with attribute name `akkaSource`:

```
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} %X{akkaSource} - %msg%n</pattern>
  </encoder>
</appender>

```

Finally, the actor system in which the logging was performed is available in the MDC with attribute name `sourceActorSystem`:

```
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} %X{sourceActorSystem} - %msg%n</pattern>
  </encoder>
</appender>

```

For more details on what this attribute contains—also for non\-actors—please see [How to Log](#how-to-log).

### More accurate timestamps for log output in MDC

Akka’s logging is asynchronous which means that the timestamp of a log entry is taken from when the underlying logger implementation is called, which can be surprising at first. If you want to more accurately output the timestamp, use the MDC attribute `akkaTimestamp`:

```
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>%X{akkaTimestamp} %-5level %logger{36} %X{akkaSource} - %msg%n</pattern>
  </encoder>
</appender>

```

### MDC values defined by the application

One useful feature available in Slf4j is [MDC](http://logback.qos.ch/manual/mdc.html), Akka has a way to let the application specify custom values, for this you need to use a specialized `LoggingAdapter`, the `DiagnosticLoggingAdapter`. In order to get it you can use the factory, providing an Actor AbstractActor as logSource:

Scala

```
// Within your Actor
val log: DiagnosticLoggingAdapter = Logging(this);

```

Java

```
// Within your AbstractActor
final DiagnosticLoggingAdapter log = Logging.getLogger(this);

```

Once you have the logger, you need to add the custom values before you log something. This way, the values will be put in the SLF4J MDC right before appending the log and removed after.

Note
The cleanup (removal) should be done in the actor at the end, otherwise, next message will log with same MDC values, if it is not set to a new map. Use `log.clearMDC()`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L38-L44 "Go to snippet source")val mdc = Map("requestId" -> 1234, "visitorId" -> 5678)
log.mdc(mdc)

// Log something
log.info("Starting new request")

log.clearMDC()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L29-L31 "Go to snippet source")import akka.event.DiagnosticLoggingAdapter;
import java.util.HashMap;
import java.util.Map;
```

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L187-L209 "Go to snippet source")class MdcActor extends AbstractActor {

  final DiagnosticLoggingAdapter log = Logging.getLogger(this);

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchAny(
            msg -> {
              Map<String, Object> mdc;
              mdc = new HashMap<String, Object>();
              mdc.put("requestId", 1234);
              mdc.put("visitorId", 5678);
              log.setMDC(mdc);

              log.info("Starting new request");

              log.clearMDC();
            })
        .build();
  }
}

```

For convenience, you can mix in the `log` member into actors, instead of defining it as above. This trait also lets you override `def mdc(msg: Any): MDC` for specifying MDC values depending on current message and lets you forget about the cleanup as well, since it already does it for you.

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L51-L74 "Go to snippet source")import Logging.MDC

final case class Req(work: String, visitorId: Int)

class MdcActorMixin extends Actor with akka.actor.DiagnosticActorLogging {
  var reqId = 0

  override def mdc(currentMessage: Any): MDC = {
    reqId += 1
    val always = Map("requestId" -> reqId)
    val perMessage = currentMessage match {
      case r: Req => Map("visitorId" -> r.visitorId)
      case _      => Map()
    }
    always ++ perMessage
  }

  def receive: Receive = {
    case r: Req => {
      log.info(s"Starting new request: ${r.work}")
    }
  }
}

```

Now, the values will be available in the MDC, so you can use them in the layout pattern:

```
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>
      %-5level %logger{36} [req: %X{requestId}, visitor: %X{visitorId}] - %msg%n
    </pattern>
  </encoder>
</appender>

```

### Using Markers

Some logging libraries allow, in addition to MDC data, attaching so called “markers” to log statements. These are used to filter out rare and special events, for example you might want to mark logs that detect some malicious activity and mark them with a `SECURITY` tag, and in your appender configuration make these trigger emails and other notifications immediately.

Markers are available through the LoggingAdapters, when obtained via `Logging.withMarker`. The first argument passed into all log calls then should be a `akka.event.LogMarker`.

The slf4j bridge provided by akka in `akka-slf4j` will automatically pick up this marker value and make it available to SLF4J. For example you could use it like this:

```
<pattern>%date{ISO8601} [%marker][%level] [%msg]%n</pattern>

```

A more advanced (including most Akka added information) example pattern would be:

```
<pattern>%date{ISO8601} level=[%level] marker=[%marker] logger=[%logger] akkaSource=[%X{akkaSource}] sourceActorSystem=[%X{sourceActorSystem}] sourceThread=[%X{sourceThread}] mdc=[ticket-#%X{ticketNumber}: %X{ticketDesc}] - msg=[%msg]%n----%n</pattern>

```

#### Using SLF4J’s Markers

It is also possible to use the `org.slf4j.Marker` with the `LoggingAdapter` when using slf4j.

Since the akka\-actor library avoids depending on any specific logging library, the support for this is included in `akka-slf4j`, which provides the `Slf4jLogMarker` type which can be passed in as first argument instead of the logging framework agnostic LogMarker type from `akka-actor`. The most notable difference between the two is that slf4j’s Markers can have child markers, so one can rely more information using them rather than just a single string.

## java.util.logging

Akka includes a logger for [java.util.logging](https://docs.oracle.com/javase/8/docs/api/java/util/logging/package-summary.html#package.description).

You need to enable the `akka.event.jul.JavaLogger` in the `loggers` element in the [configuration](general/configuration.html). Here you can also define the log level of the event bus. More fine grained log levels can be defined in the configuration of the logging backend. You should also define `akka.event.jul.JavaLoggingFilter` in the `logging-filter` configuration property. It will filter the log events using the backend configuration before they are published to the event bus.

Warning
If you set the `loglevel` to a higher level than “DEBUG”, any DEBUG events will be filtered out already at the source and will never reach the logging backend, regardless of how the backend is configured.

```
akka {
  loglevel = DEBUG
  loggers = ["akka.event.jul.JavaLogger"]
  logging-filter = "akka.event.jul.JavaLoggingFilter"
}

```

One gotcha is that the timestamp is attributed in the event handler, not when actually doing the logging.

The `java.util.logging.Logger` selected for each log event is chosen based on the `Class[_]``Class` of the log source specified when creating the `LoggingAdapter`, unless that was given directly as a string in which case that string is used (i.e. `LoggerFactory.getLogger(c: Class[_])` `LoggerFactory.getLogger(Class c)` is used in the first case and `LoggerFactory.getLogger(s: String)` `LoggerFactory.getLogger(String s)` in the second).

Note
Beware that the actor system’s name is appended to a `String` log source if the LoggingAdapter was created giving an `ActorSystem` to the factory. If this is not intended, give a `LoggingBus` instead as shown below:

Scala

```
val log = Logging(system.eventStream, "my.nice.string")

```

Java

```
final LoggingAdapter log = Logging.getLogger(system.eventStream(), "my.string");

```

## Code Examples

### Example 1: Dependency

```scala
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.32"
```

### Example 2: Dependency

```xml
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_2.12</artifactId>
    <version>2.5.32</version>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
dependencies {
  implementation "com.typesafe.akka:akka-actor_2.12:2.5.32"
}
```

### Example 4: How to Log

```scala
import akka.event.Logging

class MyActor extends Actor {
  val log = Logging(context.system, this)
  override def preStart() = {
    log.debug("Starting")
  }
  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {
    log.error(reason, "Restarting due to [{}] when processing [{}]", reason.getMessage, message.getOrElse(""))
  }
  def receive = {
    case "test" => log.info("Received test")
    case x      => log.warning("Received unknown message: {}", x)
  }
}
```

### Example 5: How to Log

```java
import akka.actor.*;
import akka.event.Logging;
import akka.event.LoggingAdapter;
```

### Example 6: How to Log

```java
class MyActor extends AbstractActor {
  LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

  @Override
  public void preStart() {
    log.debug("Starting");
  }

  @Override
  public void preRestart(Throwable reason, Optional<Object> message) {
    log.error(
        reason,
        "Restarting due to [{}] when processing [{}]",
        reason.getMessage(),
        message.isPresent() ? message.get() : "");
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals("test", msg -> log.info("Received test"))
        .matchAny(msg -> log.warning("Received unknown message: {}", msg))
        .build();
  }
}
```

### Example 7: How to Log

```scala
class MyActor extends Actor with akka.actor.ActorLogging {
  ...
}
```

### Example 8: How to Log

```scala
val args = Array("The", "brown", "fox", "jumps", 42)
system.log.debug("five parameters: {}, {}, {}, {}, {}", args)
```

### Example 9: How to Log

```java
final Object[] args = new Object[] {"The", "brown", "fox", "jumps", 42};
system.log().debug("five parameters: {}, {}, {}, {}, {}", args);
```

### Example 10: Logging of Dead Letters

```ruby
akka {
  log-dead-letters = 10
  log-dead-letters-during-shutdown = on
}
```

### Example 11: Auxiliary logging options

```ruby
akka {
  loglevel = "DEBUG"
}
```

### Example 12: Auxiliary logging options

```ruby
akka {
  # Log the complete configuration at INFO level when the actor system is started.
  # This is useful when you are uncertain of what configuration is used.
  log-config-on-start = on
}
```

### Example 13: Auxiliary logging options

```ruby
akka {
  actor {
    debug {
      # enable function of LoggingReceive, which is to log any received message at
      # DEBUG level
      receive = on
    }
  }
}
```

### Example 14: Auxiliary logging options

```ruby
akka {
  actor {
    debug {
      # enable DEBUG logging of all AutoReceiveMessages (Kill, PoisonPill etc.)
      autoreceive = on
    }
  }
}
```

### Example 15: Auxiliary logging options

```ruby
akka {
  actor {
    debug {
      # enable DEBUG logging of actor lifecycle changes
      lifecycle = on
    }
  }
}
```

### Example 16: Auxiliary logging options

```ruby
akka {
  actor {
    debug {
      # enable DEBUG logging of unhandled messages
      unhandled = on
    }
  }
}
```

### Example 17: Auxiliary logging options

```ruby
akka {
  actor {
    debug {
      # enable DEBUG logging of all LoggingFSMs for events, transitions and timers
      fsm = on
    }
  }
}
```

### Example 18: Auxiliary logging options

```ruby
akka {
  actor {
    debug {
      # enable DEBUG logging of subscription changes on the eventStream
      event-stream = on
    }
  }
}
```

### Example 19: Auxiliary remote logging options

```ruby
akka {
  remote {
    # If this is "on", Akka will log all outbound messages at DEBUG level,
    # if off then they are not logged
    log-sent-messages = on
  }
}
```

### Example 20: Auxiliary remote logging options

```ruby
akka {
  remote {
    # If this is "on", Akka will log all inbound messages at DEBUG level,
    # if off then they are not logged
    log-received-messages = on
  }
}
```

### Example 21: Auxiliary remote logging options

```ruby
akka {
  remote {
    # Logging of message types with payload size in bytes larger than
    # this value. Maximum detected size per message type is logged once,
    # with an increase threshold of 10%.
    # By default this feature is turned off. Activate it by setting the property to
    # a value in bytes, such as 1000b. Note that for all messages larger than this
    # limit there will be extra performance and scalability cost.
    log-frame-size-exceeding = 1000b
  }
}
```

### Example 22: Translating Log Source to String and Class

```scala
import akka.actor.ActorSystem
import akka.event.LogSource

object MyType {
  implicit val logSource: LogSource[AnyRef] = new LogSource[AnyRef] {
    def genString(o: AnyRef): String = o.getClass.getName
    override def getClazz(o: AnyRef): Class[_] = o.getClass
  }
}

class MyType(system: ActorSystem) {
  import MyType._
  import akka.event.Logging

  val log = Logging(system, this)
}
```

### Example 23: Turn Off Logging

```ruby
akka {
  stdout-loglevel = "OFF"
  loglevel = "OFF"
}
```

### Example 24: Loggers

```ruby
akka {
  # Loggers to register at boot time (akka.event.Logging$DefaultLogger logs
  # to STDOUT)
  loggers = ["akka.event.Logging$DefaultLogger"]
  # Options: OFF, ERROR, WARNING, INFO, DEBUG
  loglevel = "DEBUG"
}
```

### Example 25: Loggers

```scala
import akka.event.Logging.Debug
import akka.event.Logging.Error
import akka.event.Logging.Info
import akka.event.Logging.InitializeLogger
import akka.event.Logging.LoggerInitialized
import akka.event.Logging.Warning

class MyEventListener extends Actor {
  def receive = {
    case InitializeLogger(_)                        => sender() ! LoggerInitialized
    case Error(cause, logSource, logClass, message) => // ...
    case Warning(logSource, logClass, message)      => // ...
    case Info(logSource, logClass, message)         => // ...
    case Debug(logSource, logClass, message)        => // ...
  }
}
```

### Example 26: Loggers

```java
import akka.actor.*;
import akka.event.Logging;
import akka.event.LoggingAdapter;

import akka.event.Logging.InitializeLogger;
import akka.event.Logging.Error;
import akka.event.Logging.Warning;
import akka.event.Logging.Info;
import akka.event.Logging.Debug;
```

### Example 27: Loggers

```java
class MyEventListener extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            InitializeLogger.class,
            msg -> {
              getSender().tell(Logging.loggerInitialized(), getSelf());
            })
        .match(
            Error.class,
            msg -> {
              // ...
            })
        .match(
            Warning.class,
            msg -> {
              // ...
            })
        .match(
            Info.class,
            msg -> {
              // ...
            })
        .match(
            Debug.class,
            msg -> {
              // ...
            })
        .build();
  }
}
```

### Example 28: SLF4J

```scala
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-slf4j" % "2.5.32",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
```

### Example 29: SLF4J

```xml
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-slf4j_2.12</artifactId>
    <version>2.5.32</version>
  </dependency&gt
  <dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.3</version>
  </dependency&gt
</dependencies>
```

### Example 30: SLF4J

```gradle
dependencies {
  implementation "com.typesafe.akka:akka-slf4j_2.12:2.5.32"
  implementation "ch.qos.logback:logback-classic:1.2.3"
}
```

### Example 31: SLF4J

```ruby
akka {
  loggers = ["akka.event.slf4j.Slf4jLogger"]
  loglevel = "DEBUG"
  logging-filter = "akka.event.slf4j.Slf4jLoggingFilter"
}
```

### Example 32: SLF4J

```scala
val log = Logging(system.eventStream, "my.nice.string")
```

### Example 33: SLF4J

```java
final LoggingAdapter log = Logging.getLogger(system.eventStream(), "my.string");
```

### Example 34: Logging Thread, Akka Source and Actor System in MDC

```text
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} %X{sourceThread} - %msg%n</pattern>
  </encoder>
</appender>
```

### Example 35: Logging Thread, Akka Source and Actor System in MDC

```text
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} %X{akkaSource} - %msg%n</pattern>
  </encoder>
</appender>
```

### Example 36: Logging Thread, Akka Source and Actor System in MDC

```text
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} %X{sourceActorSystem} - %msg%n</pattern>
  </encoder>
</appender>
```

### Example 37: More accurate timestamps for log output in MDC

```text
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>%X{akkaTimestamp} %-5level %logger{36} %X{akkaSource} - %msg%n</pattern>
  </encoder>
</appender>
```

### Example 38: MDC values defined by the application

```scala
// Within your Actor
val log: DiagnosticLoggingAdapter = Logging(this);
```

### Example 39: MDC values defined by the application

```java
// Within your AbstractActor
final DiagnosticLoggingAdapter log = Logging.getLogger(this);
```

### Example 40: MDC values defined by the application

```scala
val mdc = Map("requestId" -> 1234, "visitorId" -> 5678)
log.mdc(mdc)

// Log something
log.info("Starting new request")

log.clearMDC()
```

### Example 41: MDC values defined by the application

```java
import akka.event.DiagnosticLoggingAdapter;
import java.util.HashMap;
import java.util.Map;
```

### Example 42: MDC values defined by the application

```java
class MdcActor extends AbstractActor {

  final DiagnosticLoggingAdapter log = Logging.getLogger(this);

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchAny(
            msg -> {
              Map<String, Object> mdc;
              mdc = new HashMap<String, Object>();
              mdc.put("requestId", 1234);
              mdc.put("visitorId", 5678);
              log.setMDC(mdc);

              log.info("Starting new request");

              log.clearMDC();
            })
        .build();
  }
}
```

### Example 43: MDC values defined by the application

```scala
import Logging.MDC

final case class Req(work: String, visitorId: Int)

class MdcActorMixin extends Actor with akka.actor.DiagnosticActorLogging {
  var reqId = 0

  override def mdc(currentMessage: Any): MDC = {
    reqId += 1
    val always = Map("requestId" -> reqId)
    val perMessage = currentMessage match {
      case r: Req => Map("visitorId" -> r.visitorId)
      case _      => Map()
    }
    always ++ perMessage
  }

  def receive: Receive = {
    case r: Req => {
      log.info(s"Starting new request: ${r.work}")
    }
  }
}
```

### Example 44: MDC values defined by the application

```text
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>
      %-5level %logger{36} [req: %X{requestId}, visitor: %X{visitorId}] - %msg%n
    </pattern>
  </encoder>
</appender>
```

### Example 45: Using Markers

```text
<pattern>%date{ISO8601} [%marker][%level] [%msg]%n</pattern>
```

### Example 46: Using Markers

```text
<pattern>%date{ISO8601} level=[%level] marker=[%marker] logger=[%logger] akkaSource=[%X{akkaSource}] sourceActorSystem=[%X{sourceActorSystem}] sourceThread=[%X{sourceThread}] mdc=[ticket-#%X{ticketNumber}: %X{ticketDesc}] - msg=[%msg]%n----%n</pattern>
```

### Example 47: java.util.logging

```ruby
akka {
  loglevel = DEBUG
  loggers = ["akka.event.jul.JavaLogger"]
  logging-filter = "akka.event.jul.JavaLoggingFilter"
}
```

### Example 48: java.util.logging

```scala
val log = Logging(system.eventStream, "my.nice.string")
```

### Example 49: java.util.logging

```java
final LoggingAdapter log = Logging.getLogger(system.eventStream(), "my.string");
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.5/event-bus.html
- https://doc.akka.io/libraries/akka-core/2.5/general/configuration.html
- https://doc.akka.io/libraries/akka-core/2.5/logging.html
- https://doc.akka.io/libraries/akka-core/2.5/scheduler.html
- https://doc.akka.io/libraries/akka-core/2.5/testing.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.5/logging.html](https://doc.akka.io/libraries/akka-core/2.5/logging.html)*