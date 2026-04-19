---
description: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:19:44Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials
---

# Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/javadsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[javadsl](../../index.html)
- [**](../../../../../akka/http/javadsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$.html "Permalink")  object [SecurityDirectives](SecurityDirectives$.html)Definition Classes[directives](index.html)
- ProvidedCredentials
c[akka](../../../../index.html).[http](../../../index.html).[javadsl](../../index.html).[server](../index.html).[directives](index.html).[SecurityDirectives](SecurityDirectives$.html)

# ProvidedCredentials[**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html "Permalink")

### 

#### case class ProvidedCredentials(asScala: [Provided](../../../scaladsl/server/directives/Credentials$$Provided.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Represents HTTP Basic or OAuth2 authentication credentials supplied with a request.

Source[SecurityDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/server/directives/SecurityDirectives.scala#L26)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ProvidedCredentials
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
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

1. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#<init>(asScala:akka.http.scaladsl.server.directives.Credentials.Provided):akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials "Permalink")  new ProvidedCredentials(asScala: [Provided](../../../scaladsl/server/directives/Credentials$$Provided.html))
### Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ProvidedCredentials toany2stringadd\[ProvidedCredentials] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ProvidedCredentials, B)ImplicitThis member is added by an implicit conversion from ProvidedCredentials toArrowAssoc\[ProvidedCredentials] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ProvidedCredentials) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ProvidedCredentialsImplicitThis member is added by an implicit conversion from ProvidedCredentials toEnsuring\[ProvidedCredentials] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ProvidedCredentials) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ProvidedCredentialsImplicitThis member is added by an implicit conversion from ProvidedCredentials toEnsuring\[ProvidedCredentials] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ProvidedCredentialsImplicitThis member is added by an implicit conversion from ProvidedCredentials toEnsuring\[ProvidedCredentials] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ProvidedCredentialsImplicitThis member is added by an implicit conversion from ProvidedCredentials toEnsuring\[ProvidedCredentials] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#identifier:String "Permalink")  def identifier: StringThe username or token provided with the credentials
15. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#verify(secret:String):Boolean "Permalink")  def verify(secret: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Safely compares the passed in `secret` with the received secret part of the Credentials.

Safely compares the passed in `secret` with the received secret part of the Credentials.
Use of this method instead of manual String equality testing is recommended in order to guard against timing attacks.

See also akka.http.impl.util.EnhancedString\#secure\_\=\=, for more information.
22. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ProvidedCredentials toStringFormat\[ProvidedCredentials] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ProvidedCredentials, B)ImplicitThis member is added by an implicit conversion from ProvidedCredentials toArrowAssoc\[ProvidedCredentials] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromProvidedCredentials to any2stringadd\[ProvidedCredentials]

### Inherited by implicit conversion StringFormat fromProvidedCredentials to StringFormat\[ProvidedCredentials]

### Inherited by implicit conversion Ensuring fromProvidedCredentials to Ensuring\[ProvidedCredentials]

### Inherited by implicit conversion ArrowAssoc fromProvidedCredentials to ArrowAssoc\[ProvidedCredentials]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$$Provided.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/server/directives/SecurityDirectives$$ProvidedCredentials.html)*