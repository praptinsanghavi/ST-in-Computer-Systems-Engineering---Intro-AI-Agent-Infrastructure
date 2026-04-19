---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TlsClientIdentityRejection.html
title: TlsClientIdentityRejection
---

# TlsClientIdentityRejection

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class TlsClientIdentityRejection

- java.lang.Object
- - akka.http.scaladsl.server.TlsClientIdentityRejection

- All Implemented Interfaces:
`[Rejection](../../javadsl/server/Rejection.html "interface in akka.http.javadsl.server")`, `[TlsClientIdentityRejection](../../javadsl/server/TlsClientIdentityRejection.html "interface in akka.http.javadsl.server")`, `[Rejection](Rejection.html "interface in akka.http.scaladsl.server")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class TlsClientIdentityRejection
extends java.lang.Object
implements [TlsClientIdentityRejection](../../javadsl/server/TlsClientIdentityRejection.html "interface in akka.http.javadsl.server"), [Rejection](Rejection.html "interface in akka.http.scaladsl.server"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.server.TlsClientIdentityRejection)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TlsClientIdentityRejection](#%3Cinit%3E(java.lang.String,java.lang.String,scala.Option,scala.collection.immutable.Seq))​(java.lang.String description,  java.lang.String requiredExpression,  scala.Option<java.lang.String> certificateCN,  scala.collection.immutable.Seq<java.lang.String> certificateSANs)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2,T3,T4))​(T1 v1,  T2 v2,  T3 v3,  T4 v4)` |  |
	| `scala.Option<java.lang.String>` | `[certificateCN](#certificateCN())()` |  |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[certificateSANs](#certificateSANs())()` |  |
	| `java.lang.String` | `[description](#description())()` |  |
	| `java.util.Optional<java.lang.String>` | `[getCertificateCN](#getCertificateCN())()` |  |
	| `java.util.List<java.lang.String>` | `[getCertificateSANs](#getCertificateSANs())()` |  |
	| `java.lang.String` | `[requiredExpression](#requiredExpression())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### TlsClientIdentityRejection
		
		
		
		```
		public TlsClientIdentityRejection​(java.lang.String description,
		                                  java.lang.String requiredExpression,
		                                  scala.Option<java.lang.String> certificateCN,
		                                  scala.collection.immutable.Seq<java.lang.String> certificateSANs)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2,
		                               T3 v3,
		                               T4 v4)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### description
		
		
		
		```
		public java.lang.String description()
		```
		
		
		Specified by:
		`[description](../../javadsl/server/TlsClientIdentityRejection.html#description())` in interface `[TlsClientIdentityRejection](../../javadsl/server/TlsClientIdentityRejection.html "interface in akka.http.javadsl.server")`
		- #### requiredExpression
		
		
		
		```
		public java.lang.String requiredExpression()
		```
		
		
		Specified by:
		`[requiredExpression](../../javadsl/server/TlsClientIdentityRejection.html#requiredExpression())` in interface `[TlsClientIdentityRejection](../../javadsl/server/TlsClientIdentityRejection.html "interface in akka.http.javadsl.server")`
		- #### certificateCN
		
		
		
		```
		public scala.Option<java.lang.String> certificateCN()
		```
		- #### certificateSANs
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> certificateSANs()
		```
		- #### getCertificateCN
		
		
		
		```
		public java.util.Optional<java.lang.String> getCertificateCN()
		```
		
		
		Specified by:
		`[getCertificateCN](../../javadsl/server/TlsClientIdentityRejection.html#getCertificateCN())` in interface `[TlsClientIdentityRejection](../../javadsl/server/TlsClientIdentityRejection.html "interface in akka.http.javadsl.server")`
		- #### getCertificateSANs
		
		
		
		```
		public java.util.List<java.lang.String> getCertificateSANs()
		```
		
		
		Specified by:
		`[getCertificateSANs](../../javadsl/server/TlsClientIdentityRejection.html#getCertificateSANs())` in interface `[TlsClientIdentityRejection](../../javadsl/server/TlsClientIdentityRejection.html "interface in akka.http.javadsl.server")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/TlsClientIdentityRejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TlsClientIdentityRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TlsClientIdentityRejection.html)*