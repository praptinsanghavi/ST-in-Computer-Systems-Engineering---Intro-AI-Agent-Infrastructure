---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TransformationRejection.html
title: TransformationRejection
---

# TransformationRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class TransformationRejection

- java.lang.Object
- - akka.http.scaladsl.server.TransformationRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[TransformationRejection](../../javadsl/server/TransformationRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class TransformationRejection
extends java.lang.Object
implements [TransformationRejection](../../javadsl/server/TransformationRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

A special Rejection that serves as a container for a transformation function on rejections.
 It is used by some directives to "cancel" rejections that are added by later directives of a similar type.
 
 Consider this route structure for example:
 

```

     put { reject(ValidationRejection("no") } ~ get { ... }
 
```

 If this structure is applied to a PUT request the list of rejections coming back contains three elements:
 

 1\. A ValidationRejection
 2\. A MethodRejection
 3\. A TransformationRejection holding a function filtering out the MethodRejection
 

 so that in the end the RejectionHandler will only see one rejection (the ValidationRejection), because the
 MethodRejection added by the `get` directive is canceled by the `put` directive (since the HTTP method
 did indeed match eventually).

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.TransformationRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TransformationRejection](#%3Cinit%3E(scala.Function1))​(scala.Function1<scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>,​scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>> transform)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1))​(T1 v1)` |  |
	| `java.lang.Object` | `[getTransform](#getTransform())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Function1<scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>,​scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>>` | `[transform](#transform())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### TransformationRejection
		
		
		
		```
		public TransformationRejection​(scala.Function1<scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>,​scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>> transform)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### transform
		
		
		
		```
		public scala.Function1<scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>,​scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>> transform()
		```
		- #### getTransform
		
		
		
		```
		public java.lang.Object getTransform()
		```
		
		
		Specified by:
		`[getTransform](../../javadsl/server/TransformationRejection.html#getTransform())` in interface `[TransformationRejection](../../javadsl/server/TransformationRejection.html "interface in akka.http.javadsl.server")`

## Code Examples

### Example 1: Class TransformationRejection

```text
put { reject(ValidationRejection("no") } ~ get { ... }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/TransformationRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TransformationRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TransformationRejection.html)*