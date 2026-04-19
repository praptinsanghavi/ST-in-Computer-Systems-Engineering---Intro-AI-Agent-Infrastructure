---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:41:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleFoldInstances.html
title: TupleFoldInstances
---

# TupleFoldInstances

## Content

Package [akka.http.scaladsl.server.util](package-summary.html)
## Class TupleFoldInstances

- java.lang.Object
- - akka.http.scaladsl.server.util.TupleFoldInstances

- Direct Known Subclasses:
`[TupleOps.FoldLeft$](TupleOps.FoldLeft$.html "class in akka.http.scaladsl.server.util")`

---

```
public abstract class TupleFoldInstances
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TupleFoldInstances](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<In,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.runtime.BoxedUnit,​Op>` | `[t0](#t0())()` |  |
	| `<In,​A,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple1<A>,​Op>` | `[t1](#t1(akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<In,​A,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​X,​T10,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>,​Op>` | `[t10](#t10(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T10,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​X,​T11,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>,​Op>` | `[t11](#t11(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T11,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​X,​T12,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>,​Op>` | `[t12](#t12(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T12,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​X,​T13,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>,​Op>` | `[t13](#t13(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T13,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​X,​T14,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>,​Op>` | `[t14](#t14(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T14,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​X,​T15,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>,​Op>` | `[t15](#t15(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T15,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​X,​T16,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>,​Op>` | `[t16](#t16(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T16,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​X,​T17,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>,​Op>` | `[t17](#t17(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T17,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​X,​T18,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>,​Op>` | `[t18](#t18(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T18,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​X,​T19,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>,​Op>` | `[t19](#t19(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T19,​Op> f)` |  |
	| `<In,​T1,​X,​T2,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple2<T1,​T2>,​Op>` | `[t2](#t2(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple1<T1>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T2,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​X,​T20,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>,​Op>` | `[t20](#t20(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T20,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​X,​T21,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple21<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>,​Op>` | `[t21](#t21(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T21,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​X,​T22,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple22<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>,​Op>` | `[t22](#t22(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple21<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T22,​Op> f)` |  |
	| `<In,​T1,​T2,​X,​T3,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple3<T1,​T2,​T3>,​Op>` | `[t3](#t3(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple2<T1,​T2>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T3,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​X,​T4,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple4<T1,​T2,​T3,​T4>,​Op>` | `[t4](#t4(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple3<T1,​T2,​T3>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T4,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​X,​T5,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple5<T1,​T2,​T3,​T4,​T5>,​Op>` | `[t5](#t5(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple4<T1,​T2,​T3,​T4>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T5,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​X,​T6,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple6<T1,​T2,​T3,​T4,​T5,​T6>,​Op>` | `[t6](#t6(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple5<T1,​T2,​T3,​T4,​T5>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T6,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​X,​T7,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>,​Op>` | `[t7](#t7(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple6<T1,​T2,​T3,​T4,​T5,​T6>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T7,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​X,​T8,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>,​Op>` | `[t8](#t8(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T8,​Op> f)` |  |
	| `<In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​X,​T9,​Op>[TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>,​Op>` | `[t9](#t9(akka.http.scaladsl.server.util.TupleOps.FoldLeft,akka.http.scaladsl.server.util.BinaryPolyFunc.Case))​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>,​Op> fold,  [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T9,​Op> f)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TupleFoldInstances
		
		
		
		```
		public TupleFoldInstances()
		```

	- ### Method Detail
	
	
	
		- #### t0
		
		
		
		```
		public <In,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.runtime.BoxedUnit,​Op> t0()
		```
		- #### t1
		
		
		
		```
		public <In,​A,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple1<A>,​Op> t1​([BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<In,​A,​Op> f)
		```
		- #### t10
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​X,​T10,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>,​Op> t10​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>,​Op> fold,
		                                                                                                                                                                                                                                                                     [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T10,​Op> f)
		```
		- #### t11
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​X,​T11,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>,​Op> t11​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple10<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10>,​Op> fold,
		                                                                                                                                                                                                                                                                                         [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T11,​Op> f)
		```
		- #### t12
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​X,​T12,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>,​Op> t12​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple11<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11>,​Op> fold,
		                                                                                                                                                                                                                                                                                                             [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T12,​Op> f)
		```
		- #### t13
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​X,​T13,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>,​Op> t13​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple12<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12>,​Op> fold,
		                                                                                                                                                                                                                                                                                                                                 [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T13,​Op> f)
		```
		- #### t14
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​X,​T14,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>,​Op> t14​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple13<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13>,​Op> fold,
		                                                                                                                                                                                                                                                                                                                                                     [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T14,​Op> f)
		```
		- #### t15
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​X,​T15,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>,​Op> t15​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple14<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14>,​Op> fold,
		                                                                                                                                                                                                                                                                                                                                                                         [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T15,​Op> f)
		```
		- #### t16
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​X,​T16,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>,​Op> t16​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple15<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15>,​Op> fold,
		                                                                                                                                                                                                                                                                                                                                                                                             [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T16,​Op> f)
		```
		- #### t17
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​X,​T17,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>,​Op> t17​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple16<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16>,​Op> fold,
		                                                                                                                                                                                                                                                                                                                                                                                                                 [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T17,​Op> f)
		```
		- #### t18
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​X,​T18,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>,​Op> t18​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple17<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17>,​Op> fold,
		                                                                                                                                                                                                                                                                                                                                                                                                                                     [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T18,​Op> f)
		```
		- #### t19
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​X,​T19,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>,​Op> t19​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple18<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18>,​Op> fold,
		                                                                                                                                                                                                                                                                                                                                                                                                                                                         [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T19,​Op> f)
		```
		- #### t2
		
		
		
		```
		public <In,​T1,​X,​T2,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple2<T1,​T2>,​Op> t2​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple1<T1>,​Op> fold,
		                                                                                                                 [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T2,​Op> f)
		```
		- #### t20
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​X,​T20,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>,​Op> t20​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple19<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19>,​Op> fold,
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                             [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T20,​Op> f)
		```
		- #### t21
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​X,​T21,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple21<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>,​Op> t21​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple20<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20>,​Op> fold,
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T21,​Op> f)
		```
		- #### t22
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​X,​T22,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple22<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21,​T22>,​Op> t22​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple21<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9,​T10,​T11,​T12,​T13,​T14,​T15,​T16,​T17,​T18,​T19,​T20,​T21>,​Op> fold,
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T22,​Op> f)
		```
		- #### t3
		
		
		
		```
		public <In,​T1,​T2,​X,​T3,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple3<T1,​T2,​T3>,​Op> t3​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple2<T1,​T2>,​Op> fold,
		                                                                                                                                   [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T3,​Op> f)
		```
		- #### t4
		
		
		
		```
		public <In,​T1,​T2,​T3,​X,​T4,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple4<T1,​T2,​T3,​T4>,​Op> t4​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple3<T1,​T2,​T3>,​Op> fold,
		                                                                                                                                                     [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T4,​Op> f)
		```
		- #### t5
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​X,​T5,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple5<T1,​T2,​T3,​T4,​T5>,​Op> t5​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple4<T1,​T2,​T3,​T4>,​Op> fold,
		                                                                                                                                                                       [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T5,​Op> f)
		```
		- #### t6
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​X,​T6,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple6<T1,​T2,​T3,​T4,​T5,​T6>,​Op> t6​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple5<T1,​T2,​T3,​T4,​T5>,​Op> fold,
		                                                                                                                                                                                         [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T6,​Op> f)
		```
		- #### t7
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​X,​T7,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>,​Op> t7​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple6<T1,​T2,​T3,​T4,​T5,​T6>,​Op> fold,
		                                                                                                                                                                                                           [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T7,​Op> f)
		```
		- #### t8
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​X,​T8,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>,​Op> t8​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple7<T1,​T2,​T3,​T4,​T5,​T6,​T7>,​Op> fold,
		                                                                                                                                                                                                                             [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T8,​Op> f)
		```
		- #### t9
		
		
		
		```
		public <In,​T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​X,​T9,​Op> [TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple9<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8,​T9>,​Op> t9​([TupleOps.FoldLeft](TupleOps.FoldLeft.html "interface in akka.http.scaladsl.server.util")<In,​scala.Tuple8<T1,​T2,​T3,​T4,​T5,​T6,​T7,​T8>,​Op> fold,
		                                                                                                                                                                                                                                               [BinaryPolyFunc.Case](BinaryPolyFunc.Case.html "interface in akka.http.scaladsl.server.util")<X,​T9,​Op> f)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/BinaryPolyFunc.Case.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.FoldLeft$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.FoldLeft.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleFoldInstances.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleFoldInstances.html)*