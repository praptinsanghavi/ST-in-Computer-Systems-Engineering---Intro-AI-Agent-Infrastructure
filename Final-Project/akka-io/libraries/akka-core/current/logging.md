---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:34:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/logging.html
title: Classic Logging • Akka core
---

# Classic Logging • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Logging

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the new API see [Logging](typed/logging.html).

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Logging, you must at least use the Akka actors dependency in your project, and will most likely want to configure logging via the SLF4J module ([see below](logging.html#slf4j)).

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
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
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

| Project Info: Akka Logging (classic) | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-slf4j 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.slf4j |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.4\.0, 2015\-09\-30 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/event/slf4j/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Introduction

Logging in Akka is not tied to a specific logging backend. By default log messages are printed to STDOUT, but you can plug\-in a SLF4J logger or your own logger. Logging is performed asynchronously to ensure that logging has minimal performance impact. Logging generally means IO and locks, which can slow down the operations of your code if it was performed synchronously.

## How to Log

Create a [`LoggingAdapter`](https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter") and use the `error`, `warning`, `info`, or `debug` methods, as illustrated in this example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L13-L27 "Go to snippet source")import akka.event.Logging

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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L8-L11 "Go to snippet source")import akka.actor.*;
import akka.event.Logging;
import akka.event.LoggingAdapter;

```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L156-L181 "Go to snippet source")class MyActor extends AbstractActor {
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

The first parameter to [`Logging`](https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$.html#apply[T](bus:akka.event.LoggingBus,logSource:T)(implicitevidence$5:akka.event.LogSource[T]):akka.event.LoggingAdapter "akka.event.Logging") [`Logging.getLogger`](https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.html#getLogger(akka.event.LoggingBus,java.lang.Object) "akka.event.Logging") could also be any [`LoggingBus`](https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingBus.html "akka.event.LoggingBus")[`LoggingBus`](https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingBus.html "akka.event.LoggingBus"), specifically [`system.eventStream`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html#eventStream:akka.event.EventStream "akka.actor.ActorSystem") [`system.getEventStream()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html#getEventStream() "akka.actor.ActorSystem"). In the demonstrated case, the actor system’s address is included in the `akkaSource` representation of the log source (see [Logging Thread, Akka Source and Actor System in MDC](logging.html#logging-thread-akka-source-and-actor-system-in-mdc)), while in the second case this is not automatically done. The second parameter to `Logging` `Logging.getLogger` is the source of this logging channel. The source object is translated to a String according to the following rules:

- if it is an Actor or ActorRef, its path is used
- in case of a String it is used as is
- in case of a Class an approximation of its `simpleName` is used
- in all other cases a compile error occurs unless an implicit [`LogSource[T]`](https://doc.akka.io/api/akka-core/2.10/akka/event/LogSource.html "akka.event.LogSource") is in scope for the type in question the `simpleName` of its class is used

The log message may contain argument placeholders `{}`, which will be substituted if the log level is enabled. Compared to constructing a full string for the log message this has the advantage of avoiding superfluous string concatenation and object allocations when the log level is disabled. Giving more arguments than placeholders results in a warning being appended to the log statement (i.e. on the same line with the same severity). You may pass an array as the only substitution argument to have its elements be treated individually:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L208-L209 "Go to snippet source")val args = Array("The", "brown", "fox", "jumps", 42)
system.log.debug("five parameters: {}, {}, {}, {}, {}", args)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L149-L150 "Go to snippet source")final Object[] args = new Object[] {"The", "brown", "fox", "jumps", 42};
system.log().debug("five parameters: {}, {}, {}, {}, {}", args);
```

The Java [`Class`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html "java.lang.Class") of the log source is also included in the generated [`LogEvent`](https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEvent.html "akka.event.Logging.LogEvent")[`LogEvent`](https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.LogEvent.html "akka.event.Logging.LogEvent"). In case of a simple string this is replaced with a “marker” class [`DummyClassForStringSources`](https://doc.akka.io/api/akka-core/2.10/akka/event/DummyClassForStringSources.html "akka.event.DummyClassForStringSources")[`DummyClassForStringSources`](https://doc.akka.io/japi/akka-core/2.10/akka/event/DummyClassForStringSources.html "akka.event.DummyClassForStringSources") in order to allow special treatment of this case, e.g. in the SLF4J event listener which will then use the string instead of the class’ name for looking up the logger instance to use.

### Logging of Dead Letters

By default messages sent to dead letters are logged at `INFO` level. Existence of dead letters does not necessarily indicate a problem, but they are logged by default for the sake of caution. After a few messages this logging is turned off, to avoid flooding the logs. You can disable this logging completely or adjust how many dead letters are logged. During system shutdown it is likely that you see dead letters, since pending messages in the actor mailboxes are sent to dead letters. You can also disable logging of dead letters during shutdown.

```
akka {
  log-dead-letters = 10
  log-dead-letters-during-shutdown = on
}

```

To customize the logging further or take other actions for dead letters you can subscribe to the [Event Stream](event-bus.html#event-stream).

### Auxiliary logging options

Akka has a few configuration options for very low level debugging. These make more sense in development than in production.

You almost definitely need to have logging set to `DEBUG` to use any of the options below:

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

If you want very detailed logging of user\-level messages then wrap your actors’ behaviors with [`LoggingReceive`](https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingReceive.html "akka.event.LoggingReceive") and enable the `receive` option:

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

If you want very detailed logging of all lifecycle changes of Actors (restarts, deaths etc.):

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

If you want unhandled messages logged at `DEBUG`:

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

If you want to see all messages that are sent through remoting at `DEBUG` log level, use the following config option. Note that this logs the messages as they are sent by the transport layer, not by an actor.

```
akka.remote.artery {
  # If this is "on", Akka will log all outbound messages at DEBUG level,
  # if off then they are not logged
  log-sent-messages = on
}

```

If you want to see all messages that are received through remoting at `DEBUG` log level, use the following config option. Note that this logs the messages as they are received by the transport layer, not by an actor.

```
akka.remote.artery {
  # If this is "on", Akka will log all inbound messages at DEBUG level,
  # if off then they are not logged
  log-received-messages = on
}

```

Also see the [logging options for TestKit](testing.html#actor-logging).

### Translating Log Source to String and Class

The rules for translating the source object to the source string and class which are inserted into the [`LogEvent`](https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEvent.html "akka.event.Logging.LogEvent") during runtime are implemented using implicit parameters and thus fully customizable: create your own instance of [`LogSource[T]`](https://doc.akka.io/api/akka-core/2.10/akka/event/LogSource.html "akka.event.LogSource") and have it in scope when creating the logger.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L97-L112 "Go to snippet source")import akka.actor.ActorSystem
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

This example creates a log source which mimics traditional usage of Java loggers, which are based upon the originating object’s class name as log category. The override of [`getClazz`](https://doc.akka.io/api/akka-core/2.10/akka/event/LogSource.html#getClazz(t:T):Class[_] "akka.event.LogSource") is only included for demonstration purposes as it contains exactly the default behavior.

Note
You may also create the string representation up front and pass that in as the log source, but be aware that then the `Class[_]` which will be put in the [`LogEvent`](https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEvent.html "akka.event.Logging.LogEvent") is [`akka.event.DummyClassForStringSources`](https://doc.akka.io/api/akka-core/2.10/akka/event/DummyClassForStringSources.html "akka.event.DummyClassForStringSources").

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
The event handler actor does not have a bounded inbox and is run on the default dispatcher. This means that logging extreme amounts of data may affect your application badly. This can be somewhat mitigated by using an async logging backend though. (See [Using the SLF4J API directly](logging.html#slf4j-directly))

You can configure which event handlers are created at system start\-up and listen to logging events. That is done using the `loggers` element in the [configuration](general/configuration.html). Here you can also define the log level. More fine grained filtering based on the log source can be implemented in a custom [`LoggingFilter`](https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingFilter.html "akka.event.LoggingFilter")[`LoggingFilter`](https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingFilter.html "akka.event.LoggingFilter"), which can be defined in the `logging-filter` configuration property.

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

Note
If `akka-actor-typed` is available on your classpath, logging will automatically switch to [SLF4J](logging.html#slf4j) instead of the default logger. See the [Akka typed logging](typed/logging.html#event-bus) docs for more details.

Example of creating a listener:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L78-L93 "Go to snippet source")import akka.event.Logging.Debug
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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L8-L11 "Go to snippet source")import akka.actor.*;
import akka.event.Logging;
import akka.event.LoggingAdapter;

import akka.event.Logging.InitializeLogger;
import akka.event.Logging.Error;
import akka.event.Logging.Warning;
import akka.event.Logging.Info;
import akka.event.Logging.Debug;

```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L211-L242 "Go to snippet source")class MyEventListener extends AbstractActor {
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

Akka provides a logger for [SLF4J](https://www.slf4j.org/). This module is available in the ‘akka\-slf4j.jar’. It has a single dependency: the slf4j\-api jar. In your runtime, you also need a SLF4J backend. We recommend [Logback](https://logback.qos.ch/):

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.5.18"
)
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
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-slf4j_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.5.18</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-slf4j_${versions.ScalaBinary}"
  implementation "ch.qos.logback:logback-classic:1.5.18"
}
```

You need to enable the Slf4jLogger in the `loggers` element in the [configuration](general/configuration.html). Here you can also define the log level of the event bus. More fine grained log levels can be defined in the configuration of the SLF4J backend (e.g. logback.xml). You should also define [`Slf4jLoggingFilter`](https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Slf4jLoggingFilter.html "akka.event.slf4j.Slf4jLoggingFilter")[`Slf4jLoggingFilter`](https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Slf4jLoggingFilter.html "akka.event.slf4j.Slf4jLoggingFilter") in the `logging-filter` configuration property. It will filter the log events using the backend configuration (e.g. logback.xml) before they are published to the event bus.

Warning
If you set the `loglevel` to a higher level than `DEBUG`, any `DEBUG` events will be filtered out already at the source and will never reach the logging backend, regardless of how the backend is configured.

You can enable `DEBUG` level for `akka.loglevel` and control the actual level in the SLF4J backend without any significant overhead, also for production.

```
akka {
  loggers = ["akka.event.slf4j.Slf4jLogger"]
  loglevel = "DEBUG"
  logging-filter = "akka.event.slf4j.Slf4jLoggingFilter"
}

