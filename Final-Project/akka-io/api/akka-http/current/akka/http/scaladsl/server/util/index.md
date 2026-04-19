---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:45:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.util
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.util

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.util

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](../directives/index.html)Definition Classes[server](../index.html)
- [**](../../../../../akka/http/scaladsl/server/util/index.html "Permalink")  package utilDefinition Classes[server](../index.html)
- [ApplyConverter](ApplyConverter.html "ApplyConverter allows generic conversion of functions of type (T1, T2, ...) => Route to (TupleX(T1, T2, ...)) => Route.")
- [BinaryPolyFunc](BinaryPolyFunc.html "Allows the definition of binary poly-functions (e.g.")
- [ClassMagnet](ClassMagnet.html "A magnet that wraps a ClassTag")
- [ConstructFromTuple](ConstructFromTuple.html "Constructor for instances of type R which can be created from a tuple of type T.")
- [Tuple](Tuple.html "Phantom type providing implicit evidence that a given type is a Tuple or Unit.")
- [TupleOps](TupleOps.html)
- [Tupler](Tupler.html "Provides a way to convert a value into an Tuple.")
p[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html)

# util[**](../../../../../akka/http/scaladsl/server/util/index.html "Permalink")

#### package util

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter.html "Permalink") abstract  class [ApplyConverter](ApplyConverter.html "ApplyConverter allows generic conversion of functions of type (T1, T2, ...) => Route to (TupleX(T1, T2, ...)) => Route.")\[L] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)ApplyConverter allows generic conversion of functions of type `(T1, T2, ...) => Route` to
`(TupleX(T1, T2, ...)) => Route`.
2. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc.html "Permalink")  trait [BinaryPolyFunc](BinaryPolyFunc.html "Allows the definition of binary poly-functions (e.g.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Allows the definition of binary poly\-functions (e.g.

Allows the definition of binary poly\-functions (e.g. for folding over tuples).

Note: the poly\-function implementation seen here is merely a stripped down version of
what Miles Sabin made available with his awesome shapeless library. All credit goes to him!
3. [**](../../../../../akka/http/scaladsl/server/util/ClassMagnet.html "Permalink")  trait [ClassMagnet](ClassMagnet.html "A magnet that wraps a ClassTag")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A magnet that wraps a ClassTag
4. [**](../../../../../akka/http/scaladsl/server/util/ConstructFromTuple.html "Permalink")  trait [ConstructFromTuple](ConstructFromTuple.html "Constructor for instances of type R which can be created from a tuple of type T.")\[T, R] extends (T) \=\> RConstructor for instances of type `R` which can be created from a tuple of type `T`.

Constructor for instances of type `R` which can be created from a tuple of type `T`.

Annotations@FunctionalInterface()
5. [**](../../../../../akka/http/scaladsl/server/util/Tuple.html "Permalink") sealed  trait [Tuple](Tuple.html "Phantom type providing implicit evidence that a given type is a Tuple or Unit.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Phantom type providing implicit evidence that a given type is a Tuple or Unit.
6. [**](../../../../../akka/http/scaladsl/server/util/TupleOps.html "Permalink") final  class [TupleOps](TupleOps.html)\[T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
7. [**](../../../../../akka/http/scaladsl/server/util/Tupler.html "Permalink")  trait [Tupler](Tupler.html "Provides a way to convert a value into an Tuple.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Provides a way to convert a value into an Tuple.

Provides a way to convert a value into an Tuple.
If the value is already a Tuple then it is returned unchanged, otherwise it's wrapped in a Tuple1 instance.
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/util/ApplyConverter$.html "Permalink")  object [ApplyConverter](ApplyConverter$.html) extends ApplyConverterInstances
2. [**](../../../../../akka/http/scaladsl/server/util/BinaryPolyFunc$.html "Permalink")  object [BinaryPolyFunc](BinaryPolyFunc$.html)
3. [**](../../../../../akka/http/scaladsl/server/util/ClassMagnet$.html "Permalink")  object [ClassMagnet](ClassMagnet$.html)
4. [**](../../../../../akka/http/scaladsl/server/util/ConstructFromTuple$.html "Permalink")  object [ConstructFromTuple](ConstructFromTuple$.html) extends ConstructFromTupleInstances
5. [**](../../../../../akka/http/scaladsl/server/util/Tuple$.html "Permalink")  object [Tuple](Tuple$.html)
6. [**](../../../../../akka/http/scaladsl/server/util/TupleOps$.html "Permalink")  object [TupleOps](TupleOps$.html)
7. [**](../../../../../akka/http/scaladsl/server/util/Tupler$.html "Permalink")  object [Tupler](Tupler$.html) extends LowerPriorityTupler
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/ApplyConverter$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/ApplyConverter.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/ClassMagnet$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/ClassMagnet.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/ConstructFromTuple$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/ConstructFromTuple.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/Tuple$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/TupleOps$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/TupleOps.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/Tupler$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/Tupler.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/index.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/util/index.html)*