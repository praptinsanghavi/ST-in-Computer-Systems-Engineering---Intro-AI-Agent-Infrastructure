---
description: Akka 2.10.17 - akka.actor.typed.scaladsl.LoggerOps
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:51:32Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/scaladsl/package$$LoggerOps.html
title: Akka 2.10.17 - akka.actor.typed.scaladsl.LoggerOps
---

# Akka 2.10.17 - akka.actor.typed.scaladsl.LoggerOps

> **Summary:** Akka 2.10.17 - akka.actor.typed.scaladsl.LoggerOps

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/actor/index.html "Permalink")  package [actor](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/actor/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[actor](../../index.html)
- [**](../../../../akka/actor/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/actor/typed/scaladsl/adapter/index.html "Permalink")  package [adapter](adapter/index.html "Adapters between typed and classic actors and actor systems.")Adapters between typed and classic actors and actor systems.

Adapters between typed and classic actors and actor systems.
The underlying `ActorSystem` is the classic [akka.actor.ActorSystem](../../ActorSystem.html)
which runs Akka Typed [akka.actor.typed.Behavior](../Behavior.html) on an emulation layer. In this
system typed and classic actors can coexist.

Use these adapters with `import akka.actor.typed.scaladsl.adapter._`.

Implicit extension methods are added to classic and typed `ActorSystem`,
`ActorContext`. Such methods make it possible to create typed child actor
from classic parent actor, and the opposite classic child from typed parent.
`watch` is also supported in both directions.

There is an implicit conversion from classic [akka.actor.ActorRef](../../ActorRef.html) to
typed [akka.actor.typed.ActorRef](../ActorRef.html).

There are also converters (`toTyped`, `toClassic`) from typed
[akka.actor.typed.ActorRef](../ActorRef.html) to classic [akka.actor.ActorRef](../../ActorRef.html), and between classic
[akka.actor.ActorSystem](../../ActorSystem.html) and typed [akka.actor.typed.ActorSystem](../ActorSystem.html).

Definition Classes[scaladsl](index.html)
- [AbstractBehavior](AbstractBehavior.html "An actor Behavior can be implemented by extending this class and implement the abstract method AbstractBehavior#onMessage and optionally override AbstractBehavior#onSignal.")
- [ActorContext](ActorContext.html "An Actor is given by the combination of a Behavior and a context in which this behavior is executed.")
- [AskPattern](AskPattern$.html "The ask-pattern implements the initiator side of a request–reply protocol.")
- [Behaviors](Behaviors$.html "Factories for akka.actor.typed.Behavior.")
- [GroupRouter](GroupRouter.html "Provides builder style configuration options for group routers")
- LoggerOps
- [PoolRouter](PoolRouter.html "Provides builder style configuration options for pool routers")
- [Routers](Routers$.html)
- [StashBuffer](StashBuffer.html "A non thread safe mutable message buffer that can be used to buffer messages inside actors and then unstash them.")
- [StashOverflowException](StashOverflowException.html "Is thrown when the size of the stash exceeds the capacity of the stash buffer.")
- [TimerScheduler](TimerScheduler.html "Support for scheduled self messages in an actor.")
c[akka](../../../index.html).[actor](../../index.html).[typed](../index.html).[scaladsl](index.html)

# LoggerOps[**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html "Permalink")

### 

#### implicit final  class LoggerOps extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Extension methods to org.slf4j.Logger that are useful because the Scala
compiler can't select the right overloaded methods for some cases when using
2 template arguments and varargs (\>\= 3 arguments) with primitive types.

Enable these extension methods with:

```
import akka.actor.typed.scaladsl.LoggerOps
```
or

```
import akka.actor.typed.scaladsl._
```
Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/scaladsl/package.scala#L30)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LoggerOps
2. AnyVal
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#<init>(log:org.slf4j.Logger):akka.actor.typed.scaladsl.package.LoggerOps "Permalink")  new LoggerOps(log: Logger)logthe underlying org.slf4j.Logger
### Value Members

1. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LoggerOps toany2stringadd\[LoggerOps] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LoggerOps, B)ImplicitThis member is added by an implicit conversion from LoggerOps toArrowAssoc\[LoggerOps] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#debug(marker:org.slf4j.Marker,format:String,arguments:Any*):Unit "Permalink")  def debug(marker: Marker, format: String, arguments: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log marker data and message at the DEBUG level according to the specified format
and arguments.