```

One gotcha is that the timestamp is attributed in the event handler, not when actually doing the logging.

The SLF4J logger selected for each log event is chosen based on the `Class[_]` `Class` of the log source specified when creating the [`LoggingAdapter`](https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter"), unless that was given directly as a string in which case that string is used (i.e. [`LoggerFactory.getLogger(c: Class[_ ])`](https://www.javadoc.io/doc/org.slf4j/slf4j-api/latest/org.slf4j/org/slf4j/LoggerFactory.html#getLogger(java.lang.Class) "org.slf4j.LoggerFactory") [`LoggerFactory.getLogger(Class c)`](https://www.javadoc.io/doc/org.slf4j/slf4j-api/latest/org.slf4j/org/slf4j/LoggerFactory.html#getLogger(java.lang.Class) "org.slf4j.LoggerFactory") is used in the first case and [`LoggerFactory.getLogger(s: String)`](https://www.javadoc.io/doc/org.slf4j/slf4j-api/latest/org.slf4j/org/slf4j/LoggerFactory.html#getLogger(java.lang.String) "org.slf4j.LoggerFactory") [`LoggerFactory.getLogger(String s)`](https://www.javadoc.io/doc/org.slf4j/slf4j-api/latest/org.slf4j/org/slf4j/LoggerFactory.html#getLogger(java.lang.String) "org.slf4j.LoggerFactory") in the second).

Note
Beware that the actor system’s name is appended to a [`String`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html "java.lang.String") log source if the LoggingAdapter was created giving an [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") to the factory. If this is not intended, give a [`LoggingBus`](https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingBus.html "akka.event.LoggingBus")[`LoggingBus`](https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingBus.html "akka.event.LoggingBus") instead as shown below:

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

This can be avoided by configuring the logging implementation to use a non\-blocking appender. Logback provides [AsyncAppender](https://logback.qos.ch/manual/appenders.html#AsyncAppender) that does this.

### Logback configuration

Logback has flexible configuration options and details can be found in the [Logback manual](https://logback.qos.ch/manual/configuration.html) and other external resources.

One part that is important to highlight is the importance of configuring an [AsyncAppender](https://logback.qos.ch/manual/appenders.html#AsyncAppender), because it offloads rendering of logging events to a background thread, increasing performance. It doesn’t block the threads of the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") while the underlying infrastructure writes the log messages to disk or other configured destination. It also contains a feature which will drop `INFO` and `DEBUG` messages if the logging load is high.

A starting point for configuration of `logback.xml` for production:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/resources/logback-doc-prod.xml "Go to snippet source")<?xml version="1.0" encoding="UTF-8"?>
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

    <!-- Give the async appender a chance to output all buffered log entries in the face of JVM shutdown -->
    <import class="ch.qos.logback.core.hook.DefaultShutdownHook"/>
    <shutdownHook class="DefaultShutdownHook"/>

    <root level="INFO">
        <appender-ref ref="ASYNC"/>
    </root>
</configuration>
```

