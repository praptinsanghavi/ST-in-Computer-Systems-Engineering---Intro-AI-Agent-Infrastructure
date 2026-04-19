---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:41:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWithApply.html
title: ZipWithApply
---

# ZipWithApply

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface ZipWithApply

- All Known Implementing Classes:
`[ZipWith$](ZipWith$.html "class in akka.stream.scaladsl")`

---

```
public interface ZipWithApply
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O>[ZipWith10](ZipWith10.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O>` | `[apply](#apply(scala.Function10))​(scala.Function10<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> zipper)` | Create a new `ZipWith` specialized for 10 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O>[ZipWith11](ZipWith11.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O>` | `[apply](#apply(scala.Function11))​(scala.Function11<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> zipper)` | Create a new `ZipWith` specialized for 11 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O>[ZipWith12](ZipWith12.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O>` | `[apply](#apply(scala.Function12))​(scala.Function12<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> zipper)` | Create a new `ZipWith` specialized for 12 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O>[ZipWith13](ZipWith13.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O>` | `[apply](#apply(scala.Function13))​(scala.Function13<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> zipper)` | Create a new `ZipWith` specialized for 13 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O>[ZipWith14](ZipWith14.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O>` | `[apply](#apply(scala.Function14))​(scala.Function14<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> zipper)` | Create a new `ZipWith` specialized for 14 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O>[ZipWith15](ZipWith15.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O>` | `[apply](#apply(scala.Function15))​(scala.Function15<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> zipper)` | Create a new `ZipWith` specialized for 15 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O>[ZipWith16](ZipWith16.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O>` | `[apply](#apply(scala.Function16))​(scala.Function16<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> zipper)` | Create a new `ZipWith` specialized for 16 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O>[ZipWith17](ZipWith17.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O>` | `[apply](#apply(scala.Function17))​(scala.Function17<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> zipper)` | Create a new `ZipWith` specialized for 17 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O>[ZipWith18](ZipWith18.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O>` | `[apply](#apply(scala.Function18))​(scala.Function18<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> zipper)` | Create a new `ZipWith` specialized for 18 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>[ZipWith19](ZipWith19.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O>` | `[apply](#apply(scala.Function19))​(scala.Function19<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> zipper)` | Create a new `ZipWith` specialized for 19 inputs. |
	| `<A1,​A2,​O>[ZipWith2](ZipWith2.html "class in akka.stream.scaladsl")<A1,​A2,​O>` | `[apply](#apply(scala.Function2))​(scala.Function2<A1,​A2,​O> zipper)` | Create a new `ZipWith` specialized for 2 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O>[ZipWith20](ZipWith20.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O>` | `[apply](#apply(scala.Function20))​(scala.Function20<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> zipper)` | Create a new `ZipWith` specialized for 20 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O>[ZipWith21](ZipWith21.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O>` | `[apply](#apply(scala.Function21))​(scala.Function21<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> zipper)` | Create a new `ZipWith` specialized for 21 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O>[ZipWith22](ZipWith22.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O>` | `[apply](#apply(scala.Function22))​(scala.Function22<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> zipper)` | Create a new `ZipWith` specialized for 22 inputs. |
	| `<A1,​A2,​A3,​O>[ZipWith3](ZipWith3.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​O>` | `[apply](#apply(scala.Function3))​(scala.Function3<A1,​A2,​A3,​O> zipper)` | Create a new `ZipWith` specialized for 3 inputs. |
	| `<A1,​A2,​A3,​A4,​O>[ZipWith4](ZipWith4.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​O>` | `[apply](#apply(scala.Function4))​(scala.Function4<A1,​A2,​A3,​A4,​O> zipper)` | Create a new `ZipWith` specialized for 4 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​O>[ZipWith5](ZipWith5.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​O>` | `[apply](#apply(scala.Function5))​(scala.Function5<A1,​A2,​A3,​A4,​A5,​O> zipper)` | Create a new `ZipWith` specialized for 5 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​O>[ZipWith6](ZipWith6.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​O>` | `[apply](#apply(scala.Function6))​(scala.Function6<A1,​A2,​A3,​A4,​A5,​A6,​O> zipper)` | Create a new `ZipWith` specialized for 6 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>[ZipWith7](ZipWith7.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O>` | `[apply](#apply(scala.Function7))​(scala.Function7<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> zipper)` | Create a new `ZipWith` specialized for 7 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O>[ZipWith8](ZipWith8.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O>` | `[apply](#apply(scala.Function8))​(scala.Function8<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> zipper)` | Create a new `ZipWith` specialized for 8 inputs. |
	| `<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O>[ZipWith9](ZipWith9.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O>` | `[apply](#apply(scala.Function9))​(scala.Function9<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> zipper)` | Create a new `ZipWith` specialized for 9 inputs. |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		<A1,​A2,​O> [ZipWith2](ZipWith2.html "class in akka.stream.scaladsl")<A1,​A2,​O> apply​(scala.Function2<A1,​A2,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 2 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​O> [ZipWith3](ZipWith3.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​O> apply​(scala.Function3<A1,​A2,​A3,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 3 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​O> [ZipWith4](ZipWith4.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​O> apply​(scala.Function4<A1,​A2,​A3,​A4,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 4 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​O> [ZipWith5](ZipWith5.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​O> apply​(scala.Function5<A1,​A2,​A3,​A4,​A5,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 5 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​O> [ZipWith6](ZipWith6.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​O> apply​(scala.Function6<A1,​A2,​A3,​A4,​A5,​A6,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 6 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> [ZipWith7](ZipWith7.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> apply​(scala.Function7<A1,​A2,​A3,​A4,​A5,​A6,​A7,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 7 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> [ZipWith8](ZipWith8.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> apply​(scala.Function8<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 8 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> [ZipWith9](ZipWith9.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> apply​(scala.Function9<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 9 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> [ZipWith10](ZipWith10.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> apply​(scala.Function10<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 10 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> [ZipWith11](ZipWith11.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> apply​(scala.Function11<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 11 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> [ZipWith12](ZipWith12.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> apply​(scala.Function12<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 12 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> [ZipWith13](ZipWith13.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> apply​(scala.Function13<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 13 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> [ZipWith14](ZipWith14.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> apply​(scala.Function14<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 14 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> [ZipWith15](ZipWith15.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> apply​(scala.Function15<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 15 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> [ZipWith16](ZipWith16.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> apply​(scala.Function16<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 16 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> [ZipWith17](ZipWith17.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> apply​(scala.Function17<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 17 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> [ZipWith18](ZipWith18.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> apply​(scala.Function18<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 18 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> [ZipWith19](ZipWith19.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> apply​(scala.Function19<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 19 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> [ZipWith20](ZipWith20.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> apply​(scala.Function20<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 20 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> [ZipWith21](ZipWith21.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> apply​(scala.Function21<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 21 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value
		- #### apply
		
		
		
		```
		<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> [ZipWith22](ZipWith22.html "class in akka.stream.scaladsl")<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> apply​(scala.Function22<A1,​A2,​A3,​A4,​A5,​A6,​A7,​A8,​A9,​A10,​A11,​A12,​A13,​A14,​A15,​A16,​A17,​A18,​A19,​A20,​A21,​A22,​O> zipper)
		```
		
		Create a new `ZipWith` specialized for 22 inputs.
		 
		
		Parameters:
		`zipper` \- zipping\-function from the input values to the output value

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith10.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith11.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith12.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith13.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith14.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith15.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith16.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith17.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith18.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith19.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith2.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith20.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith21.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith22.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith3.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith4.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith5.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith6.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith7.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith8.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWith9.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWithApply.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ZipWithApply.html)*