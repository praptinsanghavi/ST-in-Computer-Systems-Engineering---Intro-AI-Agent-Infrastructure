---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/pki/pem/PEMDecoder$.html
title: PEMDecoder$
---

# PEMDecoder$

## Content

Package [akka.pki.pem](package-summary.html)
## Class PEMDecoder$

- java.lang.Object
- - akka.pki.pem.PEMDecoder$

- ---

```
public class PEMDecoder$
extends java.lang.Object
```

Decodes lax PEM encoded data, according to
 
 https://tools.ietf.org/html/rfc7468

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PEMDecoder$](PEMDecoder$.html "class in akka.pki.pem")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PEMDecoder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem")` | `[decode](#decode(java.lang.String))​(java.lang.String pemData)` | Decodes the first entry in a PEM String into an identifier and the  DER bytes of the content. |
	| `scala.collection.immutable.Seq<[PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem")>` | `[decodeAll](#decodeAll(java.lang.String))​(java.lang.String pemData)` | Scala API: Decodes all entries in a PEM String. |
	| `java.util.List<[PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem")>` | `[getAllDecoded](#getAllDecoded(java.lang.String))​(java.lang.String pemData)` | Java API: Decodes all entries in a PEM String. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PEMDecoder$](PEMDecoder$.html "class in akka.pki.pem") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PEMDecoder$
		
		
		
		```
		public PEMDecoder$()
		```

	- ### Method Detail
	
	
	
		- #### decode
		
		
		
		```
		public [PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem") decode​(java.lang.String pemData)
		                          throws [PEMLoadingException](PEMLoadingException.html "class in akka.pki.pem")
		```
		
		Decodes the first entry in a PEM String into an identifier and the
		 DER bytes of the content.
		 
		 Note that for EDCSA and possibly other key types a pem string will contain multiple entries,
		 see [`decodeAll(java.lang.String)`](#decodeAll(java.lang.String)) or [`getAllDecoded(java.lang.String)`](#getAllDecoded(java.lang.String)) for extracting all entries.
		 
		
		
		 See https://tools.ietf.org/html/rfc7468 and https://en.wikipedia.org/wiki/Privacy\-Enhanced\_Mail
		 
		
		
		
		Parameters:
		`pemData` \- the PEM data (pre\-eb, base64\-MIME data and ponst\-eb)
		Returns:
		the decoded bytes and the content type.
		Throws:
		`[PEMLoadingException](PEMLoadingException.html "class in akka.pki.pem")`
		- #### decodeAll
		
		
		
		```
		public scala.collection.immutable.Seq<[PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem")> decodeAll​(java.lang.String pemData)
		```
		
		Scala API: Decodes all entries in a PEM String.
		- #### getAllDecoded
		
		
		
		```
		public java.util.List<[PEMDecoder.DERData](PEMDecoder.DERData.html "class in akka.pki.pem")> getAllDecoded​(java.lang.String pemData)
		                                                 throws [PEMLoadingException](PEMLoadingException.html "class in akka.pki.pem")
		```
		
		Java API: Decodes all entries in a PEM String.
		
		Throws:
		`[PEMLoadingException](PEMLoadingException.html "class in akka.pki.pem")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/pki/pem/PEMDecoder$.html
- https://doc.akka.io/japi/akka/current/akka/pki/pem/PEMDecoder.DERData.html
- https://doc.akka.io/japi/akka/current/akka/pki/pem/PEMLoadingException.html
- https://doc.akka.io/japi/akka/current/akka/pki/pem/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/pki/pem/PEMDecoder$.html](https://doc.akka.io/japi/akka/current/akka/pki/pem/PEMDecoder$.html)*