Log marker data and message at the DEBUG level according to the specified format
and arguments.

This form avoids superfluous string concatenation when the logger
is disabled for the DEBUG level. However, this variant incurs the hidden
(and relatively small) cost of creating an `Array[Object]` before invoking the method,
even if this logger is disabled for DEBUG. The `debug` variants taking
one and `debug2` taking two arguments exist solely in order to avoid this hidden cost.

formatthe format string

argumentsa list of 3 or more arguments
8. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#debug(format:String,arguments:Any*):Unit "Permalink")  def debug(format: String, arguments: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log a message at the DEBUG level according to the specified format
and arguments.

Log a message at the DEBUG level according to the specified format
and arguments.

This form avoids superfluous string concatenation when the logger
is disabled for the DEBUG level. However, this variant incurs the hidden
(and relatively small) cost of creating an `Array[Object]` before invoking the method,
even if this logger is disabled for DEBUG. The `debug` variants taking
one and `debug2` taking two arguments exist solely in order to avoid this hidden cost.

formatthe format string

argumentsa list of 3 or more arguments
9. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#debug(marker:org.slf4j.Marker,format:String,arg1:Any,arg2:Any):Unit "Permalink")  def debug(marker: Marker, format: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log marker data and message at the DEBUG level according to the specified format
and 2 arguments.

Log marker data and message at the DEBUG level according to the specified format
and 2 arguments.

This form avoids superfluous object creation when the logger
is disabled for the DEBUG level.

markerthe marker data specific to this log statement

formatthe format string

arg1the first argument

arg2the second argument
10. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#debug(format:String,arg1:Any,arg2:Any):Unit "Permalink")  def debug(format: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log a message at the DEBUG level according to the specified format
and 2 arguments.

Log a message at the DEBUG level according to the specified format
and 2 arguments.

This form avoids superfluous object creation when the logger
is disabled for the DEBUG level.

formatthe format string

arg1the first argument

arg2the second argument
11. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LoggerOps) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoggerOpsImplicitThis member is added by an implicit conversion from LoggerOps toEnsuring\[LoggerOps] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LoggerOps) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggerOpsImplicitThis member is added by an implicit conversion from LoggerOps toEnsuring\[LoggerOps] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LoggerOpsImplicitThis member is added by an implicit conversion from LoggerOps toEnsuring\[LoggerOps] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LoggerOpsImplicitThis member is added by an implicit conversion from LoggerOps toEnsuring\[LoggerOps] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#error2(marker:org.slf4j.Marker,format:String,arg1:Any,arg2:Any):Unit "Permalink")  def error2(marker: Marker, format: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log marker data and message at the ERROR level according to the specified format
and 2 arguments.

Log marker data and message at the ERROR level according to the specified format
and 2 arguments.

This form avoids superfluous object creation when the logger
is disabled for the ERROR level.

markerthe marker data specific to this log statement

formatthe format string

arg1the first argument

arg2the second argument
16. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#error2(format:String,arg1:Any,arg2:Any):Unit "Permalink")  def error2(format: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log a message at the ERROR level according to the specified format
and 2 arguments.

Log a message at the ERROR level according to the specified format
and 2 arguments.

This form avoids superfluous object creation when the logger
is disabled for the ERROR level.

formatthe format string

arg1the first argument

arg2the second argument
17. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#errorN(marker:org.slf4j.Marker,format:String,arguments:Any*):Unit "Permalink")  def errorN(marker: Marker, format: String, arguments: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log marker data and message at the ERROR level according to the specified format
and arguments.

Log marker data and message at the ERROR level according to the specified format
and arguments.

This form avoids superfluous string concatenation when the logger
is disabled for the ERROR level. However, this variant incurs the hidden
(and relatively small) cost of creating an `Array[Object]` before invoking the method,
even if this logger is disabled for ERROR. The `error` variants taking
one and `error2` taking two arguments exist solely in order to avoid this hidden cost.

