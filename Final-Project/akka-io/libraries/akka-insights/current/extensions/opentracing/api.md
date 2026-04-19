---
description: Telemetry for Akka libraries
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-insights/current/home.html/extensions/opentracing/api.html
title: Cinnamon OpenTracing APIs • Akka Insights
---

# Cinnamon OpenTracing APIs • Akka Insights

> **Summary:** Telemetry for Akka libraries

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Cinnamon OpenTracing APIs

The OpenTracing integration includes APIs for attaching additional information to active trace spans, and works alongside direct use of the OpenTracing API.

## Active span

OpenTracing supports recording logs to a trace span and also attaching *baggage* to the trace context—key:value string pairs which are propagated with the trace, similar to a logging MDC. Cinnamon provides access to the currently active span and there are utility methods for logging and attaching baggage to this span.

### Span logs

Cinnamon includes utility methods for logging events or structured data to the currently active span.

The Cinnamon [`ActiveSpan`](../../reference/api/javadoc/?com/lightbend/cinnamon/opentracing/ActiveSpan.html "com.lightbend.cinnamon.opentracing.ActiveSpan") API can be imported with:

```
import com.lightbend.cinnamon.opentracing.ActiveSpan
```

You can log an event to the active span:

```
ActiveSpan.log("something")
```

You can log structured data (a Java `Map`) to the active span:

```
ActiveSpan.log(ImmutableMap.of("a", "one", "b", "two"))
```

### Trace baggage

Cinnamon includes utility methods for attaching *baggage* to the trace context—key:value string pairs which are propagated with the trace.

The Cinnamon [`ActiveSpan`](../../reference/api/javadoc/?com/lightbend/cinnamon/opentracing/ActiveSpan.html "com.lightbend.cinnamon.opentracing.ActiveSpan") API can be imported with:

```
import com.lightbend.cinnamon.opentracing.ActiveSpan
```

A *baggage item* (a key:value string pair) can be attached to the current trace:

```
ActiveSpan.setBaggageItem("token", "abc123")
```

Baggage items can also be accessed from anywhere deeper in a trace:

```
ActiveSpan.getBaggageItem("token")
```
Note
Baggage keys are case\-insensitive. This is aligned with case\-insensitive field names in HTTP headers.

Note
Baggage items are transferred throughout the trace, both locally and remotely, which can introduce some extra overhead.

### GlobalTracer active span

