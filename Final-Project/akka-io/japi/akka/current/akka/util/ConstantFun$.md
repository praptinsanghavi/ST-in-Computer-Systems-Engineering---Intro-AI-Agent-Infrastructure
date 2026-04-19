---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/ConstantFun$.html
title: ConstantFun$
---

# ConstantFun$

## Content

Package [akka.util](package-summary.html)
## Class ConstantFun$

- java.lang.Object
- - akka.util.ConstantFun$

- ---

```
public class ConstantFun$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConstantFun$](ConstantFun$.html "class in akka.util")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConstantFun$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<java.lang.Object,​java.lang.Object>` | `[anyToFalse](#anyToFalse())()` |  |
	| `scala.Function1<java.lang.Object,​java.lang.Object>` | `[anyToTrue](#anyToTrue())()` |  |
	| `<A,​B>scala.Function1<A,​scala.Option<B>>` | `[javaAnyToNone](#javaAnyToNone())()` |  |
	| `<A,​B>[Function2](../japi/function/Function2.html "interface in akka.japi.function")<A,​B,​[Pair](../japi/Pair.html "class in akka.japi")<A,​B>>` | `[javaCreatePairFunction](#javaCreatePairFunction())()` |  |
	| `<T> [Function](../japi/function/Function.html "interface in akka.japi.function")<T,​T>` | `[javaIdentityFunction](#javaIdentityFunction())()` |  |
	| `java.lang.Object` | `[JavaPairFunction](#JavaPairFunction())()` |  |
	| `<T> scala.Function1<java.lang.Object,​T>` | `[nullFun](#nullFun())()` |  |
	| `scala.Function1<java.lang.Object,​java.lang.Object>` | `[oneInt](#oneInt())()` |  |
	| `scala.Function1<java.lang.Object,​java.lang.Object>` | `[oneLong](#oneLong())()` |  |
	| `<A,​B,​C>scala.Function3<A,​B,​C,​java.lang.Object>` | `[scalaAnyThreeToFalse](#scalaAnyThreeToFalse())()` |  |
	| `<A,​B,​C>scala.Function3<A,​B,​C,​C>` | `[scalaAnyThreeToThird](#scalaAnyThreeToThird())()` |  |
	| `<A,​B,​C>scala.Function3<A,​B,​C,​scala.runtime.BoxedUnit>` | `[scalaAnyThreeToUnit](#scalaAnyThreeToUnit())()` |  |
	| `<A,​B>scala.Function1<A,​scala.Option<B>>` | `[scalaAnyToNone](#scalaAnyToNone())()` |  |
	| `<A> scala.Function1<A,​scala.runtime.BoxedUnit>` | `[scalaAnyToUnit](#scalaAnyToUnit())()` |  |
	| `<A,​B,​C>scala.Function2<A,​B,​scala.Option<C>>` | `[scalaAnyTwoToNone](#scalaAnyTwoToNone())()` |  |
	| `<A,​B>scala.Function2<A,​B,​java.lang.Object>` | `[scalaAnyTwoToTrue](#scalaAnyTwoToTrue())()` |  |
	| `<A,​B>scala.Function2<A,​B,​scala.runtime.BoxedUnit>` | `[scalaAnyTwoToUnit](#scalaAnyTwoToUnit())()` |  |
	| `<T> scala.Function1<T,​T>` | `[scalaIdentityFunction](#scalaIdentityFunction())()` |  |
	| `scala.Function0<scala.runtime.BoxedUnit>` | `[unitToUnit](#unitToUnit())()` |  |
	| `scala.Function1<java.lang.Object,​java.lang.Object>` | `[zeroLong](#zeroLong())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConstantFun$](ConstantFun$.html "class in akka.util") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConstantFun$
		
		
		
		```
		public ConstantFun$()
		```

	- ### Method Detail
	
	
	
		- #### JavaPairFunction
		
		
		
		```
		public java.lang.Object JavaPairFunction()
		```
		- #### javaCreatePairFunction
		
		
		
		```
		public <A,​B> [Function2](../japi/function/Function2.html "interface in akka.japi.function")<A,​B,​[Pair](../japi/Pair.html "class in akka.japi")<A,​B>> javaCreatePairFunction()
		```
		- #### javaIdentityFunction
		
		
		
		```
		public <T> [Function](../japi/function/Function.html "interface in akka.japi.function")<T,​T> javaIdentityFunction()
		```
		- #### scalaIdentityFunction
		
		
		
		```
		public <T> scala.Function1<T,​T> scalaIdentityFunction()
		```
		- #### scalaAnyToNone
		
		
		
		```
		public <A,​B> scala.Function1<A,​scala.Option<B>> scalaAnyToNone()
		```
		- #### scalaAnyToUnit
		
		
		
		```
		public <A> scala.Function1<A,​scala.runtime.BoxedUnit> scalaAnyToUnit()
		```
		- #### scalaAnyTwoToNone
		
		
		
		```
		public <A,​B,​C> scala.Function2<A,​B,​scala.Option<C>> scalaAnyTwoToNone()
		```
		- #### scalaAnyTwoToUnit
		
		
		
		```
		public <A,​B> scala.Function2<A,​B,​scala.runtime.BoxedUnit> scalaAnyTwoToUnit()
		```
		- #### scalaAnyThreeToUnit
		
		
		
		```
		public <A,​B,​C> scala.Function3<A,​B,​C,​scala.runtime.BoxedUnit> scalaAnyThreeToUnit()
		```
		- #### scalaAnyTwoToTrue
		
		
		
		```
		public <A,​B> scala.Function2<A,​B,​java.lang.Object> scalaAnyTwoToTrue()
		```
		- #### scalaAnyThreeToFalse
		
		
		
		```
		public <A,​B,​C> scala.Function3<A,​B,​C,​java.lang.Object> scalaAnyThreeToFalse()
		```
		- #### scalaAnyThreeToThird
		
		
		
		```
		public <A,​B,​C> scala.Function3<A,​B,​C,​C> scalaAnyThreeToThird()
		```
		- #### javaAnyToNone
		
		
		
		```
		public <A,​B> scala.Function1<A,​scala.Option<B>> javaAnyToNone()
		```
		- #### nullFun
		
		
		
		```
		public <T> scala.Function1<java.lang.Object,​T> nullFun()
		```
		- #### zeroLong
		
		
		
		```
		public scala.Function1<java.lang.Object,​java.lang.Object> zeroLong()
		```
		- #### oneLong
		
		
		
		```
		public scala.Function1<java.lang.Object,​java.lang.Object> oneLong()
		```
		- #### oneInt
		
		
		
		```
		public scala.Function1<java.lang.Object,​java.lang.Object> oneInt()
		```
		- #### unitToUnit
		
		
		
		```
		public scala.Function0<scala.runtime.BoxedUnit> unitToUnit()
		```
		- #### anyToTrue
		
		
		
		```
		public scala.Function1<java.lang.Object,​java.lang.Object> anyToTrue()
		```
		- #### anyToFalse
		
		
		
		```
		public scala.Function1<java.lang.Object,​java.lang.Object> anyToFalse()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/current/akka/util/ConstantFun$.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/ConstantFun$.html](https://doc.akka.io/japi/akka/current/akka/util/ConstantFun$.html)*