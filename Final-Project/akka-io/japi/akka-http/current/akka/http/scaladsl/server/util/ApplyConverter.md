---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ApplyConverter.html
title: ApplyConverter
---

# ApplyConverter

## Content

Package [akka.http.scaladsl.server.util](package-summary.html)
## Class ApplyConverter\<L\>

- java.lang.Object
- - akka.http.scaladsl.server.util.ApplyConverter\<L\>

- ---

```
public abstract class ApplyConverter<L>
extends java.lang.Object
```

ApplyConverter allows generic conversion of functions of type `(T1, T2, ...) => Route` to
 `(TupleX(T1, T2, ...)) => Route`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ApplyConverter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract scala.Function1<[L](ApplyConverter.html "type parameter in ApplyConverter"),​scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>>` | `[apply](#apply(java.lang.Object))​(java.lang.Object f)` |  |
	| `static <T1> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple1<T1>>` | `[hac1](#hac1())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>>` | `[hac10](#hac10())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>>` | `[hac11](#hac11())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>>` | `[hac12](#hac12())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>>` | `[hac13](#hac13())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>>` | `[hac14](#hac14())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>>` | `[hac15](#hac15())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>>` | `[hac16](#hac16())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>>` | `[hac17](#hac17())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>>` | `[hac18](#hac18())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>>` | `[hac19](#hac19())()` |  |
	| `static <T1,​T2>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple2<T1,​T2>>` | `[hac2](#hac2())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>>` | `[hac20](#hac20())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple21<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>>` | `[hac21](#hac21())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple22<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>>` | `[hac22](#hac22())()` |  |
	| `static <T1,​T2,​T3>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple3<T1,​T2,​T3>>` | `[hac3](#hac3())()` |  |
	| `static <T1,​T2,​T3,​T4>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple4<T1,​T2,​T3,​T4>>` | `[hac4](#hac4())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple5<T1,​T2,​T3,​T4,​T5>>` | `[hac5](#hac5())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple6<T1,​T2,​T3,​T4,​T5,​T6>>` | `[hac6](#hac6())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>>` | `[hac7](#hac7())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>>` | `[hac8](#hac8())()` |  |
	| `static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>[ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>>` | `[hac9](#hac9())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ApplyConverter
		
		
		
		```
		public ApplyConverter()
		```

	- ### Method Detail
	
	
	
		- #### hac1
		
		
		
		```
		public static <T1> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple1<T1>> hac1()
		```
		- #### hac2
		
		
		
		```
		public static <T1,​T2> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple2<T1,​T2>> hac2()
		```
		- #### hac3
		
		
		
		```
		public static <T1,​T2,​T3> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple3<T1,​T2,​T3>> hac3()
		```
		- #### hac4
		
		
		
		```
		public static <T1,​T2,​T3,​T4> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple4<T1,​T2,​T3,​T4>> hac4()
		```
		- #### hac5
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple5<T1,​T2,​T3,​T4,​T5>> hac5()
		```
		- #### hac6
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple6<T1,​T2,​T3,​T4,​T5,​T6>> hac6()
		```
		- #### hac7
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>> hac7()
		```
		- #### hac8
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>> hac8()
		```
		- #### hac9
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>> hac9()
		```
		- #### hac10
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>> hac10()
		```
		- #### hac11
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>> hac11()
		```
		- #### hac12
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>> hac12()
		```
		- #### hac13
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>> hac13()
		```
		- #### hac14
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>> hac14()
		```
		- #### hac15
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>> hac15()
		```
		- #### hac16
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>> hac16()
		```
		- #### hac17
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>> hac17()
		```
		- #### hac18
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>> hac18()
		```
		- #### hac19
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>> hac19()
		```
		- #### hac20
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>> hac20()
		```
		- #### hac21
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple21<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>> hac21()
		```
		- #### hac22
		
		
		
		```
		public static <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22> [ApplyConverter](ApplyConverter.html "class in akka.http.scaladsl.server.util")<scala.Tuple22<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>> hac22()
		```
		- #### apply
		
		
		
		```
		public abstract scala.Function1<[L](ApplyConverter.html "type parameter in ApplyConverter"),​scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>> apply​(java.lang.Object f)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ApplyConverter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ApplyConverter.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ApplyConverter.html)*