---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.NonEmptyHost
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:20:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$NonEmptyHost.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.NonEmptyHost
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.NonEmptyHost

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.NonEmptyHost

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/Uri$.html "Permalink")  object [Uri](Uri$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[model](index.html)
- [Authority](Uri$$Authority.html)
- [Empty](Uri$$Empty$.html)
- [Host](Uri$$Host.html)
- [IPv4Host](Uri$$IPv4Host.html)
- [IPv6Host](Uri$$IPv6Host.html)
- [NamedHost](Uri$$NamedHost.html)
- NonEmptyHost
- [ParsingMode](Uri$$ParsingMode.html)
- [Path](Uri$$Path.html)
- [Query](Uri$$Query.html)
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Uri](Uri$.html)

# NonEmptyHost[**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html "Permalink")

### 

#### sealed abstract  class NonEmptyHost extends [Host](Uri$$Host.html)

Source[Uri.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Uri.scala#L470)Linear Supertypes[Host](Uri$$Host.html), [javadsl.model.Host](../../javadsl/model/Host.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[IPv4Host](Uri$$IPv4Host.html), [IPv6Host](Uri$$IPv6Host.html), [NamedHost](Uri$$NamedHost.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NonEmptyHost
2. Host
3. Host
4. AnyRef
5. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#address():String "Permalink") abstract  def address(): StringReturns a String representation of the address.

Returns a String representation of the address.

Definition Classes[Host](Uri$$Host.html) → [Host](../../javadsl/model/Host.html)
2. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#equalsIgnoreCase(other:akka.http.scaladsl.model.Uri.Host):Boolean "Permalink") abstract  def equalsIgnoreCase(other: [Host](Uri$$Host.html)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Host](Uri$$Host.html)
3. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#inetAddresses:Seq[java.net.InetAddress] "Permalink") abstract  def inetAddresses: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)]Definition Classes[Host](Uri$$Host.html)
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NonEmptyHost toany2stringadd\[NonEmptyHost] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NonEmptyHost, B)ImplicitThis member is added by an implicit conversion from NonEmptyHost toArrowAssoc\[NonEmptyHost] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NonEmptyHost) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NonEmptyHostImplicitThis member is added by an implicit conversion from NonEmptyHost toEnsuring\[NonEmptyHost] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NonEmptyHost) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NonEmptyHostImplicitThis member is added by an implicit conversion from NonEmptyHost toEnsuring\[NonEmptyHost] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NonEmptyHostImplicitThis member is added by an implicit conversion from NonEmptyHost toEnsuring\[NonEmptyHost] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NonEmptyHostImplicitThis member is added by an implicit conversion from NonEmptyHost toEnsuring\[NonEmptyHost] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#getInetAddresses():Iterable[java.net.InetAddress] "Permalink")  def getInetAddresses(): [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[InetAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetAddress.html#java.net.InetAddress)]Java API

Java API

Definition Classes[Host](Uri$$Host.html) → [Host](../../javadsl/model/Host.html)
16. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#isEmpty():Boolean "Permalink")  def isEmpty(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesNonEmptyHost → [Host](Uri$$Host.html) → [Host](../../javadsl/model/Host.html)
18. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#isIPv4():Boolean "Permalink")  def isIPv4(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Host](Uri$$Host.html) → [Host](../../javadsl/model/Host.html)
19. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#isIPv6():Boolean "Permalink")  def isIPv6(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Host](Uri$$Host.html) → [Host](../../javadsl/model/Host.html)
20. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#isNamedHost():Boolean "Permalink")  def isNamedHost(): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Host](Uri$$Host.html) → [Host](../../javadsl/model/Host.html)
22. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#toOption:Some[akka.http.scaladsl.model.Uri.NonEmptyHost] "Permalink")  def toOption: [Some](https://www.scala-lang.org/api/2.13.17/scala/Some.html#scala.Some)\[NonEmptyHost]Definition ClassesNonEmptyHost → [Host](Uri$$Host.html)
27. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#toString():String "Permalink")  def toString(): StringDefinition Classes[Host](Uri$$Host.html) → AnyRef → Any
28. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NonEmptyHost toStringFormat\[NonEmptyHost] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/Uri$$NonEmptyHost.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NonEmptyHost, B)ImplicitThis member is added by an implicit conversion from NonEmptyHost toArrowAssoc\[NonEmptyHost] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Host](Uri$$Host.html)

### Inherited from [javadsl.model.Host](../../javadsl/model/Host.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNonEmptyHost to any2stringadd\[NonEmptyHost]

### Inherited by implicit conversion StringFormat fromNonEmptyHost to StringFormat\[NonEmptyHost]

### Inherited by implicit conversion Ensuring fromNonEmptyHost to Ensuring\[NonEmptyHost]

### Inherited by implicit conversion ArrowAssoc fromNonEmptyHost to ArrowAssoc\[NonEmptyHost]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Authority$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Authority.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Empty$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Host$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv4Host$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv4Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv6Host$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$IPv6Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$NamedHost.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$NonEmptyHost.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$ParsingMode$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$ParsingMode.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Query$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Query.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$NonEmptyHost.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$NonEmptyHost.html)*