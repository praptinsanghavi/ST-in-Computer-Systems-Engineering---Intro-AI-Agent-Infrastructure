---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.Provided.html
title: Credentials.Provided
---

# Credentials.Provided

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class Credentials.Provided

- java.lang.Object
- - akka.http.scaladsl.server.directives.Credentials.Provided

- All Implemented Interfaces:
`[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives")

---

```
public abstract static class Credentials.Provided
extends java.lang.Object
implements [Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.server.directives.Credentials.Provided)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.directives.[Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[Credentials.Missing$](Credentials.Missing$.html "class in akka.http.scaladsl.server.directives"), [Credentials.Provided](Credentials.Provided.html "class in akka.http.scaladsl.server.directives"), [Credentials.Provided$](Credentials.Provided$.html "class in akka.http.scaladsl.server.directives")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Provided](#%3Cinit%3E(java.lang.String))​(java.lang.String identifier)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[identifier](#identifier())()` |  |
	| `boolean` | `[provideVerify](#provideVerify(java.lang.String,scala.Function2))​(java.lang.String secret,  scala.Function2<java.lang.String,​java.lang.String,​java.lang.Object> verifier)` | Compares with custom 'verifier' and the passed secret with the received secret part of the Credentials. |
	| `abstract boolean` | `[provideVerify](#provideVerify(scala.Function1))​(scala.Function1<java.lang.String,​java.lang.Object> verifier)` | Compares with custom 'verifier' the received secret part of the Credentials. |
	| `boolean` | `[verify](#verify(java.lang.String))​(java.lang.String secret)` | Safely compares the passed in `secret` with the received secret part of the Credentials. |
	| `abstract boolean` | `[verify](#verify(java.lang.String,scala.Function1))​(java.lang.String secret,  scala.Function1<java.lang.String,​java.lang.String> hasher)` | First applies the passed in `hasher` function to the received secret part of the Credentials  and then safely compares the passed in `secret` with the hashed received secret. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### Provided
		
		
		
		```
		public Provided​(java.lang.String identifier)
		```

	- ### Method Detail
	
	
	
		- #### identifier
		
		
		
		```
		public java.lang.String identifier()
		```
		- #### verify
		
		
		
		```
		public abstract boolean verify​(java.lang.String secret,
		                               scala.Function1<java.lang.String,​java.lang.String> hasher)
		```
		
		First applies the passed in `hasher` function to the received secret part of the Credentials
		 and then safely compares the passed in `secret` with the hashed received secret.
		 This method can be used if the secret is not stored in plain text.
		 Use of this method instead of manual String equality testing is recommended in order to guard against timing attacks.
		 
		 See also {@link EnhancedString\#secure\_\=\=}, for more information.
		
		
		
		Parameters:
		`secret` \- (undocumented)
		`hasher` \- (undocumented)
		Returns:
		(undocumented)
		- #### verify
		
		
		
		```
		public boolean verify​(java.lang.String secret)
		```
		
		Safely compares the passed in `secret` with the received secret part of the Credentials.
		 Use of this method instead of manual String equality testing is recommended in order to guard against timing attacks.
		 
		 See also {@link EnhancedString\#secure\_\=\=}, for more information.
		
		
		
		Parameters:
		`secret` \- (undocumented)
		Returns:
		(undocumented)
		- #### provideVerify
		
		
		
		```
		public abstract boolean provideVerify​(scala.Function1<java.lang.String,​java.lang.Object> verifier)
		```
		
		Compares with custom 'verifier' the received secret part of the Credentials.
		 Use of this method only if custom String equality testing is required, not recommended.
		
		Parameters:
		`verifier` \- (undocumented)
		Returns:
		(undocumented)
		- #### provideVerify
		
		
		
		```
		public boolean provideVerify​(java.lang.String secret,
		                             scala.Function2<java.lang.String,​java.lang.String,​java.lang.Object> verifier)
		```
		
		Compares with custom 'verifier' and the passed secret with the received secret part of the Credentials.
		 Use of this method only if custom String equality testing is required, not recommended.
		
		Parameters:
		`secret` \- (undocumented)
		`verifier` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.Missing$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.Provided$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.Provided.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.Provided.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.Provided.html)*