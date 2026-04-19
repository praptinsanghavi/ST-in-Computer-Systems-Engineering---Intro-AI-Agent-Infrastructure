---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:18:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RemoteScope.html
title: RemoteScope
---

# RemoteScope

## Content

Package [akka.remote](package-summary.html)
## Class RemoteScope

- java.lang.Object
- - akka.remote.RemoteScope

- All Implemented Interfaces:
`[Scope](../actor/Scope.html "interface in akka.actor")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RemoteScope
extends java.lang.Object
implements [Scope](../actor/Scope.html "interface in akka.actor"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.RemoteScope)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RemoteScope](#%3Cinit%3E(akka.actor.Address))​([Address](../actor/Address.html "class in akka.actor") node)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RemoteScope](RemoteScope.html "class in akka.remote")` | `[apply](#apply(akka.actor.Address))​([Address](../actor/Address.html "class in akka.actor") node)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[RemoteScope](RemoteScope.html "class in akka.remote")` | `[copy](#copy(akka.actor.Address))​([Address](../actor/Address.html "class in akka.actor") node)` |  |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[Address](../actor/Address.html "class in akka.actor")` | `[node](#node())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[Address](../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.remote.RemoteScope))​([RemoteScope](RemoteScope.html "class in akka.remote") x$0)` |  |
	| `[Scope](../actor/Scope.html "interface in akka.actor")` | `[withFallback](#withFallback(akka.actor.Scope))​([Scope](../actor/Scope.html "interface in akka.actor") other)` | When merging [`Deploy`](../actor/Deploy.html "class in akka.actor") instances using withFallback() on  the left one, this is propagated to \&ldquo;merging\&rdquo; scopes in the same way. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### RemoteScope
		
		
		
		```
		public RemoteScope​([Address](../actor/Address.html "class in akka.actor") node)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [RemoteScope](RemoteScope.html "class in akka.remote") apply​([Address](../actor/Address.html "class in akka.actor") node)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[Address](../actor/Address.html "class in akka.actor")> unapply​([RemoteScope](RemoteScope.html "class in akka.remote") x$0)
		```
		- #### node
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") node()
		```
		- #### withFallback
		
		
		
		```
		public [Scope](../actor/Scope.html "interface in akka.actor") withFallback​([Scope](../actor/Scope.html "interface in akka.actor") other)
		```
		
		Description copied from interface: `[Scope](../actor/Scope.html#withFallback(akka.actor.Scope))`
		When merging [`Deploy`](../actor/Deploy.html "class in akka.actor") instances using withFallback() on
		 the left one, this is propagated to \&ldquo;merging\&rdquo; scopes in the same way.
		 The setup is biased towards preferring the callee over the argument, i.e.
		 a.withFallback(b) is called expecting that a should in general take
		 precedence.
		
		Specified by:
		`[withFallback](../actor/Scope.html#withFallback(akka.actor.Scope))` in interface `[Scope](../actor/Scope.html "interface in akka.actor")`
		- #### copy
		
		
		
		```
		public [RemoteScope](RemoteScope.html "class in akka.remote") copy​([Address](../actor/Address.html "class in akka.actor") node)
		```
		- #### copy$default$1
		
		
		
		```
		public [Address](../actor/Address.html "class in akka.actor") copy$default$1()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Deploy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Scope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RemoteScope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RemoteScope.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/RemoteScope.html)*