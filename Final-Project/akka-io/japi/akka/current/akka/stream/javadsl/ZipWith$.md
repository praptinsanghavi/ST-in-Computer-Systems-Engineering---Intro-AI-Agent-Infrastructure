---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipWith$.html
title: ZipWith$
---

# ZipWith$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class ZipWith$

- java.lang.Object
- - akka.stream.javadsl.ZipWith$

- ---

```
public class ZipWith$
extends java.lang.Object
```

Combine the elements of multiple streams into a stream of combined elements using a combiner function.
 
 '''Emits when''' all of the inputs has an element available
 

 '''Backpressures when''' downstream backpressures
 

 '''Completes when''' any upstream completes
 

 '''Cancels when''' downstream cancels

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ZipWith$](ZipWith$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ZipWith$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A,​B,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape2](../FanInShape2.html "class in akka.stream")<A,​B,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(akka.japi.function.Function2))​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<A,​B,​Out> f)` | Create a new `ZipWith` vertex with the specified input types and zipping\-function `f`. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape10](../FanInShape10.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create10](#create10(akka.japi.function.Function10))​([Function10](../../japi/function/Function10.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​Out> f)` | Create a new `ZipWith` specialized for 10 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape11](../FanInShape11.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create11](#create11(akka.japi.function.Function11))​([Function11](../../japi/function/Function11.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​Out> f)` | Create a new `ZipWith` specialized for 11 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape12](../FanInShape12.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create12](#create12(akka.japi.function.Function12))​([Function12](../../japi/function/Function12.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​Out> f)` | Create a new `ZipWith` specialized for 12 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape13](../FanInShape13.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create13](#create13(akka.japi.function.Function13))​([Function13](../../japi/function/Function13.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​Out> f)` | Create a new `ZipWith` specialized for 13 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape14](../FanInShape14.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create14](#create14(akka.japi.function.Function14))​([Function14](../../japi/function/Function14.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​Out> f)` | Create a new `ZipWith` specialized for 14 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape15](../FanInShape15.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create15](#create15(akka.japi.function.Function15))​([Function15](../../japi/function/Function15.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​Out> f)` | Create a new `ZipWith` specialized for 15 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape16](../FanInShape16.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create16](#create16(akka.japi.function.Function16))​([Function16](../../japi/function/Function16.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​Out> f)` | Create a new `ZipWith` specialized for 16 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape17](../FanInShape17.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create17](#create17(akka.japi.function.Function17))​([Function17](../../japi/function/Function17.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​Out> f)` | Create a new `ZipWith` specialized for 17 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape18](../FanInShape18.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create18](#create18(akka.japi.function.Function18))​([Function18](../../japi/function/Function18.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​Out> f)` | Create a new `ZipWith` specialized for 18 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape19](../FanInShape19.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create19](#create19(akka.japi.function.Function19))​([Function19](../../japi/function/Function19.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​Out> f)` | Create a new `ZipWith` specialized for 19 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape20](../FanInShape20.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create20](#create20(akka.japi.function.Function20))​([Function20](../../japi/function/Function20.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​Out> f)` | Create a new `ZipWith` specialized for 20 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape21](../FanInShape21.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create21](#create21(akka.japi.function.Function21))​([Function21](../../japi/function/Function21.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​Out> f)` | Create a new `ZipWith` specialized for 21 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape22](../FanInShape22.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create22](#create22(akka.japi.function.Function22))​([Function22](../../japi/function/Function22.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​Out> f)` | Create a new `ZipWith` specialized for 22 inputs. |
	| `<T1,​T2,​T3,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape3](../FanInShape3.html "class in akka.stream")<T1,​T2,​T3,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create3](#create3(akka.japi.function.Function3))​([Function3](../../japi/function/Function3.html "interface in akka.japi.function")<T1,​T2,​T3,​Out> f)` | Create a new `ZipWith` specialized for 3 inputs. |
	| `<T1,​T2,​T3,​T4,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape4](../FanInShape4.html "class in akka.stream")<T1,​T2,​T3,​T4,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create4](#create4(akka.japi.function.Function4))​([Function4](../../japi/function/Function4.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​Out> f)` | Create a new `ZipWith` specialized for 4 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape5](../FanInShape5.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create5](#create5(akka.japi.function.Function5))​([Function5](../../japi/function/Function5.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​Out> f)` | Create a new `ZipWith` specialized for 5 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape6](../FanInShape6.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create6](#create6(akka.japi.function.Function6))​([Function6](../../japi/function/Function6.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​Out> f)` | Create a new `ZipWith` specialized for 6 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape7](../FanInShape7.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create7](#create7(akka.japi.function.Function7))​([Function7](../../japi/function/Function7.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​Out> f)` | Create a new `ZipWith` specialized for 7 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape8](../FanInShape8.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create8](#create8(akka.japi.function.Function8))​([Function8](../../japi/function/Function8.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​Out> f)` | Create a new `ZipWith` specialized for 8 inputs. |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​Out>[Graph](../Graph.html "interface in akka.stream")<[FanInShape9](../FanInShape9.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​Out>,​[NotUsed](../../NotUsed.html "class in akka")>` | `[create9](#create9(akka.japi.function.Function9))​([Function9](../../japi/function/Function9.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​Out> f)` | Create a new `ZipWith` specialized for 9 inputs. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ZipWith$](ZipWith$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ZipWith$
		
		
		
		```
		public ZipWith$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <A,​B,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape2](../FanInShape2.html "class in akka.stream")<A,​B,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create​([Function2](../../japi/function/Function2.html "interface in akka.japi.function")<A,​B,​Out> f)
		```
		
		Create a new `ZipWith` vertex with the specified input types and zipping\-function `f`.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create3
		
		
		
		```
		public <T1,​T2,​T3,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape3](../FanInShape3.html "class in akka.stream")<T1,​T2,​T3,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create3​([Function3](../../japi/function/Function3.html "interface in akka.japi.function")<T1,​T2,​T3,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 3 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create4
		
		
		
		```
		public <T1,​T2,​T3,​T4,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape4](../FanInShape4.html "class in akka.stream")<T1,​T2,​T3,​T4,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create4​([Function4](../../japi/function/Function4.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 4 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create5
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape5](../FanInShape5.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create5​([Function5](../../japi/function/Function5.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 5 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create6
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape6](../FanInShape6.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create6​([Function6](../../japi/function/Function6.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 6 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create7
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape7](../FanInShape7.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create7​([Function7](../../japi/function/Function7.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 7 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create8
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape8](../FanInShape8.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create8​([Function8](../../japi/function/Function8.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 8 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create9
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape9](../FanInShape9.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create9​([Function9](../../japi/function/Function9.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 9 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create10
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape10](../FanInShape10.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create10​([Function10](../../japi/function/Function10.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 10 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create11
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape11](../FanInShape11.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create11​([Function11](../../japi/function/Function11.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 11 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create12
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape12](../FanInShape12.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create12​([Function12](../../japi/function/Function12.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 12 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create13
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape13](../FanInShape13.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create13​([Function13](../../japi/function/Function13.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 13 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create14
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape14](../FanInShape14.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create14​([Function14](../../japi/function/Function14.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 14 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create15
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape15](../FanInShape15.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create15​([Function15](../../japi/function/Function15.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 15 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create16
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape16](../FanInShape16.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create16​([Function16](../../japi/function/Function16.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 16 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create17
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape17](../FanInShape17.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create17​([Function17](../../japi/function/Function17.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 17 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create18
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape18](../FanInShape18.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create18​([Function18](../../japi/function/Function18.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 18 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create19
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape19](../FanInShape19.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create19​([Function19](../../japi/function/Function19.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 19 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create20
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape20](../FanInShape20.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create20​([Function20](../../japi/function/Function20.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 20 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create21
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape21](../FanInShape21.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create21​([Function21](../../japi/function/Function21.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 21 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex
		- #### create22
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​Out> [Graph](../Graph.html "interface in akka.stream")<[FanInShape22](../FanInShape22.html "class in akka.stream")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​Out>,​[NotUsed](../../NotUsed.html "class in akka")> create22​([Function22](../../japi/function/Function22.html "interface in akka.japi.function")<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​Out> f)
		```
		
		Create a new `ZipWith` specialized for 22 inputs.
		 
		
		Parameters:
		`f` \- zipping\-function from the input values to the output value
		`attributes` \- optional attributes for this vertex

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function10.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function11.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function12.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function13.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function14.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function15.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function16.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function17.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function18.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function19.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function20.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function21.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function22.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function3.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function4.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function5.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function6.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function7.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function8.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function9.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape10.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape11.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape12.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape13.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape14.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape15.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape16.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape17.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape18.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape19.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape2.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape20.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape21.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape22.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape3.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape4.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape5.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape6.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape7.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape8.html
- https://doc.akka.io/japi/akka/current/akka/stream/FanInShape9.html
- https://doc.akka.io/japi/akka/current/akka/stream/Graph.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipWith$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipWith$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/ZipWith$.html)*