---
description: Akka 2.10.17 - akka.testkit.SocketUtil.Protocol
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:19:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/SocketUtil$$Protocol.html
title: Akka 2.10.17 - akka.testkit.SocketUtil.Protocol
---

# Akka 2.10.17 - akka.testkit.SocketUtil.Protocol

> **Summary:** Akka 2.10.17 - akka.testkit.SocketUtil.Protocol

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/SocketUtil$.html "Permalink")  object [SocketUtil](SocketUtil$.html "Utilities to get free socket address.")Utilities to get free socket address.

Utilities to get free socket address.

Definition Classes[testkit](index.html)
- [Both](SocketUtil$$Both$.html)
- Protocol
- [Tcp](SocketUtil$$Tcp$.html)
- [Udp](SocketUtil$$Udp$.html)
t[akka](../index.html).[testkit](index.html).[SocketUtil](SocketUtil$.html)

# Protocol[**](../../akka/testkit/SocketUtil$$Protocol.html "Permalink")

### 

#### sealed  trait Protocol extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[SocketUtil.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/SocketUtil.scala#L31)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Both](SocketUtil$$Both$.html), [Tcp](SocketUtil$$Tcp$.html), [Udp](SocketUtil$$Udp$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Protocol
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
### Value Members

1. [**](../../akka/testkit/SocketUtil$$Protocol.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/SocketUtil$$Protocol.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/SocketUtil$$Protocol.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Protocol toany2stringadd\[Protocol] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/testkit/SocketUtil$$Protocol.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Protocol, B)ImplicitThis member is added by an implicit conversion from Protocol toArrowAssoc\[Protocol] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/testkit/SocketUtil$$Protocol.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/testkit/SocketUtil$$Protocol.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/testkit/SocketUtil$$Protocol.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/testkit/SocketUtil$$Protocol.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Protocol) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ProtocolImplicitThis member is added by an implicit conversion from Protocol toEnsuring\[Protocol] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/testkit/SocketUtil$$Protocol.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Protocol) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ProtocolImplicitThis member is added by an implicit conversion from Protocol toEnsuring\[Protocol] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/testkit/SocketUtil$$Protocol.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ProtocolImplicitThis member is added by an implicit conversion from Protocol toEnsuring\[Protocol] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/testkit/SocketUtil$$Protocol.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ProtocolImplicitThis member is added by an implicit conversion from Protocol toEnsuring\[Protocol] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/testkit/SocketUtil$$Protocol.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/testkit/SocketUtil$$Protocol.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/testkit/SocketUtil$$Protocol.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/testkit/SocketUtil$$Protocol.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/testkit/SocketUtil$$Protocol.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/testkit/SocketUtil$$Protocol.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/testkit/SocketUtil$$Protocol.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/testkit/SocketUtil$$Protocol.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/testkit/SocketUtil$$Protocol.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/testkit/SocketUtil$$Protocol.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/testkit/SocketUtil$$Protocol.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/testkit/SocketUtil$$Protocol.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/testkit/SocketUtil$$Protocol.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/SocketUtil$$Protocol.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/testkit/SocketUtil$$Protocol.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Protocol toStringFormat\[Protocol] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/testkit/SocketUtil$$Protocol.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Protocol, B)ImplicitThis member is added by an implicit conversion from Protocol toArrowAssoc\[Protocol] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromProtocol to any2stringadd\[Protocol]

### Inherited by implicit conversion StringFormat fromProtocol to StringFormat\[Protocol]

### Inherited by implicit conversion Ensuring fromProtocol to Ensuring\[Protocol]

### Inherited by implicit conversion ArrowAssoc fromProtocol to ArrowAssoc\[Protocol]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/SocketUtil$$Both$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/SocketUtil$$Protocol.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/SocketUtil$$Tcp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/SocketUtil$$Udp$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/SocketUtil$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/testkit/SocketUtil$$Protocol.html](https://doc.akka.io/api/akka-core/2.10/akka/testkit/SocketUtil$$Protocol.html)*