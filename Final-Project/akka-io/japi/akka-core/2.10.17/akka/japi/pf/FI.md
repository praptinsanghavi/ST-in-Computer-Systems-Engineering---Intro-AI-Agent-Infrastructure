---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:57:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FI.Apply.html
title: FI.Apply
---

# FI.Apply

## Content

Package [akka.japi.pf](package-summary.html)
## Interface FI.Apply\<I,​R\>

- Type Parameters:
`I` \- the input type, that this Apply will be applied to
`R` \- the return type, that the results of the application will have

Enclosing class:
[FI](FI.html "class in akka.japi.pf")

Functional Interface:
This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

---

```
@FunctionalInterface
public static interface FI.Apply<I,​R>
```

Functional interface for an application.

 This class is kept for compatibility, but for future API's please prefer [`Function`](../function/Function.html "interface in akka.japi.function").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](FI.Apply.html "type parameter in FI.Apply")` | `[apply](#apply(I))​([I](FI.Apply.html "type parameter in FI.Apply") i)` | The application to perform. |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](FI.Apply.html "type parameter in FI.Apply") apply​([I](FI.Apply.html "type parameter in FI.Apply") i)
		 throws java.lang.Exception
		```
		
		The application to perform.
		
		Parameters:
		`i` \- an instance that the application is performed on
		Returns:
		the result of the application
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FI.Apply.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FI.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FI.Apply.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FI.Apply.html)*