---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ConstructFromTupleInstances.html
title: ConstructFromTupleInstances
---

# ConstructFromTupleInstances

## Content

Package [akka.http.scaladsl.server.util](package-summary.html)
## Class ConstructFromTupleInstances

- java.lang.Object
- - akka.http.scaladsl.server.util.ConstructFromTupleInstances

- Direct Known Subclasses:
`[ConstructFromTuple$](ConstructFromTuple$.html "class in akka.http.scaladsl.server.util")`

---

```
public abstract class ConstructFromTupleInstances
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConstructFromTupleInstances](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T1,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple1<T1>,​R>` | `[instance1](#instance1(scala.Function1))​(scala.Function1<T1,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>,​R>` | `[instance10](#instance10(scala.Function10))​(scala.Function10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>,​R>` | `[instance11](#instance11(scala.Function11))​(scala.Function11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>,​R>` | `[instance12](#instance12(scala.Function12))​(scala.Function12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>,​R>` | `[instance13](#instance13(scala.Function13))​(scala.Function13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>,​R>` | `[instance14](#instance14(scala.Function14))​(scala.Function14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>,​R>` | `[instance15](#instance15(scala.Function15))​(scala.Function15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>,​R>` | `[instance16](#instance16(scala.Function16))​(scala.Function16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>,​R>` | `[instance17](#instance17(scala.Function17))​(scala.Function17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>,​R>` | `[instance18](#instance18(scala.Function18))​(scala.Function18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>,​R>` | `[instance19](#instance19(scala.Function19))​(scala.Function19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​R> construct)` |  |
	| `<T1,​T2,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple2<T1,​T2>,​R>` | `[instance2](#instance2(scala.Function2))​(scala.Function2<T1,​T2,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>,​R>` | `[instance20](#instance20(scala.Function20))​(scala.Function20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple21<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>,​R>` | `[instance21](#instance21(scala.Function21))​(scala.Function21<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple22<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>,​R>` | `[instance22](#instance22(scala.Function22))​(scala.Function22<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​R> construct)` |  |
	| `<T1,​T2,​T3,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple3<T1,​T2,​T3>,​R>` | `[instance3](#instance3(scala.Function3))​(scala.Function3<T1,​T2,​T3,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple4<T1,​T2,​T3,​T4>,​R>` | `[instance4](#instance4(scala.Function4))​(scala.Function4<T1,​T2,​T3,​T4,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple5<T1,​T2,​T3,​T4,​T5>,​R>` | `[instance5](#instance5(scala.Function5))​(scala.Function5<T1,​T2,​T3,​T4,​T5,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple6<T1,​T2,​T3,​T4,​T5,​T6>,​R>` | `[instance6](#instance6(scala.Function6))​(scala.Function6<T1,​T2,​T3,​T4,​T5,​T6,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>,​R>` | `[instance7](#instance7(scala.Function7))​(scala.Function7<T1,​T2,​T3,​T4,​T5,​T6,​T7,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>,​R>` | `[instance8](#instance8(scala.Function8))​(scala.Function8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​R> construct)` |  |
	| `<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​R>[ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>,​R>` | `[instance9](#instance9(scala.Function9))​(scala.Function9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​R> construct)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConstructFromTupleInstances
		
		
		
		```
		public ConstructFromTupleInstances()
		```

	- ### Method Detail
	
	
	
		- #### instance1
		
		
		
		```
		public <T1,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple1<T1>,​R> instance1​(scala.Function1<T1,​R> construct)
		```
		- #### instance10
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>,​R> instance10​(scala.Function10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​R> construct)
		```
		- #### instance11
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>,​R> instance11​(scala.Function11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​R> construct)
		```
		- #### instance12
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>,​R> instance12​(scala.Function12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​R> construct)
		```
		- #### instance13
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>,​R> instance13​(scala.Function13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​R> construct)
		```
		- #### instance14
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>,​R> instance14​(scala.Function14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​R> construct)
		```
		- #### instance15
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>,​R> instance15​(scala.Function15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​R> construct)
		```
		- #### instance16
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>,​R> instance16​(scala.Function16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​R> construct)
		```
		- #### instance17
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>,​R> instance17​(scala.Function17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​R> construct)
		```
		- #### instance18
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>,​R> instance18​(scala.Function18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​R> construct)
		```
		- #### instance19
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>,​R> instance19​(scala.Function19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​R> construct)
		```
		- #### instance2
		
		
		
		```
		public <T1,​T2,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple2<T1,​T2>,​R> instance2​(scala.Function2<T1,​T2,​R> construct)
		```
		- #### instance20
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>,​R> instance20​(scala.Function20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​R> construct)
		```
		- #### instance21
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple21<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>,​R> instance21​(scala.Function21<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​R> construct)
		```
		- #### instance22
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple22<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>,​R> instance22​(scala.Function22<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22,​R> construct)
		```
		- #### instance3
		
		
		
		```
		public <T1,​T2,​T3,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple3<T1,​T2,​T3>,​R> instance3​(scala.Function3<T1,​T2,​T3,​R> construct)
		```
		- #### instance4
		
		
		
		```
		public <T1,​T2,​T3,​T4,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple4<T1,​T2,​T3,​T4>,​R> instance4​(scala.Function4<T1,​T2,​T3,​T4,​R> construct)
		```
		- #### instance5
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple5<T1,​T2,​T3,​T4,​T5>,​R> instance5​(scala.Function5<T1,​T2,​T3,​T4,​T5,​R> construct)
		```
		- #### instance6
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple6<T1,​T2,​T3,​T4,​T5,​T6>,​R> instance6​(scala.Function6<T1,​T2,​T3,​T4,​T5,​T6,​R> construct)
		```
		- #### instance7
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>,​R> instance7​(scala.Function7<T1,​T2,​T3,​T4,​T5,​T6,​T7,​R> construct)
		```
		- #### instance8
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>,​R> instance8​(scala.Function8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​R> construct)
		```
		- #### instance9
		
		
		
		```
		public <T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​R> [ConstructFromTuple](ConstructFromTuple.html "interface in akka.http.scaladsl.server.util")<scala.Tuple9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>,​R> instance9​(scala.Function9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​R> construct)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ConstructFromTuple$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ConstructFromTuple.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ConstructFromTupleInstances.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ConstructFromTupleInstances.html)*