---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/guide/microservices-tutorial/template.html
title: 'Section 2: Start a project :: Akka Guide'
---

# Section 2: Start a project :: Akka Guide

## Content

# Section 2: Start a project

Language

We provide a template so that you don’t need to create the shopping cart project structure along with configuration and build files. The instructions below describe how to run the template and open the resulting project in IntelliJ. If you are using a different IDE, substitute as necessary.

## 1\. Download the empty template

The starting template is available as downloadable zip file with Java or Scala sources. Select your preferred language (Java/Scala):

Java

Download [Java sources](_attachments/0-shopping-cart-start-java.zip).

Scala

Download [Scala sources](_attachments/0-shopping-cart-start-scala.zip).

Unzip the file and you should have 3 directories:

- `shopping-analytics-service`
- `shopping-cart-service`
- `shopping-order-service`

In the first part of the tutorial we will work with the `shopping-cart-service` and we will use the others in later steps of the tutorial.

Change to the new `shopping-cart-service` project directory and try to build it with:

Java

```
mvn compile
```

Scala

```
sbt compile
```

## 2\. Open the project in IntelliJ

If you are using IntelliJ, follow these steps to open the project:

1. From the **File \> Open** menu, select `shopping-cart-service/build.sbt` `shopping-cart-service/pom.xml`.
2. Select **Open as project**.

## 3\. Run Docker and Docker Compose

Follow these steps to prepare for running shopping cart:

1. From the root project directory, run the following command:

```
docker compose up -d
```

This command will build and run the containers. The `-d` flag starts the containers in detached mode. Containers started in detached mode exit when the root process used to run the container exits
2. Create the PostgreSQL tables from the SQL script located inside the `ddl-scripts` at the root of the project:

```
docker exec -i postgres-db psql -U shopping-cart -t < ddl-scripts/create_tables.sql
```

It creates all tables needed for Akka Persistence as well as the offset store table for Akka Projection.

## Configuration for local development

The template contains configuration files for local development. We will be using them in the procedures that follow, but this section provides an overview.

By default, when using `sbt run` `mvn exec:exec` the `Main` class will start an `ActorSystem` with `application.conf` which is the configuration intended to be used in production. When running multiple nodes of a Microservice on the same machine, each process (i.e. node) must use unique Akka port numbers.

To simplify the process of running multiple nodes locally, we’ve provided three configuration files named `local1.conf`, `local2.conf`, and `local3.conf` with the port values shown below. All the local configuration files include `application.conf`.

You can override the configuration by passing one of the provided `local` configuration files to the build tool using a `-D` option.

For example, once a piece of functionality is complete, you can run one Akka Cluster node with `local1.conf` as follows:

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

```
sbt -Dconfig.resource=local1.conf run
```

Then, on separate terminal windows, you can start two additional nodes with `local2.conf` and `local3.conf`:

```
# On a second terminal run:
#   (make sure to compile before running exec:exec)
mvn compile exec:exec -DAPP_CONFIG=local2.conf

# On a third terminal run:
mvn compile exec:exec -DAPP_CONFIG=local3.conf
```

```
# On a second terminal run:
sbt -Dconfig.resource=local2.conf run

# On a third terminal run:
sbt -Dconfig.resource=local3.conf run
```

The local configuration files set the following ports for each of the example services:

Table 1\. shopping\-cart\-service ports

| Node | Akka Cluster | Akka Management HTTP | Akka gRPC |
| --- | --- | --- | --- |
| local1\.conf | 2551 | 9101 | 8101 |
| local2\.conf | 2552 | 9102 | 8102 |
| local3\.conf | 2553 | 9103 | 8103 |

Table 2\. shopping\-analytics\-service ports

| Node | Akka Cluster | Akka Management HTTP | Akka gRPC |
| --- | --- | --- | --- |
| local1\.conf | 3551 | 9201 | \- |
| local2\.conf | 3552 | 9202 | \- |
| local3\.conf | 3553 | 9203 | \- |

Table 3\. shopping\-order\-service ports

| Node | Akka Cluster | Akka Management HTTP | Akka gRPC |
| --- | --- | --- | --- |
| local1\.conf | 4551 | 9301 | 8301 |
| local2\.conf | 4552 | 9302 | 8302 |
| local3\.conf | 4553 | 9303 | 8303 |

## Code Examples

### Example 1: 3. Run Docker and Docker Compose

```shell
docker compose up -d
```

### Example 2: 3. Run Docker and Docker Compose

```shell
docker exec -i postgres-db psql -U shopping-cart -t < ddl-scripts/create_tables.sql
```

### Example 3: Configuration for local development

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 4: Configuration for local development

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 5: Configuration for local development

```shell
# On a second terminal run:
#   (make sure to compile before running exec:exec)
mvn compile exec:exec -DAPP_CONFIG=local2.conf

# On a third terminal run:
mvn compile exec:exec -DAPP_CONFIG=local3.conf
```

### Example 6: Configuration for local development

```shell
# On a second terminal run:
sbt -Dconfig.resource=local2.conf run


# On a third terminal run:
sbt -Dconfig.resource=local3.conf run
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/0-shopping-cart-start-java.zip
- https://doc.akka.io/libraries/guide/microservices-tutorial/_attachments/0-shopping-cart-start-scala.zip

---
*Source: [https://doc.akka.io/libraries/guide/microservices-tutorial/template.html](https://doc.akka.io/libraries/guide/microservices-tutorial/template.html)*