For development you might want to log to standard out, but also have all `DEBUG` level logging to file, like in this example:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed-tests/src/test/resources/logback-doc-dev.xml "Go to snippet source")<?xml version="1.0" encoding="UTF-8"?>
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

MDC properties can be included in the Logback output with for example `%X{akkaSource}` specifier within the [pattern layout configuration](https://logback.qos.ch/manual/layouts.html#mdc):

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

### Logging Thread, Akka Source and Actor System in MDC

Since the logging is done asynchronously the thread in which the logging was performed is captured in Mapped Diagnostic Context (MDC) with attribute name `sourceThread`.

Note
It will probably be a good idea to use the `sourceThread` MDC value also in non\-Akka parts of the application in order to have this property consistently available in the logs.

Another helpful facility is that Akka captures the actor’s address when instantiating a logger within it, meaning that the full instance identification is available for associating log messages e.g. with members of a router. This information is available in the MDC with attribute name `akkaSource`.

The address of the actor system, containing host and port if the system is using cluster, is available through `akkaAddress`.

Finally, the actor system in which the logging was performed is available in the MDC with attribute name `sourceActorSystem`.

For more details on what this attribute contains—also for non\-actors—please see [How to Log](#how-to-log).

### More accurate timestamps for log output in MDC

Akka’s logging is asynchronous which means that the timestamp of a log entry is taken from when the underlying logger implementation is called, which can be surprising at first. If you want to more accurately output the timestamp, use the MDC attribute `akkaTimestamp`.

### MDC values defined by the application

One useful feature available in Slf4j is [MDC](https://logback.qos.ch/manual/mdc.html), Akka has a way to let the application specify custom values, for this you need to use a specialized [`LoggingAdapter`](https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter"), the [`DiagnosticLoggingAdapter`](https://doc.akka.io/api/akka-core/2.10/akka/event/DiagnosticLoggingAdapter.html "akka.event.DiagnosticLoggingAdapter")[`DiagnosticLoggingAdapter`](https://doc.akka.io/japi/akka-core/2.10/akka/event/DiagnosticLoggingAdapter.html "akka.event.DiagnosticLoggingAdapter"). In order to get it you can use the factory, providing an [`Actor`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor") [`AbstractActor`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.html "akka.actor.AbstractActor") as logSource:

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
The cleanup (removal) should be done in the actor at the end, otherwise, next message will log with same MDC values, if it is not set to a new map. Use [`log.clearMDC()`](https://doc.akka.io/api/akka-core/2.10/akka/event/DiagnosticLoggingAdapter.html#clearMDC():Unit "akka.event.DiagnosticLoggingAdapter")[`log.clearMDC()`](https://doc.akka.io/japi/akka-core/2.10/akka/event/DiagnosticLoggingAdapter.html#clearMDC() "akka.event.DiagnosticLoggingAdapter").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L38-L44 "Go to snippet source")val mdc = Map("requestId" -> 1234, "visitorId" -> 5678)
log.mdc(mdc)

// Log something
log.info("Starting new request")

log.clearMDC()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L29-L31 "Go to snippet source")import akka.event.DiagnosticLoggingAdapter;
import java.util.HashMap;
import java.util.Map;
```

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/event/LoggingDocTest.java#L185-L207 "Go to snippet source")class MdcActor extends AbstractActor {

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

For convenience, you can mix in the `log` member into actors, instead of defining it as above. This trait also lets you override [`mdc(msg: Any)`](https://doc.akka.io/api/akka-core/2.10/akka/actor/DiagnosticActorLogging.html#mdc(currentMessage:Any):akka.event.Logging.MDC "akka.actor.DiagnosticActorLogging") for specifying MDC values depending on current message and lets you forget about the cleanup as well, since it already does it for you.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/event/LoggingDocSpec.scala#L51-L74 "Go to snippet source")import Logging.MDC

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

All MDC properties as key\-value entries can be included with `%mdc`:

```
  <encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} - %msg MDC: {%mdc}%n</pattern>
  </encoder>

```

### Using Markers

Some logging libraries allow, in addition to MDC data, attaching so called “markers” to log statements. These are used to filter out rare and special events, for example you might want to mark logs that detect some malicious activity and mark them with a `SECURITY` tag, and in your appender configuration make these trigger emails and other notifications immediately.

Markers are available through the LoggingAdapters, when obtained via [`Logging.withMarker`](https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$.html#withMarker(logSource:akka.actor.Actor):akka.event.DiagnosticMarkerBusLoggingAdapter "akka.event.Logging")[`Logging.withMarker`](https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.html#withMarker(akka.actor.Actor) "akka.event.Logging"). The first argument passed into all log calls then should be a .

The slf4j bridge provided by Akka in `akka-slf4j` will automatically pick up this marker value and make it available to SLF4J.

Akka is logging some events with markers. Some of these events also include structured MDC properties. 

- The “SECURITY” marker is used for highlighting security related events or incidents.
- Akka Actor is using the markers defined in [`ActorLogMarker`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorLogMarker$.html "akka.actor.ActorLogMarker")[`ActorLogMarker`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogMarker.html "akka.actor.ActorLogMarker").
- Akka Cluster is using the markers defined in [`ClusterLogMarker`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterLogMarker$.html "akka.cluster.ClusterLogMarker")[`ClusterLogMarker`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterLogMarker.html "akka.cluster.ClusterLogMarker").
- Akka Remoting is using the markers defined in [`RemoteLogMarker`](https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteLogMarker$.html "akka.remote.RemoteLogMarker")[`RemoteLogMarker`](https://doc.akka.io/japi/akka-core/2.10/akka/remote/RemoteLogMarker.html "akka.remote.RemoteLogMarker").
- Akka Cluster Sharding is using the markers defined in [`ShardingLogMarker`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardingLogMarker$.html "akka.cluster.sharding.ShardingLogMarker")[`ShardingLogMarker`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardingLogMarker.html "akka.cluster.sharding.ShardingLogMarker").

Markers and MDC properties are automatically picked up by the [Logstash Logback encoder](https://github.com/logstash/logstash-logback-encoder).

The marker can be included in the Logback output with `%marker` and all MDC properties as key\-value entries with `%mdc`.

```
  <encoder>
    <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
  </encoder>

```

#### Using SLF4J’s Markers

It is also possible to use the [`org.slf4j.Marker`](https://www.javadoc.io/doc/org.slf4j/slf4j-api/latest/org.slf4j/org/slf4j/Marker.html "org.slf4j.Marker") with the [`LoggingAdapter`](https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter")[`LoggingAdapter`](https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html "akka.event.LoggingAdapter") when using slf4j.

Since the akka\-actor library avoids depending on any specific logging library, the support for this is included in `akka-slf4j`, which provides the [`Slf4jLogMarker`](https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Slf4jLogMarker.html "akka.event.slf4j.Slf4jLogMarker")[`Slf4jLogMarker`](https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Slf4jLogMarker.html "akka.event.slf4j.Slf4jLogMarker") type which can be passed in as first argument instead of the logging framework agnostic LogMarker type from `akka-actor`. The most notable difference between the two is that slf4j’s Markers can have child markers, so one can rely more information using them rather than just a single string.

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
```

### Example 2: Module info

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
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
akka.remote.artery {
  # If this is "on", Akka will log all outbound messages at DEBUG level,
  # if off then they are not logged
  log-sent-messages = on
}
```

### Example 20: Auxiliary remote logging options

```ruby
akka.remote.artery {
  # If this is "on", Akka will log all inbound messages at DEBUG level,
  # if off then they are not logged
  log-received-messages = on
}
```

### Example 21: Translating Log Source to String and Class

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

### Example 22: Turn Off Logging

```ruby
akka {
  stdout-loglevel = "OFF"
  loglevel = "OFF"
}
```

### Example 23: Loggers

```ruby
akka {
  # Loggers to register at boot time (akka.event.Logging$DefaultLogger logs
  # to STDOUT)
  loggers = ["akka.event.Logging$DefaultLogger"]
  # Options: OFF, ERROR, WARNING, INFO, DEBUG
  loglevel = "DEBUG"
}
```

### Example 24: Loggers

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

### Example 25: Loggers

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

### Example 26: Loggers

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

### Example 27: SLF4J

```scala
val AkkaVersion = "2.10.17"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.5.18"
)
```

### Example 28: SLF4J

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-slf4j_${scala.binary.version}</artifactId>
  </dependency&gt
  <dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.5.18</version>
  </dependency&gt
</dependencies>
```

### Example 29: SLF4J

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-slf4j_${versions.ScalaBinary}"
  implementation "ch.qos.logback:logback-classic:1.5.18"
}
```

### Example 30: SLF4J

```ruby
akka {
  loggers = ["akka.event.slf4j.Slf4jLogger"]
  loglevel = "DEBUG"
  logging-filter = "akka.event.slf4j.Slf4jLoggingFilter"
}
```

### Example 31: SLF4J

```scala
val log = Logging(system.eventStream, "my.nice.string")
```

### Example 32: SLF4J

```java
final LoggingAdapter log = Logging.getLogger(system.eventStream(), "my.string");
```

### Example 33: Logback configuration

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

    <!-- Give the async appender a chance to output all buffered log entries in the face of JVM shutdown -->
    <import class="ch.qos.logback.core.hook.DefaultShutdownHook"/>
    <shutdownHook class="DefaultShutdownHook"/>

    <root level="INFO">
        <appender-ref ref="ASYNC"/>
    </root>
</configuration>
```

