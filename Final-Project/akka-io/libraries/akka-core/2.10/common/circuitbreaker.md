---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/common/circuitbreaker.html
title: Circuit Breaker • Akka core
---

# Circuit Breaker • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Circuit Breaker

## Why are they used?

A circuit breaker is used to provide stability and prevent cascading failures in distributed systems. These should be used in conjunction with judicious timeouts at the interfaces between remote systems to prevent the failure of a single component from bringing down all components.

As an example, we have a web application interacting with a remote third party web service.  
Let’s say the third party has oversold their capacity and their database melts down under load.  
Assume that the database fails in such a way that it takes a very long time to hand back an error to the third party web service. This in turn makes calls fail after a long period of time. Back to our web application, the users have noticed that their form submissions take much longer seeming to hang. Well the users do what they know to do which is use the refresh button, adding more requests to their already running requests. This eventually causes the failure of the web application due to resource exhaustion. This will affect all users, even those who are not using functionality dependent on this third party web service.

Introducing circuit breakers on the web service call would cause the requests to begin to fail\-fast, letting the user know that something is wrong and that they need not refresh their request. This also confines the failure behavior to only those users that are using functionality dependent on the third party, other users are no longer affected as there is no resource exhaustion. Circuit breakers can also allow savvy developers to mark portions of the site that use the functionality unavailable, or perhaps show some cached content as appropriate while the breaker is open.

The Akka library provides an implementation of a circuit breaker called [`CircuitBreaker`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker")[`CircuitBreaker`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker") which has the behavior described below.

## What do they do?

- During normal operation, a circuit breaker is in the *Closed* state:

	- Exceptions or calls exceeding the configured *callTimeout* increment a failure counter
	- Successes reset the failure count to zero
	- When the failure counter reaches a *maxFailures* count, the breaker is tripped into *Open* state
- While in *Open* state:

	- All calls fail\-fast with a [`CircuitBreakerOpenException`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreakerOpenException.html "akka.pattern.CircuitBreakerOpenException")[`CircuitBreakerOpenException`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreakerOpenException.html "akka.pattern.CircuitBreakerOpenException")
	- After the configured *resetTimeout*, the circuit breaker enters a *Half\-Open* state
- In *Half\-Open* state:

	- The first call attempted is allowed through without failing fast
	- All other calls fail\-fast with an exception just as in *Open* state
	- If the first call succeeds, the breaker is reset back to *Closed* state and the *resetTimeout* is reset
	- If the first call fails, the breaker is tripped again into the *Open* state (as for exponential backoff circuit breaker, the *resetTimeout* is multiplied by the exponential backoff factor)
