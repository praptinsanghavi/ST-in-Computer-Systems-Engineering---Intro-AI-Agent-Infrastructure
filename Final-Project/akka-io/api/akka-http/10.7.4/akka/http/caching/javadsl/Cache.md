---
description: Akka HTTP 10.7.4 - akka.http.caching.javadsl.Cache
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/caching/javadsl/Cache.html
title: Akka HTTP 10.7.4 - akka.http.caching.javadsl.Cache
---

# Akka HTTP 10.7.4 - akka.http.caching.javadsl.Cache

> **Summary:** Akka HTTP 10.7.4 - akka.http.caching.javadsl.Cache

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/caching/index.html "Permalink")  package [caching](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/caching/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[caching](../index.html)
- Cache
- [CachingSettings](CachingSettings.html "Public API but not intended for subclassing")
- [LfuCacheSettings](LfuCacheSettings.html "Public API but not intended for subclassing")
t[akka](../../../index.html).[http](../../index.html).[caching](../index.html).[javadsl](index.html)

# Cache[**](../../../../akka/http/caching/javadsl/Cache.html "Permalink")

### 

#### trait Cache\[K, V] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Annotations@ApiMayChange() @DoNotInherit() Source[Cache.java](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-caching/src/main/java/akka/http/caching/javadsl/Cache.java#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Cache](../scaladsl/Cache.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Cache
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
### Abstract Value Members

1. [**](../../../../akka/http/caching/javadsl/Cache.html#clear():Unit "Permalink") abstract  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clears the cache by removing all entries.
2. [**](../../../../akka/http/caching/javadsl/Cache.html#getFuture(key:K,genValue:akka.japi.Creator[java.util.concurrent.CompletionStage[V]]):java.util.concurrent.CompletionStage[V] "Permalink") abstract  def getFuture(key: K, genValue: [Creator](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Creator.html#akka.japi.Creator)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[V]]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[V]Returns either the cached CompletionStage for the given key or evaluates the given value generating
function producing a `CompletionStage<V>`.
3. [**](../../../../akka/http/caching/javadsl/Cache.html#getKeys():java.util.Set[K] "Permalink") abstract  def getKeys(): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[K]Returns the set of keys in the cache, in no particular order
Should return in roughly constant time.

Returns the set of keys in the cache, in no particular order
Should return in roughly constant time.
Note that this number might not reflect the exact keys of active, unexpired
cache entries, since expired entries are only evicted upon next access
(or by being thrown out by a capacity constraint).
4. [**](../../../../akka/http/caching/javadsl/Cache.html#getOptional(key:K):java.util.Optional[java.util.concurrent.CompletionStage[V]] "Permalink") abstract  def getOptional(key: K): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[V]]Retrieves the CompletionStage instance that is currently in the cache for the given key.

Retrieves the CompletionStage instance that is currently in the cache for the given key.
Returns None if the key has no corresponding cache entry.
5. [**](../../../../akka/http/caching/javadsl/Cache.html#getOrCreateStrict(key:K,block:akka.japi.Creator[V]):java.util.concurrent.CompletionStage[V] "Permalink") abstract  def getOrCreateStrict(key: K, block: [Creator](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Creator.html#akka.japi.Creator)\[V]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[V]Returns either the cached CompletionStage for the given key or the given value as a CompletionStage
6. [**](../../../../akka/http/caching/javadsl/Cache.html#getOrFulfil(key:K,f:akka.japi.Procedure[java.util.concurrent.CompletableFuture[V]]):java.util.concurrent.CompletionStage[V] "Permalink") abstract  def getOrFulfil(key: K, f: [Procedure](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Procedure.html#akka.japi.Procedure)\[[CompletableFuture](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletableFuture.html#java.util.concurrent.CompletableFuture)\[V]]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[V]Returns either the cached `CompletionStage` for the key, or evaluates the given function which
should lead to eventual completion of the completable future.
7. [**](../../../../akka/http/caching/javadsl/Cache.html#remove(key:K):Unit "Permalink") abstract  def remove(key: K): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Removes the cache item for the given key.
8. [**](../../../../akka/http/caching/javadsl/Cache.html#size():Int "Permalink") abstract  def size(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the upper bound for the number of currently cached entries.

Returns the upper bound for the number of currently cached entries.
Note that this number might not reflect the exact number of active, unexpired
cache entries, since expired entries are only evicted upon next access
(or by being thrown out by a capacity constraint).
### Concrete Value Members

1. [**](../../../../akka/http/caching/javadsl/Cache.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/caching/javadsl/Cache.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/caching/javadsl/Cache.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Cache\[K, V] toany2stringadd\[Cache\[K, V]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/caching/javadsl/Cache.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Cache\[K, V], B)ImplicitThis member is added by an implicit conversion from Cache\[K, V] toArrowAssoc\[Cache\[K, V]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/caching/javadsl/Cache.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/caching/javadsl/Cache.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/http/caching/javadsl/Cache.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/http/caching/javadsl/Cache.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Cache\[K, V]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Cache\[K, V]ImplicitThis member is added by an implicit conversion from Cache\[K, V] toEnsuring\[Cache\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/http/caching/javadsl/Cache.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Cache\[K, V]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Cache\[K, V]ImplicitThis member is added by an implicit conversion from Cache\[K, V] toEnsuring\[Cache\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/caching/javadsl/Cache.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Cache\[K, V]ImplicitThis member is added by an implicit conversion from Cache\[K, V] toEnsuring\[Cache\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/caching/javadsl/Cache.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Cache\[K, V]ImplicitThis member is added by an implicit conversion from Cache\[K, V] toEnsuring\[Cache\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/caching/javadsl/Cache.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/http/caching/javadsl/Cache.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../akka/http/caching/javadsl/Cache.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../akka/http/caching/javadsl/Cache.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/http/caching/javadsl/Cache.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/http/caching/javadsl/Cache.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/http/caching/javadsl/Cache.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/caching/javadsl/Cache.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/caching/javadsl/Cache.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/http/caching/javadsl/Cache.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/http/caching/javadsl/Cache.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/http/caching/javadsl/Cache.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/http/caching/javadsl/Cache.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/caching/javadsl/Cache.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/caching/javadsl/Cache.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Cache\[K, V] toStringFormat\[Cache\[K, V]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/caching/javadsl/Cache.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Cache\[K, V], B)ImplicitThis member is added by an implicit conversion from Cache\[K, V] toArrowAssoc\[Cache\[K, V]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromCache\[K, V] to any2stringadd\[Cache\[K, V]]

### Inherited by implicit conversion StringFormat fromCache\[K, V] to StringFormat\[Cache\[K, V]]

### Inherited by implicit conversion Ensuring fromCache\[K, V] to Ensuring\[Cache\[K, V]]

### Inherited by implicit conversion ArrowAssoc fromCache\[K, V] to ArrowAssoc\[Cache\[K, V]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Creator.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Procedure.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/CachingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/LfuCacheSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/javadsl/Cache.html)*