---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/UnzipWith.html
title: UnzipWith
---

# UnzipWith

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class UnzipWith

- java.lang.Object
- - akka.stream.javadsl.UnzipWith

- ---

```
public class UnzipWith
extends java.lang.Object
```

Split one stream into several streams using a splitting function.
 
 '''Emits when''' all of the outputs stops backpressuring and there is an input element available
 

 '''Backpressures when''' any of the outputs backpressures
 

 '''Completes when''' upstream completes
 

 '''Cancels when''' any downstream cancels

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnzipWith](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <In,​A,​B>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape2](../FanOutShape2.html "class in akka.stream")<In,​A,​B>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Pair](../../japi/Pair.html "class in akka.japi")<A,​B>> f)` | Create a new `UnzipWith` vertex with the specified input type and unzipping\-function `f`. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape10](../FanOutShape10.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create10](#create10(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple10](../../japi/tuple/Tuple10.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>> f)` | Create a new `UnzipWith` specialized for 10 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape11](../FanOutShape11.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create11](#create11(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple11](../../japi/tuple/Tuple11.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>> f)` | Create a new `UnzipWith` specialized for 11 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape12](../FanOutShape12.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create12](#create12(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple12](../../japi/tuple/Tuple12.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>> f)` | Create a new `UnzipWith` specialized for 12 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape13](../FanOutShape13.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create13](#create13(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple13](../../japi/tuple/Tuple13.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>> f)` | Create a new `UnzipWith` specialized for 13 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape14](../FanOutShape14.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create14](#create14(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple14](../../japi/tuple/Tuple14.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>> f)` | Create a new `UnzipWith` specialized for 14 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape15](../FanOutShape15.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create15](#create15(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple15](../../japi/tuple/Tuple15.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>> f)` | Create a new `UnzipWith` specialized for 15 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape16](../FanOutShape16.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create16](#create16(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple16](../../japi/tuple/Tuple16.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>> f)` | Create a new `UnzipWith` specialized for 16 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape17](../FanOutShape17.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create17](#create17(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple17](../../japi/tuple/Tuple17.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>> f)` | Create a new `UnzipWith` specialized for 17 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape18](../FanOutShape18.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create18](#create18(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple18](../../japi/tuple/Tuple18.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>> f)` | Create a new `UnzipWith` specialized for 18 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape19](../FanOutShape19.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create19](#create19(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple19](../../japi/tuple/Tuple19.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>> f)` | Create a new `UnzipWith` specialized for 19 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape20](../FanOutShape20.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create20](#create20(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple20](../../japi/tuple/Tuple20.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>> f)` | Create a new `UnzipWith` specialized for 20 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape21](../FanOutShape21.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create21](#create21(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple21](../../japi/tuple/Tuple21.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>> f)` | Create a new `UnzipWith` specialized for 21 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape22](../FanOutShape22.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create22](#create22(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple22](../../japi/tuple/Tuple22.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>> f)` | Create a new `UnzipWith` specialized for 22 outputs. |
	| `static <In,​T1,​T2,​T3>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape3](../FanOutShape3.html "class in akka.stream")<In,​T1,​T2,​T3>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create3](#create3(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple3](../../japi/tuple/Tuple3.html "class in akka.japi.tuple")<T1,​T2,​T3>> f)` | Create a new `UnzipWith` specialized for 3 outputs. |
	| `static <In,​T1,​T2,​T3,​T4>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape4](../FanOutShape4.html "class in akka.stream")<In,​T1,​T2,​T3,​T4>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create4](#create4(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple4](../../japi/tuple/Tuple4.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4>> f)` | Create a new `UnzipWith` specialized for 4 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape5](../FanOutShape5.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create5](#create5(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple5](../../japi/tuple/Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5>> f)` | Create a new `UnzipWith` specialized for 5 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape6](../FanOutShape6.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create6](#create6(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple6](../../japi/tuple/Tuple6.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6>> f)` | Create a new `UnzipWith` specialized for 6 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape7](../FanOutShape7.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create7](#create7(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple7](../../japi/tuple/Tuple7.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7>> f)` | Create a new `UnzipWith` specialized for 7 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape8](../FanOutShape8.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create8](#create8(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple8](../../japi/tuple/Tuple8.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>> f)` | Create a new `UnzipWith` specialized for 8 outputs. |
	| `static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>[Graph](../Graph.html "interface in akka.stream")<[FanOutShape9](../FanOutShape9.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create9](#create9(akka.japi.function.Function))​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple9](../../japi/tuple/Tuple9.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>> f)` | Create a new `UnzipWith` specialized for 9 outputs. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UnzipWith
		
		
		
		```
		public UnzipWith()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <In,​A,​B> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape2](../FanOutShape2.html "class in akka.stream")<In,​A,​B>,​[NotUsed](../../NotUsed.html "class in akka")> create​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Pair](../../japi/Pair.html "class in akka.japi")<A,​B>> f)
		```
		
		Create a new `UnzipWith` vertex with the specified input type and unzipping\-function `f`.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the pair of output values
		- #### create3
		
		
		
		```
		public static <In,​T1,​T2,​T3> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape3](../FanOutShape3.html "class in akka.stream")<In,​T1,​T2,​T3>,​[NotUsed](../../NotUsed.html "class in akka")> create3​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple3](../../japi/tuple/Tuple3.html "class in akka.japi.tuple")<T1,​T2,​T3>> f)
		```
		
		Create a new `UnzipWith` specialized for 3 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create4
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape4](../FanOutShape4.html "class in akka.stream")<In,​T1,​T2,​T3,​T4>,​[NotUsed](../../NotUsed.html "class in akka")> create4​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple4](../../japi/tuple/Tuple4.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4>> f)
		```
		
		Create a new `UnzipWith` specialized for 4 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create5
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape5](../FanOutShape5.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5>,​[NotUsed](../../NotUsed.html "class in akka")> create5​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple5](../../japi/tuple/Tuple5.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5>> f)
		```
		
		Create a new `UnzipWith` specialized for 5 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create6
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape6](../FanOutShape6.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6>,​[NotUsed](../../NotUsed.html "class in akka")> create6​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple6](../../japi/tuple/Tuple6.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6>> f)
		```
		
		Create a new `UnzipWith` specialized for 6 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create7
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape7](../FanOutShape7.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7>,​[NotUsed](../../NotUsed.html "class in akka")> create7​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple7](../../japi/tuple/Tuple7.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7>> f)
		```
		
		Create a new `UnzipWith` specialized for 7 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create8
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape8](../FanOutShape8.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>,​[NotUsed](../../NotUsed.html "class in akka")> create8​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple8](../../japi/tuple/Tuple8.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>> f)
		```
		
		Create a new `UnzipWith` specialized for 8 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create9
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape9](../FanOutShape9.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>,​[NotUsed](../../NotUsed.html "class in akka")> create9​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple9](../../japi/tuple/Tuple9.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>> f)
		```
		
		Create a new `UnzipWith` specialized for 9 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create10
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape10](../FanOutShape10.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>,​[NotUsed](../../NotUsed.html "class in akka")> create10​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple10](../../japi/tuple/Tuple10.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>> f)
		```
		
		Create a new `UnzipWith` specialized for 10 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create11
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape11](../FanOutShape11.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>,​[NotUsed](../../NotUsed.html "class in akka")> create11​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple11](../../japi/tuple/Tuple11.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>> f)
		```
		
		Create a new `UnzipWith` specialized for 11 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create12
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape12](../FanOutShape12.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>,​[NotUsed](../../NotUsed.html "class in akka")> create12​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple12](../../japi/tuple/Tuple12.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>> f)
		```
		
		Create a new `UnzipWith` specialized for 12 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create13
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape13](../FanOutShape13.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>,​[NotUsed](../../NotUsed.html "class in akka")> create13​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple13](../../japi/tuple/Tuple13.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>> f)
		```
		
		Create a new `UnzipWith` specialized for 13 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create14
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape14](../FanOutShape14.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>,​[NotUsed](../../NotUsed.html "class in akka")> create14​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple14](../../japi/tuple/Tuple14.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>> f)
		```
		
		Create a new `UnzipWith` specialized for 14 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create15
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape15](../FanOutShape15.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>,​[NotUsed](../../NotUsed.html "class in akka")> create15​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple15](../../japi/tuple/Tuple15.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>> f)
		```
		
		Create a new `UnzipWith` specialized for 15 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create16
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape16](../FanOutShape16.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>,​[NotUsed](../../NotUsed.html "class in akka")> create16​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple16](../../japi/tuple/Tuple16.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>> f)
		```
		
		Create a new `UnzipWith` specialized for 16 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create17
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape17](../FanOutShape17.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>,​[NotUsed](../../NotUsed.html "class in akka")> create17​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple17](../../japi/tuple/Tuple17.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>> f)
		```
		
		Create a new `UnzipWith` specialized for 17 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create18
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape18](../FanOutShape18.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>,​[NotUsed](../../NotUsed.html "class in akka")> create18​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple18](../../japi/tuple/Tuple18.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>> f)
		```
		
		Create a new `UnzipWith` specialized for 18 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create19
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape19](../FanOutShape19.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>,​[NotUsed](../../NotUsed.html "class in akka")> create19​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple19](../../japi/tuple/Tuple19.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>> f)
		```
		
		Create a new `UnzipWith` specialized for 19 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create20
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape20](../FanOutShape20.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>,​[NotUsed](../../NotUsed.html "class in akka")> create20​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple20](../../japi/tuple/Tuple20.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>> f)
		```
		
		Create a new `UnzipWith` specialized for 20 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create21
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape21](../FanOutShape21.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>,​[NotUsed](../../NotUsed.html "class in akka")> create21​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple21](../../japi/tuple/Tuple21.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>> f)
		```
		
		Create a new `UnzipWith` specialized for 21 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values
		- #### create22
		
		
		
		```
		public static <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22> [Graph](../Graph.html "interface in akka.stream")<[FanOutShape22](../FanOutShape22.html "class in akka.stream")<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>,​[NotUsed](../../NotUsed.html "class in akka")> create22​([Function](../../japi/function/Function.html "interface in akka.japi.function")<In,​[Tuple22](../../japi/tuple/Tuple22.html "class in akka.japi.tuple")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>> f)
		```
		
		Create a new `UnzipWith` specialized for 22 outputs.
		 
		
		Parameters:
		`f` \- unzipping\-function from the input value to the output values

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple10.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple11.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple12.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple13.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple14.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple15.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple16.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple17.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple18.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple19.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple20.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple21.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple22.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple3.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple4.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple5.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple6.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple7.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple8.html
- https://doc.akka.io/japi/akka/current/akka/japi/tuple/Tuple9.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape10.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape11.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape12.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape13.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape14.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape15.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape16.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape17.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape18.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape19.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape2.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape20.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape21.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape22.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape3.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape4.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape5.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape6.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape7.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape8.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanOutShape9.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/UnzipWith.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/UnzipWith.html)*