- State transition listeners:

	- Callbacks can be provided for every state entry via [`onOpen`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#onOpen(callback:=%3EUnit):akka.pattern.CircuitBreaker "akka.pattern.CircuitBreaker")[`onOpen`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#addOnOpenListener(java.lang.Runnable) "akka.pattern.CircuitBreaker"), [`onClose`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#onClose(callback:=%3EUnit):akka.pattern.CircuitBreaker "akka.pattern.CircuitBreaker")[`onClose`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#addOnCloseListener(java.lang.Runnable) "akka.pattern.CircuitBreaker"), and [`onHalfOpen`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#onHalfOpen(callback:=%3EUnit):akka.pattern.CircuitBreaker "akka.pattern.CircuitBreaker")[`onHalfOpen`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#addOnHalfOpenListener(java.lang.Runnable) "akka.pattern.CircuitBreaker")
	- These are executed in the [`ExecutionContext`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html "scala.concurrent.ExecutionContext") provided.
- Calls result listeners:

	- Callbacks can be used eg. to collect statistics about all invocations or to react on specific call results like success, failures or timeouts.
	- Supported callbacks are: [`onCallSuccess`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#onCallSuccess(callback:Long=%3EUnit):akka.pattern.CircuitBreaker "akka.pattern.CircuitBreaker")[`onCallSuccess`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#addOnCallSuccessListener(java.util.function.Consumer) "akka.pattern.CircuitBreaker"), [`onCallFailure`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#onCallFailure(callback:Long=%3EUnit):akka.pattern.CircuitBreaker "akka.pattern.CircuitBreaker")[`onCallFailure`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#addOnCallFailureListener(java.util.function.Consumer) "akka.pattern.CircuitBreaker"), [`onCallTimeout`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#onCallTimeout(callback:Long=%3EUnit):akka.pattern.CircuitBreaker "akka.pattern.CircuitBreaker")[`onCallTimeout`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#addOnCallTimeoutListener(java.util.function.Consumer) "akka.pattern.CircuitBreaker"), [`onCallBreakerOpen`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#onCallBreakerOpen(callback:=%3EUnit):akka.pattern.CircuitBreaker "akka.pattern.CircuitBreaker")[`onCallBreakerOpen`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#addOnCallBreakerOpenListener(java.lang.Runnable) "akka.pattern.CircuitBreaker").
	- These are executed in the [`ExecutionContext`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html "scala.concurrent.ExecutionContext") provided.

![circuit-breaker-states.png](../images/circuit-breaker-states.png)

## Examples

### Initialization

Here’s how a named [`CircuitBreaker`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker")[`CircuitBreaker`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker") is configured with the name `data-access`:

- 5 maximum failures
- a call timeout of 10 seconds
- a reset timeout of 1 minute

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/circuitbreaker/CircuitBreakerDocSpec.scala#L29-L33 "Go to snippet source")akka.circuit-breaker.data-access {
  max-failures = 5
  call-timeout = 10s
  reset-timeout = 1m
}
```

The circuit breaker is created on first access with the same name, subsequent lookups will return the same circuit breaker instance. Looking up the circuit breaker and using it looks like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/circuitbreaker/CircuitBreakerDocSpec.scala#L53 "Go to snippet source")val circuitBreaker = CircuitBreaker("data-access")(context.system)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/circuitbreaker/CircuitBreakerDocTest.java#L74-L75 "Go to snippet source")CircuitBreaker circuitBreaker =
    CircuitBreaker.lookup("data-access", context.getSystem());
```

### Future \& Synchronous based API

Once a circuit breaker actor has been initialized, interacting with that actor is done by either using the Future based API or the synchronous API. Both of these APIs are considered `Call Protection` because whether synchronously or asynchronously, the purpose of the circuit breaker is to protect your system from cascading failures while making a call to another service. 

In the future based API, we use the [`withCircuitBreaker`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#withCircuitBreaker[T](body:=%3Escala.concurrent.Future[T]):scala.concurrent.Future[T] "akka.pattern.CircuitBreaker")[`callWithCircuitBreakerCS`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#callWithCircuitBreakerCS(java.util.concurrent.Callable) "akka.pattern.CircuitBreaker") which takes an asynchronous method (some method wrapped in a [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletionState`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage")), for instance a call to retrieve data from a service, and we pipe the result back to the sender. If for some reason the service in this example isn’t responding, or there is another issue, the circuit breaker will open and stop trying to hit the service again and again until the timeout is reached.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/circuitbreaker/CircuitBreakerDocSpec.scala#L61-L89 "Go to snippet source")class DataAccess(
    context: ActorContext[DataAccess.Command],
    id: String,
    service: ThirdPartyWebService,
    circuitBreaker: CircuitBreaker) {
  import DataAccess._

  private def active(): Behavior[Command] = {
    Behaviors.receiveMessagePartial {
      case Handle(value, replyTo) =>
        val futureResult: Future[Done] = circuitBreaker.withCircuitBreaker {
          service.call(id, value)
        }
        context.pipeToSelf(futureResult) {
          case Success(_)         => HandleSuceeded(replyTo)
          case Failure(exception) => HandleFailed(replyTo, exception)
        }
        Behaviors.same
      case HandleSuceeded(replyTo) =>
        replyTo ! StatusReply.Ack
        Behaviors.same
      case HandleFailed(replyTo, exception) =>
        context.log.warn("Failed to call web service", exception)
        replyTo ! StatusReply.error("Dependency service not available")
        Behaviors.same
    }

  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/circuitbreaker/CircuitBreakerDocTest.java#L30-L143 "Go to snippet source")class DataAccess extends AbstractBehavior<DataAccess.Command> {

  public interface Command {}

  public static class Handle implements Command {
    final String value;
    final ActorRef<StatusReply<Done>> replyTo;

    public Handle(String value, ActorRef<StatusReply<Done>> replyTo) {
      this.value = value;
      this.replyTo = replyTo;
    }
  }

  private final class HandleFailed implements Command {
    final Throwable failure;
    final ActorRef<StatusReply<Done>> replyTo;

    public HandleFailed(Throwable failure, ActorRef<StatusReply<Done>> replyTo) {
      this.failure = failure;
      this.replyTo = replyTo;
    }
  }

  private final class HandleSuceeded implements Command {
    final ActorRef<StatusReply<Done>> replyTo;

    public HandleSuceeded(ActorRef<StatusReply<Done>> replyTo) {
      this.replyTo = replyTo;
    }
  }

  private final class CircuitBreakerStateChange implements Command {
    final String newState;

    public CircuitBreakerStateChange(String newState) {
      this.newState = newState;
    }
  }

  public static Behavior<Command> create(String id, ThirdPartyWebService service) {
    return Behaviors.setup(
        context -> {
          CircuitBreaker circuitBreaker =
              CircuitBreaker.lookup("data-access", context.getSystem());
          return new DataAccess(context, id, service, circuitBreaker);
        });
  }

  private final String id;
  private final ThirdPartyWebService service;
  private final CircuitBreaker circuitBreaker;

  public DataAccess(
      ActorContext<Command> context,
      String id,
      ThirdPartyWebService service,
      CircuitBreaker circuitBreaker) {
    super(context);
    this.id = id;
    this.service = service;
    this.circuitBreaker = circuitBreaker;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Handle.class, this::onHandle)
        .onMessage(HandleSuceeded.class, this::onHandleSucceeded)
        .onMessage(HandleFailed.class, this::onHandleFailed)
        .build();
  }

  private Behavior<Command> onHandle(Handle handle) {
    CompletionStage<Done> futureResult =
        circuitBreaker.callWithCircuitBreakerCS(() -> service.call(id, handle.value));
    getContext()
        .pipeToSelf(
            futureResult,
            (done, throwable) -> {
              if (throwable != null) {
                return new HandleFailed(throwable, handle.replyTo);
              } else {
                return new HandleSuceeded(handle.replyTo);
              }
            });
    return this;
  }

  private Behavior<Command> onHandleSucceeded(HandleSuceeded handleSuceeded) {
    handleSuceeded.replyTo.tell(StatusReply.ack());
    return this;
  }

  private Behavior<Command> onHandleFailed(HandleFailed handleFailed) {
    getContext().getLog().warn("Failed to call web service", handleFailed.failure);
    handleFailed.replyTo.tell(StatusReply.error("Dependency service not available"));
    return this;
  }

}
```

The Synchronous API would also wrap your call with the circuit breaker logic, however, it uses the [`withSyncCircuitBreaker`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#withSyncCircuitBreaker[T](body:=%3ET):T "akka.pattern.CircuitBreaker")[`callWithSyncCircuitBreaker`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#callWithSyncCircuitBreaker(java.util.concurrent.Callable) "akka.pattern.CircuitBreaker") and receives a method that is not wrapped in a `Future``CompletionState`.

The `CircuitBreaker` will execute all callbacks on the default system dispatcher.

### Control failure count explicitly

By default, the circuit breaker treats [`Exception`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html "java.lang.Exception") as failure in synchronized API, or failed [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletionState`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") as failure in future based API. On failure, the failure count will increment. If the failure count reaches the *maxFailures*, the circuit breaker will be opened. However, some applications may require certain exceptions to not increase the failure count. In other cases one may want to increase the failure count even if the call succeeded. Akka circuit breaker provides a way to achieve such use cases: [`withCircuitBreaker`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#withCircuitBreaker[T](body:=%3Escala.concurrent.Future[T],defineFailureFn:scala.util.Try[T]=%3EBoolean):scala.concurrent.Future[T] "akka.pattern.CircuitBreaker") and [`withSyncCircuitBreaker`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#withSyncCircuitBreaker[T](body:=%3ET,defineFailureFn:scala.util.Try[T]=%3EBoolean):T "akka.pattern.CircuitBreaker")[`callWithCircuitBreaker`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#callWithCircuitBreaker(java.util.concurrent.Callable,java.util.function.BiFunction) "akka.pattern.CircuitBreaker"), [`callWithSyncCircuitBreaker`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#callWithSyncCircuitBreaker(java.util.concurrent.Callable,java.util.function.BiFunction) "akka.pattern.CircuitBreaker") and [`callWithCircuitBreakerCS`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#callWithCircuitBreakerCS(java.util.concurrent.Callable,java.util.function.BiFunction) "akka.pattern.CircuitBreaker").

All methods above accept an argument `defineFailureFn`

Type of `defineFailureFn`: [`Try[T]`](http://www.scala-lang.org/api/2.13.17/scala/util/Try.html "scala.util.Try") \=\> [`Boolean`](http://www.scala-lang.org/api/2.13.17/scala/Boolean.html "scala.Boolean")[`BiFunction`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html "java.util.function.BiFunction")\[[`Optional[T]`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html "java.util.Optional"), [`Optional`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html "java.util.Optional")\[[`Throwable`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html "java.lang.Throwable")], [`Boolean`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Boolean.html "java.lang.Boolean")]

This is a function which takes in a [`Try[T]`](http://www.scala-lang.org/api/2.13.17/scala/util/Try.html "scala.util.Try") and returns a [`Boolean`](http://www.scala-lang.org/api/2.13.17/scala/Boolean.html "scala.Boolean"). The [`Try[T]`](http://www.scala-lang.org/api/2.13.17/scala/util/Try.html "scala.util.Try") correspond to the [`Future[T]`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future") of the protected call. The response of a protected call is modelled using [`Optional[T]`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html "java.util.Optional") for a successful return value and [`Optional`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html "java.util.Optional")\[[`Throwable`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html "java.lang.Throwable")] for exceptions. This function should return `true` if the result of a call should increase the failure count, or `false` to not affect the count.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/circuitbreaker/CircuitBreakerDocSpec.scala#L98-L107 "Go to snippet source")  
val evenNumberAsFailure: Try[Int] => Boolean = {
  case Success(n) => n % 2 == 0
  case Failure(_) => true
}

val breaker = CircuitBreaker("dangerous-breaker")

// this call will return 8888 and increase failure count at the same time
breaker.withCircuitBreaker(Future(8888), evenNumberAsFailure)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/circuitbreaker/CircuitBreakerDocTest.java#L135-L139 "Go to snippet source")BiFunction<Optional<Integer>, Optional<Throwable>, Boolean> evenNoAsFailure =
    (result, err) -> (result.isPresent() && result.get() % 2 == 0);

// this will return 8888 and increase failure count at the same time
return circuitBreaker.callWithSyncCircuitBreaker(() -> 8888, evenNoAsFailure);
```

### Low level API

Instead of looking up a configured circuit breaker by name, it is also possible to construct it in the source code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/circuitbreaker/CircuitBreakerDocSpec.scala#L129-L135 "Go to snippet source")import akka.actor.typed.scaladsl.adapter._
val breaker =
  new CircuitBreaker(
    context.system.scheduler.toClassic,
    maxFailures = 5,
    callTimeout = 10.seconds,
    resetTimeout = 1.minute).onOpen(context.self ! BreakerOpen)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/circuitbreaker/CircuitBreakerDocTest.java#L197-L206 "Go to snippet source")breaker =
    CircuitBreaker.create(
            getContext().getSystem().classicSystem().getScheduler(),
            // maxFailures
            5,
            // callTimeout
            Duration.ofSeconds(10),
            // resetTimeout
            Duration.ofMinutes(1))
        .addOnOpenListener(() -> context.getSelf().tell(new BreakerOpen()));
```

This also allows for creating the circuit breaker with a specific execution context to run its callbacks on.

The low\-level API allows you to describe the behavior of the [`CircuitBreaker`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker")[`CircuitBreaker`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker") in detail, including deciding what to return to the calling [`Actor`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor")[`Actor`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor") in case of success or failure. This is especially useful when expecting the remote call to send a reply. [`CircuitBreaker`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker")[`CircuitBreaker`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker") doesn’t support `Tell Protection` (protecting against calls that expect a reply) natively at the moment. Thus, you need to use the low\-level power\-user APIs, [`succeed`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#succeed():Unit "akka.pattern.CircuitBreaker")[`succeed`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#succeed() "akka.pattern.CircuitBreaker") and [`fail`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#fail():Unit "akka.pattern.CircuitBreaker")[`fail`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#fail() "akka.pattern.CircuitBreaker") methods, as well as [`isClosed`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#isClosed:Boolean "akka.pattern.CircuitBreaker")[`isClosed`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#isClosed() "akka.pattern.CircuitBreaker"), [`isOpen`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#isOpen:Boolean "akka.pattern.CircuitBreaker")[`isOpen`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#isOpen() "akka.pattern.CircuitBreaker"), [`isHalfOpen`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#isHalfOpen:Boolean "akka.pattern.CircuitBreaker")[`isHalfOpen`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#isHalfOpen() "akka.pattern.CircuitBreaker") to implement it.

As can be seen in the examples below, a `Tell Protection` pattern could be implemented by using the [`succeed`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#succeed():Unit "akka.pattern.CircuitBreaker")[`succeed`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#succeed() "akka.pattern.CircuitBreaker") and [`fail`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#fail():Unit "akka.pattern.CircuitBreaker")[`fail`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#fail() "akka.pattern.CircuitBreaker") methods, which would count towards the [`CircuitBreaker`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker")[`CircuitBreaker`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker") counts. In the example, a call is made to the remote service if the breaker is closed or half open. Once a response is received, the [`succeed`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#succeed():Unit "akka.pattern.CircuitBreaker")[`succeed`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#succeed() "akka.pattern.CircuitBreaker") method is invoked, which tells the [`CircuitBreaker`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker")[`CircuitBreaker`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html "akka.pattern.CircuitBreaker") to keep the breaker closed. On the other hand, if an error or timeout is received we trigger a [`fail`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html#fail():Unit "akka.pattern.CircuitBreaker")[`fail`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html#fail() "akka.pattern.CircuitBreaker"), and the breaker accrues this failure towards its count for opening the breaker.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/circuitbreaker/CircuitBreakerDocSpec.scala#L118-L156 "Go to snippet source")object CircuitBreakingIntermediateActor {
  sealed trait Command
  case class Call(payload: String, replyTo: ActorRef[StatusReply[Done]]) extends Command
  private case class OtherActorReply(reply: Try[Done], originalReplyTo: ActorRef[StatusReply[Done]]) extends Command
  private case object BreakerOpen extends Command

  def apply(recipient: ActorRef[OtherActor.Command]): Behavior[Command] =
    Behaviors.setup { context =>
      implicit val askTimeout: Timeout = 11.seconds
      import context.executionContext
      import akka.actor.typed.scaladsl.adapter._
      val breaker =
        new CircuitBreaker(
          context.system.scheduler.toClassic,
          maxFailures = 5,
          callTimeout = 10.seconds,
          resetTimeout = 1.minute).onOpen(context.self ! BreakerOpen)

      Behaviors.receiveMessage {
        case Call(payload, replyTo) =>
          if (breaker.isClosed || breaker.isHalfOpen) {
            context.askWithStatus(recipient, OtherActor.Call(payload, _))(OtherActorReply(_, replyTo))
          } else {
            replyTo ! StatusReply.error("Service unavailable")
          }
          Behaviors.same
        case OtherActorReply(reply, originalReplyTo) =>
          if (reply.isSuccess) breaker.succeed()
          else breaker.fail()
          originalReplyTo ! StatusReply.fromTry(reply)
          Behaviors.same
        case BreakerOpen =>
          context.log.warn("Circuit breaker open")
          Behaviors.same
      }
    }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/circuitbreaker/CircuitBreakerDocTest.java#L161-L250 "Go to snippet source")static class CircuitBreakingIntermediateActor
    extends AbstractBehavior<CircuitBreakingIntermediateActor.Command> {

  public interface Command {}

  public static class Call implements Command {
    final String payload;
    final ActorRef<StatusReply<Done>> replyTo;

    public Call(String payload, ActorRef<StatusReply<Done>> replyTo) {
      this.payload = payload;
      this.replyTo = replyTo;
    }
  }

  private class OtherActorReply implements Command {
    final Optional<Throwable> failure;
    final ActorRef<StatusReply<Done>> originalReplyTo;

    public OtherActorReply(
        Optional<Throwable> failure, ActorRef<StatusReply<Done>> originalReplyTo) {
      this.failure = failure;
      this.originalReplyTo = originalReplyTo;
    }
  }

  private class BreakerOpen implements Command {}

  private final ActorRef<OtherActor.Command> target;
  private final CircuitBreaker breaker;

  public CircuitBreakingIntermediateActor(
      ActorContext<Command> context, ActorRef<OtherActor.Command> targetActor) {
    super(context);
    this.target = targetActor;
    breaker =
        CircuitBreaker.create(
                getContext().getSystem().classicSystem().getScheduler(),
                // maxFailures
                5,
                // callTimeout
                Duration.ofSeconds(10),
                // resetTimeout
                Duration.ofMinutes(1))
            .addOnOpenListener(() -> context.getSelf().tell(new BreakerOpen()));
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Call.class, this::onCall)
        .onMessage(OtherActorReply.class, this::onOtherActorReply)
        .onMessage(BreakerOpen.class, this::breakerOpened)
        .build();
  }

  private Behavior<Command> onCall(Call call) {
    if (breaker.isClosed() || breaker.isHalfOpen()) {
      getContext()
          .askWithStatus(
              Done.class,
              target,
              Duration.ofSeconds(11),
              (replyTo) -> new OtherActor.Call(call.payload, replyTo),
              (done, failure) -> new OtherActorReply(Optional.ofNullable(failure), call.replyTo));
    } else {
      call.replyTo.tell(StatusReply.error("Service unavailable"));
    }
    return this;
  }

  private Behavior<Command> onOtherActorReply(OtherActorReply otherActorReply) {
    if (otherActorReply.failure.isPresent()) {
      breaker.fail();
      getContext().getLog().warn("Service failure", otherActorReply.failure.get());
      otherActorReply.originalReplyTo.tell(StatusReply.error("Service unavailable"));
    } else {
      breaker.succeed();
      otherActorReply.originalReplyTo.tell(StatusReply.ack());
    }
    return this;
  }

  private Behavior<Command> breakerOpened(BreakerOpen breakerOpen) {
    getContext().getLog().warn("Circuit breaker open");
    return this;
  }
}
```

Note
This example always makes remote calls when the state is *HalfOpen*. Using the power\-user APIs, it is your responsibility to judge when to make remote calls in *HalfOpen*.

## Code Examples

### Example 1: Initialization

```scala
akka.circuit-breaker.data-access {
  max-failures = 5
  call-timeout = 10s
  reset-timeout = 1m
}
```

### Example 2: Initialization

```scala
val circuitBreaker = CircuitBreaker("data-access")(context.system)
```

### Example 3: Initialization

```java
CircuitBreaker circuitBreaker =
    CircuitBreaker.lookup("data-access", context.getSystem());
```

### Example 4: Future & Synchronous based API

```scala
class DataAccess(
    context: ActorContext[DataAccess.Command],
    id: String,
    service: ThirdPartyWebService,
    circuitBreaker: CircuitBreaker) {
  import DataAccess._

  private def active(): Behavior[Command] = {
    Behaviors.receiveMessagePartial {
      case Handle(value, replyTo) =>
        val futureResult: Future[Done] = circuitBreaker.withCircuitBreaker {
          service.call(id, value)
        }
        context.pipeToSelf(futureResult) {
          case Success(_)         => HandleSuceeded(replyTo)
          case Failure(exception) => HandleFailed(replyTo, exception)
        }
        Behaviors.same
      case HandleSuceeded(replyTo) =>
        replyTo ! StatusReply.Ack
        Behaviors.same
      case HandleFailed(replyTo, exception) =>
        context.log.warn("Failed to call web service", exception)
        replyTo ! StatusReply.error("Dependency service not available")
        Behaviors.same
    }

  }
}
```

### Example 5: Future & Synchronous based API

```java
class DataAccess extends AbstractBehavior<DataAccess.Command> {

  public interface Command {}

  public static class Handle implements Command {
    final String value;
    final ActorRef<StatusReply<Done>> replyTo;

    public Handle(String value, ActorRef<StatusReply<Done>> replyTo) {
      this.value = value;
      this.replyTo = replyTo;
    }
  }

  private final class HandleFailed implements Command {
    final Throwable failure;
    final ActorRef<StatusReply<Done>> replyTo;

    public HandleFailed(Throwable failure, ActorRef<StatusReply<Done>> replyTo) {
      this.failure = failure;
      this.replyTo = replyTo;
    }
  }

  private final class HandleSuceeded implements Command {
    final ActorRef<StatusReply<Done>> replyTo;

    public HandleSuceeded(ActorRef<StatusReply<Done>> replyTo) {
      this.replyTo = replyTo;
    }
  }

  private final class CircuitBreakerStateChange implements Command {
    final String newState;

    public CircuitBreakerStateChange(String newState) {
      this.newState = newState;
    }
  }

  public static Behavior<Command> create(String id, ThirdPartyWebService service) {
    return Behaviors.setup(
        context -> {
          CircuitBreaker circuitBreaker =
              CircuitBreaker.lookup("data-access", context.getSystem());
          return new DataAccess(context, id, service, circuitBreaker);
        });
  }

  private final String id;
  private final ThirdPartyWebService service;
  private final CircuitBreaker circuitBreaker;

  public DataAccess(
      ActorContext<Command> context,
      String id,
      ThirdPartyWebService service,
      CircuitBreaker circuitBreaker) {
    super(context);
    this.id = id;
    this.service = service;
    this.circuitBreaker = circuitBreaker;
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Handle.class, this::onHandle)
        .onMessage(HandleSuceeded.class, this::onHandleSucceeded)
        .onMessage(HandleFailed.class, this::onHandleFailed)
        .build();
  }

  private Behavior<Command> onHandle(Handle handle) {
    CompletionStage<Done> futureResult =
        circuitBreaker.callWithCircuitBreakerCS(() -> service.call(id, handle.value));
    getContext()
        .pipeToSelf(
            futureResult,
            (done, throwable) -> {
              if (throwable != null) {
                return new HandleFailed(throwable, handle.replyTo);
              } else {
                return new HandleSuceeded(handle.replyTo);
              }
            });
    return this;
  }

  private Behavior<Command> onHandleSucceeded(HandleSuceeded handleSuceeded) {
    handleSuceeded.replyTo.tell(StatusReply.ack());
    return this;
  }

  private Behavior<Command> onHandleFailed(HandleFailed handleFailed) {
    getContext().getLog().warn("Failed to call web service", handleFailed.failure);
    handleFailed.replyTo.tell(StatusReply.error("Dependency service not available"));
    return this;
  }

}
```

### Example 6: Control failure count explicitly

```scala
val evenNumberAsFailure: Try[Int] => Boolean = {
  case Success(n) => n % 2 == 0
  case Failure(_) => true
}

val breaker = CircuitBreaker("dangerous-breaker")

// this call will return 8888 and increase failure count at the same time
breaker.withCircuitBreaker(Future(8888), evenNumberAsFailure)
```

### Example 7: Control failure count explicitly

```java
BiFunction<Optional<Integer>, Optional<Throwable>, Boolean> evenNoAsFailure =
    (result, err) -> (result.isPresent() && result.get() % 2 == 0);

// this will return 8888 and increase failure count at the same time
return circuitBreaker.callWithSyncCircuitBreaker(() -> 8888, evenNoAsFailure);
```

### Example 8: Low level API

```scala
import akka.actor.typed.scaladsl.adapter._
val breaker =
  new CircuitBreaker(
    context.system.scheduler.toClassic,
    maxFailures = 5,
    callTimeout = 10.seconds,
    resetTimeout = 1.minute).onOpen(context.self ! BreakerOpen)
```

### Example 9: Low level API

```java
breaker =
    CircuitBreaker.create(
            getContext().getSystem().classicSystem().getScheduler(),
            // maxFailures
            5,
            // callTimeout
            Duration.ofSeconds(10),
            // resetTimeout
            Duration.ofMinutes(1))
        .addOnOpenListener(() -> context.getSelf().tell(new BreakerOpen()));
```

### Example 10: Low level API

```scala
object CircuitBreakingIntermediateActor {
  sealed trait Command
  case class Call(payload: String, replyTo: ActorRef[StatusReply[Done]]) extends Command
  private case class OtherActorReply(reply: Try[Done], originalReplyTo: ActorRef[StatusReply[Done]]) extends Command
  private case object BreakerOpen extends Command

  def apply(recipient: ActorRef[OtherActor.Command]): Behavior[Command] =
    Behaviors.setup { context =>
      implicit val askTimeout: Timeout = 11.seconds
      import context.executionContext
      import akka.actor.typed.scaladsl.adapter._
      val breaker =
        new CircuitBreaker(
          context.system.scheduler.toClassic,
          maxFailures = 5,
          callTimeout = 10.seconds,
          resetTimeout = 1.minute).onOpen(context.self ! BreakerOpen)

      Behaviors.receiveMessage {
        case Call(payload, replyTo) =>
          if (breaker.isClosed || breaker.isHalfOpen) {
            context.askWithStatus(recipient, OtherActor.Call(payload, _))(OtherActorReply(_, replyTo))
          } else {
            replyTo ! StatusReply.error("Service unavailable")
          }
          Behaviors.same
        case OtherActorReply(reply, originalReplyTo) =>
          if (reply.isSuccess) breaker.succeed()
          else breaker.fail()
          originalReplyTo ! StatusReply.fromTry(reply)
          Behaviors.same
        case BreakerOpen =>
          context.log.warn("Circuit breaker open")
          Behaviors.same
      }
    }
}
```

### Example 11: Low level API

```java
static class CircuitBreakingIntermediateActor
    extends AbstractBehavior<CircuitBreakingIntermediateActor.Command> {

  public interface Command {}

  public static class Call implements Command {
    final String payload;
    final ActorRef<StatusReply<Done>> replyTo;

    public Call(String payload, ActorRef<StatusReply<Done>> replyTo) {
      this.payload = payload;
      this.replyTo = replyTo;
    }
  }

  private class OtherActorReply implements Command {
    final Optional<Throwable> failure;
    final ActorRef<StatusReply<Done>> originalReplyTo;

    public OtherActorReply(
        Optional<Throwable> failure, ActorRef<StatusReply<Done>> originalReplyTo) {
      this.failure = failure;
      this.originalReplyTo = originalReplyTo;
    }
  }

  private class BreakerOpen implements Command {}

  private final ActorRef<OtherActor.Command> target;
  private final CircuitBreaker breaker;

  public CircuitBreakingIntermediateActor(
      ActorContext<Command> context, ActorRef<OtherActor.Command> targetActor) {
    super(context);
    this.target = targetActor;
    breaker =
        CircuitBreaker.create(
                getContext().getSystem().classicSystem().getScheduler(),
                // maxFailures
                5,
                // callTimeout
                Duration.ofSeconds(10),
                // resetTimeout
                Duration.ofMinutes(1))
            .addOnOpenListener(() -> context.getSelf().tell(new BreakerOpen()));
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(Call.class, this::onCall)
        .onMessage(OtherActorReply.class, this::onOtherActorReply)
        .onMessage(BreakerOpen.class, this::breakerOpened)
        .build();
  }

  private Behavior<Command> onCall(Call call) {
    if (breaker.isClosed() || breaker.isHalfOpen()) {
      getContext()
          .askWithStatus(
              Done.class,
              target,
              Duration.ofSeconds(11),
              (replyTo) -> new OtherActor.Call(call.payload, replyTo),
              (done, failure) -> new OtherActorReply(Optional.ofNullable(failure), call.replyTo));
    } else {
      call.replyTo.tell(StatusReply.error("Service unavailable"));
    }
    return this;
  }

  private Behavior<Command> onOtherActorReply(OtherActorReply otherActorReply) {
    if (otherActorReply.failure.isPresent()) {
      breaker.fail();
      getContext().getLog().warn("Service failure", otherActorReply.failure.get());
      otherActorReply.originalReplyTo.tell(StatusReply.error("Service unavailable"));
    } else {
      breaker.succeed();
      otherActorReply.originalReplyTo.tell(StatusReply.ack());
    }
    return this;
  }

  private Behavior<Command> breakerOpened(BreakerOpen breakerOpen) {
    getContext().getLog().warn("Circuit breaker open");
    return this;
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreaker.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/CircuitBreakerOpenException.html
- https://doc.akka.io/libraries/akka-core/2.10/futures.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/logging.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/common/circuitbreaker.html](https://doc.akka.io/libraries/akka-core/2.10/common/circuitbreaker.html)*