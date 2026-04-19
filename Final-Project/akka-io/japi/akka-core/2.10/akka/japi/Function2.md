---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:59:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/Function2.html
title: Function2
---

# Function2

## Content

Package [akka.japi](package-summary.html)
## Interface Function2\<T1,​T2,​R\>

- ---

```
public interface Function2<T1,​T2,​R>
```

A Function interface. Used to create 2\-arg first\-class\-functions is Java.
 
 This class is kept for compatibility, but for future API's please prefer [`Function2`](function/Function2.html "interface in akka.japi.function").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[R](Function2.html "type parameter in Function2")` | `[apply](#apply(T1,T2))​([T1](Function2.html "type parameter in Function2") arg1,  [T2](Function2.html "type parameter in Function2") arg2)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[R](Function2.html "type parameter in Function2") apply​([T1](Function2.html "type parameter in Function2") arg1,
		        [T2](Function2.html "type parameter in Function2") arg2)
		 throws java.lang.Exception
		```
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Function2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/Function2.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/Function2.html)*