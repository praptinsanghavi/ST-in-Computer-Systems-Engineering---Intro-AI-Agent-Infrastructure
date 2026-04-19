---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaTypes.multipart
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:44:41Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/MediaTypes$$multipart$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaTypes.multipart
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaTypes.multipart

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.MediaTypes.multipart

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/model/MediaTypes$.html "Permalink")  object [MediaTypes](MediaTypes$.html) extends ObjectRegistry\[(String, String), [MediaType](MediaType.html)]Definition Classes[model](index.html)
- multipart
o[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[model](index.html).[MediaTypes](MediaTypes$.html)

# multipart[**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html "Permalink")

### 

#### object multipart

Source[MediaType.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/model/MediaType.scala#L477)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. multipart
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#alternative(params:Map[String,String]):akka.http.scaladsl.model.MediaType.Multipart "Permalink")  def alternative(params: Map\[String, String]): [MediaType.Multipart](MediaType$$Multipart.html)
5. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#byteRanges(params:Map[String,String]):akka.http.scaladsl.model.MediaType.Multipart "Permalink")  def byteRanges(params: Map\[String, String]): [MediaType.Multipart](MediaType$$Multipart.html)
7. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#encrypted(params:Map[String,String]):akka.http.scaladsl.model.MediaType.Multipart "Permalink")  def encrypted(params: Map\[String, String]): [MediaType.Multipart](MediaType$$Multipart.html)
9. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#form-data(params:Map[String,String]):akka.http.scaladsl.model.MediaType.Multipart "Permalink")  def form\-data(params: Map\[String, String]): [MediaType.Multipart](MediaType$$Multipart.html)
12. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#mixed(params:Map[String,String]):akka.http.scaladsl.model.MediaType.Multipart "Permalink")  def mixed(params: Map\[String, String]): [MediaType.Multipart](MediaType$$Multipart.html)
16. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#related(params:Map[String,String]):akka.http.scaladsl.model.MediaType.Multipart "Permalink")  def related(params: Map\[String, String]): [MediaType.Multipart](MediaType$$Multipart.html)
20. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#signed(params:Map[String,String]):akka.http.scaladsl.model.MediaType.Multipart "Permalink")  def signed(params: Map\[String, String]): [MediaType.Multipart](MediaType$$Multipart.html)
21. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/model/MediaTypes$$multipart$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType$$Multipart.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$$multipart$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$$multipart$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/MediaTypes$$multipart$.html)*