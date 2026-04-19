---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:49:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/ConstantFun.html
title: ConstantFun
---

# ConstantFun

## Content

Package [akka.util](package-summary.html)
## Class ConstantFun

- java.lang.Object
- - akka.util.ConstantFun

- ---

```
public class ConstantFun
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConstantFun](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.Function1<java.lang.Object,​java.lang.Object>` | `[anyToFalse](#anyToFalse())()` |  |
	| `static scala.Function1<java.lang.Object,​java.lang.Object>` | `[anyToTrue](#anyToTrue())()` |  |
	| `static <A,​B>scala.Function1<A,​scala.Option<B>>` | `[javaAnyToNone](#javaAnyToNone())()` |  |
	| `static <A,​B>[Function2](../japi/function/Function2.html "interface in akka.japi.function")<A,​B,​[Pair](../japi/Pair.html "class in akka.japi")<A,​B>>` | `[javaCreatePairFunction](#javaCreatePairFunction())()` |  |
	| `static <T> [Function](../japi/function/Function.html "interface in akka.japi.function")<T,​T>` | `[javaIdentityFunction](#javaIdentityFunction())()` |  |
	| `static java.lang.Object` | `[JavaPairFunction](#JavaPairFunction())()` |  |
	| `static <T> scala.Function1<java.lang.Object,​T>` | `[nullFun](#nullFun())()` |  |
	| `static scala.Function1<java.lang.Object,​java.lang.Object>` | `[oneInt](#oneInt())()` |  |
	| `static scala.Function1<java.lang.Object,​java.lang.Object>` | `[oneLong](#oneLong())()` |  |
	| `static <A,​B,​C>scala.Function3<A,​B,​C,​java.lang.Object>` | `[scalaAnyThreeToFalse](#scalaAnyThreeToFalse())()` |  |
	| `static <A,​B,​C>scala.Function3<A,​B,​C,​C>` | `[scalaAnyThreeToThird](#scalaAnyThreeToThird())()` |  |
	| `static <A,​B,​C>scala.Function3<A,​B,​C,​scala.runtime.BoxedUnit>` | `[scalaAnyThreeToUnit](#scalaAnyThreeToUnit())()` |  |
	| `static <A,​B>scala.Function1<A,​scala.Option<B>>` | `[scalaAnyToNone](#scalaAnyToNone())()` |  |
	| `static <A> scala.Function1<A,​scala.runtime.BoxedUnit>` | `[scalaAnyToUnit](#scalaAnyToUnit())()` |  |
	| `static <A,​B,​C>scala.Function2<A,​B,​scala.Option<C>>` | `[scalaAnyTwoToNone](#scalaAnyTwoToNone())()` |  |
	| `static <A,​B>scala.Function2<A,​B,​java.lang.Object>` | `[scalaAnyTwoToTrue](#scalaAnyTwoToTrue())()` |  |
	| `static <A,​B>scala.Function2<A,​B,​scala.runtime.BoxedUnit>` | `[scalaAnyTwoToUnit](#scalaAnyTwoToUnit())()` |  |
	| `static <T> scala.Function1<T,​T>` | `[scalaIdentityFunction](#scalaIdentityFunction())()` |  |
	| `static scala.Function0<scala.runtime.BoxedUnit>` | `[unitToUnit](#unitToUnit())()` |  |
	| `static scala.Function1<java.lang.Object,​java.lang.Object>` | `[zeroLong](#zeroLong())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConstantFun
		
		
		
		```
		public ConstantFun()
		```

	- ### Method Detail
	
	
	
		- #### JavaPairFunction
		
		
		
		```
		public static java.lang.Object JavaPairFunction()
		```
		- #### javaCreatePairFunction
		
		
		
		```
		public static <A,​B> [Function2](../japi/function/Function2.html "interface in akka.japi.function")<A,​B,​[Pair](../japi/Pair.html "class in akka.japi")<A,​B>> javaCreatePairFunction()
		```
		- #### javaIdentityFunction
		
		
		
		```
		public static <T> [Function](../japi/function/Function.html "interface in akka.japi.function")<T,​T> javaIdentityFunction()
		```
		- #### scalaIdentityFunction
		
		
		
		```
		public static <T> scala.Function1<T,​T> scalaIdentityFunction()
		```
		- #### scalaAnyToNone
		
		
		
		```
		public static <A,​B> scala.Function1<A,​scala.Option<B>> scalaAnyToNone()
		```
		- #### scalaAnyToUnit
		
		
		
		```
		public static <A> scala.Function1<A,​scala.runtime.BoxedUnit> scalaAnyToUnit()
		```
		- #### scalaAnyTwoToNone
		
		
		
		```
		public static <A,​B,​C> scala.Function2<A,​B,​scala.Option<C>> scalaAnyTwoToNone()
		```
		- #### scalaAnyTwoToUnit
		
		
		
		```
		public static <A,​B> scala.Function2<A,​B,​scala.runtime.BoxedUnit> scalaAnyTwoToUnit()
		```
		- #### scalaAnyThreeToUnit
		
		
		
		```
		public static <A,​B,​C> scala.Function3<A,​B,​C,​scala.runtime.BoxedUnit> scalaAnyThreeToUnit()
		```
		- #### scalaAnyTwoToTrue
		
		
		
		```
		public static <A,​B> scala.Function2<A,​B,​java.lang.Object> scalaAnyTwoToTrue()
		```
		- #### scalaAnyThreeToFalse
		
		
		
		```
		public static <A,​B,​C> scala.Function3<A,​B,​C,​java.lang.Object> scalaAnyThreeToFalse()
		```
		- #### scalaAnyThreeToThird
		
		
		
		```
		public static <A,​B,​C> scala.Function3<A,​B,​C,​C> scalaAnyThreeToThird()
		```
		- #### javaAnyToNone
		
		
		
		```
		public static <A,​B> scala.Function1<A,​scala.Option<B>> javaAnyToNone()
		```
		- #### nullFun
		
		
		
		```
		public static <T> scala.Function1<java.lang.Object,​T> nullFun()
		```
		- #### zeroLong
		
		
		
		```
		public static scala.Function1<java.lang.Object,​java.lang.Object> zeroLong()
		```
		- #### oneLong
		
		
		
		```
		public static scala.Function1<java.lang.Object,​java.lang.Object> oneLong()
		```
		- #### oneInt
		
		
		
		```
		public static scala.Function1<java.lang.Object,​java.lang.Object> oneInt()
		```
		- #### unitToUnit
		
		
		
		```
		public static scala.Function0<scala.runtime.BoxedUnit> unitToUnit()
		```
		- #### anyToTrue
		
		
		
		```
		public static scala.Function1<java.lang.Object,​java.lang.Object> anyToTrue()
		```
		- #### anyToFalse
		
		
		
		```
		public static scala.Function1<java.lang.Object,​java.lang.Object> anyToFalse()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/ConstantFun.html](https://doc.akka.io/japi/akka/current/akka/util/ConstantFun.html)*