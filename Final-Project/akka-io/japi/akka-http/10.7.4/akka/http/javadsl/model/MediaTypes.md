---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html
title: MediaTypes
---

# MediaTypes

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class MediaTypes

- java.lang.Object
- - akka.http.javadsl.model.MediaTypes

- ---

```
public final class MediaTypes
extends java.lang.Object
```

Contains the set of predefined media\-types.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_ATOM_XML](#APPLICATION_ATOM_XML)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_BASE64](#APPLICATION_BASE64)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_CBOR](#APPLICATION_CBOR)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_EXCEL](#APPLICATION_EXCEL)` | Deprecated. This format is unofficial and should not be used. |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_FONT_WOFF](#APPLICATION_FONT_WOFF)` | Deprecated. This format is unofficial and should not be used. |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_GNUTAR](#APPLICATION_GNUTAR)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_GRPC_PROTO](#APPLICATION_GRPC_PROTO)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_JAVA_ARCHIVE](#APPLICATION_JAVA_ARCHIVE)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_JAVASCRIPT](#APPLICATION_JAVASCRIPT)` |  |
	| `static [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_JSON](#APPLICATION_JSON)` |  |
	| `static [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_JSON_PATCH_JSON](#APPLICATION_JSON_PATCH_JSON)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_LHA](#APPLICATION_LHA)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_LZX](#APPLICATION_LZX)` |  |
	| `static [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_MERGE_PATCH_JSON](#APPLICATION_MERGE_PATCH_JSON)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_MSPOWERPOINT](#APPLICATION_MSPOWERPOINT)` | Deprecated. This format is unofficial and should not be used. |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_MSWORD](#APPLICATION_MSWORD)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_OCTET_STREAM](#APPLICATION_OCTET_STREAM)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_PDF](#APPLICATION_PDF)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_POSTSCRIPT](#APPLICATION_POSTSCRIPT)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_RSS_XML](#APPLICATION_RSS_XML)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_SOAP_XML](#APPLICATION_SOAP_XML)` |  |
	| `static [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_API_JSON](#APPLICATION_VND_API_JSON)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_GOOGLE_EARTH_KML_XML](#APPLICATION_VND_GOOGLE_EARTH_KML_XML)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_GOOGLE_EARTH_KMZ](#APPLICATION_VND_GOOGLE_EARTH_KMZ)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_EXCEL](#APPLICATION_VND_MS_EXCEL)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_EXCEL_ADDIN_MACROENABLED_12](#APPLICATION_VND_MS_EXCEL_ADDIN_MACROENABLED_12)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_EXCEL_SHEET_BINARY_MACROENABLED_12](#APPLICATION_VND_MS_EXCEL_SHEET_BINARY_MACROENABLED_12)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_EXCEL_SHEET_MACROENABLED_12](#APPLICATION_VND_MS_EXCEL_SHEET_MACROENABLED_12)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_EXCEL_TEMPLATE_MACROENABLED_12](#APPLICATION_VND_MS_EXCEL_TEMPLATE_MACROENABLED_12)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_FONTOBJECT](#APPLICATION_VND_MS_FONTOBJECT)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_POWERPOINT](#APPLICATION_VND_MS_POWERPOINT)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_POWERPOINT_ADDIN_MACROENABLED_12](#APPLICATION_VND_MS_POWERPOINT_ADDIN_MACROENABLED_12)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_POWERPOINT_PRESENTATION_MACROENABLED_12](#APPLICATION_VND_MS_POWERPOINT_PRESENTATION_MACROENABLED_12)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_POWERPOINT_SLIDESHOW_MACROENABLED_12](#APPLICATION_VND_MS_POWERPOINT_SLIDESHOW_MACROENABLED_12)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_WORD_DOCUMENT_MACROENABLED_12](#APPLICATION_VND_MS_WORD_DOCUMENT_MACROENABLED_12)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_MS_WORD_TEMPLATE_MACROENABLED_12](#APPLICATION_VND_MS_WORD_TEMPLATE_MACROENABLED_12)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OASIS_OPENDOCUMENT_CHART](#APPLICATION_VND_OASIS_OPENDOCUMENT_CHART)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OASIS_OPENDOCUMENT_DATABASE](#APPLICATION_VND_OASIS_OPENDOCUMENT_DATABASE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OASIS_OPENDOCUMENT_FORMULA](#APPLICATION_VND_OASIS_OPENDOCUMENT_FORMULA)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OASIS_OPENDOCUMENT_GRAPHICS](#APPLICATION_VND_OASIS_OPENDOCUMENT_GRAPHICS)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OASIS_OPENDOCUMENT_IMAGE](#APPLICATION_VND_OASIS_OPENDOCUMENT_IMAGE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION](#APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET](#APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT](#APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_MASTER](#APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_MASTER)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_WEB](#APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_WEB)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION](#APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDE](#APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDESHOW](#APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDESHOW)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_TEMPLATE](#APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_TEMPLATE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET](#APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_TEMPLATE](#APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_TEMPLATE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT](#APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_TEMPLATE](#APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_TEMPLATE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_7Z_COMPRESSED](#APPLICATION_X_7Z_COMPRESSED)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_ACE_COMPRESSED](#APPLICATION_X_ACE_COMPRESSED)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_APPLE_DISKIMAGE](#APPLICATION_X_APPLE_DISKIMAGE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_ARC_COMPRESSED](#APPLICATION_X_ARC_COMPRESSED)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_BZIP](#APPLICATION_X_BZIP)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_BZIP2](#APPLICATION_X_BZIP2)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_CHROME_EXTENSION](#APPLICATION_X_CHROME_EXTENSION)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_COMPRESS](#APPLICATION_X_COMPRESS)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_COMPRESSED](#APPLICATION_X_COMPRESSED)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_DEBIAN_PACKAGE](#APPLICATION_X_DEBIAN_PACKAGE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_DVI](#APPLICATION_X_DVI)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_FONT_OPENTYPE](#APPLICATION_X_FONT_OPENTYPE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_FONT_TRUETYPE](#APPLICATION_X_FONT_TRUETYPE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_GTAR](#APPLICATION_X_GTAR)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_GZIP](#APPLICATION_X_GZIP)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_LATEX](#APPLICATION_X_LATEX)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_RAR_COMPRESSED](#APPLICATION_X_RAR_COMPRESSED)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_REDHAT_PACKAGE_MANAGER](#APPLICATION_X_REDHAT_PACKAGE_MANAGER)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_SHOCKWAVE_FLASH](#APPLICATION_X_SHOCKWAVE_FLASH)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_TAR](#APPLICATION_X_TAR)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_TEX](#APPLICATION_X_TEX)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_TEXINFO](#APPLICATION_X_TEXINFO)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_VRML](#APPLICATION_X_VRML)` |  |
	| `static [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_WWW_FORM_URLENCODED](#APPLICATION_X_WWW_FORM_URLENCODED)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_X509_CA_CERT](#APPLICATION_X_X509_CA_CERT)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_X_XPINSTALL](#APPLICATION_X_XPINSTALL)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_XHTML_XML](#APPLICATION_XHTML_XML)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_XML](#APPLICATION_XML)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[APPLICATION_XML_DTD](#APPLICATION_XML_DTD)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[APPLICATION_ZIP](#APPLICATION_ZIP)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_AIFF](#AUDIO_AIFF)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_BASIC](#AUDIO_BASIC)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_MIDI](#AUDIO_MIDI)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_MOD](#AUDIO_MOD)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_MPEG](#AUDIO_MPEG)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_OGG](#AUDIO_OGG)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_VOC](#AUDIO_VOC)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_VORBIS](#AUDIO_VORBIS)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_VOXWARE](#AUDIO_VOXWARE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_WAV](#AUDIO_WAV)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_WEBM](#AUDIO_WEBM)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_X_PSID](#AUDIO_X_PSID)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_X_REALAUDIO](#AUDIO_X_REALAUDIO)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[AUDIO_XM](#AUDIO_XM)` |  |
	| `static [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model")` | `[COMPRESSIBLE](#COMPRESSIBLE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[FONT_WOFF](#FONT_WOFF)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[FONT_WOFF_2](#FONT_WOFF_2)` |  |
	| `static [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model")` | `[GZIPPED](#GZIPPED)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_GIF](#IMAGE_GIF)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_JPEG](#IMAGE_JPEG)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_PICT](#IMAGE_PICT)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_PNG](#IMAGE_PNG)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_SVG_XML](#IMAGE_SVG_XML)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_SVGZ](#IMAGE_SVGZ)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_TIFF](#IMAGE_TIFF)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_WEBP](#IMAGE_WEBP)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_X_ICON](#IMAGE_X_ICON)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_X_MS_BMP](#IMAGE_X_MS_BMP)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_X_PCX](#IMAGE_X_PCX)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_X_PICT](#IMAGE_X_PICT)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_X_QUICKTIME](#IMAGE_X_QUICKTIME)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_X_RGB](#IMAGE_X_RGB)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_X_XBITMAP](#IMAGE_X_XBITMAP)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[IMAGE_X_XPIXMAP](#IMAGE_X_XPIXMAP)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[MESSAGE_DELIVERY_STATUS](#MESSAGE_DELIVERY_STATUS)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[MESSAGE_HTTP](#MESSAGE_HTTP)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[MESSAGE_RFC822](#MESSAGE_RFC822)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[MULTIPART_ALTERNATIVE](#MULTIPART_ALTERNATIVE)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[MULTIPART_BYTERANGES](#MULTIPART_BYTERANGES)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[MULTIPART_ENCRYPTED](#MULTIPART_ENCRYPTED)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[MULTIPART_FORM_DATA](#MULTIPART_FORM_DATA)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[MULTIPART_MIXED](#MULTIPART_MIXED)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[MULTIPART_RELATED](#MULTIPART_RELATED)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[MULTIPART_SIGNED](#MULTIPART_SIGNED)` |  |
	| `static [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model")` | `[NOT_COMPRESSIBLE](#NOT_COMPRESSIBLE)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_ASP](#TEXT_ASP)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_CACHE_MANIFEST](#TEXT_CACHE_MANIFEST)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_CALENDAR](#TEXT_CALENDAR)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_CSS](#TEXT_CSS)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_CSV](#TEXT_CSV)` |  |
	| `static [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_EVENT_STREAM](#TEXT_EVENT_STREAM)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_HTML](#TEXT_HTML)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_MARKDOWN](#TEXT_MARKDOWN)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_MCF](#TEXT_MCF)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_PLAIN](#TEXT_PLAIN)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_RICHTEXT](#TEXT_RICHTEXT)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_TAB_SEPARATED_VALUES](#TEXT_TAB_SEPARATED_VALUES)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_URI_LIST](#TEXT_URI_LIST)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_VND_WAP_WML](#TEXT_VND_WAP_WML)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_VND_WAP_WMLSCRIPT](#TEXT_VND_WAP_WMLSCRIPT)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_ASM](#TEXT_X_ASM)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_C](#TEXT_X_C)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_COMPONENT](#TEXT_X_COMPONENT)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_H](#TEXT_X_H)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_JAVA_SOURCE](#TEXT_X_JAVA_SOURCE)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_PASCAL](#TEXT_X_PASCAL)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPT](#TEXT_X_SCRIPT)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTCSH](#TEXT_X_SCRIPTCSH)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTELISP](#TEXT_X_SCRIPTELISP)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTKSH](#TEXT_X_SCRIPTKSH)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTLISP](#TEXT_X_SCRIPTLISP)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTPERL](#TEXT_X_SCRIPTPERL)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTPERL_MODULE](#TEXT_X_SCRIPTPERL_MODULE)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTPHYTON](#TEXT_X_SCRIPTPHYTON)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTREXX](#TEXT_X_SCRIPTREXX)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTSCHEME](#TEXT_X_SCRIPTSCHEME)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTSH](#TEXT_X_SCRIPTSH)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTTCL](#TEXT_X_SCRIPTTCL)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTTCSH](#TEXT_X_SCRIPTTCSH)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SCRIPTZSH](#TEXT_X_SCRIPTZSH)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SERVER_PARSED_HTML](#TEXT_X_SERVER_PARSED_HTML)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SETEXT](#TEXT_X_SETEXT)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SGML](#TEXT_X_SGML)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_SPEECH](#TEXT_X_SPEECH)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_UUENCODE](#TEXT_X_UUENCODE)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_VCALENDAR](#TEXT_X_VCALENDAR)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_X_VCARD](#TEXT_X_VCARD)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[TEXT_XML](#TEXT_XML)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_AVS_VIDEO](#VIDEO_AVS_VIDEO)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_DIVX](#VIDEO_DIVX)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_GL](#VIDEO_GL)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_MP4](#VIDEO_MP4)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_MPEG](#VIDEO_MPEG)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_OGG](#VIDEO_OGG)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_QUICKTIME](#VIDEO_QUICKTIME)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_WEBM](#VIDEO_WEBM)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_X_DV](#VIDEO_X_DV)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_X_FLV](#VIDEO_X_FLV)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_X_MOTION_JPEG](#VIDEO_X_MOTION_JPEG)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_X_MS_ASF](#VIDEO_X_MS_ASF)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_X_MSVIDEO](#VIDEO_X_MSVIDEO)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[VIDEO_X_SGI_MOVIE](#VIDEO_X_SGI_MOVIE)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[applicationBinary](#applicationBinary(java.lang.String,boolean,java.lang.String...))​(java.lang.String subType,  boolean compressible,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[applicationBinary](#applicationBinary(java.lang.String,akka.http.javadsl.model.MediaType.Compressibility,java.lang.String...))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[applicationWithFixedCharset](#applicationWithFixedCharset(java.lang.String,akka.http.javadsl.model.HttpCharset,java.lang.String...))​(java.lang.String subType,  [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[applicationWithOpenCharset](#applicationWithOpenCharset(java.lang.String,java.lang.String...))​(java.lang.String subType,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[audio](#audio(java.lang.String,boolean,java.lang.String...))​(java.lang.String subType,  boolean compressible,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[audio](#audio(java.lang.String,akka.http.javadsl.model.MediaType.Compressibility,java.lang.String...))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType](MediaType.html "interface in akka.http.javadsl.model")` | `[custom](#custom(java.lang.String,boolean,boolean))​(java.lang.String value,  boolean binary,  boolean compressible)` | Creates a custom media type. |
	| `static [MediaType](MediaType.html "interface in akka.http.javadsl.model")` | `[custom](#custom(java.lang.String,boolean,akka.http.javadsl.model.MediaType.Compressibility))​(java.lang.String value,  boolean binary,  [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[customBinary](#customBinary(java.lang.String,java.lang.String,boolean))​(java.lang.String mainType,  java.lang.String subType,  boolean compressible)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[customBinary](#customBinary(java.lang.String,java.lang.String,boolean,java.util.Map,boolean,java.lang.String...))​(java.lang.String mainType,  java.lang.String subType,  boolean compressible,  java.util.Map<java.lang.String,​java.lang.String> params,  boolean allowArbitrarySubtypes,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[customBinary](#customBinary(java.lang.String,java.lang.String,akka.http.javadsl.model.MediaType.Compressibility))​(java.lang.String mainType,  java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[customBinary](#customBinary(java.lang.String,java.lang.String,akka.http.javadsl.model.MediaType.Compressibility,java.util.Map,boolean,java.lang.String...))​(java.lang.String mainType,  java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,  java.util.Map<java.lang.String,​java.lang.String> params,  boolean allowArbitrarySubtypes,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.Multipart](MediaType.Multipart.html "interface in akka.http.javadsl.model")` | `[customMultipart](#customMultipart(java.lang.String,java.util.Map))​(java.lang.String subType,  java.util.Map<java.lang.String,​java.lang.String> params)` |  |
	| `static [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model")` | `[customWithFixedCharset](#customWithFixedCharset(java.lang.String,java.lang.String,akka.http.javadsl.model.HttpCharset,java.util.Map,boolean,java.lang.String...))​(java.lang.String mainType,  java.lang.String subType,  [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset,  java.util.Map<java.lang.String,​java.lang.String> params,  boolean allowArbitrarySubtypes,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[customWithOpenCharset](#customWithOpenCharset(java.lang.String,java.lang.String,java.util.Map,boolean,java.lang.String...))​(java.lang.String mainType,  java.lang.String subType,  java.util.Map<java.lang.String,​java.lang.String> params,  boolean allowArbitrarySubtypes,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[image](#image(java.lang.String,boolean,java.lang.String...))​(java.lang.String subType,  boolean compressible,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[image](#image(java.lang.String,akka.http.javadsl.model.MediaType.Compressibility,java.lang.String...))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,  java.lang.String... fileExtensions)` |  |
	| `static java.util.Optional<[MediaType](MediaType.html "interface in akka.http.javadsl.model")>` | `[lookup](#lookup(java.lang.String,java.lang.String))​(java.lang.String mainType,  java.lang.String subType)` | Looks up a media\-type with the given main\-type and sub\-type. |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[message](#message(java.lang.String,boolean,java.lang.String...))​(java.lang.String subType,  boolean compressible,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[message](#message(java.lang.String,akka.http.javadsl.model.MediaType.Compressibility,java.lang.String...))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model")` | `[text](#text(java.lang.String,java.lang.String...))​(java.lang.String subType,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[video](#video(java.lang.String,boolean,java.lang.String...))​(java.lang.String subType,  boolean compressible,  java.lang.String... fileExtensions)` |  |
	| `static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model")` | `[video](#video(java.lang.String,akka.http.javadsl.model.MediaType.Compressibility,java.lang.String...))​(java.lang.String subType,  [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,  java.lang.String... fileExtensions)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### APPLICATION\_ATOM\_XML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_ATOM_XML
		```
		- #### APPLICATION\_BASE64
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_BASE64
		```
		- #### APPLICATION\_CBOR
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_CBOR
		```
		- #### APPLICATION\_EXCEL
		
		
		
		```
		@Deprecated
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_EXCEL
		```
		
		Deprecated.
		This format is unofficial and should not be used.
		 Use {@link{\#APPLICATION\_VND\_MS\_EXCEL} instead.
		- #### APPLICATION\_FONT\_WOFF
		
		
		
		```
		@Deprecated
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_FONT_WOFF
		```
		
		Deprecated.
		This format is unofficial and should not be used.
		 Use {@link{\#FONT\_WOFF} instead.
		- #### APPLICATION\_GNUTAR
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_GNUTAR
		```
		- #### APPLICATION\_JAVA\_ARCHIVE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_JAVA_ARCHIVE
		```
		- #### APPLICATION\_JAVASCRIPT
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_JAVASCRIPT
		```
		- #### APPLICATION\_JSON
		
		
		
		```
		public static final [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") APPLICATION_JSON
		```
		- #### APPLICATION\_JSON\_PATCH\_JSON
		
		
		
		```
		public static final [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") APPLICATION_JSON_PATCH_JSON
		```
		- #### APPLICATION\_MERGE\_PATCH\_JSON
		
		
		
		```
		public static final [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") APPLICATION_MERGE_PATCH_JSON
		```
		- #### APPLICATION\_LHA
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_LHA
		```
		- #### APPLICATION\_LZX
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_LZX
		```
		- #### APPLICATION\_MSPOWERPOINT
		
		
		
		```
		@Deprecated
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_MSPOWERPOINT
		```
		
		Deprecated.
		This format is unofficial and should not be used.
		 Use {@link{\#APPLICATION\_VND\_MS\_POWERPOINT} instead.
		- #### APPLICATION\_MSWORD
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_MSWORD
		```
		- #### APPLICATION\_OCTET\_STREAM
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_OCTET_STREAM
		```
		- #### APPLICATION\_GRPC\_PROTO
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_GRPC_PROTO
		```
		- #### APPLICATION\_PDF
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_PDF
		```
		- #### APPLICATION\_POSTSCRIPT
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_POSTSCRIPT
		```
		- #### APPLICATION\_RSS\_XML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_RSS_XML
		```
		- #### APPLICATION\_SOAP\_XML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_SOAP_XML
		```
		- #### APPLICATION\_VND\_API\_JSON
		
		
		
		```
		public static final [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") APPLICATION_VND_API_JSON
		```
		- #### APPLICATION\_VND\_GOOGLE\_EARTH\_KML\_XML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_VND_GOOGLE_EARTH_KML_XML
		```
		- #### APPLICATION\_VND\_GOOGLE\_EARTH\_KMZ
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_GOOGLE_EARTH_KMZ
		```
		- #### APPLICATION\_VND\_MS\_EXCEL
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_EXCEL
		```
		- #### APPLICATION\_VND\_MS\_EXCEL\_ADDIN\_MACROENABLED\_12
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_EXCEL_ADDIN_MACROENABLED_12
		```
		- #### APPLICATION\_VND\_MS\_EXCEL\_SHEET\_BINARY\_MACROENABLED\_12
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_EXCEL_SHEET_BINARY_MACROENABLED_12
		```
		- #### APPLICATION\_VND\_MS\_EXCEL\_SHEET\_MACROENABLED\_12
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_EXCEL_SHEET_MACROENABLED_12
		```
		- #### APPLICATION\_VND\_MS\_EXCEL\_TEMPLATE\_MACROENABLED\_12
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_EXCEL_TEMPLATE_MACROENABLED_12
		```
		- #### APPLICATION\_VND\_MS\_FONTOBJECT
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_FONTOBJECT
		```
		- #### APPLICATION\_VND\_MS\_POWERPOINT
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_POWERPOINT
		```
		- #### APPLICATION\_VND\_MS\_POWERPOINT\_ADDIN\_MACROENABLED\_12
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_POWERPOINT_ADDIN_MACROENABLED_12
		```
		- #### APPLICATION\_VND\_MS\_POWERPOINT\_PRESENTATION\_MACROENABLED\_12
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_POWERPOINT_PRESENTATION_MACROENABLED_12
		```
		- #### APPLICATION\_VND\_MS\_POWERPOINT\_SLIDESHOW\_MACROENABLED\_12
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_POWERPOINT_SLIDESHOW_MACROENABLED_12
		```
		- #### APPLICATION\_VND\_MS\_WORD\_DOCUMENT\_MACROENABLED\_12
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_WORD_DOCUMENT_MACROENABLED_12
		```
		- #### APPLICATION\_VND\_MS\_WORD\_TEMPLATE\_MACROENABLED\_12
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_MS_WORD_TEMPLATE_MACROENABLED_12
		```
		- #### APPLICATION\_VND\_OASIS\_OPENDOCUMENT\_CHART
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OASIS_OPENDOCUMENT_CHART
		```
		- #### APPLICATION\_VND\_OASIS\_OPENDOCUMENT\_DATABASE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OASIS_OPENDOCUMENT_DATABASE
		```
		- #### APPLICATION\_VND\_OASIS\_OPENDOCUMENT\_FORMULA
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OASIS_OPENDOCUMENT_FORMULA
		```
		- #### APPLICATION\_VND\_OASIS\_OPENDOCUMENT\_GRAPHICS
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OASIS_OPENDOCUMENT_GRAPHICS
		```
		- #### APPLICATION\_VND\_OASIS\_OPENDOCUMENT\_IMAGE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OASIS_OPENDOCUMENT_IMAGE
		```
		- #### APPLICATION\_VND\_OASIS\_OPENDOCUMENT\_PRESENTATION
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION
		```
		- #### APPLICATION\_VND\_OASIS\_OPENDOCUMENT\_SPREADSHEET
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET
		```
		- #### APPLICATION\_VND\_OASIS\_OPENDOCUMENT\_TEXT
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT
		```
		- #### APPLICATION\_VND\_OASIS\_OPENDOCUMENT\_TEXT\_MASTER
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_MASTER
		```
		- #### APPLICATION\_VND\_OASIS\_OPENDOCUMENT\_TEXT\_WEB
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT_WEB
		```
		- #### APPLICATION\_VND\_OPENXMLFORMATS\_OFFICEDOCUMENT\_PRESENTATIONML\_PRESENTATION
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION
		```
		- #### APPLICATION\_VND\_OPENXMLFORMATS\_OFFICEDOCUMENT\_PRESENTATIONML\_SLIDE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDE
		```
		- #### APPLICATION\_VND\_OPENXMLFORMATS\_OFFICEDOCUMENT\_PRESENTATIONML\_SLIDESHOW
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDESHOW
		```
		- #### APPLICATION\_VND\_OPENXMLFORMATS\_OFFICEDOCUMENT\_PRESENTATIONML\_TEMPLATE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_TEMPLATE
		```
		- #### APPLICATION\_VND\_OPENXMLFORMATS\_OFFICEDOCUMENT\_SPREADSHEETML\_SHEET
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET
		```
		- #### APPLICATION\_VND\_OPENXMLFORMATS\_OFFICEDOCUMENT\_SPREADSHEETML\_TEMPLATE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_TEMPLATE
		```
		- #### APPLICATION\_VND\_OPENXMLFORMATS\_OFFICEDOCUMENT\_WORDPROCESSINGML\_DOCUMENT
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT
		```
		- #### APPLICATION\_VND\_OPENXMLFORMATS\_OFFICEDOCUMENT\_WORDPROCESSINGML\_TEMPLATE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_TEMPLATE
		```
		- #### APPLICATION\_X\_7Z\_COMPRESSED
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_7Z_COMPRESSED
		```
		- #### APPLICATION\_X\_ACE\_COMPRESSED
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_ACE_COMPRESSED
		```
		- #### APPLICATION\_X\_APPLE\_DISKIMAGE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_APPLE_DISKIMAGE
		```
		- #### APPLICATION\_X\_ARC\_COMPRESSED
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_ARC_COMPRESSED
		```
		- #### APPLICATION\_X\_BZIP
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_BZIP
		```
		- #### APPLICATION\_X\_BZIP2
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_BZIP2
		```
		- #### APPLICATION\_X\_CHROME\_EXTENSION
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_CHROME_EXTENSION
		```
		- #### APPLICATION\_X\_COMPRESS
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_COMPRESS
		```
		- #### APPLICATION\_X\_COMPRESSED
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_COMPRESSED
		```
		- #### APPLICATION\_X\_DEBIAN\_PACKAGE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_DEBIAN_PACKAGE
		```
		- #### APPLICATION\_X\_DVI
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_DVI
		```
		- #### APPLICATION\_X\_FONT\_TRUETYPE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_FONT_TRUETYPE
		```
		- #### APPLICATION\_X\_FONT\_OPENTYPE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_FONT_OPENTYPE
		```
		- #### APPLICATION\_X\_GTAR
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_GTAR
		```
		- #### APPLICATION\_X\_GZIP
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_GZIP
		```
		- #### APPLICATION\_X\_LATEX
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_X_LATEX
		```
		- #### APPLICATION\_X\_RAR\_COMPRESSED
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_RAR_COMPRESSED
		```
		- #### APPLICATION\_X\_REDHAT\_PACKAGE\_MANAGER
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_REDHAT_PACKAGE_MANAGER
		```
		- #### APPLICATION\_X\_SHOCKWAVE\_FLASH
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_SHOCKWAVE_FLASH
		```
		- #### APPLICATION\_X\_TAR
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_TAR
		```
		- #### APPLICATION\_X\_TEX
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_TEX
		```
		- #### APPLICATION\_X\_TEXINFO
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_TEXINFO
		```
		- #### APPLICATION\_X\_VRML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_X_VRML
		```
		- #### APPLICATION\_X\_WWW\_FORM\_URLENCODED
		
		
		
		```
		public static final [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") APPLICATION_X_WWW_FORM_URLENCODED
		```
		- #### APPLICATION\_X\_X509\_CA\_CERT
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_X509_CA_CERT
		```
		- #### APPLICATION\_X\_XPINSTALL
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_X_XPINSTALL
		```
		- #### APPLICATION\_XHTML\_XML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_XHTML_XML
		```
		- #### APPLICATION\_XML\_DTD
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_XML_DTD
		```
		- #### APPLICATION\_XML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") APPLICATION_XML
		```
		- #### APPLICATION\_ZIP
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") APPLICATION_ZIP
		```
		- #### AUDIO\_AIFF
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_AIFF
		```
		- #### AUDIO\_BASIC
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_BASIC
		```
		- #### AUDIO\_MIDI
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_MIDI
		```
		- #### AUDIO\_MOD
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_MOD
		```
		- #### AUDIO\_MPEG
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_MPEG
		```
		- #### AUDIO\_OGG
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_OGG
		```
		- #### AUDIO\_VOC
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_VOC
		```
		- #### AUDIO\_VORBIS
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_VORBIS
		```
		- #### AUDIO\_VOXWARE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_VOXWARE
		```
		- #### AUDIO\_WAV
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_WAV
		```
		- #### AUDIO\_X\_REALAUDIO
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_X_REALAUDIO
		```
		- #### AUDIO\_X\_PSID
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_X_PSID
		```
		- #### AUDIO\_XM
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_XM
		```
		- #### AUDIO\_WEBM
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") AUDIO_WEBM
		```
		- #### FONT\_WOFF
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") FONT_WOFF
		```
		- #### FONT\_WOFF\_2
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") FONT_WOFF_2
		```
		- #### IMAGE\_GIF
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_GIF
		```
		- #### IMAGE\_JPEG
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_JPEG
		```
		- #### IMAGE\_PICT
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_PICT
		```
		- #### IMAGE\_PNG
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_PNG
		```
		- #### IMAGE\_SVGZ
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_SVGZ
		```
		- #### IMAGE\_SVG\_XML
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_SVG_XML
		```
		- #### IMAGE\_TIFF
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_TIFF
		```
		- #### IMAGE\_X\_ICON
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_X_ICON
		```
		- #### IMAGE\_X\_MS\_BMP
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_X_MS_BMP
		```
		- #### IMAGE\_X\_PCX
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_X_PCX
		```
		- #### IMAGE\_X\_PICT
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_X_PICT
		```
		- #### IMAGE\_X\_QUICKTIME
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_X_QUICKTIME
		```
		- #### IMAGE\_X\_RGB
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_X_RGB
		```
		- #### IMAGE\_X\_XBITMAP
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_X_XBITMAP
		```
		- #### IMAGE\_X\_XPIXMAP
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_X_XPIXMAP
		```
		- #### IMAGE\_WEBP
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") IMAGE_WEBP
		```
		- #### MESSAGE\_HTTP
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") MESSAGE_HTTP
		```
		- #### MESSAGE\_DELIVERY\_STATUS
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") MESSAGE_DELIVERY_STATUS
		```
		- #### MESSAGE\_RFC822
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") MESSAGE_RFC822
		```
		- #### MULTIPART\_MIXED
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") MULTIPART_MIXED
		```
		- #### MULTIPART\_ALTERNATIVE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") MULTIPART_ALTERNATIVE
		```
		- #### MULTIPART\_RELATED
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") MULTIPART_RELATED
		```
		- #### MULTIPART\_FORM\_DATA
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") MULTIPART_FORM_DATA
		```
		- #### MULTIPART\_SIGNED
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") MULTIPART_SIGNED
		```
		- #### MULTIPART\_ENCRYPTED
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") MULTIPART_ENCRYPTED
		```
		- #### MULTIPART\_BYTERANGES
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") MULTIPART_BYTERANGES
		```
		- #### TEXT\_ASP
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_ASP
		```
		- #### TEXT\_CACHE\_MANIFEST
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_CACHE_MANIFEST
		```
		- #### TEXT\_CALENDAR
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_CALENDAR
		```
		- #### TEXT\_CSS
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_CSS
		```
		- #### TEXT\_CSV
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_CSV
		```
		- #### TEXT\_EVENT\_STREAM
		
		
		
		```
		public static final [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") TEXT_EVENT_STREAM
		```
		- #### TEXT\_HTML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_HTML
		```
		- #### TEXT\_MARKDOWN
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_MARKDOWN
		```
		- #### TEXT\_MCF
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_MCF
		```
		- #### TEXT\_PLAIN
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_PLAIN
		```
		- #### TEXT\_RICHTEXT
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_RICHTEXT
		```
		- #### TEXT\_TAB\_SEPARATED\_VALUES
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_TAB_SEPARATED_VALUES
		```
		- #### TEXT\_URI\_LIST
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_URI_LIST
		```
		- #### TEXT\_VND\_WAP\_WML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_VND_WAP_WML
		```
		- #### TEXT\_VND\_WAP\_WMLSCRIPT
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_VND_WAP_WMLSCRIPT
		```
		- #### TEXT\_X\_ASM
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_ASM
		```
		- #### TEXT\_X\_C
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_C
		```
		- #### TEXT\_X\_COMPONENT
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_COMPONENT
		```
		- #### TEXT\_X\_H
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_H
		```
		- #### TEXT\_X\_JAVA\_SOURCE
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_JAVA_SOURCE
		```
		- #### TEXT\_X\_PASCAL
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_PASCAL
		```
		- #### TEXT\_X\_SCRIPT
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPT
		```
		- #### TEXT\_X\_SCRIPTCSH
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTCSH
		```
		- #### TEXT\_X\_SCRIPTELISP
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTELISP
		```
		- #### TEXT\_X\_SCRIPTKSH
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTKSH
		```
		- #### TEXT\_X\_SCRIPTLISP
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTLISP
		```
		- #### TEXT\_X\_SCRIPTPERL
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTPERL
		```
		- #### TEXT\_X\_SCRIPTPERL\_MODULE
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTPERL_MODULE
		```
		- #### TEXT\_X\_SCRIPTPHYTON
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTPHYTON
		```
		- #### TEXT\_X\_SCRIPTREXX
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTREXX
		```
		- #### TEXT\_X\_SCRIPTSCHEME
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTSCHEME
		```
		- #### TEXT\_X\_SCRIPTSH
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTSH
		```
		- #### TEXT\_X\_SCRIPTTCL
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTTCL
		```
		- #### TEXT\_X\_SCRIPTTCSH
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTTCSH
		```
		- #### TEXT\_X\_SCRIPTZSH
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SCRIPTZSH
		```
		- #### TEXT\_X\_SERVER\_PARSED\_HTML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SERVER_PARSED_HTML
		```
		- #### TEXT\_X\_SETEXT
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SETEXT
		```
		- #### TEXT\_X\_SGML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SGML
		```
		- #### TEXT\_X\_SPEECH
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_SPEECH
		```
		- #### TEXT\_X\_UUENCODE
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_UUENCODE
		```
		- #### TEXT\_X\_VCALENDAR
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_VCALENDAR
		```
		- #### TEXT\_X\_VCARD
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_X_VCARD
		```
		- #### TEXT\_XML
		
		
		
		```
		public static final [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") TEXT_XML
		```
		- #### VIDEO\_AVS\_VIDEO
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_AVS_VIDEO
		```
		- #### VIDEO\_DIVX
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_DIVX
		```
		- #### VIDEO\_GL
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_GL
		```
		- #### VIDEO\_MP4
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_MP4
		```
		- #### VIDEO\_MPEG
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_MPEG
		```
		- #### VIDEO\_OGG
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_OGG
		```
		- #### VIDEO\_QUICKTIME
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_QUICKTIME
		```
		- #### VIDEO\_X\_DV
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_X_DV
		```
		- #### VIDEO\_X\_FLV
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_X_FLV
		```
		- #### VIDEO\_X\_MOTION\_JPEG
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_X_MOTION_JPEG
		```
		- #### VIDEO\_X\_MS\_ASF
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_X_MS_ASF
		```
		- #### VIDEO\_X\_MSVIDEO
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_X_MSVIDEO
		```
		- #### VIDEO\_X\_SGI\_MOVIE
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_X_SGI_MOVIE
		```
		- #### VIDEO\_WEBM
		
		
		
		```
		public static final [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") VIDEO_WEBM
		```
		- #### COMPRESSIBLE
		
		
		
		```
		public static final [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") COMPRESSIBLE
		```
		- #### NOT\_COMPRESSIBLE
		
		
		
		```
		public static final [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") NOT_COMPRESSIBLE
		```
		- #### GZIPPED
		
		
		
		```
		public static final [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") GZIPPED
		```

	- ### Method Detail
	
	
	
		- #### applicationBinary
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") applicationBinary​(java.lang.String subType,
		                                                 boolean compressible,
		                                                 java.lang.String... fileExtensions)
		```
		- #### applicationBinary
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") applicationBinary​(java.lang.String subType,
		                                                 [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,
		                                                 java.lang.String... fileExtensions)
		```
		- #### applicationWithFixedCharset
		
		
		
		```
		public static [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") applicationWithFixedCharset​(java.lang.String subType,
		                                                                     [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset,
		                                                                     java.lang.String... fileExtensions)
		```
		- #### applicationWithOpenCharset
		
		
		
		```
		public static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") applicationWithOpenCharset​(java.lang.String subType,
		                                                                   java.lang.String... fileExtensions)
		```
		- #### audio
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") audio​(java.lang.String subType,
		                                     boolean compressible,
		                                     java.lang.String... fileExtensions)
		```
		- #### audio
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") audio​(java.lang.String subType,
		                                     [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,
		                                     java.lang.String... fileExtensions)
		```
		- #### image
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") image​(java.lang.String subType,
		                                     boolean compressible,
		                                     java.lang.String... fileExtensions)
		```
		- #### image
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") image​(java.lang.String subType,
		                                     [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,
		                                     java.lang.String... fileExtensions)
		```
		- #### message
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") message​(java.lang.String subType,
		                                       boolean compressible,
		                                       java.lang.String... fileExtensions)
		```
		- #### message
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") message​(java.lang.String subType,
		                                       [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,
		                                       java.lang.String... fileExtensions)
		```
		- #### text
		
		
		
		```
		public static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") text​(java.lang.String subType,
		                                             java.lang.String... fileExtensions)
		```
		- #### video
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") video​(java.lang.String subType,
		                                     boolean compressible,
		                                     java.lang.String... fileExtensions)
		```
		- #### video
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") video​(java.lang.String subType,
		                                     [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,
		                                     java.lang.String... fileExtensions)
		```
		- #### customBinary
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") customBinary​(java.lang.String mainType,
		                                            java.lang.String subType,
		                                            boolean compressible)
		```
		- #### customBinary
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") customBinary​(java.lang.String mainType,
		                                            java.lang.String subType,
		                                            [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility)
		```
		- #### customBinary
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") customBinary​(java.lang.String mainType,
		                                            java.lang.String subType,
		                                            boolean compressible,
		                                            java.util.Map<java.lang.String,​java.lang.String> params,
		                                            boolean allowArbitrarySubtypes,
		                                            java.lang.String... fileExtensions)
		```
		- #### customBinary
		
		
		
		```
		public static [MediaType.Binary](MediaType.Binary.html "interface in akka.http.javadsl.model") customBinary​(java.lang.String mainType,
		                                            java.lang.String subType,
		                                            [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility,
		                                            java.util.Map<java.lang.String,​java.lang.String> params,
		                                            boolean allowArbitrarySubtypes,
		                                            java.lang.String... fileExtensions)
		```
		- #### customWithFixedCharset
		
		
		
		```
		public static [MediaType.WithFixedCharset](MediaType.WithFixedCharset.html "interface in akka.http.javadsl.model") customWithFixedCharset​(java.lang.String mainType,
		                                                                java.lang.String subType,
		                                                                [HttpCharset](HttpCharset.html "class in akka.http.javadsl.model") charset,
		                                                                java.util.Map<java.lang.String,​java.lang.String> params,
		                                                                boolean allowArbitrarySubtypes,
		                                                                java.lang.String... fileExtensions)
		```
		- #### customWithOpenCharset
		
		
		
		```
		public static [MediaType.WithOpenCharset](MediaType.WithOpenCharset.html "interface in akka.http.javadsl.model") customWithOpenCharset​(java.lang.String mainType,
		                                                              java.lang.String subType,
		                                                              java.util.Map<java.lang.String,​java.lang.String> params,
		                                                              boolean allowArbitrarySubtypes,
		                                                              java.lang.String... fileExtensions)
		```
		- #### customMultipart
		
		
		
		```
		public static [MediaType.Multipart](MediaType.Multipart.html "interface in akka.http.javadsl.model") customMultipart​(java.lang.String subType,
		                                                  java.util.Map<java.lang.String,​java.lang.String> params)
		```
		- #### custom
		
		
		
		```
		public static [MediaType](MediaType.html "interface in akka.http.javadsl.model") custom​(java.lang.String value,
		                               boolean binary,
		                               boolean compressible)
		```
		
		Creates a custom media type.
		- #### custom
		
		
		
		```
		public static [MediaType](MediaType.html "interface in akka.http.javadsl.model") custom​(java.lang.String value,
		                               boolean binary,
		                               [MediaType.Compressibility](MediaType.Compressibility.html "interface in akka.http.javadsl.model") compressibility)
		```
		- #### lookup
		
		
		
		```
		public static java.util.Optional<[MediaType](MediaType.html "interface in akka.http.javadsl.model")> lookup​(java.lang.String mainType,
		                                                   java.lang.String subType)
		```
		
		Looks up a media\-type with the given main\-type and sub\-type.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.Binary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.Compressibility.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.Multipart.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.WithFixedCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/MediaTypes.html)*