### Example 34: Logback configuration

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

### Example 35: Logback configuration

```text
<encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} %X{akkaSource} - %msg%n</pattern>
  </encoder>
```

### Example 36: Logback configuration

```text
<encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} - %msg MDC: {%mdc}%n</pattern>
  </encoder>
```

### Example 37: MDC values defined by the application

```scala
// Within your Actor
val log: DiagnosticLoggingAdapter = Logging(this);
```

### Example 38: MDC values defined by the application

```java
// Within your AbstractActor
final DiagnosticLoggingAdapter log = Logging.getLogger(this);
```

### Example 39: MDC values defined by the application

```scala
val mdc = Map("requestId" -> 1234, "visitorId" -> 5678)
log.mdc(mdc)

// Log something
log.info("Starting new request")

log.clearMDC()
```

### Example 40: MDC values defined by the application

```java
import akka.event.DiagnosticLoggingAdapter;
import java.util.HashMap;
import java.util.Map;
```

### Example 41: MDC values defined by the application

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

### Example 42: MDC values defined by the application

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

### Example 43: MDC values defined by the application

```text
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
  <encoder>
    <pattern>
      %-5level %logger{36} [req: %X{requestId}, visitor: %X{visitorId}] - %msg%n
    </pattern>
  </encoder>
</appender>
```

