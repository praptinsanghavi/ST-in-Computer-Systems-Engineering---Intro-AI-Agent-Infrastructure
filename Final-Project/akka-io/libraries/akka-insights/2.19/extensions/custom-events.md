---
description: Telemetry for Lightbend Platform
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:23:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current//extensions/custom-events.html
title: Custom events • Akka Insights
---

# Custom events • Akka Insights

> **Summary:** Telemetry for Lightbend Platform

## Content

# Custom events

The [`custom events extension`](../reference/api/javadoc/?com/lightbend/cinnamon/akka/CinnamonEvents.html "com.lightbend.cinnamon.akka.CinnamonEvents") provides an API whereby a developer can create events for capturing arbitrary event data. The API also provides the ability to create the custom events at the *application level*, *system level*, or *actor level*. Please note that Akka Insights events use structured data, i.e. a map of key\-values pairs, rather than message\-based.

Why would one use custom events instead of a logging approach? One of the benefits of using the custom event approach is that it enables [flexible rate limiting](../instrumentations/metrics-and-events/metrics-and-events.html#rate-limit-events).

## Custom event log levels

Events can be created at three different log levels:

- Error
- Warning
- Info

The selected log level is used whenever the event is used and is selected via one of the methods:

- `createInfoEvent`
- `createWarningEvent`
- `createErrorEvent`

## Developer API

### Accessing CinnamonEvents

To start using the [`Cinnamon events API`](../reference/api/javadoc/?com/lightbend/cinnamon/akka/CinnamonEvents.html "com.lightbend.cinnamon.akka.CinnamonEvents") you will first want to import the `CinnamonEvents` and `CinnamonEvent` classes:

Scala

```
import com.lightbend.cinnamon.akka.{ CinnamonEvent, CinnamonEvents }

```

Java

```
import com.lightbend.cinnamon.akka.CinnamonEvents;
import com.lightbend.cinnamon.akka.CinnamonEvent;

```

### Accessing CinnamonEvents from Akka Typed

For Akka Typed, there is a separate extension that can be used with typed actor systems or actor contexts.

First add the Cinnamon Akka Typed module dependency to your build file:

sbt

```
libraryDependencies += Cinnamon.library.cinnamonAkkaTyped
```

Maven

```
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-typed_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

Gradle

```
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-typed_2.13', version: '2.19.4'
}
```

Then import the typed extension for `CinnamonEvents`:

Scala

```
import com.lightbend.cinnamon.akka.CinnamonEvent
import com.lightbend.cinnamon.akka.typed.CinnamonEvents
```

Java

```
import com.lightbend.cinnamon.akka.typed.CinnamonEvents;
import com.lightbend.cinnamon.akka.CinnamonEvent;
```

### Creating system level custom events

System level custom events provide an excellent way to capture events at the `ActorSystem` level. To create custom events at this level, you use `CinnamonEvents` with the `ActorSystem` and call the `createEvent` follows:

Scala

```
val systemLevelEvent: CinnamonEvent = CinnamonEvents(system).createWarningEvent("systemWarningLevelEvent")
```

Java

```
CinnamonEvent systemWarningLevelEvent =
    CinnamonEvents.get(getSystem()).createWarningEvent("systemWarningLevelEvent");

```

### Creating actor level custom events

Actor level custom events provide an excellent way to capture actor\-specific behavior as events. To create custom events at this level, you use `CinnamonEvents` with the `ActorContext` and call the `createEvent` follows:

Scala

```
val actorLevelEvent: CinnamonEvent = CinnamonEvents(context).createInfoEvent("actorInfoLevelEvent")
```

Java

```
CinnamonEvent actorInfoLevelEvent =
    CinnamonEvents.get(getContext()).createInfoEvent("actorInfoLevelEvent");

```

### Creating application level custom events

Application level custom events are associated with the application as a whole, rather than with the actor system. See [Cinnamon metadata](../plugins/plugins.html#cinnamon-metadata) for setting the application name. To create custom events at the application level, you first need to use the `CinnamonEvents` extension with the `ActorSystem` or with the `ActorContext`, and then access the application\-level metrics using the `eventsForApplication` method. You can then call the to create `createEvent` to custom application level events:

Scala

```
val appEvents = CinnamonEvents(system).eventsForApplication()
val applicationLevelEvent: CinnamonEvent = appEvents.createErrorEvent("applicationErrorLevelEvent")
```

Java

```
CinnamonEvents appEvents = CinnamonEvents.get(getSystem()).eventsForApplication();
CinnamonEvent applicationErrorLevelEvent =
    appEvents.createErrorEvent("applicationErrorLevelEvent");
```

### Using custom events

Using the custom events involves calling one of the methods supplied by the event class. The `actorLevelEvent` created above is used in this example to create events on the actor level:

Scala

```
actorLevelEvent.fire("key1" -> "value1", "key2" -> "value2")
```

Java

```
actorInfoLevelEvent.fireWithData("key1", "value1", "key2", "value2");
```

One can also use respective Maps for Java or Scala when invoking the `fire` method on an event. More information about the available methods can be found in the [`API documentation`](../reference/api/javadoc/?com/lightbend/cinnamon/akka/CinnamonEvents.html "com.lightbend.cinnamon.akka.CinnamonEvents").

### Destroying custom events

When finished with the event(s), you should call `destroy`. Calling `destroy` will, in turn, invoke the underlying event backend to run any cleanup tasks if required.

Scala

```
actorLevelEvent.destroy()
```

Java

```
actorInfoLevelEvent.destroy();
```

### Custom event example

Here is an example of an *actor\-level* custom event to log particular messages that an actor might receive.

```
import com.lightbend.cinnamon.akka.{ CinnamonEvent, CinnamonEvents }

