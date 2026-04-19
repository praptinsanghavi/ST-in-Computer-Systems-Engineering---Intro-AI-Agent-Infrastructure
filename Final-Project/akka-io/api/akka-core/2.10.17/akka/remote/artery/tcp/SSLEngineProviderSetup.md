---
description: Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProviderSetup
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:53:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/remote/artery/tcp/SSLEngineProviderSetup.html
title: Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProviderSetup
---

# Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProviderSetup

> **Summary:** Akka 2.10.17 - akka.remote.artery.tcp.SSLEngineProviderSetup

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/remote/index.html "Permalink")  package [remote](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/remote/artery/index.html "Permalink")  package [artery](../index.html)Definition Classes[remote](../../index.html)
- [**](../../../../akka/remote/artery/tcp/index.html "Permalink")  package [tcp](index.html)Definition Classes[artery](../index.html)
- [**](../../../../akka/remote/artery/tcp/ssl/index.html "Permalink")  package [ssl](ssl/index.html)Definition Classes[tcp](index.html)
- [ConfigSSLEngineProvider](ConfigSSLEngineProvider.html "Config in akka.remote.artery.ssl.config-ssl-engine")
- [SSLEngineProvider](SSLEngineProvider.html)
- SSLEngineProviderSetup
- [SslTransportException](SslTransportException.html)
[c](SSLEngineProviderSetup$.html "See companion object")[akka](../../../index.html).[remote](../../index.html).[artery](../index.html).[tcp](index.html)

# [SSLEngineProviderSetup](SSLEngineProviderSetup$.html "See companion object")[**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html "Permalink")

### Companion [object SSLEngineProviderSetup](SSLEngineProviderSetup$.html "See companion object")

#### class SSLEngineProviderSetup extends [Setup](../../../actor/setup/Setup.html)

Setup for defining a `SSLEngineProvider` that is passed in when ActorSystem
is created rather than creating one from configured class name. That is useful
when the SSLEngineProvider implementation require other external constructor parameters
or is created before the ActorSystem is created.

Constructor is \*Internal API\*, use factories in SSLEngineProviderSetup

Source[SSLEngineProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote/src/main/scala/akka/remote/artery/tcp/SSLEngineProvider.scala#L65)Linear Supertypes[Setup](../../../actor/setup/Setup.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SSLEngineProviderSetup
2. Setup
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SSLEngineProviderSetup toany2stringadd\[SSLEngineProviderSetup] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SSLEngineProviderSetup, B)ImplicitThis member is added by an implicit conversion from SSLEngineProviderSetup toArrowAssoc\[SSLEngineProviderSetup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#and(other:akka.actor.setup.Setup):akka.actor.setup.ActorSystemSetup "Permalink") final  def and(other: [Setup](../../../actor/setup/Setup.html)): [ActorSystemSetup](../../../actor/setup/ActorSystemSetup.html)Construct an ActorSystemSetup with this setup combined with another one.

Construct an ActorSystemSetup with this setup combined with another one. Allows for
fluent creation of settings. If `other` is a setting of the same concrete Setup as this
it will replace this.

Definition Classes[Setup](../../../actor/setup/Setup.html)
7. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SSLEngineProviderSetup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SSLEngineProviderSetupImplicitThis member is added by an implicit conversion from SSLEngineProviderSetup toEnsuring\[SSLEngineProviderSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SSLEngineProviderSetup) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SSLEngineProviderSetupImplicitThis member is added by an implicit conversion from SSLEngineProviderSetup toEnsuring\[SSLEngineProviderSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SSLEngineProviderSetupImplicitThis member is added by an implicit conversion from SSLEngineProviderSetup toEnsuring\[SSLEngineProviderSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SSLEngineProviderSetupImplicitThis member is added by an implicit conversion from SSLEngineProviderSetup toEnsuring\[SSLEngineProviderSetup] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#sslEngineProvider:akka.actor.ExtendedActorSystem=>akka.remote.artery.tcp.SSLEngineProvider "Permalink")  val sslEngineProvider: ([ExtendedActorSystem](../../../actor/ExtendedActorSystem.html)) \=\> [SSLEngineProvider](SSLEngineProvider.html)
22. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SSLEngineProviderSetup toStringFormat\[SSLEngineProviderSetup] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/remote/artery/tcp/SSLEngineProviderSetup.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SSLEngineProviderSetup, B)ImplicitThis member is added by an implicit conversion from SSLEngineProviderSetup toArrowAssoc\[SSLEngineProviderSetup] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Setup](../../../actor/setup/Setup.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSSLEngineProviderSetup to any2stringadd\[SSLEngineProviderSetup]

### Inherited by implicit conversion StringFormat fromSSLEngineProviderSetup to StringFormat\[SSLEngineProviderSetup]

### Inherited by implicit conversion Ensuring fromSSLEngineProviderSetup to Ensuring\[SSLEngineProviderSetup]

### Inherited by implicit conversion ArrowAssoc fromSSLEngineProviderSetup to ArrowAssoc\[SSLEngineProviderSetup]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/setup/ActorSystemSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/setup/Setup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/ConfigSSLEngineProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProviderSetup$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProviderSetup.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SslTransportException.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/ssl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProviderSetup.html](https://doc.akka.io/api/akka-core/2.10.17/akka/remote/artery/tcp/SSLEngineProviderSetup.html)*