---
description: Akka 2.10.17 - akka.japi
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:37:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/index.html
title: Akka 2.10.17 - akka.japi
---

# Akka 2.10.17 - akka.japi

> **Summary:** Akka 2.10.17 - akka.japi

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](../event/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package japiDefinition Classes[akka](../index.html)
- [**](../../akka/japi/function/index.html "Permalink")  package [function](function/index.html)
- [**](../../akka/japi/pf/index.html "Permalink")  package [pf](pf/index.html)
- [**](../../akka/japi/tuple/index.html "Permalink")  package [tuple](tuple/index.html)
- [Creator](Creator.html "A constructor/factory, takes no parameters but creates a new value of type T every call.")
- [Effect](Effect.html "An executable piece of code that takes no parameters and doesn't return any value.")
- [Function](Function.html "A Function interface.")
- [Function2](Function2.html "A Function interface.")
- [JAPI](JAPI.html)
- [JavaPartialFunction](JavaPartialFunction.html "Helper for implementing a *pure* partial function: it will possibly be invoked multiple times for a single “application”, because its only abstract method is used for both isDefinedAt() and apply(); the former is mapped to isCheck == true and the latter to isCheck == false for those cases where this is important to know.")
- [Option](Option.html "This class represents optional values.")
- [Pair](Pair.html "Java API Represents a pair (tuple) of two elements.")
- [Predicate](Predicate.html "Java API: Defines a criteria and determines whether the parameter meets this criteria.")
- [Procedure](Procedure.html "A Procedure is like a Function, but it doesn't produce a return value.")
- [Throwables](Throwables$.html "Helper class for determining whether a Throwable is fatal or not.")
- [Util](Util$.html "This class hold common utilities for Java")
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](../pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](../persistence/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](../stream/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# japi[**](../../akka/japi/index.html "Permalink")

#### package japi

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/japi/function/index.html "Permalink")  package [function](function/index.html)
2. [**](../../akka/japi/pf/index.html "Permalink")  package [pf](pf/index.html)
3. [**](../../akka/japi/tuple/index.html "Permalink")  package [tuple](tuple/index.html)
### Type Members

1. [**](../../akka/japi/Creator.html "Permalink")  trait [Creator](Creator.html "A constructor/factory, takes no parameters but creates a new value of type T every call.")\[T] extends SerializableA constructor/factory, takes no parameters but creates a new value of type T every call.

A constructor/factory, takes no parameters but creates a new value of type T every call.

This class is kept for compatibility, but for future API's please prefer [akka.japi.function.Creator](function/Creator.html).

