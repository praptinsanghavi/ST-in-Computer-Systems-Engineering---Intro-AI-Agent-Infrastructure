---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple$.html
title: Tuple$
---

# Tuple$

## Content

Package [akka.http.scaladsl.server.util](package-summary.html)
## Class Tuple$

- java.lang.Object
- - akka.http.scaladsl.server.util.Tuple$

- ---

```
public class Tuple$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Tuple$](Tuple$.html "class in akka.http.scaladsl.server.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tuple$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.runtime.Nothing$>` | `[forNothing](#forNothing())()` |  |
	| `<A> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple1<A>>` | `[forTuple1](#forTuple1())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple10<A,​B,​C,​D,​E,​F,​G,​H,​I,​J>>` | `[forTuple10](#forTuple10())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple11<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K>>` | `[forTuple11](#forTuple11())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple12<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L>>` | `[forTuple12](#forTuple12())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple13<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M>>` | `[forTuple13](#forTuple13())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple14<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N>>` | `[forTuple14](#forTuple14())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple15<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O>>` | `[forTuple15](#forTuple15())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple16<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P>>` | `[forTuple16](#forTuple16())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple17<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q>>` | `[forTuple17](#forTuple17())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple18<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R>>` | `[forTuple18](#forTuple18())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple19<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S>>` | `[forTuple19](#forTuple19())()` |  |
	| `<A,​B>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple2<A,​B>>` | `[forTuple2](#forTuple2())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple20<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T>>` | `[forTuple20](#forTuple20())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T,​U>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple21<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T,​U>>` | `[forTuple21](#forTuple21())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T,​U,​V>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple22<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T,​U,​V>>` | `[forTuple22](#forTuple22())()` |  |
	| `<A,​B,​C>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple3<A,​B,​C>>` | `[forTuple3](#forTuple3())()` |  |
	| `<A,​B,​C,​D>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple4<A,​B,​C,​D>>` | `[forTuple4](#forTuple4())()` |  |
	| `<A,​B,​C,​D,​E>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple5<A,​B,​C,​D,​E>>` | `[forTuple5](#forTuple5())()` |  |
	| `<A,​B,​C,​D,​E,​F>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple6<A,​B,​C,​D,​E,​F>>` | `[forTuple6](#forTuple6())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple7<A,​B,​C,​D,​E,​F,​G>>` | `[forTuple7](#forTuple7())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple8<A,​B,​C,​D,​E,​F,​G,​H>>` | `[forTuple8](#forTuple8())()` |  |
	| `<A,​B,​C,​D,​E,​F,​G,​H,​I>[Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple9<A,​B,​C,​D,​E,​F,​G,​H,​I>>` | `[forTuple9](#forTuple9())()` |  |
	| `<A> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.runtime.BoxedUnit>` | `[forUnit](#forUnit())()` |  |
	| `<T> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<T>` | `[yes](#yes())()` | Used to provide "is\-Tuple" evidence where we know that a given value must be a tuple. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Tuple$](Tuple$.html "class in akka.http.scaladsl.server.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Tuple$
		
		
		
		```
		public Tuple$()
		```

	- ### Method Detail
	
	
	
		- #### yes
		
		
		
		```
		public <T> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<T> yes()
		```
		
		Used to provide "is\-Tuple" evidence where we know that a given value must be a tuple.
		
		Returns:
		(undocumented)
		- #### forNothing
		
		
		
		```
		public <A> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.runtime.Nothing$> forNothing()
		```
		- #### forUnit
		
		
		
		```
		public <A> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.runtime.BoxedUnit> forUnit()
		```
		- #### forTuple1
		
		
		
		```
		public <A> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple1<A>> forTuple1()
		```
		- #### forTuple2
		
		
		
		```
		public <A,​B> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple2<A,​B>> forTuple2()
		```
		- #### forTuple3
		
		
		
		```
		public <A,​B,​C> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple3<A,​B,​C>> forTuple3()
		```
		- #### forTuple4
		
		
		
		```
		public <A,​B,​C,​D> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple4<A,​B,​C,​D>> forTuple4()
		```
		- #### forTuple5
		
		
		
		```
		public <A,​B,​C,​D,​E> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple5<A,​B,​C,​D,​E>> forTuple5()
		```
		- #### forTuple6
		
		
		
		```
		public <A,​B,​C,​D,​E,​F> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple6<A,​B,​C,​D,​E,​F>> forTuple6()
		```
		- #### forTuple7
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple7<A,​B,​C,​D,​E,​F,​G>> forTuple7()
		```
		- #### forTuple8
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple8<A,​B,​C,​D,​E,​F,​G,​H>> forTuple8()
		```
		- #### forTuple9
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple9<A,​B,​C,​D,​E,​F,​G,​H,​I>> forTuple9()
		```
		- #### forTuple10
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple10<A,​B,​C,​D,​E,​F,​G,​H,​I,​J>> forTuple10()
		```
		- #### forTuple11
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple11<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K>> forTuple11()
		```
		- #### forTuple12
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple12<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L>> forTuple12()
		```
		- #### forTuple13
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple13<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M>> forTuple13()
		```
		- #### forTuple14
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple14<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N>> forTuple14()
		```
		- #### forTuple15
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple15<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O>> forTuple15()
		```
		- #### forTuple16
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple16<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P>> forTuple16()
		```
		- #### forTuple17
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple17<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q>> forTuple17()
		```
		- #### forTuple18
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple18<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R>> forTuple18()
		```
		- #### forTuple19
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple19<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S>> forTuple19()
		```
		- #### forTuple20
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple20<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T>> forTuple20()
		```
		- #### forTuple21
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T,​U> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple21<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T,​U>> forTuple21()
		```
		- #### forTuple22
		
		
		
		```
		public <A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T,​U,​V> [Tuple](Tuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple22<A,​B,​C,​D,​E,​F,​G,​H,​I,​J,​K,​L,​M,​N,​O,​P,​Q,​R,​S,​T,​U,​V>> forTuple22()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple$.html)*