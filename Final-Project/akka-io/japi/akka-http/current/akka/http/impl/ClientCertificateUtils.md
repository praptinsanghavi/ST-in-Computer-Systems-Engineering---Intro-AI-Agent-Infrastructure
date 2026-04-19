---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/ClientCertificateUtils.html
title: ClientCertificateUtils
---

# ClientCertificateUtils

## Content

Package [akka.http.impl](package-summary.html)
## Class ClientCertificateUtils

- java.lang.Object
- - akka.http.impl.ClientCertificateUtils

- ---

```
public class ClientCertificateUtils
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClientCertificateUtils](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.Option<java.lang.String>` | `[extractCN](#extractCN(java.lang.String))​(java.lang.String rfc2253Name)` |  |
	| `static scala.Option<java.lang.String>` | `[extractCN](#extractCN(java.security.cert.X509Certificate))​(java.security.cert.X509Certificate certificate)` |  |
	| `static scala.collection.immutable.Seq<java.lang.String>` | `[extractIpAndDnsSANs](#extractIpAndDnsSANs(java.security.cert.X509Certificate))​(java.security.cert.X509Certificate certificate)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClientCertificateUtils
		
		
		
		```
		public ClientCertificateUtils()
		```

	- ### Method Detail
	
	
	
		- #### extractCN
		
		
		
		```
		public static scala.Option<java.lang.String> extractCN​(java.security.cert.X509Certificate certificate)
		```
		- #### extractCN
		
		
		
		```
		public static scala.Option<java.lang.String> extractCN​(java.lang.String rfc2253Name)
		```
		- #### extractIpAndDnsSANs
		
		
		
		```
		public static scala.collection.immutable.Seq<java.lang.String> extractIpAndDnsSANs​(java.security.cert.X509Certificate certificate)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/ClientCertificateUtils.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/ClientCertificateUtils.html)*