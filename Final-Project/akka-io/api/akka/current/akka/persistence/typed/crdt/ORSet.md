---
description: Akka 2.10.17 - akka.persistence.typed.crdt.ORSet
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:56:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/ORSet.html
title: Akka 2.10.17 - akka.persistence.typed.crdt.ORSet
---

# Akka 2.10.17 - akka.persistence.typed.crdt.ORSet

> **Summary:** Akka 2.10.17 - akka.persistence.typed.crdt.ORSet

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](index.html)Definition Classes[typed](../index.html)
- [Counter](Counter.html)
- [LwwTime](LwwTime.html "Utility class for comparing timestamp replica identifier when implementing last-writer wins.")
- ORSet
- [OpCrdt](OpCrdt.html)
[c](ORSet$.html "See companion object")[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[crdt](index.html)

# [ORSet](ORSet$.html "See companion object")[**](../../../../akka/persistence/typed/crdt/ORSet.html "Permalink")

### Companion [object ORSet](ORSet$.html "See companion object")

#### final  class ORSet\[A] extends [OpCrdt](OpCrdt.html)\[[DeltaOp](ORSet$$DeltaOp.html)]

Implements a 'Observed Remove Set' operation based CRDT, also called a 'OR\-Set'.
Elements can be added and removed any number of times. Concurrent add wins
over remove.

It is not implemented as in the paper
[A comprehensive study of Convergent and Commutative Replicated Data Types](https://hal.inria.fr/file/index/docid/555588/filename/techreport.pdf).
This is more space efficient and doesn't accumulate garbage for removed elements.
It is described in the paper
[An optimized conflict\-free replicated set](https://hal.inria.fr/file/index/docid/738680/filename/RR-8083.pdf)
The implementation is inspired by the Riak DT [riak\_dt\_orswot](https://github.com/basho/riak_dt/blob/develop/src/riak_dt_orswot.erl).

The ORSet has a version vector that is incremented when an element is added to
the set. The `DC -> count` pair for that increment is stored against the
element as its "birth dot". Every time the element is re\-added to the set,
its "birth dot" is updated to that of the `DC -> count` version vector entry
resulting from the add. When an element is removed, we simply drop it, no tombstones.

When an element exists in replica A and not replica B, is it because A added
it and B has not yet seen that, or that B removed it and A has not yet seen that?
In this implementation we compare the `dot` of the present element to the version vector
in the Set it is absent from. If the element dot is not "seen" by the Set version vector,
that means the other set has yet to see this add, and the item is in the merged
Set. If the Set version vector dominates the dot, that means the other Set has removed this
element already, and the item is not in the merged Set.

This class is immutable, i.e. "modifying" methods return a new instance.

Source[ORSet.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/crdt/ORSet.scala#L340)Linear Supertypes[OpCrdt](OpCrdt.html)\[[DeltaOp](ORSet$$DeltaOp.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ORSet
2. OpCrdt
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
### Type Members

1. [**](../../../../akka/persistence/typed/crdt/ORSet.html#D=akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  type D \= [DeltaOp](ORSet$$DeltaOp.html)
2. [**](../../../../akka/persistence/typed/crdt/ORSet.html#T=akka.persistence.typed.crdt.ORSet[A] "Permalink")  type T \= ORSet\[A]Definition ClassesORSet → [OpCrdt](OpCrdt.html)
### Value Members

1. [**](../../../../akka/persistence/typed/crdt/ORSet.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/crdt/ORSet.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/crdt/ORSet.html#+(element:A):akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def \+(element: A): [DeltaOp](ORSet$$DeltaOp.html)Adds an element to the set
4. [**](../../../../akka/persistence/typed/crdt/ORSet.html#-(element:A):akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def \-(element: A): [DeltaOp](ORSet$$DeltaOp.html)Removes an element from the set.
5. [**](../../../../akka/persistence/typed/crdt/ORSet.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ORSet\[A], B)ImplicitThis member is added by an implicit conversion from ORSet\[A] toArrowAssoc\[ORSet\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../../akka/persistence/typed/crdt/ORSet.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../../akka/persistence/typed/crdt/ORSet.html#add(element:A):akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def add(element: A): [DeltaOp](ORSet$$DeltaOp.html)Adds an element to the set
8. [**](../../../../akka/persistence/typed/crdt/ORSet.html#addAll(elems:Set[A]):akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def addAll(elems: Set\[A]): [DeltaOp](ORSet$$DeltaOp.html)Scala API: Add several elements to the set.

Scala API: Add several elements to the set.
`elems` must not be empty.
9. [**](../../../../akka/persistence/typed/crdt/ORSet.html#addAll(elems:java.util.Set[A]):akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def addAll(elems: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[A]): [DeltaOp](ORSet$$DeltaOp.html)Java API: Add several elements to the set.

Java API: Add several elements to the set.
`elems` must not be empty.
10. [**](../../../../akka/persistence/typed/crdt/ORSet.html#applyOperation(thatDelta:akka.persistence.typed.crdt.ORSet.DeltaOp):akka.persistence.typed.crdt.ORSet[A] "Permalink")  def applyOperation(thatDelta: [DeltaOp](ORSet$$DeltaOp.html)): ORSet\[A]Definition ClassesORSet → [OpCrdt](OpCrdt.html)
11. [**](../../../../akka/persistence/typed/crdt/ORSet.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../../akka/persistence/typed/crdt/ORSet.html#clear():akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def clear(): [DeltaOp](ORSet$$DeltaOp.html)Removes all elements from the set, but keeps the history.

Removes all elements from the set, but keeps the history.
This has the same result as using [\#remove](#remove(element:A):akka.persistence.typed.crdt.ORSet.DeltaOp) for each
element, but it is more efficient.
13. [**](../../../../akka/persistence/typed/crdt/ORSet.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/persistence/typed/crdt/ORSet.html#contains(a:A):Boolean "Permalink")  def contains(a: A): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
15. [**](../../../../akka/persistence/typed/crdt/ORSet.html#elements:Set[A] "Permalink")  def elements: Set\[A]Scala API
16. [**](../../../../akka/persistence/typed/crdt/ORSet.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ORSet\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ORSet\[A]ImplicitThis member is added by an implicit conversion from ORSet\[A] toEnsuring\[ORSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../../akka/persistence/typed/crdt/ORSet.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ORSet\[A]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ORSet\[A]ImplicitThis member is added by an implicit conversion from ORSet\[A] toEnsuring\[ORSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../../akka/persistence/typed/crdt/ORSet.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ORSet\[A]ImplicitThis member is added by an implicit conversion from ORSet\[A] toEnsuring\[ORSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../../akka/persistence/typed/crdt/ORSet.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ORSet\[A]ImplicitThis member is added by an implicit conversion from ORSet\[A] toEnsuring\[ORSet\[A]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../../akka/persistence/typed/crdt/ORSet.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../../akka/persistence/typed/crdt/ORSet.html#equals(o:Any):Boolean "Permalink")  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesORSet → AnyRef → Any
22. [**](../../../../akka/persistence/typed/crdt/ORSet.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/persistence/typed/crdt/ORSet.html#getElements():java.util.Set[A] "Permalink")  def getElements(): [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[A]Java API
24. [**](../../../../akka/persistence/typed/crdt/ORSet.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesORSet → AnyRef → Any
25. [**](../../../../akka/persistence/typed/crdt/ORSet.html#isEmpty:Boolean "Permalink")  def isEmpty: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
26. [**](../../../../akka/persistence/typed/crdt/ORSet.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
27. [**](../../../../akka/persistence/typed/crdt/ORSet.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../../akka/persistence/typed/crdt/ORSet.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../../akka/persistence/typed/crdt/ORSet.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
30. [**](../../../../akka/persistence/typed/crdt/ORSet.html#originReplica:String "Permalink")  val originReplica: String
31. [**](../../../../akka/persistence/typed/crdt/ORSet.html#remove(element:A):akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def remove(element: A): [DeltaOp](ORSet$$DeltaOp.html)Removes an element from the set.
32. [**](../../../../akka/persistence/typed/crdt/ORSet.html#removeAll(elems:Set[A]):akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def removeAll(elems: Set\[A]): [DeltaOp](ORSet$$DeltaOp.html)Scala API: Remove several elements from the set.

Scala API: Remove several elements from the set.
`elems` must not be empty.
33. [**](../../../../akka/persistence/typed/crdt/ORSet.html#removeAll(elems:java.util.Set[A]):akka.persistence.typed.crdt.ORSet.DeltaOp "Permalink")  def removeAll(elems: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[A]): [DeltaOp](ORSet$$DeltaOp.html)Java API: Remove several elements from the set.

Java API: Remove several elements from the set.
`elems` must not be empty.
34. [**](../../../../akka/persistence/typed/crdt/ORSet.html#size:Int "Permalink")  def size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
35. [**](../../../../akka/persistence/typed/crdt/ORSet.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../../../akka/persistence/typed/crdt/ORSet.html#toString():String "Permalink")  def toString(): StringDefinition ClassesORSet → AnyRef → Any
37. [**](../../../../akka/persistence/typed/crdt/ORSet.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../../akka/persistence/typed/crdt/ORSet.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../../akka/persistence/typed/crdt/ORSet.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Shadowed Implicit Value Members

1. [**](../../../../akka/persistence/typed/crdt/ORSet.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ORSet\[A] toany2stringadd\[ORSet\[A]] performed by method any2stringadd in scala.Predef.ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(oRSet: any2stringadd[ORSet[A]]).+(other)
```
Definition Classesany2stringadd
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/crdt/ORSet.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/crdt/ORSet.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ORSet\[A] toStringFormat\[ORSet\[A]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/crdt/ORSet.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ORSet\[A], B)ImplicitThis member is added by an implicit conversion from ORSet\[A] toArrowAssoc\[ORSet\[A]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [OpCrdt](OpCrdt.html)\[[DeltaOp](ORSet$$DeltaOp.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromORSet\[A] to any2stringadd\[ORSet\[A]]

### Inherited by implicit conversion StringFormat fromORSet\[A] to StringFormat\[ORSet\[A]]

### Inherited by implicit conversion Ensuring fromORSet\[A] to Ensuring\[ORSet\[A]]

### Inherited by implicit conversion ArrowAssoc fromORSet\[A] to ArrowAssoc\[ORSet\[A]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/Counter$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/Counter.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/LwwTime.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$$DeltaOp.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet$.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/OpCrdt.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet.html](https://doc.akka.io/api/akka/current/akka/persistence/typed/crdt/ORSet.html)*