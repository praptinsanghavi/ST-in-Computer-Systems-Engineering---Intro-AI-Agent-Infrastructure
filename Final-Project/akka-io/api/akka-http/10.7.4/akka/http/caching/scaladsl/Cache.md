---
description: Akka HTTP 10.7.4 - akka.http.caching.scaladsl.Cache
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:19Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/caching/scaladsl/Cache.html
title: Akka HTTP 10.7.4 - akka.http.caching.scaladsl.Cache
---

# Akka HTTP 10.7.4 - akka.http.caching.scaladsl.Cache

> **Summary:** Akka HTTP 10.7.4 - akka.http.caching.scaladsl.Cache

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/caching/index.html "Permalink")  package [caching](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/caching/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[caching](../index.html)
- Cache
- [CachingSettings](CachingSettings.html "Public API but not intended for subclassing")
- [LfuCacheSettings](LfuCacheSettings.html "Public API but not intended for subclassing")
c[akka](../../../index.html).[http](../../index.html).[caching](../index.html).[scaladsl](index.html)

# Cache[**](../../../../akka/http/caching/scaladsl/Cache.html "Permalink")

### 

#### abstract  class Cache\[K, V] extends [javadsl.Cache](../javadsl/Cache.html)\[K, V]

API MAY CHANGE

General interface implemented by all akka\-http cache implementations.

Self TypeCache\[K, V]Annotations@ApiMayChange() @DoNotInherit() Source[Cache.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-caching/src/main/scala/akka/http/caching/scaladsl/Cache.scala#L25)Linear Supertypes[javadsl.Cache](../javadsl/Cache.html)\[K, V], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Cache
2. Cache
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
### Instance Constructors

1. [**](../../../../akka/http/caching/scaladsl/Cache.html#<init>():akka.http.caching.scaladsl.Cache[K,V] "Permalink")  new Cache()
### Abstract Value Members

1. [**](../../../../akka/http/caching/scaladsl/Cache.html#apply(key:K,genValue:()=>scala.concurrent.Future[V]):scala.concurrent.Future[V] "Permalink") abstract  def apply(key: K, genValue: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[V]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[V]Returns either the cached Future for the given key or evaluates the given value generating
function producing a `Future[V]`.
2. [**](../../../../akka/http/caching/scaladsl/Cache.html#clear():Unit "Permalink") abstract  def clear(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Clears the cache by removing all entries.

Clears the cache by removing all entries.

Definition ClassesCache → [Cache](../javadsl/Cache.html)
3. [**](../../../../akka/http/caching/scaladsl/Cache.html#get(key:K):Option[scala.concurrent.Future[V]] "Permalink") abstract  def get(key: K): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[V]]Retrieves the future instance that is currently in the cache for the given key.

Retrieves the future instance that is currently in the cache for the given key.
Returns None if the key has no corresponding cache entry.
4. [**](../../../../akka/http/caching/scaladsl/Cache.html#getOrLoad(key:K,loadValue:K=>scala.concurrent.Future[V]):scala.concurrent.Future[V] "Permalink") abstract  def getOrLoad(key: K, loadValue: (K) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[V]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[V]Returns either the cached Future for the given key, or applies the given value loading
function on the key, producing a `Future[V]`.
5. [**](../../../../akka/http/caching/scaladsl/Cache.html#keys:scala.collection.immutable.Set[K] "Permalink") abstract  def keys: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[K]Returns the set of keys in the cache, in no particular order
Should return in roughly constant time.

Returns the set of keys in the cache, in no particular order
Should return in roughly constant time.
Note that this number might not reflect the exact keys of active, unexpired
cache entries, since expired entries are only evicted upon next access
(or by being thrown out by a capacity constraint).
6. [**](../../../../akka/http/caching/scaladsl/Cache.html#put(key:K,mayBeValue:scala.concurrent.Future[V])(implicitex:scala.concurrent.ExecutionContext):scala.concurrent.Future[V] "Permalink") abstract  def put(key: K, mayBeValue: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[V])(implicit ex: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[V]Cache the given future if not cached previously.

Cache the given future if not cached previously.
Or replace the old cached value on successful completion of given future.
In case the given future fails, the previously cached value for that key (if any) will remain unchanged.
7. [**](../../../../akka/http/caching/scaladsl/Cache.html#remove(key:K):Unit "Permalink") abstract  def remove(key: K): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Removes the cache item for the given key.

Removes the cache item for the given key.

Definition ClassesCache → [Cache](../javadsl/Cache.html)
8. [**](../../../../akka/http/caching/scaladsl/Cache.html#size():Int "Permalink") abstract  def size(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Returns the upper bound for the number of currently cached entries.

Returns the upper bound for the number of currently cached entries.
Note that this number might not reflect the exact number of active, unexpired
cache entries, since expired entries are only evicted upon next access
(or by being thrown out by a capacity constraint).

Definition ClassesCache → [Cache](../javadsl/Cache.html)
### Concrete Value Members

1. [**](../../../../akka/http/caching/scaladsl/Cache.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/caching/scaladsl/Cache.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/caching/scaladsl/Cache.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Cache\[K, V] toany2stringadd\[Cache\[K, V]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/caching/scaladsl/Cache.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Cache\[K, V], B)ImplicitThis member is added by an implicit conversion from Cache\[K, V] toArrowAssoc\[Cache\[K, V]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/caching/scaladsl/Cache.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/caching/scaladsl/Cache.html#apply(key:K,f:scala.concurrent.Promise[V]=>Unit):scala.concurrent.Future[V] "Permalink")  def apply(key: K, f: ([Promise](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Promise.html#scala.concurrent.Promise)\[V]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[V]Returns either the cached Future for the key or evaluates the given function which
should lead to eventual completion of the promise.
7. [**](../../../../akka/http/caching/scaladsl/Cache.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/caching/scaladsl/Cache.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/caching/scaladsl/Cache.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Cache\[K, V]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Cache\[K, V]ImplicitThis member is added by an implicit conversion from Cache\[K, V] toEnsuring\[Cache\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/http/caching/scaladsl/Cache.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Cache\[K, V]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Cache\[K, V]ImplicitThis member is added by an implicit conversion from Cache\[K, V] toEnsuring\[Cache\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/caching/scaladsl/Cache.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Cache\[K, V]ImplicitThis member is added by an implicit conversion from Cache\[K, V] toEnsuring\[Cache\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/caching/scaladsl/Cache.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Cache\[K, V]ImplicitThis member is added by an implicit conversion from Cache\[K, V] toEnsuring\[Cache\[K, V]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/caching/scaladsl/Cache.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/http/caching/scaladsl/Cache.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/http/caching/scaladsl/Cache.html#get(key:K,block:()=>V):scala.concurrent.Future[V] "Permalink")  def get(key: K, block: () \=\> V): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[V]Returns either the cached Future for the given key or the given value as a Future
16. [**](../../../../akka/http/caching/scaladsl/Cache.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/http/caching/scaladsl/Cache.html#getFuture(key:K,genValue:akka.japi.Creator[java.util.concurrent.CompletionStage[V]]):java.util.concurrent.CompletionStage[V] "Permalink") final  def getFuture(key: K, genValue: [Creator](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Creator.html#akka.japi.Creator)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[V]]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[V]Returns either the cached CompletionStage for the given key or evaluates the given value generating
function producing a `CompletionStage<V>`.

Returns either the cached CompletionStage for the given key or evaluates the given value generating
function producing a `CompletionStage<V>`.

Definition ClassesCache → [Cache](../javadsl/Cache.html)
18. [**](../../../../akka/http/caching/scaladsl/Cache.html#getKeys():java.util.Set[K] "Permalink")  def getKeys(): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[K]Returns the set of keys in the cache, in no particular order
Should return in roughly constant time.

Returns the set of keys in the cache, in no particular order
Should return in roughly constant time.
Note that this number might not reflect the exact keys of active, unexpired
cache entries, since expired entries are only evicted upon next access
(or by being thrown out by a capacity constraint).

Definition ClassesCache → [Cache](../javadsl/Cache.html)
19. [**](../../../../akka/http/caching/scaladsl/Cache.html#getOptional(key:K):java.util.Optional[java.util.concurrent.CompletionStage[V]] "Permalink")  def getOptional(key: K): [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[V]]Retrieves the CompletionStage instance that is currently in the cache for the given key.

Retrieves the CompletionStage instance that is currently in the cache for the given key.
Returns None if the key has no corresponding cache entry.

Definition ClassesCache → [Cache](../javadsl/Cache.html)
20. [**](../../../../akka/http/caching/scaladsl/Cache.html#getOrCreateStrict(key:K,block:akka.japi.Creator[V]):java.util.concurrent.CompletionStage[V] "Permalink")  def getOrCreateStrict(key: K, block: [Creator](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Creator.html#akka.japi.Creator)\[V]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[V]Returns either the cached CompletionStage for the given key or the given value as a CompletionStage

Returns either the cached CompletionStage for the given key or the given value as a CompletionStage

Definition ClassesCache → [Cache](../javadsl/Cache.html)
21. [**](../../../../akka/http/caching/scaladsl/Cache.html#getOrFulfil(key:K,f:akka.japi.Procedure[java.util.concurrent.CompletableFuture[V]]):java.util.concurrent.CompletionStage[V] "Permalink") final  def getOrFulfil(key: K, f: [Procedure](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Procedure.html#akka.japi.Procedure)\[[CompletableFuture](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletableFuture.html#java.util.concurrent.CompletableFuture)\[V]]): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[V]Returns either the cached `CompletionStage` for the key, or evaluates the given function which
should lead to eventual completion of the completable future.

Returns either the cached `CompletionStage` for the key, or evaluates the given function which
should lead to eventual completion of the completable future.

Definition ClassesCache → [Cache](../javadsl/Cache.html)
22. [**](../../../../akka/http/caching/scaladsl/Cache.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/caching/scaladsl/Cache.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../../akka/http/caching/scaladsl/Cache.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../../akka/http/caching/scaladsl/Cache.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../../akka/http/caching/scaladsl/Cache.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/caching/scaladsl/Cache.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../../akka/http/caching/scaladsl/Cache.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../../akka/http/caching/scaladsl/Cache.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../../akka/http/caching/scaladsl/Cache.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../../../akka/http/caching/scaladsl/Cache.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/caching/scaladsl/Cache.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/caching/scaladsl/Cache.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Cache\[K, V] toStringFormat\[Cache\[K, V]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/caching/scaladsl/Cache.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Cache\[K, V], B)ImplicitThis member is added by an implicit conversion from Cache\[K, V] toArrowAssoc\[Cache\[K, V]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [javadsl.Cache](../javadsl/Cache.html)\[K, V]

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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/LfuCacheSettings$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/LfuCacheSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/caching/scaladsl/Cache.html)*