### Example 44: MDC values defined by the application

```text
<encoder>
    <pattern>%date{ISO8601} %-5level %logger{36} - %msg MDC: {%mdc}%n</pattern>
  </encoder>
```

### Example 45: Using Markers

```text
<encoder>
    <pattern>[%date{ISO8601}] [%level] [%logger] [%marker] [%thread] - %msg MDC: {%mdc}%n</pattern>
  </encoder>
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/DiagnosticActorLogging.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/DummyClassForStringSources.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LogSource.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$$LogEvent.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/Logging$.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingBus.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingReceive.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Slf4jLogMarker.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/slf4j/Slf4jLoggingFilter.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/RemoteLogMarker$.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/slf4j/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogMarker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterLogMarker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardingLogMarker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/DiagnosticLoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/DummyClassForStringSources.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.LogEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/Logging.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingBus.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LoggingFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Slf4jLogMarker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/slf4j/Slf4jLoggingFilter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/RemoteLogMarker.html
- https://doc.akka.io/libraries/akka-core/current/event-bus.html
- https://doc.akka.io/libraries/akka-core/current/general/configuration.html
- https://doc.akka.io/libraries/akka-core/current/logging.html
- https://doc.akka.io/libraries/akka-core/current/project/links.html
- https://doc.akka.io/libraries/akka-core/current/scheduler.html
- https://doc.akka.io/libraries/akka-core/current/testing.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-core/current/typed/coexisting.html
- https://doc.akka.io/libraries/akka-core/current/typed/logging.html
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/logging.html](https://doc.akka.io/libraries/akka-core/current/logging.html)*