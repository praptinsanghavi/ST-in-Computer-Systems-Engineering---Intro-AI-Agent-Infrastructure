---
description: Akka 2.10.17 - akka.actor.typed.SpawnProtocol.Spawn
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:31:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/actor/typed/SpawnProtocol$$Spawn.html
title: Akka 2.10.17 - akka.actor.typed.SpawnProtocol.Spawn
---

# Akka 2.10.17 - akka.actor.typed.SpawnProtocol.Spawn

> **Summary:** Akka 2.10.17 - akka.actor.typed.SpawnProtocol.Spawn

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/actor/index.html "Permalink")  package [actor](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/actor/typed/index.html "Permalink")  package [typed](index.html)Definition Classes[actor](../index.html)
- [**](../../../akka/actor/typed/SpawnProtocol$.html "Permalink")  object [SpawnProtocol](SpawnProtocol$.html "A message protocol for actors that support spawning a child actor when receiving a SpawnProtocol#Spawn message and sending back the ActorRef of the child actor.")A message protocol for actors that support spawning a child actor when receiving a SpawnProtocol\#Spawn
message and sending back the [ActorRef](ActorRef.html) of the child actor.

A message protocol for actors that support spawning a child actor when receiving a SpawnProtocol\#Spawn
message and sending back the [ActorRef](ActorRef.html) of the child actor. Create instances through the [SpawnProtocol\#apply](SpawnProtocol$.html#apply():akka.actor.typed.Behavior[akka.actor.typed.SpawnProtocol.Command])
or [SpawnProtocol\#create](SpawnProtocol$.html#create():akka.actor.typed.Behavior[akka.actor.typed.SpawnProtocol.Command]) factory methods.

The typical usage of this is to use it as the guardian actor of the [ActorSystem](ActorSystem.html), possibly combined with
`Behaviors.setup` to starts some initial tasks or actors. Child actors can then be started from the outside
by telling or asking SpawnProtocol\#Spawn to the actor reference of the system. When using `ask` this is
similar to how [akka.actor.ActorSystem\#actorOf](../ActorSystem.html#actorOf(props:akka.actor.Props,name:String):akka.actor.ActorRef) can be used in classic actors with the difference that
a `Future` / `CompletionStage` of the `ActorRef` is returned.

Stopping children is done through specific support in the protocol of the children, or stopping the entire
spawn protocol actor.

Definition Classes[typed](index.html)
- [Command](SpawnProtocol$$Command.html "Not for user extension")
- Spawn
c[akka](../../index.html).[actor](../index.html).[typed](index.html).[SpawnProtocol](SpawnProtocol$.html)

# Spawn[**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html "Permalink")

### 

#### final  case class Spawn\[T](behavior: [Behavior](Behavior.html)\[T], name: String, props: [Props](Props.html), replyTo: [ActorRef](ActorRef.html)\[[ActorRef](ActorRef.html)\[T]]) extends [Command](SpawnProtocol$$Command.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Spawn a child actor with the given `behavior` and send back the `ActorRef` of that child to the given
`replyTo` destination.

If `name` is an empty string an anonymous actor (with automatically generated name) will be created.

If the `name` is already taken of an existing actor a unique name will be used by appending a suffix
to the the `name`. The exact format or value of the suffix is an implementation detail that is
undefined. This means that reusing the same name for several actors will not result in
`InvalidActorNameException`, but it's better to use unique names to begin with.

Source[SpawnProtocol.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-typed/src/main/scala/akka/actor/typed/SpawnProtocol.scala#L44)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Command](SpawnProtocol$$Command.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Spawn
2. Serializable
3. Product
4. Equals
5. Command
6. AnyRef
7. Any
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

1. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#<init>(behavior:akka.actor.typed.Behavior[T],name:String,props:akka.actor.typed.Props,replyTo:akka.actor.typed.ActorRef[akka.actor.typed.ActorRef[T]]):akka.actor.typed.SpawnProtocol.Spawn[T] "Permalink")  new Spawn(behavior: [Behavior](Behavior.html)\[T], name: String, props: [Props](Props.html), replyTo: [ActorRef](ActorRef.html)\[[ActorRef](ActorRef.html)\[T]])
### Value Members

1. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Spawn\[T] toany2stringadd\[Spawn\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Spawn\[T], B)ImplicitThis member is added by an implicit conversion from Spawn\[T] toArrowAssoc\[Spawn\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#behavior:akka.actor.typed.Behavior[T] "Permalink")  val behavior: [Behavior](Behavior.html)\[T]
8. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Spawn\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Spawn\[T]ImplicitThis member is added by an implicit conversion from Spawn\[T] toEnsuring\[Spawn\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Spawn\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Spawn\[T]ImplicitThis member is added by an implicit conversion from Spawn\[T] toEnsuring\[Spawn\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Spawn\[T]ImplicitThis member is added by an implicit conversion from Spawn\[T] toEnsuring\[Spawn\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Spawn\[T]ImplicitThis member is added by an implicit conversion from Spawn\[T] toEnsuring\[Spawn\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#name:String "Permalink")  val name: String
17. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#props:akka.actor.typed.Props "Permalink")  val props: [Props](Props.html)
22. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#replyTo:akka.actor.typed.ActorRef[akka.actor.typed.ActorRef[T]] "Permalink")  val replyTo: [ActorRef](ActorRef.html)\[[ActorRef](ActorRef.html)\[T]]
23. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Spawn\[T] toStringFormat\[Spawn\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/actor/typed/SpawnProtocol$$Spawn.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Spawn\[T], B)ImplicitThis member is added by an implicit conversion from Spawn\[T] toArrowAssoc\[Spawn\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Command](SpawnProtocol$$Command.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSpawn\[T] to any2stringadd\[Spawn\[T]]

### Inherited by implicit conversion StringFormat fromSpawn\[T] to StringFormat\[Spawn\[T]]

### Inherited by implicit conversion Ensuring fromSpawn\[T] to Ensuring\[Spawn\[T]]

### Inherited by implicit conversion ArrowAssoc fromSpawn\[T] to ArrowAssoc\[Spawn\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/SpawnProtocol$$Command.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/SpawnProtocol$$Spawn.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/SpawnProtocol$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/SpawnProtocol$$Spawn.html](https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/SpawnProtocol$$Spawn.html)*