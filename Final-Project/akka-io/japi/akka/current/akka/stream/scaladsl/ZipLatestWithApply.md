---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWithApply.html
title: ZipLatestWithApply
---

# ZipLatestWithApply

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface ZipLatestWithApply

- All Known Implementing Classes:
`[ZipLatestWith$](ZipLatestWith$.html "class in akka.stream.scaladsl")`

---

```
public interface ZipLatestWithApply
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O>[ZipLatestWith10](ZipLatestWith10.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O>` | `[apply](#apply(scala.Function10))​(scala.Function10<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> zipper)` | Create a new `ZipLatestWith` specialized for 10 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O>[ZipLatestWith10](ZipLatestWith10.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O>` | `[apply](#apply(scala.Function10,boolean))​(scala.Function10<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 10 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O>[ZipLatestWith11](ZipLatestWith11.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O>` | `[apply](#apply(scala.Function11))​(scala.Function11<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> zipper)` | Create a new `ZipLatestWith` specialized for 11 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O>[ZipLatestWith11](ZipLatestWith11.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O>` | `[apply](#apply(scala.Function11,boolean))​(scala.Function11<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 11 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O>[ZipLatestWith12](ZipLatestWith12.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O>` | `[apply](#apply(scala.Function12))​(scala.Function12<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> zipper)` | Create a new `ZipLatestWith` specialized for 12 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O>[ZipLatestWith12](ZipLatestWith12.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O>` | `[apply](#apply(scala.Function12,boolean))​(scala.Function12<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 12 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O>[ZipLatestWith13](ZipLatestWith13.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O>` | `[apply](#apply(scala.Function13))​(scala.Function13<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> zipper)` | Create a new `ZipLatestWith` specialized for 13 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O>[ZipLatestWith13](ZipLatestWith13.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O>` | `[apply](#apply(scala.Function13,boolean))​(scala.Function13<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 13 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O>[ZipLatestWith14](ZipLatestWith14.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O>` | `[apply](#apply(scala.Function14))​(scala.Function14<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> zipper)` | Create a new `ZipLatestWith` specialized for 14 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O>[ZipLatestWith14](ZipLatestWith14.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O>` | `[apply](#apply(scala.Function14,boolean))​(scala.Function14<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 14 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O>[ZipLatestWith15](ZipLatestWith15.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O>` | `[apply](#apply(scala.Function15))​(scala.Function15<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> zipper)` | Create a new `ZipLatestWith` specialized for 15 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O>[ZipLatestWith15](ZipLatestWith15.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O>` | `[apply](#apply(scala.Function15,boolean))​(scala.Function15<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 15 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O>[ZipLatestWith16](ZipLatestWith16.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O>` | `[apply](#apply(scala.Function16))​(scala.Function16<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> zipper)` | Create a new `ZipLatestWith` specialized for 16 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O>[ZipLatestWith16](ZipLatestWith16.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O>` | `[apply](#apply(scala.Function16,boolean))​(scala.Function16<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 16 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O>[ZipLatestWith17](ZipLatestWith17.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O>` | `[apply](#apply(scala.Function17))​(scala.Function17<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> zipper)` | Create a new `ZipLatestWith` specialized for 17 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O>[ZipLatestWith17](ZipLatestWith17.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O>` | `[apply](#apply(scala.Function17,boolean))​(scala.Function17<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 17 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O>[ZipLatestWith18](ZipLatestWith18.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O>` | `[apply](#apply(scala.Function18))​(scala.Function18<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> zipper)` | Create a new `ZipLatestWith` specialized for 18 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O>[ZipLatestWith18](ZipLatestWith18.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O>` | `[apply](#apply(scala.Function18,boolean))​(scala.Function18<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 18 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>[ZipLatestWith19](ZipLatestWith19.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>` | `[apply](#apply(scala.Function19))​(scala.Function19<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> zipper)` | Create a new `ZipLatestWith` specialized for 19 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>[ZipLatestWith19](ZipLatestWith19.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>` | `[apply](#apply(scala.Function19,boolean))​(scala.Function19<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 19 inputs. |
	| `<A1,​A2,​O>[ZipLatestWith2](ZipLatestWith2.html "class in akka.stream.scaladsl")<A1,​A2,​O>` | `[apply](#apply(scala.Function2))​(scala.Function2<A1,​A2,​O> zipper)` | Create a new `ZipLatestWith` specialized for 2 inputs. |
	| `<A1,​A2,​O>[ZipLatestWith2](ZipLatestWith2.html "class in akka.stream.scaladsl")<A1,​A2,​O>` | `[apply](#apply(scala.Function2,boolean))​(scala.Function2<A1,​A2,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 2 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O>[ZipLatestWith20](ZipLatestWith20.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O>` | `[apply](#apply(scala.Function20))​(scala.Function20<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> zipper)` | Create a new `ZipLatestWith` specialized for 20 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O>[ZipLatestWith20](ZipLatestWith20.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O>` | `[apply](#apply(scala.Function20,boolean))​(scala.Function20<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 20 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O>[ZipLatestWith21](ZipLatestWith21.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O>` | `[apply](#apply(scala.Function21))​(scala.Function21<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> zipper)` | Create a new `ZipLatestWith` specialized for 21 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O>[ZipLatestWith21](ZipLatestWith21.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O>` | `[apply](#apply(scala.Function21,boolean))​(scala.Function21<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 21 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O>[ZipLatestWith22](ZipLatestWith22.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O>` | `[apply](#apply(scala.Function22))​(scala.Function22<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> zipper)` | Create a new `ZipLatestWith` specialized for 22 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O>[ZipLatestWith22](ZipLatestWith22.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O>` | `[apply](#apply(scala.Function22,boolean))​(scala.Function22<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 22 inputs. |
	| `<A1,​A2,​A3,​O>[ZipLatestWith3](ZipLatestWith3.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​O>` | `[apply](#apply(scala.Function3))​(scala.Function3<A1,​A2,​A3,​O> zipper)` | Create a new `ZipLatestWith` specialized for 3 inputs. |
	| `<A1,​A2,​A3,​O>[ZipLatestWith3](ZipLatestWith3.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​O>` | `[apply](#apply(scala.Function3,boolean))​(scala.Function3<A1,​A2,​A3,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 3 inputs. |
	| `<A1,​A2,​A3,​A4,​O>[ZipLatestWith4](ZipLatestWith4.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​O>` | `[apply](#apply(scala.Function4))​(scala.Function4<A1,​A2,​A3,​A4,​O> zipper)` | Create a new `ZipLatestWith` specialized for 4 inputs. |
	| `<A1,​A2,​A3,​A4,​O>[ZipLatestWith4](ZipLatestWith4.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​O>` | `[apply](#apply(scala.Function4,boolean))​(scala.Function4<A1,​A2,​A3,​A4,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 4 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​O>[ZipLatestWith5](ZipLatestWith5.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​O>` | `[apply](#apply(scala.Function5))​(scala.Function5<A1,​A2,​A3,​A4,​A5,​O> zipper)` | Create a new `ZipLatestWith` specialized for 5 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​O>[ZipLatestWith5](ZipLatestWith5.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​O>` | `[apply](#apply(scala.Function5,boolean))​(scala.Function5<A1,​A2,​A3,​A4,​A5,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 5 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​O>[ZipLatestWith6](ZipLatestWith6.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​O>` | `[apply](#apply(scala.Function6))​(scala.Function6<A1,​A2,​A3,​A4,​A5,​A6,​O> zipper)` | Create a new `ZipLatestWith` specialized for 6 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​O>[ZipLatestWith6](ZipLatestWith6.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​O>` | `[apply](#apply(scala.Function6,boolean))​(scala.Function6<A1,​A2,​A3,​A4,​A5,​A6,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 6 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>[ZipLatestWith7](ZipLatestWith7.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>` | `[apply](#apply(scala.Function7))​(scala.Function7<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> zipper)` | Create a new `ZipLatestWith` specialized for 7 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>[ZipLatestWith7](ZipLatestWith7.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>` | `[apply](#apply(scala.Function7,boolean))​(scala.Function7<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 7 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O>[ZipLatestWith8](ZipLatestWith8.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O>` | `[apply](#apply(scala.Function8))​(scala.Function8<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> zipper)` | Create a new `ZipLatestWith` specialized for 8 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O>[ZipLatestWith8](ZipLatestWith8.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O>` | `[apply](#apply(scala.Function8,boolean))​(scala.Function8<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 8 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O>[ZipLatestWith9](ZipLatestWith9.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O>` | `[apply](#apply(scala.Function9))​(scala.Function9<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> zipper)` | Create a new `ZipLatestWith` specialized for 9 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O>[ZipLatestWith9](ZipLatestWith9.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O>` | `[apply](#apply(scala.Function9,boolean))​(scala.Function9<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> zipper,  boolean eagerComplete)` | Create a new `ZipLatestWith` specialized for 9 inputs. |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		<A1,​A2,​O> [ZipLatestWith2](ZipLatestWith2.html "class in akka.stream.scaladsl")<A1,​A2,​O> apply​(scala.Function2<A1,​A2,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 2 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​O> [ZipLatestWith3](ZipLatestWith3.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​O> apply​(scala.Function3<A1,​A2,​A3,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 3 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​O> [ZipLatestWith4](ZipLatestWith4.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​O> apply​(scala.Function4<A1,​A2,​A3,​A4,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 4 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​O> [ZipLatestWith5](ZipLatestWith5.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​O> apply​(scala.Function5<A1,​A2,​A3,​A4,​A5,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 5 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​O> [ZipLatestWith6](ZipLatestWith6.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​O> apply​(scala.Function6<A1,​A2,​A3,​A4,​A5,​A6,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 6 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> [ZipLatestWith7](ZipLatestWith7.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> apply​(scala.Function7<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 7 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> [ZipLatestWith8](ZipLatestWith8.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> apply​(scala.Function8<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 8 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> [ZipLatestWith9](ZipLatestWith9.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> apply​(scala.Function9<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 9 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> [ZipLatestWith10](ZipLatestWith10.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> apply​(scala.Function10<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 10 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> [ZipLatestWith11](ZipLatestWith11.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> apply​(scala.Function11<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 11 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> [ZipLatestWith12](ZipLatestWith12.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> apply​(scala.Function12<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 12 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> [ZipLatestWith13](ZipLatestWith13.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> apply​(scala.Function13<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 13 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> [ZipLatestWith14](ZipLatestWith14.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> apply​(scala.Function14<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 14 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> [ZipLatestWith15](ZipLatestWith15.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> apply​(scala.Function15<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 15 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> [ZipLatestWith16](ZipLatestWith16.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> apply​(scala.Function16<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 16 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> [ZipLatestWith17](ZipLatestWith17.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> apply​(scala.Function17<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 17 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> [ZipLatestWith18](ZipLatestWith18.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> apply​(scala.Function18<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 18 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> [ZipLatestWith19](ZipLatestWith19.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> apply​(scala.Function19<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 19 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> [ZipLatestWith20](ZipLatestWith20.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> apply​(scala.Function20<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 20 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> [ZipLatestWith21](ZipLatestWith21.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> apply​(scala.Function21<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 21 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> [ZipLatestWith22](ZipLatestWith22.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> apply​(scala.Function22<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> zipper)
		```
		
		Create a new `ZipLatestWith` specialized for 22 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​O> [ZipLatestWith2](ZipLatestWith2.html "class in akka.stream.scaladsl")<A1,​A2,​O> apply​(scala.Function2<A1,​A2,​O> zipper,
		                                                                boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 2 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​O> [ZipLatestWith3](ZipLatestWith3.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​O> apply​(scala.Function3<A1,​A2,​A3,​O> zipper,
		                                                                                  boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 3 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​O> [ZipLatestWith4](ZipLatestWith4.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​O> apply​(scala.Function4<A1,​A2,​A3,​A4,​O> zipper,
		                                                                                                    boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 4 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​O> [ZipLatestWith5](ZipLatestWith5.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​O> apply​(scala.Function5<A1,​A2,​A3,​A4,​A5,​O> zipper,
		                                                                                                                      boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 5 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​O> [ZipLatestWith6](ZipLatestWith6.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​O> apply​(scala.Function6<A1,​A2,​A3,​A4,​A5,​A6,​O> zipper,
		                                                                                                                                        boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 6 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> [ZipLatestWith7](ZipLatestWith7.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> apply​(scala.Function7<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> zipper,
		                                                                                                                                                          boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 7 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> [ZipLatestWith8](ZipLatestWith8.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> apply​(scala.Function8<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> zipper,
		                                                                                                                                                                            boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 8 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> [ZipLatestWith9](ZipLatestWith9.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> apply​(scala.Function9<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> zipper,
		                                                                                                                                                                                              boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 9 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> [ZipLatestWith10](ZipLatestWith10.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> apply​(scala.Function10<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> zipper,
		                                                                                                                                                                                                                   boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 10 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> [ZipLatestWith11](ZipLatestWith11.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> apply​(scala.Function11<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> zipper,
		                                                                                                                                                                                                                                       boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 11 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> [ZipLatestWith12](ZipLatestWith12.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> apply​(scala.Function12<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> zipper,
		                                                                                                                                                                                                                                                           boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 12 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> [ZipLatestWith13](ZipLatestWith13.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> apply​(scala.Function13<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> zipper,
		                                                                                                                                                                                                                                                                               boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 13 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> [ZipLatestWith14](ZipLatestWith14.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> apply​(scala.Function14<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> zipper,
		                                                                                                                                                                                                                                                                                                   boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 14 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> [ZipLatestWith15](ZipLatestWith15.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> apply​(scala.Function15<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> zipper,
		                                                                                                                                                                                                                                                                                                                       boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 15 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> [ZipLatestWith16](ZipLatestWith16.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> apply​(scala.Function16<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> zipper,
		                                                                                                                                                                                                                                                                                                                                           boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 16 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> [ZipLatestWith17](ZipLatestWith17.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> apply​(scala.Function17<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> zipper,
		                                                                                                                                                                                                                                                                                                                                                               boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 17 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> [ZipLatestWith18](ZipLatestWith18.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> apply​(scala.Function18<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> zipper,
		                                                                                                                                                                                                                                                                                                                                                                                   boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 18 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> [ZipLatestWith19](ZipLatestWith19.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> apply​(scala.Function19<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> zipper,
		                                                                                                                                                                                                                                                                                                                                                                                                       boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 19 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> [ZipLatestWith20](ZipLatestWith20.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> apply​(scala.Function20<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> zipper,
		                                                                                                                                                                                                                                                                                                                                                                                                                           boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 20 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> [ZipLatestWith21](ZipLatestWith21.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> apply​(scala.Function21<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> zipper,
		                                                                                                                                                                                                                                                                                                                                                                                                                                               boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 21 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> [ZipLatestWith22](ZipLatestWith22.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> apply​(scala.Function22<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> zipper,
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                   boolean eagerComplete)
		```
		
		Create a new `ZipLatestWith` specialized for 22 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith10.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith11.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith12.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith13.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith14.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith15.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith16.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith17.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith18.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith19.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith2.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith20.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith21.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith22.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith3.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith4.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith5.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith6.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith7.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith8.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWith9.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWithApply.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipLatestWithApply.html)*