---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith.html
title: UnzipWith
---

# UnzipWith

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class UnzipWith

- java.lang.Object
- - akka.stream.scaladsl.UnzipWith

- ---

```
public class UnzipWith
extends java.lang.Object
```

Transforms each element of input stream into multiple streams using a splitter function.
 
 '''Emits when''' all of the outputs stop backpressuring and there is an input element available
 

 '''Backpressures when''' any of the outputs backpressure
 

 '''Completes when''' upstream completes
 

 '''Cancels when''' any downstream cancels

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnzipWith](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10>[UnzipWith10](UnzipWith10.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator10))​(scala.Function1<In,​scala.Tuple10<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10>> unzipper,  [UnzipWithApply.UnzipWithCreator10](UnzipWithApply.UnzipWithCreator10.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11>[UnzipWith11](UnzipWith11.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator11))​(scala.Function1<In,​scala.Tuple11<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11>> unzipper,  [UnzipWithApply.UnzipWithCreator11](UnzipWithApply.UnzipWithCreator11.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12>[UnzipWith12](UnzipWith12.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator12))​(scala.Function1<In,​scala.Tuple12<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12>> unzipper,  [UnzipWithApply.UnzipWithCreator12](UnzipWithApply.UnzipWithCreator12.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13>[UnzipWith13](UnzipWith13.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator13))​(scala.Function1<In,​scala.Tuple13<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13>> unzipper,  [UnzipWithApply.UnzipWithCreator13](UnzipWithApply.UnzipWithCreator13.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14>[UnzipWith14](UnzipWith14.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator14))​(scala.Function1<In,​scala.Tuple14<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14>> unzipper,  [UnzipWithApply.UnzipWithCreator14](UnzipWithApply.UnzipWithCreator14.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15>[UnzipWith15](UnzipWith15.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator15))​(scala.Function1<In,​scala.Tuple15<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15>> unzipper,  [UnzipWithApply.UnzipWithCreator15](UnzipWithApply.UnzipWithCreator15.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16>[UnzipWith16](UnzipWith16.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator16))​(scala.Function1<In,​scala.Tuple16<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16>> unzipper,  [UnzipWithApply.UnzipWithCreator16](UnzipWithApply.UnzipWithCreator16.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17>[UnzipWith17](UnzipWith17.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator17))​(scala.Function1<In,​scala.Tuple17<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17>> unzipper,  [UnzipWithApply.UnzipWithCreator17](UnzipWithApply.UnzipWithCreator17.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18>[UnzipWith18](UnzipWith18.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator18))​(scala.Function1<In,​scala.Tuple18<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18>> unzipper,  [UnzipWithApply.UnzipWithCreator18](UnzipWithApply.UnzipWithCreator18.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19>[UnzipWith19](UnzipWith19.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator19))​(scala.Function1<In,​scala.Tuple19<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19>> unzipper,  [UnzipWithApply.UnzipWithCreator19](UnzipWithApply.UnzipWithCreator19.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2>[UnzipWith2](UnzipWith2.html "class in akka.stream.scaladsl")<In,​A1,​A2>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator2))​(scala.Function1<In,​scala.Tuple2<A1,​A2>> unzipper,  [UnzipWithApply.UnzipWithCreator2](UnzipWithApply.UnzipWithCreator2.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20>[UnzipWith20](UnzipWith20.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator20))​(scala.Function1<In,​scala.Tuple20<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20>> unzipper,  [UnzipWithApply.UnzipWithCreator20](UnzipWithApply.UnzipWithCreator20.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21>[UnzipWith21](UnzipWith21.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator21))​(scala.Function1<In,​scala.Tuple21<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21>> unzipper,  [UnzipWithApply.UnzipWithCreator21](UnzipWithApply.UnzipWithCreator21.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22>[UnzipWith22](UnzipWith22.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator22))​(scala.Function1<In,​scala.Tuple22<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22>> unzipper,  [UnzipWithApply.UnzipWithCreator22](UnzipWithApply.UnzipWithCreator22.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3>[UnzipWith3](UnzipWith3.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator3))​(scala.Function1<In,​scala.Tuple3<A1,​A2,​A3>> unzipper,  [UnzipWithApply.UnzipWithCreator3](UnzipWithApply.UnzipWithCreator3.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4>[UnzipWith4](UnzipWith4.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator4))​(scala.Function1<In,​scala.Tuple4<A1,​A2,​A3,​A4>> unzipper,  [UnzipWithApply.UnzipWithCreator4](UnzipWithApply.UnzipWithCreator4.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5>[UnzipWith5](UnzipWith5.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator5))​(scala.Function1<In,​scala.Tuple5<A1,​A2,​A3,​A4,​A5>> unzipper,  [UnzipWithApply.UnzipWithCreator5](UnzipWithApply.UnzipWithCreator5.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6>[UnzipWith6](UnzipWith6.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator6))​(scala.Function1<In,​scala.Tuple6<A1,​A2,​A3,​A4,​A5,​A6>> unzipper,  [UnzipWithApply.UnzipWithCreator6](UnzipWithApply.UnzipWithCreator6.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7>[UnzipWith7](UnzipWith7.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator7))​(scala.Function1<In,​scala.Tuple7<A1,​A2,​A3,​A4,​A5,​A6,​A7>> unzipper,  [UnzipWithApply.UnzipWithCreator7](UnzipWithApply.UnzipWithCreator7.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8>[UnzipWith8](UnzipWith8.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator8))​(scala.Function1<In,​scala.Tuple8<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8>> unzipper,  [UnzipWithApply.UnzipWithCreator8](UnzipWithApply.UnzipWithCreator8.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	| `static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9>[UnzipWith9](UnzipWith9.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.UnzipWithApply.UnzipWithCreator9))​(scala.Function1<In,​scala.Tuple9<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9>> unzipper,  [UnzipWithApply.UnzipWithCreator9](UnzipWithApply.UnzipWithCreator9.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### UnzipWith
		
		
		
		```
		public UnzipWith()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2> [UnzipWith2](UnzipWith2.html "class in akka.stream.scaladsl")<In,​A1,​A2> apply​(scala.Function1<In,​scala.Tuple2<A1,​A2>> unzipper,
		                                                                            [UnzipWithApply.UnzipWithCreator2](UnzipWithApply.UnzipWithCreator2.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3> [UnzipWith3](UnzipWith3.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3> apply​(scala.Function1<In,​scala.Tuple3<A1,​A2,​A3>> unzipper,
		                                                                                              [UnzipWithApply.UnzipWithCreator3](UnzipWithApply.UnzipWithCreator3.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4> [UnzipWith4](UnzipWith4.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4> apply​(scala.Function1<In,​scala.Tuple4<A1,​A2,​A3,​A4>> unzipper,
		                                                                                                                [UnzipWithApply.UnzipWithCreator4](UnzipWithApply.UnzipWithCreator4.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5> [UnzipWith5](UnzipWith5.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5> apply​(scala.Function1<In,​scala.Tuple5<A1,​A2,​A3,​A4,​A5>> unzipper,
		                                                                                                                                  [UnzipWithApply.UnzipWithCreator5](UnzipWithApply.UnzipWithCreator5.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6> [UnzipWith6](UnzipWith6.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6> apply​(scala.Function1<In,​scala.Tuple6<A1,​A2,​A3,​A4,​A5,​A6>> unzipper,
		                                                                                                                                                    [UnzipWithApply.UnzipWithCreator6](UnzipWithApply.UnzipWithCreator6.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7> [UnzipWith7](UnzipWith7.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7> apply​(scala.Function1<In,​scala.Tuple7<A1,​A2,​A3,​A4,​A5,​A6,​A7>> unzipper,
		                                                                                                                                                                      [UnzipWithApply.UnzipWithCreator7](UnzipWithApply.UnzipWithCreator7.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8> [UnzipWith8](UnzipWith8.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8> apply​(scala.Function1<In,​scala.Tuple8<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8>> unzipper,
		                                                                                                                                                                                        [UnzipWithApply.UnzipWithCreator8](UnzipWithApply.UnzipWithCreator8.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9> [UnzipWith9](UnzipWith9.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9> apply​(scala.Function1<In,​scala.Tuple9<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9>> unzipper,
		                                                                                                                                                                                                          [UnzipWithApply.UnzipWithCreator9](UnzipWithApply.UnzipWithCreator9.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10> [UnzipWith10](UnzipWith10.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10> apply​(scala.Function1<In,​scala.Tuple10<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10>> unzipper,
		                                                                                                                                                                                                                               [UnzipWithApply.UnzipWithCreator10](UnzipWithApply.UnzipWithCreator10.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11> [UnzipWith11](UnzipWith11.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11> apply​(scala.Function1<In,​scala.Tuple11<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11>> unzipper,
		                                                                                                                                                                                                                                                   [UnzipWithApply.UnzipWithCreator11](UnzipWithApply.UnzipWithCreator11.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12> [UnzipWith12](UnzipWith12.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12> apply​(scala.Function1<In,​scala.Tuple12<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12>> unzipper,
		                                                                                                                                                                                                                                                                       [UnzipWithApply.UnzipWithCreator12](UnzipWithApply.UnzipWithCreator12.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13> [UnzipWith13](UnzipWith13.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13> apply​(scala.Function1<In,​scala.Tuple13<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13>> unzipper,
		                                                                                                                                                                                                                                                                                           [UnzipWithApply.UnzipWithCreator13](UnzipWithApply.UnzipWithCreator13.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14> [UnzipWith14](UnzipWith14.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14> apply​(scala.Function1<In,​scala.Tuple14<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14>> unzipper,
		                                                                                                                                                                                                                                                                                                               [UnzipWithApply.UnzipWithCreator14](UnzipWithApply.UnzipWithCreator14.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15> [UnzipWith15](UnzipWith15.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15> apply​(scala.Function1<In,​scala.Tuple15<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15>> unzipper,
		                                                                                                                                                                                                                                                                                                                                   [UnzipWithApply.UnzipWithCreator15](UnzipWithApply.UnzipWithCreator15.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16> [UnzipWith16](UnzipWith16.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16> apply​(scala.Function1<In,​scala.Tuple16<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16>> unzipper,
		                                                                                                                                                                                                                                                                                                                                                       [UnzipWithApply.UnzipWithCreator16](UnzipWithApply.UnzipWithCreator16.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17> [UnzipWith17](UnzipWith17.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17> apply​(scala.Function1<In,​scala.Tuple17<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17>> unzipper,
		                                                                                                                                                                                                                                                                                                                                                                           [UnzipWithApply.UnzipWithCreator17](UnzipWithApply.UnzipWithCreator17.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18> [UnzipWith18](UnzipWith18.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18> apply​(scala.Function1<In,​scala.Tuple18<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18>> unzipper,
		                                                                                                                                                                                                                                                                                                                                                                                               [UnzipWithApply.UnzipWithCreator18](UnzipWithApply.UnzipWithCreator18.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19> [UnzipWith19](UnzipWith19.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19> apply​(scala.Function1<In,​scala.Tuple19<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19>> unzipper,
		                                                                                                                                                                                                                                                                                                                                                                                                                   [UnzipWithApply.UnzipWithCreator19](UnzipWithApply.UnzipWithCreator19.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20> [UnzipWith20](UnzipWith20.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20> apply​(scala.Function1<In,​scala.Tuple20<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20>> unzipper,
		                                                                                                                                                                                                                                                                                                                                                                                                                                       [UnzipWithApply.UnzipWithCreator20](UnzipWithApply.UnzipWithCreator20.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21> [UnzipWith21](UnzipWith21.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21> apply​(scala.Function1<In,​scala.Tuple21<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21>> unzipper,
		                                                                                                                                                                                                                                                                                                                                                                                                                                                           [UnzipWithApply.UnzipWithCreator21](UnzipWithApply.UnzipWithCreator21.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```
		- #### apply
		
		
		
		```
		public static <In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22> [UnzipWith22](UnzipWith22.html "class in akka.stream.scaladsl")<In,​A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22> apply​(scala.Function1<In,​scala.Tuple22<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22>> unzipper,
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                               [UnzipWithApply.UnzipWithCreator22](UnzipWithApply.UnzipWithCreator22.html "interface in akka.stream.scaladsl")<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object> creator)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith10.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith11.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith12.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith13.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith14.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith15.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith16.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith17.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith18.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith19.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith2.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith20.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith21.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith22.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith3.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith4.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith5.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith6.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith7.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith8.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith9.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator10.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator11.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator12.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator13.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator14.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator15.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator16.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator17.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator18.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator19.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator2.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator20.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator21.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator22.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator3.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator4.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator5.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator6.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator7.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator8.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWithApply.UnzipWithCreator9.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/UnzipWith.html)*