Annotations@nowarn() @SerialVersionUID() @FunctionalInterface()
2. [**](../../akka/japi/Effect.html "Permalink")  trait [Effect](Effect.html "An executable piece of code that takes no parameters and doesn't return any value.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An executable piece of code that takes no parameters and doesn't return any value.

An executable piece of code that takes no parameters and doesn't return any value.

This class is kept for compatibility, but for future API's please prefer [akka.japi.function.Effect](function/Effect.html).

Annotations@FunctionalInterface()
3. [**](../../akka/japi/Function.html "Permalink")  trait [Function](Function.html "A Function interface.")\[T, R] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A Function interface.

A Function interface. Used to create first\-class\-functions is Java.

This class is kept for compatibility, but for future API's please prefer [akka.japi.function.Function](function/Function.html).

Annotations@FunctionalInterface()
4. [**](../../akka/japi/Function2.html "Permalink")  trait [Function2](Function2.html "A Function interface.")\[T1, T2, R] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A Function interface.

A Function interface. Used to create 2\-arg first\-class\-functions is Java.

This class is kept for compatibility, but for future API's please prefer [akka.japi.function.Function2](function/Function2.html).

Annotations@FunctionalInterface()
5. [**](../../akka/japi/JAPI.html "Permalink")  class [JAPI](JAPI.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
6. [**](../../akka/japi/JavaPartialFunction.html "Permalink") abstract  class [JavaPartialFunction](JavaPartialFunction.html "Helper for implementing a *pure* partial function: it will possibly be invoked multiple times for a single “application”, because its only abstract method is used for both isDefinedAt() and apply(); the former is mapped to isCheck == true and the latter to isCheck == false for those cases where this is important to know.")\[A, B] extends [AbstractPartialFunction](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractPartialFunction.html#scala.runtime.AbstractPartialFunction)\[A, B]Helper for implementing a \*pure\* partial function: it will possibly be
invoked multiple times for a single “application”, because its only abstract
method is used for both isDefinedAt() and apply(); the former is mapped to
`isCheck == true` and the latter to `isCheck == false` for those cases where
this is important to know.

Helper for implementing a \*pure\* partial function: it will possibly be
invoked multiple times for a single “application”, because its only abstract
method is used for both isDefinedAt() and apply(); the former is mapped to
`isCheck == true` and the latter to `isCheck == false` for those cases where
this is important to know.

Failure to match is signaled by throwing `noMatch()`, i.e. not returning
normally (the exception used in this case is pre\-allocated, hence not
*that* expensive).

```
new JavaPartialFunction<Object, String>() {
  public String apply(Object in, boolean isCheck) {
    if (in instanceof TheThing) {
      if (isCheck) return null; // to spare the expensive or side-effecting code
      return doSomethingWithTheThing((TheThing) in);
    } else {
      throw noMatch();
    }
  }
}
```
The typical use of partial functions from Akka looks like the following:

```
if (pf.isDefinedAt(x)) {
  pf.apply(x);
}
```
i.e. it will first call `JavaPartialFunction.apply(x, true)` and if that
does not throw `noMatch()` it will continue with calling
`JavaPartialFunction.apply(x, false)`.
7. [**](../../akka/japi/Option.html "Permalink") sealed abstract  class [Option](Option.html "This class represents optional values.")\[A] extends [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[A]This class represents optional values.

This class represents optional values. Instances of `Option`
are either instances of case class `Some` or it is case
object `None`.
8. [**](../../akka/japi/Pair.html "Permalink")  case class [Pair](Pair.html "Java API Represents a pair (tuple) of two elements.")\[A, B](first: A, second: B) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableJava API
Represents a pair (tuple) of two elements.

Java API
Represents a pair (tuple) of two elements.

Additional tuple types for 3 to 22 values are defined in the `akka.japi.tuple` package, e.g. [akka.japi.tuple.Tuple3](tuple/Tuple3.html).

Annotations@SerialVersionUID()
9. [**](../../akka/japi/Predicate.html "Permalink")  trait [Predicate](Predicate.html "Java API: Defines a criteria and determines whether the parameter meets this criteria.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: Defines a criteria and determines whether the parameter meets this criteria.

Java API: Defines a criteria and determines whether the parameter meets this criteria.

This class is kept for compatibility, but for future API's please prefer [java.util.function.Predicate](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html).

Annotations@FunctionalInterface()
10. [**](../../akka/japi/Procedure.html "Permalink")  trait [Procedure](Procedure.html "A Procedure is like a Function, but it doesn't produce a return value.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A Procedure is like a Function, but it doesn't produce a return value.

A Procedure is like a Function, but it doesn't produce a return value.

This class is kept for compatibility, but for future API's please prefer [akka.japi.function.Procedure](function/Procedure.html).

Annotations@FunctionalInterface()
### Value Members

1. [**](../../akka/japi/JavaPartialFunction$.html "Permalink")  object [JavaPartialFunction](JavaPartialFunction$.html)
2. [**](../../akka/japi/Option$.html "Permalink")  object [Option](Option$.html)
3. [**](../../akka/japi/Pair$.html "Permalink")  object [Pair](Pair$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
4. [**](../../akka/japi/Throwables$.html "Permalink")  object [Throwables](Throwables$.html "Helper class for determining whether a Throwable is fatal or not.")Helper class for determining whether a `Throwable` is fatal or not.

Helper class for determining whether a `Throwable` is fatal or not.
User should only catch the non\-fatal one,and keep rethrow the fatal one.

Fatal errors are errors like `VirtualMachineError`
(for example, `OutOfMemoryError` and `StackOverflowError`, subclasses of `VirtualMachineError`), `ThreadDeath`,
`LinkageError`, `InterruptedException`, `ControlThrowable`.

Note. this helper keep the same semantic with `NonFatal` in Scala.
For example, all harmless `Throwable`s can be caught by:

```
try {
  // dangerous stuff
} catch(Throwable e) {
  if (Throwables.isNonFatal(e)){
    log.error(e, "Something not that bad.");
  } else {
    throw e;
  }
```
5. [**](../../akka/japi/Util$.html "Permalink")  object [Util](Util$.html "This class hold common utilities for Java")This class hold common utilities for Java
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka/current/akka/actor/index.html
- https://doc.akka.io/api/akka/current/akka/annotation/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/coordination/index.html
- https://doc.akka.io/api/akka/current/akka/discovery/index.html
- https://doc.akka.io/api/akka/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka/current/akka/event/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/akka/japi/Creator.html
- https://doc.akka.io/api/akka/current/akka/japi/Effect.html
- https://doc.akka.io/api/akka/current/akka/japi/Function.html
- https://doc.akka.io/api/akka/current/akka/japi/Function2.html
- https://doc.akka.io/api/akka/current/akka/japi/JAPI.html
- https://doc.akka.io/api/akka/current/akka/japi/JavaPartialFunction$.html
- https://doc.akka.io/api/akka/current/akka/japi/JavaPartialFunction.html
- https://doc.akka.io/api/akka/current/akka/japi/Option$.html
- https://doc.akka.io/api/akka/current/akka/japi/Option.html
- https://doc.akka.io/api/akka/current/akka/japi/Pair$.html
- https://doc.akka.io/api/akka/current/akka/japi/Pair.html
- https://doc.akka.io/api/akka/current/akka/japi/Predicate.html
- https://doc.akka.io/api/akka/current/akka/japi/Procedure.html
- https://doc.akka.io/api/akka/current/akka/japi/Throwables$.html
- https://doc.akka.io/api/akka/current/akka/japi/Util$.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Effect.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Procedure.html
- https://doc.akka.io/api/akka/current/akka/japi/function/index.html
- https://doc.akka.io/api/akka/current/akka/japi/index.html
- https://doc.akka.io/api/akka/current/akka/japi/pf/index.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/Tuple3.html
- https://doc.akka.io/api/akka/current/akka/japi/tuple/index.html
- https://doc.akka.io/api/akka/current/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka/current/akka/pattern/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/pki/index.html
- https://doc.akka.io/api/akka/current/akka/remote/index.html
- https://doc.akka.io/api/akka/current/akka/routing/index.html
- https://doc.akka.io/api/akka/current/akka/serialization/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/util/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/japi/index.html](https://doc.akka.io/api/akka/current/akka/japi/index.html)*