---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.Credentials.Provided
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:13:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/Credentials$$Provided.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.Credentials.Provided
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.Credentials.Provided

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.Credentials.Provided

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/Credentials$.html "Permalink")  object [Credentials](Credentials$.html)Definition Classes[directives](index.html)
- [Missing](Credentials$$Missing$.html)
- Provided
c[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html).[Credentials](Credentials$.html)

# Provided[**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html "Permalink")

### 

#### abstract  case class Provided(identifier: String) extends [Credentials](Credentials.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[SecurityDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/SecurityDirectives.scala#L286)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Credentials](Credentials.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Provided
2. Serializable
3. Product
4. Equals
5. Credentials
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

1. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#<init>(identifier:String):akka.http.scaladsl.server.directives.Credentials.Provided "Permalink")  new Provided(identifier: String)
### Abstract Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#provideVerify(verifier:String=>Boolean):Boolean "Permalink") abstract  def provideVerify(verifier: (String) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Compares with custom 'verifier' the received secret part of the Credentials.

Compares with custom 'verifier' the received secret part of the Credentials.
Use of this method only if custom String equality testing is required, not recommended.
2. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#verify(secret:String,hasher:String=>String):Boolean "Permalink") abstract  def verify(secret: String, hasher: (String) \=\> String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)First applies the passed in `hasher` function to the received secret part of the Credentials
and then safely compares the passed in `secret` with the hashed received secret.

First applies the passed in `hasher` function to the received secret part of the Credentials
and then safely compares the passed in `secret` with the hashed received secret.
This method can be used if the secret is not stored in plain text.
Use of this method instead of manual String equality testing is recommended in order to guard against timing attacks.

See also EnhancedString\#secure\_\=\=, for more information.
### Concrete Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Provided toany2stringadd\[Provided] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Provided, B)ImplicitThis member is added by an implicit conversion from Provided toArrowAssoc\[Provided] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Provided) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ProvidedImplicitThis member is added by an implicit conversion from Provided toEnsuring\[Provided] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Provided) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ProvidedImplicitThis member is added by an implicit conversion from Provided toEnsuring\[Provided] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ProvidedImplicitThis member is added by an implicit conversion from Provided toEnsuring\[Provided] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ProvidedImplicitThis member is added by an implicit conversion from Provided toEnsuring\[Provided] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#identifier:String "Permalink")  val identifier: String
15. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#provideVerify(secret:String,verifier:(String,String)=>Boolean):Boolean "Permalink")  def provideVerify(secret: String, verifier: (String, String) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Compares with custom 'verifier' and the passed secret with the received secret part of the Credentials.

Compares with custom 'verifier' and the passed secret with the received secret part of the Credentials.
Use of this method only if custom String equality testing is required, not recommended.
21. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#verify(secret:String):Boolean "Permalink")  def verify(secret: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Safely compares the passed in `secret` with the received secret part of the Credentials.

Safely compares the passed in `secret` with the received secret part of the Credentials.
Use of this method instead of manual String equality testing is recommended in order to guard against timing attacks.

See also EnhancedString\#secure\_\=\=, for more information.
23. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Provided toStringFormat\[Provided] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/directives/Credentials$$Provided.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Provided, B)ImplicitThis member is added by an implicit conversion from Provided toArrowAssoc\[Provided] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Credentials](Credentials.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromProvided to any2stringadd\[Provided]

### Inherited by implicit conversion StringFormat fromProvided to StringFormat\[Provided]

### Inherited by implicit conversion Ensuring fromProvided to Ensuring\[Provided]

### Inherited by implicit conversion ArrowAssoc fromProvided to ArrowAssoc\[Provided]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$$Missing$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$$Provided.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$$Provided.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$$Provided.html)*