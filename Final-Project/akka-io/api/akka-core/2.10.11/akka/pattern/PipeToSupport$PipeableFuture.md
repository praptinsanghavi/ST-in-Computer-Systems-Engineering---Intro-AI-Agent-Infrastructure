---
description: Akka 2.10.11 - akka.pattern.PipeToSupport.PipeableFuture
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:14:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/pattern/PipeToSupport$PipeableFuture.html
title: Akka 2.10.11 - akka.pattern.PipeToSupport.PipeableFuture
---

# Akka 2.10.11 - akka.pattern.PipeToSupport.PipeableFuture

> **Summary:** Akka 2.10.11 - akka.pattern.PipeToSupport.PipeableFuture

## Content

Akka2\.10\.11 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
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
For Java the patterns are available as static methods of the [akka.pattern.Patterns](Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/pattern/PipeToSupport.html "Permalink")  trait [PipeToSupport](PipeToSupport.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Definition Classes[pattern](index.html)
- [PipeableCompletionStage](PipeToSupport$PipeableCompletionStage.html)
- PipeableFuture
c[akka](../index.html).[pattern](index.html).[PipeToSupport](PipeToSupport.html)

# PipeableFuture[**](../../akka/pattern/PipeToSupport$PipeableFuture.html "Permalink")

### 

#### final  class PipeableFuture\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[PipeToSupport.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-actor/src/main/scala/akka/pattern/PipeToSupport.scala#L21)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PipeableFuture
2. AnyRef
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

1. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#<init>(future:scala.concurrent.Future[T])(implicitexecutionContext:scala.concurrent.ExecutionContext):PipeToSupport.this.PipeableFuture[T] "Permalink")  new PipeableFuture(future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T])(implicit executionContext: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext))
### Value Members

1. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PipeableFuture\[T] toany2stringadd\[PipeableFuture\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PipeableFuture\[T], B)ImplicitThis member is added by an implicit conversion from PipeableFuture\[T] toArrowAssoc\[PipeableFuture\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PipeableFuture\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PipeableFuture\[T]ImplicitThis member is added by an implicit conversion from PipeableFuture\[T] toEnsuring\[PipeableFuture\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PipeableFuture\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PipeableFuture\[T]ImplicitThis member is added by an implicit conversion from PipeableFuture\[T] toEnsuring\[PipeableFuture\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PipeableFuture\[T]ImplicitThis member is added by an implicit conversion from PipeableFuture\[T] toEnsuring\[PipeableFuture\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PipeableFuture\[T]ImplicitThis member is added by an implicit conversion from PipeableFuture\[T] toEnsuring\[PipeableFuture\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#future:scala.concurrent.Future[T] "Permalink")  val future: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]
15. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#pipeTo(recipient:akka.actor.ActorRef)(implicitsender:akka.actor.ActorRef):scala.concurrent.Future[T] "Permalink")  def pipeTo(recipient: [ActorRef](../actor/ActorRef.html))(implicit sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../index.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]
22. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#pipeToSelection(recipient:akka.actor.ActorSelection)(implicitsender:akka.actor.ActorRef):scala.concurrent.Future[T] "Permalink")  def pipeToSelection(recipient: [ActorSelection](../actor/ActorSelection.html))(implicit sender: [ActorRef](../actor/ActorRef.html) \= [Actor.noSender](../index.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]
23. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#to(recipient:akka.actor.ActorSelection,sender:akka.actor.ActorRef):PipeToSupport.this.PipeableFuture[T] "Permalink")  def to(recipient: [ActorSelection](../actor/ActorSelection.html), sender: [ActorRef](../actor/ActorRef.html)): PipeableFuture\[T]
25. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#to(recipient:akka.actor.ActorSelection):PipeToSupport.this.PipeableFuture[T] "Permalink")  def to(recipient: [ActorSelection](../actor/ActorSelection.html)): PipeableFuture\[T]
26. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#to(recipient:akka.actor.ActorRef,sender:akka.actor.ActorRef):PipeToSupport.this.PipeableFuture[T] "Permalink")  def to(recipient: [ActorRef](../actor/ActorRef.html), sender: [ActorRef](../actor/ActorRef.html)): PipeableFuture\[T]
27. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#to(recipient:akka.actor.ActorRef):PipeToSupport.this.PipeableFuture[T] "Permalink")  def to(recipient: [ActorRef](../actor/ActorRef.html)): PipeableFuture\[T]
28. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PipeableFuture\[T] toStringFormat\[PipeableFuture\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/pattern/PipeToSupport$PipeableFuture.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PipeableFuture\[T], B)ImplicitThis member is added by an implicit conversion from PipeableFuture\[T] toArrowAssoc\[PipeableFuture\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPipeableFuture\[T] to any2stringadd\[PipeableFuture\[T]]

### Inherited by implicit conversion StringFormat fromPipeableFuture\[T] to StringFormat\[PipeableFuture\[T]]

### Inherited by implicit conversion Ensuring fromPipeableFuture\[T] to Ensuring\[PipeableFuture\[T]]

### Inherited by implicit conversion ArrowAssoc fromPipeableFuture\[T] to ArrowAssoc\[PipeableFuture\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/PipeToSupport$PipeableCompletionStage.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/PipeToSupport$PipeableFuture.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/PipeToSupport.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/2.10.11/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/PipeToSupport$PipeableFuture.html](https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/PipeToSupport$PipeableFuture.html)*