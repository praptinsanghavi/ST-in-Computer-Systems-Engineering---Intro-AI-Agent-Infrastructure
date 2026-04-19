---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:39Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/discovery/aws.html
title: AWS API • Akka Management
---

# AWS API • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

## AWS API

Warning
This module is community maintained and the Lightbend subscription doesn’t cover support for this module.

If you’re using EC2 directly *or* you’re using ECS with host mode networking *and* you’re deploying one container per cluster member, continue to [Discovery Method: AWS API \- EC2 Tag\-Based Discovery](aws.html#discovery-method-aws-api-ec2-tag-based-discovery).

If you’re using ECS with [awsvpcs](https://aws.amazon.com/blogs/compute/introducing-cloud-native-networking-for-ecs-containers/) mode networking (whether on EC2 or with [Fargate](https://aws.amazon.com/fargate/)), continue to [Discovery Method: AWS API \- ECS Discovery](aws.html#discovery-method-aws-api-ecs-discovery).

ECS with bridge mode networking is not supported.

If you’re using EKS, then you may want to use the [‘Kubernetes API’\-based discovery method](kubernetes.html) instead.

## Project Info

| Project Info: Akka Discovery AWS | |
| --- | --- |
| Artifact | com.lightbend.akka.discovery akka\-discovery\-aws\-api 1\.6\.4 [Akka library snapshot repository](https://repo.akka.io/snapshots) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| License | [BUSL\-1\.1](https://github.com/akka/akka-management/blob/v1.6.4/LICENSE) |
| Readiness level | [Community\-driven](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#community-driven) Since 0\.11\.0, 2018\-04\-09 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-management/1.6.4/akka/index.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-management/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-management/issues) |
| Sources | [https://github.com/akka/akka\-management](https://github.com/akka/akka-management) |

### Discovery Method: AWS API \- EC2 Tag\-Based Discovery

You can use tags to simply mark the instances that belong to the same cluster. Use a tag that has “service” as the key and set the value equal to the name of your service (same value as `akka.management.cluster.bootstrap.contact-point-discovery.service-name` defined in `application.conf`, if you’re using this module for bootstrapping your Akka cluster).

Screenshot of two tagged EC2 instances:

![EC2 instances](../images/discovery-aws-ec2-tagged-instances.png)

Note the tag **service** \-\> *products\-api*. It is set on both instances.

Note that this implementation is adequate for users running service clusters on *vanilla* EC2 instances. These instances can be created and tagged manually, or created via an auto\-scaling group (ASG). If they are created via an ASG, they can be tagged automatically on creation. Simply add the tag to the auto\-scaling group configuration and ensure the “Tag New Instances” option is checked.

#### Dependencies and usage (EC2 Tag\-Based Discovery)

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-aws-api" % AkkaManagementVersion
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery-aws-api_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```
Maven
```
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-aws-api_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

`akka-discovery-aws-api` can be used with Akka 2\.10\.11 or later. You have to override the following Akka dependencies by defining them explicitly in your build and define the Akka version to the one that you are using. Latest patch version of Akka is recommended and a later version than 2\.10\.11 can be used.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

And in your `application.conf`:

```
akka.discovery {
  method = aws-api-ec2-tag-based
}

```

Notes:

- You will need to make sure that the proper privileges are in place for the discovery implementation to access the Amazon EC2 API. The simplest way to do this is by creating a IAM role that, at a minimum, allows the *DescribeInstances* action. Attach this IAM role to the EC2 instances that need to access the discovery implementation. See the docs for [IAM Roles for Amazon EC2](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/iam-roles-for-amazon-ec2.html).
- In general, for the EC2 instances to “talk to each other” (necessary for forming a cluster), they need to be in the same security group and [the proper rules have to be set](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/security-group-rules-reference.html#sg-rules-other-instances).
- You can set additional filters (by instance type, region, other tags etc.) in your application.conf file, in the `akka.discovery.aws-api-ec2-tag-based.filters` key. The filters have to be key\=value pairs separated by the semicolon character. For example:

```
akka {
  discovery {
    aws-api-ec2-tag-based {
      filters = "instance-type=m1.small;tag:purpose=production"
    }
  }
}

```
- By default, this module is configured for clusters with one Akka node per EC2 instance: it separates cluster members solely by their EC2 IP address. However, we can change the default configuration to indicate multiple ports per discovered EC2 IP, and achieve a setup with multiple Akka nodes (i.e. multiple JVMs) per EC2 instance.

```
akka {
  discovery {
    aws-api-ec2-tag-based {
      ports = [8557, 8558, 8559] # 3 Akka nodes per EC2 instance
      # note that the above need to be the ports associated with the *Akka Management* extension
    }
  }
}

```

Note: this comes with the limitation that each EC2 instance has to have the same number of Akka nodes.
- You can change the default tag key from “service” to something else. This can be done via `application.conf`, by setting `akka.discovery.aws-api-ec2-tag-based.tag-key` to something else.

```
akka.discovery.aws-api-ec2-tag-based.tag-key = "akka-cluster"

```
- If your service is running in a docker container, you will need to configure Akka Management with separate IPs for binding and discovery. This is because Akka Management needs to *bind* to the internal docker IP, but will *discover* the “host” IP (the EC2 private IP) on the AWS API. See [Basic Configuration](../akka-management.html) on how to separate the bind IP from the discovery IP.

Demo:

- A working demo app is available in the [integration\-test](https://github.com/akka/akka-management/tree/main/integration-test/aws-api-ec2) folder.

### Discovery Method: AWS API \- ECS Discovery

If you’re using ECS with [awsvpc](https://aws.amazon.com/blogs/compute/introducing-cloud-native-networking-for-ecs-containers/) mode networking, you can have all task instances of a given ECS service discover each other. If you’re using this module for bootstrapping your Akka cluster that you’ll do so by setting the value of `akka.management.cluster.bootstrap.contact-point-discovery.service-name` to that of the ECS service itself.

Screenshot of two ECS task instances (the service name is `liquidity-application`):

![ECS task instances](../images/discovery-aws-ecs-task-instances.png)

#### Dependencies and usage (ECS Discovery)

There are two “flavours” of the ECS Discovery module.

##### akka\-discovery\-aws\-api

This uses the mainstream AWS SDK. The advantage here is that if you’ve already got the mainstream AWS SDK as a dependency you’re not now also bringing in the preview SDK. The disadvantage is that the mainstream SDK does blocking IO.

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-aws-api" % AkkaManagementVersion
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery-aws-api_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```
Maven
```
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-aws-api_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

And in your `application.conf`:

```
akka.discovery {
  method = aws-api-ecs
  aws-api-ecs {
    # Defaults to "default" to match the AWS default cluster name if not overridden
    cluster = "your-ecs-cluster-name"
  }
}

```

##### akka\-discovery\-aws\-api\-async

This uses the preview AWS SDK. The advantage here is that the SDK does non\-blocking IO, which you probably want. You might need to think carefully before using this though if you’ve already got the mainstream AWS SDK as a dependency.

Once the async AWS SDK is out of preview it is likely that the `akka-discovery-aws-api` module will be discontinued in favour of `akka-discovery-aws-api-async`.

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-aws-api-async" % AkkaManagementVersion
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery-aws-api-async_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```
Maven
```
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-aws-api-async_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

We have 2 approaches in ECS: `aws-api-ecs-async` and `aws-api-ecs-task-set-async`.

###### aws\-api\-ecs\-async

In your `application.conf`:

```
akka.discovery {
  method = aws-api-ecs-async
  aws-api-ecs-async {
    # Defaults to "default" to match the AWS default cluster name if not overridden
    cluster = "your-ecs-cluster-name"
    # Defaults to an empty list
    tags = [
      { key = "deployment-side", value = "blue" }
    ]
  }
}

```

This will query the AWS API to retrieve all running tasks of the ESC service specified at `akka.management.cluster.bootstrap.contact-point-discovery.service-name`.

###### aws\-api\-ecs\-task\-set\-async

If you use AWS CodeDeploy, you probably want to use this method of discovery.

In your `application.conf`:

```
akka.discovery {
  method = aws-api-ecs-task-set-async
  aws-api-ecs-task-set-async {
    # Defaults to "default" to match the AWS default cluster name if not overridden
    cluster = "your-ecs-cluster-name"
  }
}

```

The service\-discovery works in 3 steps: 1\. Query the internal ECS metadata API to retrieve the TaskARN of itself (See [AWS docs](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-metadata-endpoint-v3.html)) 2\. Retrieve the TaskSet to which the TaskARN belongs 3\. Retrieve all Tasks belonging to that TaskSet

Notes:

- Since the implementation uses the AWS ECS API, you’ll need to make sure that AWS credentials are provided. The simplest way to do this is to create an IAM role that includes appropriate permissions for AWS ECS API access. Attach this IAM role to the task definition of the ECS Service. See the docs for [IAM Roles for Tasks](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html).
- In general, for the ECS task instances to “talk to each other” (necessary for forming a cluster), they need to be in the same security group and the proper rules have to be set. See the docs for [Task Networking with the `awsvpc` Network Mode](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html).
- akka\-remote by default sets `akka.remote.netty.tcp.hostname` to the result of `InetAddress.getLocalHost.getHostAddress`, and akka\-management does the same for `akka.management.http.hostname`. However, `InetAddress.getLocalHost.getHostAddress` throws an exception when running in awsvpc mode (because the container name cannot be resolved), so you will need to set this explicitly. An alternative host address discovery method is provided by both modules. The methods are `EcsSimpleServiceDiscovery.getContainerAddress` and `AsyncEcsDiscovery.getContainerAddress` respectively, which you should use to programmatically set both config hostnames.
- Because ECS service discovery is only able to discover IP addresses (not ports too) you’ll need to set `akka.management.cluster.bootstrap.contact-point.fallback-port = 8558`, where 8558 is whatever port you choose to bind akka\-management to.
- You can set additional filters to only discover nodes with specific tag values in your application.conf file, in the `akka.discovery.aws-api-ecs-async.tags` key. An empty list of tags will not filter any nodes out.

For example: `akka {
 discovery {
 aws-api-ecs-async {
 tags = [
 { key = "environment", value = "staging" },
 { key = "deployment-side", value = "blue" }
 ]
 }
 }
 }`

- The current implementation only supports discovery of service task instances within the same region.

Demo:

- A working demo app is available in the [integration\-test](https://github.com/akka/akka-management/tree/main/integration-test/aws-api-ecs) folder. It includes CloudFormation templates with minimal permissions w.r.t to IAM policies and security group ingress, and so is a good starting point for any deployment that integrates the [principle of least privilege](https://en.wikipedia.org/wiki/Principle_of_least_privilege).

## Code Examples

### Example 1: Dependencies and usage (EC2 Tag-Based Discovery)

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-aws-api" % AkkaManagementVersion
```

### Example 2: Dependencies and usage (EC2 Tag-Based Discovery)

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery-aws-api_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 3: Dependencies and usage (EC2 Tag-Based Discovery)

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-aws-api_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 4: Dependencies and usage (EC2 Tag-Based Discovery)

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
)
```

### Example 5: Dependencies and usage (EC2 Tag-Based Discovery)

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 6: Dependencies and usage (EC2 Tag-Based Discovery)

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 7: Dependencies and usage (EC2 Tag-Based Discovery)

```text
akka.discovery {
  method = aws-api-ec2-tag-based
}
```

### Example 8: Dependencies and usage (EC2 Tag-Based Discovery)

```text
akka {
  discovery {
    aws-api-ec2-tag-based {
      filters = "instance-type=m1.small;tag:purpose=production"
    }
  }
}
```

### Example 9: Dependencies and usage (EC2 Tag-Based Discovery)

```text
akka {
  discovery {
    aws-api-ec2-tag-based {
      ports = [8557, 8558, 8559] # 3 Akka nodes per EC2 instance
      # note that the above need to be the ports associated with the *Akka Management* extension
    }
  }
}
```

### Example 10: Dependencies and usage (EC2 Tag-Based Discovery)

```text
akka.discovery.aws-api-ec2-tag-based.tag-key = "akka-cluster"
```

### Example 11: Dependencies and usage (ECS Discovery)

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-aws-api" % AkkaManagementVersion
```

### Example 12: Dependencies and usage (ECS Discovery)

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery-aws-api_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 13: Dependencies and usage (ECS Discovery)

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-aws-api_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 14: Dependencies and usage (ECS Discovery)

```text
akka.discovery {
  method = aws-api-ecs
  aws-api-ecs {
    # Defaults to "default" to match the AWS default cluster name if not overridden
    cluster = "your-ecs-cluster-name"
  }
}
```

### Example 15: Dependencies and usage (ECS Discovery)

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-aws-api-async" % AkkaManagementVersion
```

### Example 16: Dependencies and usage (ECS Discovery)

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery-aws-api-async_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 17: Dependencies and usage (ECS Discovery)

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-aws-api-async_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 18: Dependencies and usage (ECS Discovery)

```text
akka.discovery {
  method = aws-api-ecs-async
  aws-api-ecs-async {
    # Defaults to "default" to match the AWS default cluster name if not overridden
    cluster = "your-ecs-cluster-name"
    # Defaults to an empty list
    tags = [
      { key = "deployment-side", value = "blue" }
    ]
  }
}
```

### Example 19: Dependencies and usage (ECS Discovery)

```text
akka.discovery {
  method = aws-api-ecs-task-set-async
  aws-api-ecs-task-set-async {
    # Defaults to "default" to match the AWS default cluster name if not overridden
    cluster = "your-ecs-cluster-name"
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-management/current/akka-management.html
- https://doc.akka.io/libraries/akka-management/current/discovery/aws.html
- https://doc.akka.io/libraries/akka-management/current/discovery/azure.html
- https://doc.akka.io/libraries/akka-management/current/discovery/kubernetes.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/discovery/aws.html](https://doc.akka.io/libraries/akka-management/current/discovery/aws.html)*