---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Authority
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:20:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/Uri$$Authority.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Authority
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Authority

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.Uri.Authority

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/Uri$.html "Permalink")  object [Uri](Uri$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[model](index.html)
- Authority
- [Empty](Uri$$Empty$.html)
- [Host](Uri$$Host.html)
- [IPv4Host](Uri$$IPv4Host.html)
- [IPv6Host](Uri$$IPv6Host.html)
- [NamedHost](Uri$$NamedHost.html)
- [NonEmptyHost](Uri$$NonEmptyHost.html)
- [ParsingMode](Uri$$ParsingMode.html)
- [Path](Uri$$Path.html)
- [Query](Uri$$Query.html)
[c](Uri$$Authority$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[Uri](Uri$.html)

# [Authority](Uri$$Authority$.html "See companion object")[**](../../../../akka/http/scaladsl/model/Uri$$Authority.html "Permalink")

### Companion [object Authority](Uri$$Authority$.html "See companion object")

#### final  case class Authority(host: [Host](Uri$$Host.html), port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, userinfo: String \= "") extends [javadsl.model.Authority](../../javadsl/model/Authority.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

portA port number that may be `0` to signal the default port of for scheme.
 In general what you want is not the value of this field but [Uri.effectivePort](Uri.html#effectivePort:Int).

userinfoThe percent decoded userinfo. According to https://tools.ietf.org/html/rfc3986\#section\-3\.2\.1
 the "user:password" syntax is deprecated and implementations are encouraged to ignore any characters
 after the colon (`:`). Therefore, it is not guaranteed that future versions of this class will
 preserve full userinfo between parsing and rendering (even if it might do so right now).

Source[Uri.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/Uri.scala#L410)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [javadsl.model.Authority](../../javadsl/model/Authority.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Authority
2. Serializable
3. Product
4. Equals
5. Authority
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

1. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#<init>(host:akka.http.scaladsl.model.Uri.Host,port:Int,userinfo:String):akka.http.scaladsl.model.Uri.Authority "Permalink")  new Authority(host: [Host](Uri$$Host.html), port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, userinfo: String \= "")portA port number that may be `0` to signal the default port of for scheme.
 In general what you want is not the value of this field but [Uri.effectivePort](Uri.html#effectivePort:Int).

userinfoThe percent decoded userinfo. According to https://tools.ietf.org/html/rfc3986\#section\-3\.2\.1
 the "user:password" syntax is deprecated and implementations are encouraged to ignore any characters
 after the colon (`:`). Therefore, it is not guaranteed that future versions of this class will
 preserve full userinfo between parsing and rendering (even if it might do so right now).
### Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Authority toany2stringadd\[Authority] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Authority, B)ImplicitThis member is added by an implicit conversion from Authority toArrowAssoc\[Authority] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Authority) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AuthorityImplicitThis member is added by an implicit conversion from Authority toEnsuring\[Authority] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Authority) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AuthorityImplicitThis member is added by an implicit conversion from Authority toEnsuring\[Authority] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): AuthorityImplicitThis member is added by an implicit conversion from Authority toEnsuring\[Authority] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): AuthorityImplicitThis member is added by an implicit conversion from Authority toEnsuring\[Authority] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#host:akka.http.scaladsl.model.Uri.Host "Permalink")  val host: [Host](Uri$$Host.html)Host in a URI

Host in a URI

Definition ClassesAuthority → [Authority](../../javadsl/model/Authority.html)
15. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
16. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#nonEmpty:Boolean "Permalink")  def nonEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
19. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#normalizedFor(scheme:String):akka.http.scaladsl.model.Uri.Authority "Permalink")  def normalizedFor(scheme: String): Authority
20. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#normalizedForHttp(encrypted:Boolean):akka.http.scaladsl.model.Uri.Authority "Permalink")  def normalizedForHttp(encrypted: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): Authority
21. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#port:Int "Permalink")  val port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)A port number that may be `0` to signal the default port of for scheme.

A port number that may be `0` to signal the default port of for scheme.
In general what you want is not the value of this field but `Uri::port::`

Definition ClassesAuthority → [Authority](../../javadsl/model/Authority.html)
24. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
25. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#toString():String "Permalink")  def toString(): StringDefinition ClassesAuthority → AnyRef → Any
27. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#userinfo:String "Permalink")  val userinfo: StringThe percent decoded userinfo.

The percent decoded userinfo. According to https://tools.ietf.org/html/rfc3986\#section\-3\.2\.1
the "user:password" syntax is deprecated and implementations are encouraged to ignore any characters
after the colon (`:`). Therefore, it is not guaranteed that future versions of this class will
preserve full userinfo between parsing and rendering (even if it might do so right now).

Definition ClassesAuthority → [Authority](../../javadsl/model/Authority.html)
28. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Authority toStringFormat\[Authority] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/model/Uri$$Authority.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Authority, B)ImplicitThis member is added by an implicit conversion from Authority toArrowAssoc\[Authority] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [javadsl.model.Authority](../../javadsl/model/Authority.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromAuthority to any2stringadd\[Authority]

### Inherited by implicit conversion StringFormat fromAuthority to StringFormat\[Authority]

### Inherited by implicit conversion Ensuring fromAuthority to Ensuring\[Authority]

### Inherited by implicit conversion ArrowAssoc fromAuthority to ArrowAssoc\[Authority]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/Authority.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Authority.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Authority.html)*