case class EventIn(id: Long)
case class EventOut(id: Long)
case object EventDone

class CustomerEventActor extends Actor {
  val event: CinnamonEvent = CinnamonEvents(context).createInfoEvent("customerEvent")

  def receive: PartialFunction[Any, Unit] = {
    case EventIn(id) =>
      event.fire("InEventId" -> s"ID-$id")
      sender() ! EventIn(id)
    case EventOut(id) =>
      event.fire("OutEventId" -> s"ID-$id")
      sender() ! EventOut(id)
    case EventDone =>
      event.destroy()
      sender() ! EventDone
      context.stop(self)
  }
}
```

## Code Examples

### Example 1: Accessing CinnamonEvents

```scala
import com.lightbend.cinnamon.akka.{ CinnamonEvent, CinnamonEvents }
```

### Example 2: Accessing CinnamonEvents

```java
import com.lightbend.cinnamon.akka.CinnamonEvents;
import com.lightbend.cinnamon.akka.CinnamonEvent;
```

### Example 3: Accessing CinnamonEvents from Akka Typed

```sbt
libraryDependencies += Cinnamon.library.cinnamonAkkaTyped
```

### Example 4: Accessing CinnamonEvents from Akka Typed

```xml
<dependency>
  <groupId>com.lightbend.cinnamon</groupId>
  <artifactId>cinnamon-akka-typed_2.13</artifactId>
  <version>2.19.4</version>
</dependency>
```

### Example 5: Accessing CinnamonEvents from Akka Typed

```gradle
dependencies {
  implementation group: 'com.lightbend.cinnamon', name: 'cinnamon-akka-typed_2.13', version: '2.19.4'
}
```

### Example 6: Accessing CinnamonEvents from Akka Typed

```scala
import com.lightbend.cinnamon.akka.CinnamonEvent
import com.lightbend.cinnamon.akka.typed.CinnamonEvents
```

### Example 7: Accessing CinnamonEvents from Akka Typed

```java
import com.lightbend.cinnamon.akka.typed.CinnamonEvents;
import com.lightbend.cinnamon.akka.CinnamonEvent;
```

### Example 8: Creating system level custom events

```scala
val systemLevelEvent: CinnamonEvent = CinnamonEvents(system).createWarningEvent("systemWarningLevelEvent")
```

### Example 9: Creating system level custom events

```java
CinnamonEvent systemWarningLevelEvent =
    CinnamonEvents.get(getSystem()).createWarningEvent("systemWarningLevelEvent");
```

### Example 10: Creating actor level custom events

```scala
val actorLevelEvent: CinnamonEvent = CinnamonEvents(context).createInfoEvent("actorInfoLevelEvent")
```

### Example 11: Creating actor level custom events

```java
CinnamonEvent actorInfoLevelEvent =
    CinnamonEvents.get(getContext()).createInfoEvent("actorInfoLevelEvent");
```

### Example 12: Creating application level custom events

```scala
val appEvents = CinnamonEvents(system).eventsForApplication()
val applicationLevelEvent: CinnamonEvent = appEvents.createErrorEvent("applicationErrorLevelEvent")
```

### Example 13: Creating application level custom events

```java
CinnamonEvents appEvents = CinnamonEvents.get(getSystem()).eventsForApplication();
CinnamonEvent applicationErrorLevelEvent =
    appEvents.createErrorEvent("applicationErrorLevelEvent");
```

### Example 14: Using custom events

```scala
actorLevelEvent.fire("key1" -> "value1", "key2" -> "value2")
```

### Example 15: Using custom events

```java
actorInfoLevelEvent.fireWithData("key1", "value1", "key2", "value2");
```

### Example 16: Destroying custom events

```scala
actorLevelEvent.destroy()
```

### Example 17: Destroying custom events

```java
actorInfoLevelEvent.destroy();
```

### Example 18: Custom event example

```scala
import com.lightbend.cinnamon.akka.{ CinnamonEvent, CinnamonEvents }

case class EventIn(id: Long)
case class EventOut(id: Long)
case object EventDone

class CustomerEventActor extends Actor {
  val event: CinnamonEvent = CinnamonEvents(context).createInfoEvent("customerEvent")

  def receive: PartialFunction[Any, Unit] = {
    case EventIn(id) =>
      event.fire("InEventId" -> s"ID-$id")
      sender() ! EventIn(id)
    case EventOut(id) =>
      event.fire("OutEventId" -> s"ID-$id")
      sender() ! EventOut(id)
    case EventDone =>
      event.destroy()
      sender() ! EventDone
      context.stop(self)
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-insights/2.19/extensions/custom-metrics.html
- https://doc.akka.io/libraries/akka-insights/2.19/extensions/extensions.html
- https://doc.akka.io/libraries/akka-insights/2.19/instrumentations/metrics-and-events/metrics-and-events.html
- https://doc.akka.io/libraries/akka-insights/2.19/plugins/plugins.html
- https://doc.akka.io/libraries/akka-insights/2.19/reference/api/javadoc/?com/lightbend/cinnamon/akka/CinnamonEvents.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/2.19/extensions/custom-events.html](https://doc.akka.io/libraries/akka-insights/2.19/extensions/custom-events.html)*