formatthe format string

argumentsa list of 3 or more arguments
18. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#errorN(format:String,arguments:Any*):Unit "Permalink")  def errorN(format: String, arguments: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log a message at the ERROR level according to the specified format
and arguments.

Log a message at the ERROR level according to the specified format
and arguments.

This form avoids superfluous string concatenation when the logger
is disabled for the ERROR level. However, this variant incurs the hidden
(and relatively small) cost of creating an `Array[Object]` before invoking the method,
even if this logger is disabled for ERROR. The `error` variants taking
one and `error2` taking two arguments exist solely in order to avoid this hidden cost.

formatthe format string

argumentsa list of 3 or more arguments
19. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
20. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#info(marker:org.slf4j.Marker,format:String,arguments:Any*):Unit "Permalink")  def info(marker: Marker, format: String, arguments: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log marker data and message at the INFO level according to the specified format
and arguments.

Log marker data and message at the INFO level according to the specified format
and arguments.

This form avoids superfluous string concatenation when the logger
is disabled for the INFO level. However, this variant incurs the hidden
(and relatively small) cost of creating an `Array[Object]` before invoking the method,
even if this logger is disabled for INFO. The `info` variants taking
one and `info2` taking two arguments exist solely in order to avoid this hidden cost.

formatthe format string

argumentsa list of 3 or more arguments
21. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#info(format:String,arguments:Any*):Unit "Permalink")  def info(format: String, arguments: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log a message at the INFO level according to the specified format
and arguments.

Log a message at the INFO level according to the specified format
and arguments.

This form avoids superfluous string concatenation when the logger
is disabled for the INFO level. However, this variant incurs the hidden
(and relatively small) cost of creating an `Array[Object]` before invoking the method,
even if this logger is disabled for INFO. The `info` variants taking
one and `info2` taking two arguments exist solely in order to avoid this hidden cost.

formatthe format string

argumentsa list of 3 or more arguments
22. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#info(marker:org.slf4j.Marker,format:String,arg1:Any,arg2:Any):Unit "Permalink")  def info(marker: Marker, format: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log marker data and message at the INFO level according to the specified format
and 2 arguments.

Log marker data and message at the INFO level according to the specified format
and 2 arguments.

This form avoids superfluous object creation when the logger
is disabled for the INFO level.

markerthe marker data specific to this log statement

formatthe format string

arg1the first argument

arg2the second argument
23. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#info(format:String,arg1:Any,arg2:Any):Unit "Permalink")  def info(format: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log a message at the INFO level according to the specified format
and 2 arguments.

Log a message at the INFO level according to the specified format
and 2 arguments.

This form avoids superfluous object creation when the logger
is disabled for the INFO level.

formatthe format string

arg1the first argument

arg2the second argument
24. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
25. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#log:org.slf4j.Logger "Permalink")  val log: Logger
26. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
27. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#trace2(marker:org.slf4j.Marker,format:String,arg1:Any,arg2:Any):Unit "Permalink")  def trace2(marker: Marker, format: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log marker data and message at the TRACE level according to the specified format
and 2 arguments.

Log marker data and message at the TRACE level according to the specified format
and 2 arguments.

This form avoids superfluous object creation when the logger
is disabled for the TRACE level.

markerthe marker data specific to this log statement

formatthe format string

arg1the first argument

arg2the second argument
28. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#trace2(format:String,arg1:Any,arg2:Any):Unit "Permalink")  def trace2(format: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log a message at the TRACE level according to the specified format
and 2 arguments.

Log a message at the TRACE level according to the specified format
and 2 arguments.

This form avoids superfluous object creation when the logger
is disabled for the TRACE level.

formatthe format string

arg1the first argument

arg2the second argument
29. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#traceN(marker:org.slf4j.Marker,format:String,arguments:Any*):Unit "Permalink")  def traceN(marker: Marker, format: String, arguments: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log marker data and message at the TRACE level according to the specified format
and arguments.

