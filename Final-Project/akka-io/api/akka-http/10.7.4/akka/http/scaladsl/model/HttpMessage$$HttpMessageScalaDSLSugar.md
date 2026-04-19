---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage.HttpMessageScalaDSLSugar
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:12:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage.HttpMessageScalaDSLSugar
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage.HttpMessageScalaDSLSugar

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.HttpMessage.HttpMessageScalaDSLSugar

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/HttpMessage$.html "Permalink")  object [HttpMessage](HttpMessage$.html)Definition Classes[model](index.html)
- [DiscardedEntity](HttpMessage$$DiscardedEntity.html "Represents the currently being-drained HTTP Entity which triggers completion of the contained Future once the entity has been drained for the given HttpMessage completely.")
- HttpMessageScalaDSLSugar
c[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[HttpMessage](HttpMessage$.html)

# HttpMessageScalaDSLSugar[**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html "Permalink")

### 

#### implicit final  class HttpMessageScalaDSLSugar extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

Adds Scala DSL idiomatic methods to [HttpMessage](HttpMessage.html), e.g. versions of methods with an implicit Materializer.

Source[HttpMessage.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/HttpMessage.scala#L288)Linear Supertypes[AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpMessageScalaDSLSugar
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

1. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#<init>(httpMessage:akka.http.scaladsl.model.HttpMessage):akka.http.scaladsl.model.HttpMessage.HttpMessageScalaDSLSugar "Permalink")  new HttpMessageScalaDSLSugar(httpMessage: [HttpMessage](HttpMessage.html))
### Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
2. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAny
3. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpMessageScalaDSLSugar toany2stringadd\[HttpMessageScalaDSLSugar] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpMessageScalaDSLSugar, B)ImplicitThis member is added by an implicit conversion from HttpMessageScalaDSLSugar toArrowAssoc\[HttpMessageScalaDSLSugar] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
6. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#discardEntityBytes()(implicitmat:akka.stream.Materializer):akka.http.scaladsl.model.HttpMessage.DiscardedEntity "Permalink")  def discardEntityBytes()(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [DiscardedEntity](HttpMessage$$DiscardedEntity.html)Discards the entities data bytes by running the `dataBytes` Source contained by the `entity` of this HTTP message.

Discards the entities data bytes by running the `dataBytes` Source contained by the `entity` of this HTTP message.

Note: It is crucial that entities are either discarded, or consumed by running the underlying [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html)
as otherwise the lack of consuming of the data will trigger back\-pressure to the underlying TCP connection
(as designed), however possibly leading to an idle\-timeout that will close the connection, instead of
just having ignored the data.

Warning: It is not allowed to discard and/or consume the `entity.dataBytes` more than once
as the stream is directly attached to the "live" incoming data source from the underlying TCP connection.
Allowing it to be consumable twice would require buffering the incoming data, thus defeating the purpose
of its streaming nature. If the dataBytes source is materialized a second time, it will fail with an
"stream can cannot be materialized more than once" exception.

When called on `Strict` entities or sources whose values can be buffered in memory,
the above warnings can be ignored. Repeated materialization is not necessary in this case, avoiding
the mentioned exceptions due to the data being held in memory.

In future versions, more automatic ways to warn or resolve these situations may be introduced, see issue \#18716\.
8. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpMessageScalaDSLSugar) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpMessageScalaDSLSugarImplicitThis member is added by an implicit conversion from HttpMessageScalaDSLSugar toEnsuring\[HttpMessageScalaDSLSugar] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpMessageScalaDSLSugar) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpMessageScalaDSLSugarImplicitThis member is added by an implicit conversion from HttpMessageScalaDSLSugar toEnsuring\[HttpMessageScalaDSLSugar] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpMessageScalaDSLSugarImplicitThis member is added by an implicit conversion from HttpMessageScalaDSLSugar toEnsuring\[HttpMessageScalaDSLSugar] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpMessageScalaDSLSugarImplicitThis member is added by an implicit conversion from HttpMessageScalaDSLSugar toEnsuring\[HttpMessageScalaDSLSugar] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#getClass():Class[_<:AnyVal] "Permalink")  def getClass(): Class\[\_ \<: [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)]Definition ClassesAnyVal → Any
13. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#httpMessage:akka.http.scaladsl.model.HttpMessage "Permalink")  val httpMessage: [HttpMessage](HttpMessage.html)
14. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAny
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpMessageScalaDSLSugar toStringFormat\[HttpMessageScalaDSLSugar] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
2. [**](../../../../akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpMessageScalaDSLSugar, B)ImplicitThis member is added by an implicit conversion from HttpMessageScalaDSLSugar toArrowAssoc\[HttpMessageScalaDSLSugar] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttpMessageScalaDSLSugar to any2stringadd\[HttpMessageScalaDSLSugar]

### Inherited by implicit conversion StringFormat fromHttpMessageScalaDSLSugar to StringFormat\[HttpMessageScalaDSLSugar]

### Inherited by implicit conversion Ensuring fromHttpMessageScalaDSLSugar to Ensuring\[HttpMessageScalaDSLSugar]

### Inherited by implicit conversion ArrowAssoc fromHttpMessageScalaDSLSugar to ArrowAssoc\[HttpMessageScalaDSLSugar]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$$DiscardedEntity.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpMessage$$HttpMessageScalaDSLSugar.html)*