You can also access the currently active span through the `GlobalTracer` available in the [OpenTracing Java API](https://github.com/opentracing/opentracing-java), and then use the OpenTracing API directly to record logs or attach baggage. For example, you can log to the active span via the global tracer:

```
import io.opentracing.util.GlobalTracer

GlobalTracer.get.activeSpan.log("something")
```

### Context Only Spans

Cinnamon uses a custom implementation of Span to propagate context and make it available for the tracer in the absence of an active span. So if a new span is created, it will use the propagated SpanContext. It’s enabled by default, but some tracers (E.g. ElasticAPM, DataDog) don’t support it. It may lead to a class cast or other exceptions. In such cases context Only Spans can be disabled with: 

When context only spans are disabled, you might still need to use propagated SpanContext. This can be done via GlobalExtendedTracer. See the next section to see how to achieve it.

### GlobalExtendedTracer active context

Cinnamon propagates `SpanContext` and makes it available to the tracer by activating a context\-only span, but it’s not always possible because [some tracers don’t support a custom Span implementations](compatibility.html#opentracing-compatibility). In such cases you can access the current `SpanContext` via `GlobalExtendedTracer` in order to create a child span:

```
import io.opentracing.util.GlobalTracer
import cinnamon.opentracing.GlobalExtendedTracer

val parentContext = GlobalExtendedTracer.get.local().currentContext()
val span = GlobalTracer.get().buildSpan("child-span")
  .ignoreActiveSpan()
  .asChildOf(parentContext)
  .start()
```

## Custom spans

You can add custom trace spans using the [OpenTracing Java API](https://github.com/opentracing/opentracing-java). Cinnamon tracing is integrated with the `GlobalTracer` and active spans managed by the `ThreadLocalScopeManager`, both provided by the `opentracing-util` module.

The global tracer can be accessed with:

```
import io.opentracing.util.GlobalTracer

val tracer = GlobalTracer.get
```

You can create a custom span using the OpenTracing API:

```
val span = tracer.buildSpan("custom-span").start()
val scope = tracer.activateSpan(span)
// do some work within the scope of this active span ...
span.finish() // optionally pass in the span end timestamp (microseconds)
scope.close()
```

If there is anything asynchronous within the scope of a custom span, and which is instrumented by Cinnamon, then traces will be automatically connected to the custom spans.

It’s also possible to manually propagate traces across process boundaries using the OpenTracing APIs for [injecting and extracting](https://opentracing.io/guides/java/inject-extract/) trace contexts.

Note that to create custom spans that will connect to Akka Stream operators, you need to scope over the actual downstream push to a stage, which requires a custom stream stage. As an example, if there was a message service (not instrumented by Cinnamon automatically) where the consumer was an Akka Stream, it’s possible to use the OpenTracing APIs to inject and extract trace contexts into any messages that support *headers*, and to scope any downstream operators with a custom trace span using a custom stream stage. Here’s a complete example of doing this:

```
import akka.stream._
import akka.stream.scaladsl._
import akka.stream.stage.{ GraphStage, GraphStageLogic, InHandler, OutHandler }
import com.lightbend.cinnamon.akka.stream.CinnamonAttributes._
import io.opentracing.propagation.{ Format, TextMapAdapter }
import io.opentracing.util.GlobalTracer
import io.opentracing.{ Scope, SpanContext, Tracer }
import java.util.{ HashMap => JHashMap, Map => JMap }
import scala.jdk.CollectionConverters._

// demo message type with headers for context
case class Message[T](headers: Map[String, String], payload: T)

// access the global tracer
val tracer: Tracer = GlobalTracer.get

// start trace span on the producer side
val producerSpan: Span = tracer
  .buildSpan("producer")
  .start()

val producerScope: Scope = tracer
  .activateSpan(producerSpan)

// access the currently active context when sending a message
val producerContext: SpanContext = tracer.activeSpan().context()

// inject the headers for the parent context into a text map
val contextHeaders: JMap[String, String] = new JHashMap[String, String]()
tracer.inject(
  producerContext,
  Format.Builtin.TEXT_MAP,
  new TextMapAdapter(contextHeaders))

// store the trace headers in the message
val message = Message(contextHeaders.asScala.toMap, "some payload")

// finish the span to record its duration/end timestamp
producerSpan.finish()

// close the trace scope for the producer (and deactivate the trace span)
producerScope.close()

// custom stream stage so we can wrap the downstream `push` of the message payload with traced scope
class Extract[T] extends GraphStage[FlowShape[Message[T], T]] {
  val in = Inlet[Message[T]]("extract.in")
  val out = Outlet[T]("extract.out")
  override val shape = FlowShape(in, out)

  override def initialAttributes: Attributes = Attributes.name("extract")

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic =
    new GraphStageLogic(shape) with InHandler with OutHandler {
      override def onPush(): Unit = {
        val message = grab(in)
        // extract the trace context from the message headers
        val context: SpanContext = tracer.extract(
          Format.Builtin.TEXT_MAP,
          new TextMapAdapter(message.headers.asJava))
        // use the context as a parent reference for a consumer trace span
        val consumerSpan: Span = tracer
          .buildSpan("consumer")
          .asChildOf(context)
          .start()

        val consumerScope: Scope = tracer
          .activateSpan(consumerSpan)
        // push the message payload downstream scoped by the connected trace span
        push(out, message.payload)
        // finish the consumer span
        consumerSpan.finish()
        // close the trace scope for the consumer (and deactivate the trace span)
        consumerScope.close()
      }

      override def onPull(): Unit = pull(in)

      setHandlers(in, out, this)
    }
}

// imagine the message is actually transferred via some message service...
Source.single(message)
  .via(new Extract[String])
  .map(_.toUpperCase)
  .to(Sink.ignore)
  .instrumented(name = "sample", traceable = true)
  .run()
```

## Code Examples

### Example 1: Span logs

```scala
import com.lightbend.cinnamon.opentracing.ActiveSpan
```

### Example 2: Span logs

```scala
ActiveSpan.log("something")
```

### Example 3: Span logs

```scala
ActiveSpan.log(ImmutableMap.of("a", "one", "b", "two"))
```

### Example 4: Trace baggage

```scala
import com.lightbend.cinnamon.opentracing.ActiveSpan
```

### Example 5: Trace baggage

```scala
ActiveSpan.setBaggageItem("token", "abc123")
```

### Example 6: Trace baggage

```scala
ActiveSpan.getBaggageItem("token")
```

### Example 7: GlobalTracer active span

```scala
import io.opentracing.util.GlobalTracer

GlobalTracer.get.activeSpan.log("something")
```

### Example 8: GlobalExtendedTracer active context

```scala
import io.opentracing.util.GlobalTracer
import cinnamon.opentracing.GlobalExtendedTracer

val parentContext = GlobalExtendedTracer.get.local().currentContext()
val span = GlobalTracer.get().buildSpan("child-span")
  .ignoreActiveSpan()
  .asChildOf(parentContext)
  .start()
```

### Example 9: Custom spans

```scala
import io.opentracing.util.GlobalTracer

val tracer = GlobalTracer.get
```

### Example 10: Custom spans

```scala
val span = tracer.buildSpan("custom-span").start()
val scope = tracer.activateSpan(span)
// do some work within the scope of this active span ...
span.finish() // optionally pass in the span end timestamp (microseconds)
scope.close()
```

### Example 11: Custom spans

```scala
import akka.stream._
import akka.stream.scaladsl._
import akka.stream.stage.{ GraphStage, GraphStageLogic, InHandler, OutHandler }
import com.lightbend.cinnamon.akka.stream.CinnamonAttributes._
import io.opentracing.propagation.{ Format, TextMapAdapter }
import io.opentracing.util.GlobalTracer
import io.opentracing.{ Scope, SpanContext, Tracer }
import java.util.{ HashMap => JHashMap, Map => JMap }
import scala.jdk.CollectionConverters._

// demo message type with headers for context
case class Message[T](headers: Map[String, String], payload: T)

// access the global tracer
val tracer: Tracer = GlobalTracer.get

// start trace span on the producer side
val producerSpan: Span = tracer
  .buildSpan("producer")
  .start()

val producerScope: Scope = tracer
  .activateSpan(producerSpan)

// access the currently active context when sending a message
val producerContext: SpanContext = tracer.activeSpan().context()

// inject the headers for the parent context into a text map
val contextHeaders: JMap[String, String] = new JHashMap[String, String]()
tracer.inject(
  producerContext,
  Format.Builtin.TEXT_MAP,
  new TextMapAdapter(contextHeaders))

// store the trace headers in the message
val message = Message(contextHeaders.asScala.toMap, "some payload")

// finish the span to record its duration/end timestamp
producerSpan.finish()

// close the trace scope for the producer (and deactivate the trace span)
producerScope.close()

// custom stream stage so we can wrap the downstream `push` of the message payload with traced scope
class Extract[T] extends GraphStage[FlowShape[Message[T], T]] {
  val in = Inlet[Message[T]]("extract.in")
  val out = Outlet[T]("extract.out")
  override val shape = FlowShape(in, out)

  override def initialAttributes: Attributes = Attributes.name("extract")

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic =
    new GraphStageLogic(shape) with InHandler with OutHandler {
      override def onPush(): Unit = {
        val message = grab(in)
        // extract the trace context from the message headers
        val context: SpanContext = tracer.extract(
          Format.Builtin.TEXT_MAP,
          new TextMapAdapter(message.headers.asJava))
        // use the context as a parent reference for a consumer trace span
        val consumerSpan: Span = tracer
          .buildSpan("consumer")
          .asChildOf(context)
          .start()

        val consumerScope: Scope = tracer
          .activateSpan(consumerSpan)
        // push the message payload downstream scoped by the connected trace span
        push(out, message.payload)
        // finish the consumer span
        consumerSpan.finish()
        // close the trace scope for the consumer (and deactivate the trace span)
        consumerScope.close()
      }

      override def onPull(): Unit = pull(in)

      setHandlers(in, out, this)
    }
}

// imagine the message is actually transferred via some message service...
Source.single(message)
  .via(new Extract[String])
  .map(_.toUpperCase)
  .to(Sink.ignore)
  .instrumented(name = "sample", traceable = true)
  .run()
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-insights/current/extensions/opentracing/backends.html
- https://doc.akka.io/libraries/akka-insights/current/extensions/opentracing/compatibility.html
- https://doc.akka.io/libraries/akka-insights/current/extensions/opentracing/enabling.html
- https://doc.akka.io/libraries/akka-insights/current/reference/api/javadoc/?com/lightbend/cinnamon/opentracing/ActiveSpan.html

---
*Source: [https://doc.akka.io/libraries/akka-insights/current/extensions/opentracing/api.html](https://doc.akka.io/libraries/akka-insights/current/extensions/opentracing/api.html)*