Log marker data and message at the TRACE level according to the specified format
and arguments.

This form avoids superfluous string concatenation when the logger
is disabled for the TRACE level. However, this variant incurs the hidden
(and relatively small) cost of creating an `Array[Object]` before invoking the method,
even if this logger is disabled for TRACE. The `trace` variants taking
one and `trace2` taking two arguments exist solely in order to avoid this hidden cost.

formatthe format string

argumentsa list of 3 or more arguments
30. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#traceN(format:String,arguments:Any*):Unit "Permalink")  def traceN(format: String, arguments: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log a message at the TRACE level according to the specified format
and arguments.

Log a message at the TRACE level according to the specified format
and arguments.

This form avoids superfluous string concatenation when the logger
is disabled for the TRACE level. However, this variant incurs the hidden
(and relatively small) cost of creating an `Array[Object]` before invoking the method,
even if this logger is disabled for TRACE. The `trace` variants taking
one and `trace2` taking two arguments exist solely in order to avoid this hidden cost.

formatthe format string

argumentsa list of 3 or more arguments
31. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#warn(marker:org.slf4j.Marker,format:String,arg1:Any,arg2:Any):Unit "Permalink")  def warn(marker: Marker, format: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log marker data and message at the WARN level according to the specified format
and 2 arguments.

Log marker data and message at the WARN level according to the specified format
and 2 arguments.

This form avoids superfluous object creation when the logger
is disabled for the WARN level.

markerthe marker data specific to this log statement

formatthe format string

arg1the first argument

arg2the second argument
32. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#warn(format:String,arg1:Any,arg2:Any):Unit "Permalink")  def warn(format: String, arg1: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any), arg2: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log a message at the WARN level according to the specified format
and 2 arguments.

Log a message at the WARN level according to the specified format
and 2 arguments.

This form avoids superfluous object creation when the logger
is disabled for the WARN level.

formatthe format string

arg1the first argument

arg2the second argument
33. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#warnN(marker:org.slf4j.Marker,format:String,arguments:Any*):Unit "Permalink")  def warnN(marker: Marker, format: String, arguments: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log marker data and message at the WARN level according to the specified format
and arguments.

Log marker data and message at the WARN level according to the specified format
and arguments.

This form avoids superfluous string concatenation when the logger
is disabled for the WARN level. However, this variant incurs the hidden
(and relatively small) cost of creating an `Array[Object]` before invoking the method,
even if this logger is disabled for WARN. The `warn` variants taking
one and `warn2` taking two arguments exist solely in order to avoid this hidden cost.

formatthe format string

argumentsa list of 3 or more arguments
34. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#warnN(format:String,arguments:Any*):Unit "Permalink")  def warnN(format: String, arguments: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)\*): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Log a message at the WARN level according to the specified format
and arguments.

Log a message at the WARN level according to the specified format
and arguments.

This form avoids superfluous string concatenation when the logger
is disabled for the WARN level. However, this variant incurs the hidden
(and relatively small) cost of creating an `Array[Object]` before invoking the method,
even if this logger is disabled for WARN. The `warn` variants taking
one and `warn2` taking two arguments exist solely in order to avoid this hidden cost.

formatthe format string

argumentsa list of 3 or more arguments
### Deprecated Value Members

1. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LoggerOps toStringFormat\[LoggerOps] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../akka/actor/typed/scaladsl/package$$LoggerOps.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LoggerOps, B)ImplicitThis member is added by an implicit conversion from LoggerOps toArrowAssoc\[LoggerOps] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLoggerOps to any2stringadd\[LoggerOps]

### Inherited by implicit conversion StringFormat fromLoggerOps to StringFormat\[LoggerOps]

### Inherited by implicit conversion Ensuring fromLoggerOps to Ensuring\[LoggerOps]

### Inherited by implicit conversion ArrowAssoc fromLoggerOps to ArrowAssoc\[LoggerOps]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/AskPattern$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/Behaviors$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/Routers$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/StashBuffer.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/TimerScheduler.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/adapter/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/package$$LoggerOps.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/package$$LoggerOps.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/scaladsl/package$$LoggerOps.html)*