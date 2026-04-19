---
description: Akka 2.10.17 - akka.persistence.typed.scaladsl.EventSourcedBehavior.CommandHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:52:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html
title: Akka 2.10.17 - akka.persistence.typed.scaladsl.EventSourcedBehavior.CommandHandler
---

# Akka 2.10.17 - akka.persistence.typed.scaladsl.EventSourcedBehavior.CommandHandler

> **Summary:** Akka 2.10.17 - akka.persistence.typed.scaladsl.EventSourcedBehavior.CommandHandler

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html "Permalink")  object [EventSourcedBehavior](EventSourcedBehavior$.html)Definition Classes[scaladsl](index.html)
- CommandHandler
o[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[scaladsl](index.html).[EventSourcedBehavior](EventSourcedBehavior$.html)

# CommandHandler[**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html "Permalink")

### 

#### object CommandHandler

The `CommandHandler` defines how to act on commands. A `CommandHandler` is
a function:

```
(State, Command) => Effect[Event, State]
```
The [CommandHandler\#command](#command[Command,Event,State](commandHandler:Command=>akka.persistence.typed.scaladsl.Effect[Event,State]):(State,Command)=>akka.persistence.typed.scaladsl.Effect[Event,State]) is useful for simple commands that don't need the state
and context.

Source[EventSourcedBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/scaladsl/EventSourcedBehavior.scala#L136)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CommandHandler
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#command[Command,Event,State](commandHandler:Command=>akka.persistence.typed.scaladsl.Effect[Event,State]):(State,Command)=>akka.persistence.typed.scaladsl.Effect[Event,State] "Permalink")  def command\[Command, Event, State](commandHandler: (Command) \=\> [Effect](Effect.html)\[Event, State]): (State, Command) \=\> [Effect](Effect.html)\[Event, State]Convenience for simple commands that don't need the state and context.

Convenience for simple commands that don't need the state and context.

See also[Effect](Effect.html) for possible effects of a command.
7. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior$$CommandHandler$.html)*