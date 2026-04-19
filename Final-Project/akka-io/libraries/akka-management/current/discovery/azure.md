---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:39Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/discovery/azure.html
title: Azure API • Akka Management
---

# Azure API • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

## Azure API

## Project Info

| Project Info: Akka Discovery Azure | |
| --- | --- |
| Artifact | com.lightbend.akka.discovery akka\-discovery\-azure\-api 1\.6\.4 [Akka library snapshot repository](https://repo.akka.io/snapshots) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| License | [BUSL\-1\.1](https://github.com/akka/akka-management/blob/v1.6.4/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.5\.4, 2024\-08\-15 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-management/1.6.4/akka/index.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-management/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-management/issues) |
| Sources | [https://github.com/akka/akka\-management](https://github.com/akka/akka-management) |

### Discovery Method: AKS Azure RBAC Based Discovery

You can use `azure-rbac-aks-api` based discovery with azure rbac and workload identity enabled AKS clusters.

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-azure-api" % AkkaManagementVersion
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery-azure-api_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
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
    <artifactId>akka-discovery-azure-api_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Getting started

`akka-discovery-azure-api` is similar to the `akka-discovery-kubernetes-api` in that it queries the AKS Kubernetes API server to find pods with a given label but different in terms how authentication and authorization work. The discovery method doesn’t require using the more traditional Kubernetes RBAC but instead relies on using Azure RBAC.

- `Authentication and Authorization` is set to `Microsoft Entra ID authentication with Azure RBAC`

![AKS_authentication_and_authorization](../images/discovery-azure-api-rbac-authentication-and-authorization.png)

- Workload Identity is enabled for the AKS cluster

Note
This step will deploy azure workload identity controller to your aks cluster in the kube\-system namespace

```
az aks update --resource-group "${RESOURCE_GROUP}" \
  --name "${CLUSTER_NAME}" --enable-oidc-issuer \
  --enable-workload-identity

```

- Create a Microsoft Azure Manged Identity

```
az identity create --name "${USER_ASSIGNED_IDENTITY_NAME}" \
  --resource-group "${RESOURCE_GROUP}" --location "${LOCATION}" \
  --subscription "${SUBSCRIPTION}"

```

- Assign `AKS Pod Reader` to the Managed Identity
- Create Federated Credential for the Managed Identity

```
az identity federated-credential create \
  --name ${FEDERATED_IDENTITY_CREDENTIAL_NAME} \
  --identity-name "${USER_ASSIGNED_IDENTITY_NAME}" \
  --resource-group "${RESOURCE_GROUP}" --issuer "${AKS_OIDC_ISSUER}" \
  --subject system:serviceaccount:"${SERVICE_ACCOUNT_NAMESPACE}":"${SERVICE_ACCOUNT_NAME}" \
  --audience api://AzureADTokenExchange

```

- Create a Kubernetes Service Account

```
kubectl apply -f - <<EOF
apiVersion: v1
kind: ServiceAccount
metadata:
  name: <akka-app>
  namespace: <akka-app-namespace>
  annotations:
    azure.workload.identity/client-id: "XXXXXXXXXXXXXXXXX"
EOF

```

- Label Pods with `azure.workload.identity/use: "true"`

```
kubectl apply -f - <<EOF
apiVersion: apps/v1
kind: Deployment
metadata:
  name: <akka-app>
  namespace: <akka-app-namespace>
# Removed for brevity
spec:
  template:
    metadata:
      labels:
        azure.workload.identity/use: "true"
     spec:
      serviceAccountName: <akka-app>
      # Removed for brevity

```

- Change `application.conf` to use the discovery method:

```
akka {
  # Removed for brevity
  management {
    cluster.bootstrap {
      contact-point-discovery {
        discovery-method = azure-rbac-aks-api
        azure-rbac-aks-api {
          pod-namespace = "test-akka-app"
        }
      }
    }
  }
}

```

Azure’s workload identity controller will inject your application pods with environment variables that the discovery method uses to query the AKS Kubernetes Cluster’s API Server. Here’s a list of environment variables that get injected in pods:

```
${AZURE_AUTHORITY_HOST}
${AZURE_AUTHORITY_HOST}
${AZURE_AUTHORITY_HOST}
${AZURE_AUTHORITY_HOST}

```

Additionally, the discovery method uses the `AZURE_SERVER_ID` environment variable whose default value is set to `6dae42f8-4368-4678-94ff-3960e28e3630/.default`. This is the application used by the server side. The access token accessing AKS clusters need to be issued for this app.

Note
AKS uses a pair of first\-party Microsoft Entra applications.

These application IDs are the same in all environments. The AKS Microsoft Entra server application ID that the server side uses is 6dae42f8\-4368\-4678\-94ff\-3960e28e3630\. The access token that accesses AKS clusters must be issued for this application.

## Code Examples

### Example 1: Discovery Method: AKS Azure RBAC Based Discovery

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-azure-api" % AkkaManagementVersion
```

### Example 2: Discovery Method: AKS Azure RBAC Based Discovery

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery-azure-api_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 3: Discovery Method: AKS Azure RBAC Based Discovery

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-azure-api_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 4: Getting started

```shell
az aks update --resource-group "${RESOURCE_GROUP}" \
  --name "${CLUSTER_NAME}" --enable-oidc-issuer \
  --enable-workload-identity
```

### Example 5: Getting started

```shell
az identity create --name "${USER_ASSIGNED_IDENTITY_NAME}" \
  --resource-group "${RESOURCE_GROUP}" --location "${LOCATION}" \
  --subscription "${SUBSCRIPTION}"
```

### Example 6: Getting started

```shell
az identity federated-credential create \
  --name ${FEDERATED_IDENTITY_CREDENTIAL_NAME} \
  --identity-name "${USER_ASSIGNED_IDENTITY_NAME}" \
  --resource-group "${RESOURCE_GROUP}" --issuer "${AKS_OIDC_ISSUER}" \
  --subject system:serviceaccount:"${SERVICE_ACCOUNT_NAMESPACE}":"${SERVICE_ACCOUNT_NAME}" \
  --audience api://AzureADTokenExchange
```

### Example 7: Getting started

```shell
kubectl apply -f - <<EOF
apiVersion: v1
kind: ServiceAccount
metadata:
  name: <akka-app>
  namespace: <akka-app-namespace>
  annotations:
    azure.workload.identity/client-id: "XXXXXXXXXXXXXXXXX"
EOF
```

### Example 8: Getting started

```shell
kubectl apply -f - <<EOF
apiVersion: apps/v1
kind: Deployment
metadata:
  name: <akka-app>
  namespace: <akka-app-namespace>
# Removed for brevity
spec:
  template:
    metadata:
      labels:
        azure.workload.identity/use: "true"
     spec:
      serviceAccountName: <akka-app>
      # Removed for brevity
```

### Example 9: Getting started

```hocon
akka {
  # Removed for brevity
  management {
    cluster.bootstrap {
      contact-point-discovery {
        discovery-method = azure-rbac-aks-api
        azure-rbac-aks-api {
          pod-namespace = "test-akka-app"
        }
      }
    }
  }
}
```

### Example 10: Getting started

```shell
${AZURE_AUTHORITY_HOST}
${AZURE_AUTHORITY_HOST}
${AZURE_AUTHORITY_HOST}
${AZURE_AUTHORITY_HOST}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-management/current/discovery/aws.html
- https://doc.akka.io/libraries/akka-management/current/discovery/consul.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/discovery/azure.html](https://doc.akka.io/libraries/akka-management/current/discovery/azure.html)*