---
description: Akka HTTP 10.7.4 - akka.http.javadsl.common.EntityStreamingSupport
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:06:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/EntityStreamingSupport.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.common.EntityStreamingSupport
---

# Akka HTTP 10.7.4 - akka.http.javadsl.common.EntityStreamingSupport

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.common.EntityStreamingSupport

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/javadsl/common/index.html "Permalink")  package [common](index.html)Definition Classes[javadsl](../index.html)
- [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html)
- EntityStreamingSupport
- [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html)
- [PartialApplication](PartialApplication$.html "Contains helpful methods to partially apply Functions for Java")
- [RegexConverters](RegexConverters.html)
- [SSLContextFactory](SSLContextFactory$.html)
[c](EntityStreamingSupport$.html "See companion object")[akka](../../../index.html).[http](../../index.html).[javadsl](../index.html).[common](index.html)

# [EntityStreamingSupport](EntityStreamingSupport$.html "See companion object")[**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html "Permalink")

### Companion [object EntityStreamingSupport](EntityStreamingSupport$.html "See companion object")

#### abstract  class EntityStreamingSupport extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Entity streaming support trait allowing rendering and receiving incoming `Source[T, _]` from HTTP entities.

See [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html) or [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html) for default implementations.

Source[EntityStreamingSupport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/javadsl/common/EntityStreamingSupport.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[CsvEntityStreamingSupport](CsvEntityStreamingSupport.html), [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html), [CsvEntityStreamingSupport](../../scaladsl/common/CsvEntityStreamingSupport.html), [EntityStreamingSupport](../../scaladsl/common/EntityStreamingSupport.html), [JsonEntityStreamingSupport](../../scaladsl/common/JsonEntityStreamingSupport.html), [JsonEntityStreamingSupport](../../scaladsl/marshallers/sprayjson/JsonEntityStreamingSupport.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. EntityStreamingSupport
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

1. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#<init>():akka.http.javadsl.common.EntityStreamingSupport "Permalink")  new EntityStreamingSupport()
### Abstract Value Members

1. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#contentType:akka.http.javadsl.model.ContentType "Permalink") abstract  def contentType: [ContentType](../model/ContentType.html)Write\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response.
2. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#getFramingDecoder:akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "Permalink") abstract  def getFramingDecoder: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Read\-side, decode incoming framed entity.

Read\-side, decode incoming framed entity.
For example with an incoming JSON array, chunk it up into JSON objects contained within that array.
3. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#getFramingRenderer:akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "Permalink") abstract  def getFramingRenderer: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [ByteString](https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html#akka.util.ByteString), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Write\-side, apply framing to outgoing entity stream.

Write\-side, apply framing to outgoing entity stream.

Most typical usage will be a variant of `Flow[ByteString].intersperse`.

For example for rendering a JSON array one would return
`Flow[ByteString].intersperse(ByteString("["), ByteString(","), ByteString("]"))`
and for rendering a new\-line separated CSV simply `Flow[ByteString].intersperse(ByteString("\n"))`.
4. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#parallelism:Int "Permalink") abstract  def parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Write\-side / read\-side, defines if (un)marshalling should be done in parallel.

Write\-side / read\-side, defines if (un)marshalling should be done in parallel.

This may be beneficial marshalling the bottleneck in the pipeline.

See also [parallelism](#parallelism:Int) and [withParallelMarshalling](#withParallelMarshalling(parallelism:Int,unordered:Boolean):akka.http.javadsl.common.EntityStreamingSupport).
5. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#supported:akka.http.javadsl.model.ContentTypeRange "Permalink") abstract  def supported: [ContentTypeRange](../model/ContentTypeRange.html)Read\-side, what content types it is able to frame and unmarshall.
6. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#unordered:Boolean "Permalink") abstract  def unordered: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Write\-side / read\-side, defines if (un)marshalling of incoming stream elements should be preserved or not.

Write\-side / read\-side, defines if (un)marshalling of incoming stream elements should be preserved or not.

Allowing for parallel and unordered (un)marshalling often yields higher throughput and also allows avoiding
head\-of\-line blocking if some elements are much larger than others.

See also [parallelism](#parallelism:Int) and [withParallelMarshalling](#withParallelMarshalling(parallelism:Int,unordered:Boolean):akka.http.javadsl.common.EntityStreamingSupport).
7. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#withContentType(range:akka.http.javadsl.model.ContentType):akka.http.javadsl.common.EntityStreamingSupport "Permalink") abstract  def withContentType(range: [ContentType](../model/ContentType.html)): EntityStreamingSupportWrite\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response.

Write\-side, defines what Content\-Type the Marshaller should offer and the final Content\-Type of the response.

EntityStreamingSupport traits MUST support re\-configuring the offered ContentType.
This is due to the need integrating with existing systems which sometimes excpect custom Content\-Types,
however really are just plain JSON or something else internally (perhaps with slight extensions).

NOTE: Implementations should specialize the return type to their own Type!
8. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#withParallelMarshalling(parallelism:Int,unordered:Boolean):akka.http.javadsl.common.EntityStreamingSupport "Permalink") abstract  def withParallelMarshalling(parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), unordered: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityStreamingSupportWrite\-side / read\-side, defines parallelism and if ordering should be preserved or not of Source element marshalling.

Write\-side / read\-side, defines parallelism and if ordering should be preserved or not of Source element marshalling.

Sometimes marshalling multiple elements at once (esp. when elements are not evenly sized, and ordering is not enforced)
may yield in higher throughput.

NOTE: Implementations should specialize the return type to their own Type!
9. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#withSupported(range:akka.http.javadsl.model.ContentTypeRange):akka.http.javadsl.common.EntityStreamingSupport "Permalink") abstract  def withSupported(range: [ContentTypeRange](../model/ContentTypeRange.html)): EntityStreamingSupportRead\-side, allows changing what content types are accepted by this framing.

Read\-side, allows changing what content types are accepted by this framing.

EntityStreamingSupport traits MUST support re\-configuring the accepted ContentTypeRange.

This is in order to support a\-typical APIs which users still want to communicate with using
the provided support trait. Typical examples include APIs which return valid `application/json`
however advertise the content type as being `application/javascript` or vendor specific content types,
which still parse correctly as JSON, CSV or something else that a provided support trait is built for.

NOTE: Implementations should specialize the return type to their own Type!
### Concrete Value Members

1. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from EntityStreamingSupport toany2stringadd\[EntityStreamingSupport] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (EntityStreamingSupport, B)ImplicitThis member is added by an implicit conversion from EntityStreamingSupport toArrowAssoc\[EntityStreamingSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (EntityStreamingSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EntityStreamingSupportImplicitThis member is added by an implicit conversion from EntityStreamingSupport toEnsuring\[EntityStreamingSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (EntityStreamingSupport) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityStreamingSupportImplicitThis member is added by an implicit conversion from EntityStreamingSupport toEnsuring\[EntityStreamingSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): EntityStreamingSupportImplicitThis member is added by an implicit conversion from EntityStreamingSupport toEnsuring\[EntityStreamingSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): EntityStreamingSupportImplicitThis member is added by an implicit conversion from EntityStreamingSupport toEnsuring\[EntityStreamingSupport] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from EntityStreamingSupport toStringFormat\[EntityStreamingSupport] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/javadsl/common/EntityStreamingSupport.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (EntityStreamingSupport, B)ImplicitThis member is added by an implicit conversion from EntityStreamingSupport toArrowAssoc\[EntityStreamingSupport] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromEntityStreamingSupport to any2stringadd\[EntityStreamingSupport]

### Inherited by implicit conversion StringFormat fromEntityStreamingSupport to StringFormat\[EntityStreamingSupport]

### Inherited by implicit conversion Ensuring fromEntityStreamingSupport to Ensuring\[EntityStreamingSupport]

### Inherited by implicit conversion ArrowAssoc fromEntityStreamingSupport to ArrowAssoc\[EntityStreamingSupport]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/util/ByteString.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/EntityStreamingSupport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/PartialApplication$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/RegexConverters.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/SSLContextFactory$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/model/ContentTypeRange.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/sprayjson/JsonEntityStreamingSupport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/EntityStreamingSupport.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/common/EntityStreamingSupport.html)*