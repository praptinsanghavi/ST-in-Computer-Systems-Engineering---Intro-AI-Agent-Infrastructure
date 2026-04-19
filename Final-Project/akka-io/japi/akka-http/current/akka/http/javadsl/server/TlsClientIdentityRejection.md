---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/TlsClientIdentityRejection.html
title: TlsClientIdentityRejection
---

# TlsClientIdentityRejection

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Interface TlsClientIdentityRejection

- All Superinterfaces:
`[Rejection](Rejection.html "interface in akka.http.javadsl.server")`

All Known Implementing Classes:
`[TlsClientIdentityRejection](../../scaladsl/server/TlsClientIdentityRejection.html "class in akka.http.scaladsl.server")`

---

```
public interface TlsClientIdentityRejection
extends [Rejection](Rejection.html "interface in akka.http.javadsl.server")
```

Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[description](#description())()` |  |
	| `java.util.Optional<java.lang.String>` | `[getCertificateCN](#getCertificateCN())()` |  |
	| `java.util.List<java.lang.String>` | `[getCertificateSANs](#getCertificateSANs())()` |  |
	| `java.lang.String` | `[requiredExpression](#requiredExpression())()` |  |

- - ### Method Detail
	
	
	
		- #### description
		
		
		
		```
		java.lang.String description()
		```
		- #### getCertificateCN
		
		
		
		```
		java.util.Optional<java.lang.String> getCertificateCN()
		```
		- #### getCertificateSANs
		
		
		
		```
		java.util.List<java.lang.String> getCertificateSANs()
		```
		- #### requiredExpression
		
		
		
		```
		java.lang.String requiredExpression()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/TlsClientIdentityRejection.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/TlsClientIdentityRejection.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/TlsClientIdentityRejection.html)*