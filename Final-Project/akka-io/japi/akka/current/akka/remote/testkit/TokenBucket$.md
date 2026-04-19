---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testkit/TokenBucket$.html
title: TokenBucket$
---

# TokenBucket$

## Content

Package [akka.remote.testkit](package-summary.html)
## Class TokenBucket$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[TokenBucket](TokenBucket.html "class in akka.remote.testkit")\>
	- - akka.remote.testkit.TokenBucket$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[TokenBucket](TokenBucket.html "class in akka.remote.testkit")>`

---

```
public class TokenBucket$
extends scala.runtime.AbstractFunction4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[TokenBucket](TokenBucket.html "class in akka.remote.testkit")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testkit.TokenBucket$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TokenBucket$](TokenBucket$.html "class in akka.remote.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TokenBucket$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TokenBucket](TokenBucket.html "class in akka.remote.testkit")` | `[apply](#apply(int,double,long,int))​(int capacity,  double tokensPerSecond,  long nanoTimeOfLastSend,  int availableTokens)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.remote.testkit.TokenBucket))​([TokenBucket](TokenBucket.html "class in akka.remote.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TokenBucket$](TokenBucket$.html "class in akka.remote.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TokenBucket$
		
		
		
		```
		public TokenBucket$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[TokenBucket](TokenBucket.html "class in akka.remote.testkit")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[TokenBucket](TokenBucket.html "class in akka.remote.testkit")>`
		- #### apply
		
		
		
		```
		public [TokenBucket](TokenBucket.html "class in akka.remote.testkit") apply​(int capacity,
		                         double tokensPerSecond,
		                         long nanoTimeOfLastSend,
		                         int availableTokens)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​([TokenBucket](TokenBucket.html "class in akka.remote.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/testkit/TokenBucket$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/TokenBucket.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testkit/TokenBucket$.html](https://doc.akka.io/japi/akka/current/akka/remote/testkit/TokenBucket$.html)*