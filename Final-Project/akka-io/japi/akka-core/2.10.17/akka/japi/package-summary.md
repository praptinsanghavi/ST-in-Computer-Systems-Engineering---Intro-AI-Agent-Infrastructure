---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:57:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/package-summary.html
title: akka.japi
---

# akka.japi

## Content

# Package akka.japi

- Interface Summary 
| Interface | Description |
| [Creator](Creator.html "interface in akka.japi")\<T\> | A constructor/factory, takes no parameters but creates a new value of type T every call. |
| --- | --- |
| [Effect](Effect.html "interface in akka.japi") | An executable piece of code that takes no parameters and doesn't return any value. |
| [Function](Function.html "interface in akka.japi")\<T,​R\> | A Function interface. |
| [Function2](Function2.html "interface in akka.japi")\<T1,​T2,​R\> | A Function interface. |
| [Predicate](Predicate.html "interface in akka.japi")\<T\> | Java API: Defines a criteria and determines whether the parameter meets this criteria. |
| [Procedure](Procedure.html "interface in akka.japi")\<T\> | A Procedure is like a Function, but it doesn't produce a return value. |
- Class Summary 
| Class | Description |
| [JAPI](JAPI.html "class in akka.japi") |  |
| --- | --- |
| [JavaPartialFunction](JavaPartialFunction.html "class in akka.japi")\<A,​B\> | Helper for implementing a \*pure\* partial function: it will possibly be  invoked multiple times for a single \&ldquo;application\&rdquo;, because its only abstract  method is used for both isDefinedAt() and apply(); the former is mapped to  `isCheck == true` and the latter to `isCheck == false` for those cases where  this is important to know. |
| [JavaPartialFunction$](JavaPartialFunction$.html "class in akka.japi") |  |
| [Option](Option.html "class in akka.japi")\<A\> | This class represents optional values. |
| [Option.Some](Option.Some.html "class in akka.japi")\<A\> | Class `Some[A]` represents existing values of type  `A`. |
| [Option.Some$](Option.Some$.html "class in akka.japi") |  |
| [Option$](Option$.html "class in akka.japi") |  |
| [Pair](Pair.html "class in akka.japi")\<A,​B\> | Java API  Represents a pair (tuple) of two elements. |
| [Pair$](Pair$.html "class in akka.japi") |  |
| [Throwables](Throwables.html "class in akka.japi") | Helper class for determining whether a `Throwable` is fatal or not. |
| [Throwables$](Throwables$.html "class in akka.japi") | Helper class for determining whether a `Throwable` is fatal or not. |
| [Util](Util.html "class in akka.japi") | This class hold common utilities for Java |
| [Util$](Util$.html "class in akka.japi") | This class hold common utilities for Java |
- Exception Summary 
| Exception | Description |
| [JavaPartialFunction.NoMatch$](JavaPartialFunction.NoMatch$.html "class in akka.japi") |  |
| --- | --- |
| [JavaPartialFunction.NoMatchException](JavaPartialFunction.NoMatchException.html "class in akka.japi") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Creator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Effect.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Function.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Function2.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/JAPI.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/JavaPartialFunction$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/JavaPartialFunction.NoMatch$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/JavaPartialFunction.NoMatchException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/JavaPartialFunction.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Option$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Option.Some$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Option.Some.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Option.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Pair.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Predicate.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Procedure.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Throwables$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Throwables.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Util$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Util.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/package-summary.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/package-summary.html)*