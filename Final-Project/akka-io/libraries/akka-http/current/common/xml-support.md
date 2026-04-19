---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/common/xml-support.html
title: XML Support • Akka HTTP
---

# XML Support • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# XML Support

Akka HTTP’s [marshalling](marshalling.html) and [unmarshalling](unmarshalling.html) infrastructure makes it rather easy to seamlessly support specific wire representations of your data objects, like JSON, XML or even binary encodings.

Akka HTTP does not currently provide a Java API for XML support. If you need to produce and consume XML, you can write a [custom marshaller](marshalling.html#custom-marshallers) using [Jackson](https://github.com/FasterXML/jackson), which is also the library used for providing [JSON support](json-support.html#jackson-support).

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/JacksonXmlSupport.java#L8-L51 "Go to snippet source")import java.io.IOException;
import java.util.List;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import akka.http.javadsl.model.*;
import akka.http.javadsl.marshalling.Marshaller;
import akka.http.javadsl.unmarshalling.Unmarshaller;

public class JacksonXmlSupport {
  private static final ObjectMapper DEFAULT_XML_MAPPER =
    new XmlMapper().enable(SerializationFeature.WRAP_ROOT_VALUE);
  private static final List<MediaType> XML_MEDIA_TYPES = Arrays.asList(MediaTypes.APPLICATION_XML, MediaTypes.TEXT_XML);

  public static <T> Marshaller<T, RequestEntity> marshaller() {
    return Marshaller.wrapEntity(
      u -> toXML(DEFAULT_XML_MAPPER, u),
      Marshaller.stringToEntity(),
      MediaTypes.APPLICATION_XML
    );
  }

  public static <T> Unmarshaller<HttpEntity, T> unmarshaller(Class<T> expectedType) {
    return Unmarshaller.forMediaTypes(XML_MEDIA_TYPES, Unmarshaller.entityToString())
                       .thenApply(xml -> fromXML(DEFAULT_XML_MAPPER, xml, expectedType));
  }

  private static <T> String toXML(ObjectMapper mapper, T object) {
    try {
      return mapper.writeValueAsString(object);
    } catch (IOException e) {
      throw new IllegalArgumentException("Cannot marshal to XML: " + object, e);
    }
  }

  private static <T> T fromXML(ObjectMapper mapper, String xml, Class<T> expectedType) {
    try {
      return mapper.readerFor(expectedType).readValue(xml);
    } catch (IOException e) {
      throw new IllegalArgumentException("Cannot unmarshal XML as " + expectedType.getSimpleName(), e);
    }
  }
}
```

The custom XML (un)marshalling code shown above requires that you depend on the `jackson-dataformat-xml` library.

@@@note The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
libraryDependencies += "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % "2.18.4"
```
Gradle
```
dependencies {
  implementation "com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.18.4"
}
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
    <version>2.18.4</version>
  </dependency&gt
</dependencies>
```

@@@

For XML Akka HTTP currently provides support for [Scala XML](https://github.com/scala/scala-xml) right out of the box through it’s `akka-http-xml` module.

## Scala XML Support

The [`ScalaXmlSupport`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html "akka.http.scaladsl.marshallers.xml.ScalaXmlSupport") trait provides a `FromEntityUnmarshaller[NodeSeq]` and `ToEntityMarshaller[NodeSeq]` that you can use directly or build upon.

In order to enable support for (un)marshalling from and to XML with [Scala XML](https://github.com/scala/scala-xml) `NodeSeq` you must add the following dependency:

sbt
```
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-xml" % AkkaHttpVersion
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-xml_${versions.ScalaBinary}"
}
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-xml_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

Once you have done this (un)marshalling between XML and `NodeSeq` instances should work nicely and transparently, by either using `import akka.http.scaladsl.marshallers.xml.ScalaXmlSupport._` or mixing in the `akka.http.scaladsl.marshallers.xml.ScalaXmlSupport` trait.

## Code Examples

### Example 1: XML Support

```java
import java.io.IOException;
import java.util.List;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import akka.http.javadsl.model.*;
import akka.http.javadsl.marshalling.Marshaller;
import akka.http.javadsl.unmarshalling.Unmarshaller;

public class JacksonXmlSupport {
  private static final ObjectMapper DEFAULT_XML_MAPPER =
    new XmlMapper().enable(SerializationFeature.WRAP_ROOT_VALUE);
  private static final List<MediaType> XML_MEDIA_TYPES = Arrays.asList(MediaTypes.APPLICATION_XML, MediaTypes.TEXT_XML);

  public static <T> Marshaller<T, RequestEntity> marshaller() {
    return Marshaller.wrapEntity(
      u -> toXML(DEFAULT_XML_MAPPER, u),
      Marshaller.stringToEntity(),
      MediaTypes.APPLICATION_XML
    );
  }

  public static <T> Unmarshaller<HttpEntity, T> unmarshaller(Class<T> expectedType) {
    return Unmarshaller.forMediaTypes(XML_MEDIA_TYPES, Unmarshaller.entityToString())
                       .thenApply(xml -> fromXML(DEFAULT_XML_MAPPER, xml, expectedType));
  }

  private static <T> String toXML(ObjectMapper mapper, T object) {
    try {
      return mapper.writeValueAsString(object);
    } catch (IOException e) {
      throw new IllegalArgumentException("Cannot marshal to XML: " + object, e);
    }
  }

  private static <T> T fromXML(ObjectMapper mapper, String xml, Class<T> expectedType) {
    try {
      return mapper.readerFor(expectedType).readValue(xml);
    } catch (IOException e) {
      throw new IllegalArgumentException("Cannot unmarshal XML as " + expectedType.getSimpleName(), e);
    }
  }
}
```

### Example 2: XML Support

```scala
libraryDependencies += "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % "2.18.4"
```

### Example 3: XML Support

```gradle
dependencies {
  implementation "com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.18.4"
}
```

### Example 4: XML Support

```xml
<dependencies&gt
  <dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
    <version>2.18.4</version>
  </dependency&gt
</dependencies>
```

### Example 5: Scala XML Support

```scala
val AkkaHttpVersion = "10.7.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-xml" % AkkaHttpVersion
```

### Example 6: Scala XML Support

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-http-bom_${versions.ScalaBinary}:10.7.4")

  implementation "com.typesafe.akka:akka-http-xml_${versions.ScalaBinary}"
}
```

### Example 7: Scala XML Support

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-http-bom_${scala.binary.version}</artifactId>
      <version>10.7.4</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-http-xml_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html
- https://doc.akka.io/libraries/akka-http/current/common/json-support.html
- https://doc.akka.io/libraries/akka-http/current/common/marshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/sse-support.html
- https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/common/xml-support.html](https://doc.akka.io/libraries/akka-http/current/common/xml-support.html)*