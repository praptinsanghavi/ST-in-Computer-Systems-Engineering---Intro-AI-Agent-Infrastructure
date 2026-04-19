---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pki/pem/DERPrivateKeyLoader.html
title: DERPrivateKeyLoader
---

# DERPrivateKeyLoader

## Content

Package [akka.pki.pem](package-summary.html)
## Class DERPrivateKeyLoader

- java.lang.Object
- - akka.pki.pem.DERPrivateKeyLoader

- ---

```
public class DERPrivateKeyLoader
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DERPrivateKeyLoader](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.security.PrivateKey` | `[load](#load(akka.pki.pem.PEMDecoder.DERData))​([PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem") derData)` | Converts the DER payload in [`PEMDecoder.DERData`](PEMDecoder.DERData.html "class in akka.pki.pem") into a `PrivateKey`. |
	| `static java.security.PrivateKey` | `[load](#load(java.util.List))​(java.util.List<[PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem")> derData)` | Java API: Converts the DER payload in the first private key entry in the given [`PEMDecoder.DERData`](PEMDecoder.DERData.html "class in akka.pki.pem") into a `PrivateKey`. |
	| `static java.security.PrivateKey` | `[load](#load(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem")> derData)` | Scala API: Converts the DER payload in the first private key entry in the given [`PEMDecoder.DERData`](PEMDecoder.DERData.html "class in akka.pki.pem") into a `PrivateKey`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DERPrivateKeyLoader
		
		
		
		```
		public DERPrivateKeyLoader()
		```

	- ### Method Detail
	
	
	
		- #### load
		
		
		
		```
		public static java.security.PrivateKey load​(java.util.List<[PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem")> derData)
		                                     throws [PEMLoadingException](PEMLoadingException.html "class in akka.pki.pem")
		```
		
		Java API: Converts the DER payload in the first private key entry in the given [`PEMDecoder.DERData`](PEMDecoder.DERData.html "class in akka.pki.pem") into a `PrivateKey`.
		 The received DER data must be a valid PKCS\#1 (identified in PEM as "RSA PRIVATE KEY") or non\-encrypted PKCS\#8 (identified
		 in PEM as "PRIVATE KEY" or "EC PRIVATE KEY").
		 
		
		Throws:
		`[PEMLoadingException](PEMLoadingException.html "class in akka.pki.pem")` \- when the no entry in `derData` is a supported format
		- #### load
		
		
		
		```
		public static java.security.PrivateKey load​(scala.collection.immutable.Seq<[PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem")> derData)
		                                     throws [PEMLoadingException](PEMLoadingException.html "class in akka.pki.pem")
		```
		
		Scala API: Converts the DER payload in the first private key entry in the given [`PEMDecoder.DERData`](PEMDecoder.DERData.html "class in akka.pki.pem") into a `PrivateKey`.
		 The received DER data must be a valid PKCS\#1 (identified in PEM as "RSA PRIVATE KEY") or non\-encrypted PKCS\#8 (identified
		 in PEM as "PRIVATE KEY" or "EC PRIVATE KEY").
		 
		
		Throws:
		`[PEMLoadingException](PEMLoadingException.html "class in akka.pki.pem")` \- when the no entry in `derData` is a supported format
		- #### load
		
		
		
		```
		public static java.security.PrivateKey load​([PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem") derData)
		                                     throws [PEMLoadingException](PEMLoadingException.html "class in akka.pki.pem")
		```
		
		Converts the DER payload in [`PEMDecoder.DERData`](PEMDecoder.DERData.html "class in akka.pki.pem") into a `PrivateKey`. The received DER
		 data must be a valid PKCS\#1 PKCS\#1 (identified in PEM as "RSA PRIVATE KEY") or non\-encrypted PKCS\#8 (identified
		 \* in PEM as "PRIVATE KEY" or "EC PRIVATE KEY").
		 
		
		Throws:
		`[PEMLoadingException](PEMLoadingException.html "class in akka.pki.pem")` \- when the `derData` is for an unsupported format

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/pki/pem/PEMDecoder.DERData.html
- https://doc.akka.io/japi/akka/current/akka/pki/pem/PEMLoadingException.html
- https://doc.akka.io/japi/akka/current/akka/pki/pem/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pki/pem/DERPrivateKeyLoader.html](https://doc.akka.io/japi/akka/current/akka/pki/pem/DERPrivateKeyLoader.html)*