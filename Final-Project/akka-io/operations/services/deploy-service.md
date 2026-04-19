---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:20Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/services/deploy-service.html
title: 'Deploy and manage services :: Akka Documentation'
---

# Deploy and manage services :: Akka Documentation

## Content

# Deploy and manage services

This guide will walk you through deploying Akka services using the Akka Console and the Akka CLI. By the end, you’ll be able to deploy, check the status, update, and remove services.

|  | Akka also supports a descriptor for a full project configuration spanning over multiple services and other project\-level settings. Please refer to [Project Descriptor reference](../../reference/descriptors/project-descriptor.html) for details. |
| --- | --- |

## Prerequisites

Before deploying a service, ensure you have the following:

- An [Akka account](https://console.akka.io/register)
- An [Akka project created](../projects/create-project.html)
- The [Akka CLI installed](../cli/installation.html)
- A running Docker daemon

## Build container image

|  | The `mvn install` command of the Maven Docker plugin connects to the locally running Docker daemon. Check your active Docker context with `docker context list`. You may overwrite it through the `DOCKER_HOST` environment value. |
| --- | --- |

Build a container image of the service:

```
mvn clean install -DskipTests
```

By default, the maven build will produce images with the following format: `container-name:tag-name` where the container name is the `artifactId` and the tag name is the `version` plus the build timestamp.

The docker build output in maven will print something similar to the following:

```
DOCKER> Tagging image shopping-cart:1.0-SNAPSHOT-20241028102843 successful!
```

## Deploying a service

Services can be deployed via the Akka CLI.

To deploy your service, use the following command. Replace `my-service` with your service name and update the container name and tag from the `mvn install`:

```
akka service deploy my-service container-name:tag-name --push
```

Your service will now begin deploying.

|  | The `--push` flag will push the container image to the Akka Container Registry before deploying the service. If your project has more than one region, the image will be pushed to each region ACR and deployed in all regions. If you are not using ACR, you first need to push the image to the container registry you are using. See [pushing to ACR](#_pushing_to_acr) and [pushing to external container registry](#_pushing_to_ext_cr) for more information. |
| --- | --- |

|  | To combine deploying a service with relevant settings, Akka supports deploying with service descriptors ([see below](#apply)). |
| --- | --- |

## Checking service status

You can verify the deployment status of your service in the Akka Console or with the Akka CLI:

Akka CLI

Verify the service status from the command line with this command:

```
akka service list
```

A service status can be one of the following:

- **Ready**: All service instances are up\-to\-date and fully available.
- **UpdateInProgress**: Service is updating.
- **Unavailable**: No service instances are available.
- **PartiallyReady**: Some, but not all, service instances are available.

Akka Console

1. Open the [**Akka Console**](https://console.akka.io).
2. Navigate to the **Project** where the Service is deployed.
3. Look for the **Service** card of the Service, it shows the status.

![Service card](../_images/console-service-status.png)

A service status can be one of the following:

	- **Ready**: All service instances are up\-to\-date and fully available.
	- **Update In Progress**: Service is updating.
	- **Unavailable**: No service instances are available.
	- **Partially Ready**: Some, but not all, service instances are available.

## How to update a deployed service

If you need to update your service with a new container image:

1. **Make changes** to your service and **package them** into a **new container image**, see [Build container image](#_build_container_image).
2. **Deploy the updated image** by passing the new tag:

```
akka service deploy my-service container-name:tag-name-2 --push
```

Akka will perform a rolling update, replacing old instances with new ones without downtime.

|  | The `--push` flag will push the container image to the Akka Container Registry before deploying the service. If your project has more than one region, the image will be pushed to each region ACR and deployed in all regions. If you are not using ACR, you first need to push the image to the container registry you are using. See [pushing to ACR](#_pushing_to_acr) and [pushing to external container registry](#_pushing_to_ext_cr) for more information. |
| --- | --- |

## Pushing to Akka Container Registry

Pushing images to the Akka Container Registry (ACR) works similarly to other Docker registries, with the added feature that Akka supports multi\-region deployments. When deploying to multiple regions, each configured region requires its own ACR. The Akka CLI manages this process automatically.

To push your images to the Akka Container Registry (ACR), use the following command:

```
akka container-registry push container-name:tag-name
```

This command will create new tags specifically formatted for ACR, prepending the ACR **URL**, the **organization**, and the **project** names to the image before pushing it.

For example, if your project has two regions with ACRs `acr.us-east-1.akka.io` and `acr.us-east-2.akka.io`, the command will push to:

- `acr.us-east-1.akka.io/my-organization/my-project/container-name:tag-name`
- `acr.us-east-2.akka.io/my-organization/my-project/container-name:tag-name`

After pushing to all regions, the CLI will display the primary region’s image path, which should be used for service deployment:

```
When deploying an Akka service, use the primary region image tag:
	acr.us-east-1.akka.io/my-organization/my-project/container-name:tag-name
```

### ACR image paths

Images in ACR follow a hierarchical structure and can be scoped to either a single project or an entire organization:

- For single\-project availability, the image path must include both the organization and project names:

`my-organization/my-project/container-name:tag-name`
- To make an image available across **all projects** within an organization, use only the organization name in the image path:

`my-organization/container-name:tag-name`

In ACR, this structure reflects Akka’s organizational layout, where an organization can manage multiple projects that host images. Images stored at the organizational root can be deployed in any project within that organization.

As mentioned earlier, the Maven build will produce images with the format `container-name:tag-name` (without `organization` and `project` segments). When pushing images without the organization and project segments, the Akka CLI will populate these segments based on your current `organization` and `project`.

If desired, you can configure Maven to build images for a specific `organization` or `organization/project`. To do this, configure the `docker.image` property in your pom.xml:

```
<properties>
  <docker.image>my-organization/my-project/container-name</docker.image>
</properties>
```

## Pushing to external container registry

If you are not using ACR, use `docker push` command instead.

```
docker push container-uri/container-name:tag-name
```

Ensure that your chosen container registry is accessible to all regions in your project.

For further details, see [external container registries](../projects/external-container-registries.html).

## Using service descriptors

Akka services can also be described and managed with **YAML service descriptors**. See [Service Descriptor reference](../../reference/descriptors/service-descriptor.html).

|  | Akka also supports a descriptor for a full project configuration spanning over multiple services and other project\-level settings. Please refer to [Project Descriptor reference](../../reference/descriptors/project-descriptor.html) for details. |
| --- | --- |

You can deploy your service using a service descriptor.
For this you need at least the image, which you can get by [building the container image](#_build_container_image) and then [pushing it to the container registry](#_pushing_to_acr):

```
akka container-registry push container-name:tag-name
```

Once pushed, you need to use the suggested image from the command’s output in your service descriptor, for example:

```
name: my-service
service:
  resources:
    runtime:
      mode: embedded
  image: acr.us-east-1.akka.io/my-organization/my-project/container-name:tag-name
  env:
  - name: SOME_VARIABLE
    value: some value
```

|  | You must add the primary region image tag from `akka container-registry push` output. |
| --- | --- |

|  | Keep the embedded runtime mode in the service descriptor, as it is the only mode supported by Akka services. |
| --- | --- |

To apply this descriptor, run:

```
akka service apply -f my-service.yaml
```

You can also export an existing service’s descriptor for reference or editing:

```
akka service export my-service -f my-service.yaml
```

### Redeploying with a descriptor

After editing the service descriptor (e.g., `my-service.yaml`), redeploy it with:

```
akka service apply -f my-service.yaml
```

### Editing the service descriptor in place

Once you have [deployed your service](#_deploying_a_service), you can also modify it by editing its service descriptor:

```
akka service edit my-service
```

## Removing a deployed service

To delete a service and free its resources, run the following command, replacing `my-service` with the name of the service you want to remove:

```
akka service delete my-service
```

The service will be deleted, and its resources will be freed.

|  | During development, with changing domain models, it may be useful to delete a service *including its data*. To delete already stored data and the service, use the `--hard` flag. **This can not be undone.**     ``` akka service delete my-service --hard ``` |
| --- | --- |

## Conclusion

You now know how to deploy, verify, update, and remove Akka services using the Akka CLI. Continue experimenting with different configurations and commands to further enhance your services.

## Related documentation

- [`akka service` CLI commands](../../reference/cli/akka-cli/akka_services.html)
- [Akka Service Descriptor](../../reference/descriptors/service-descriptor.html)

## Code Examples

### Example 1: Build container image

```command
mvn clean install -DskipTests
```

### Example 2: Build container image

```command
DOCKER> Tagging image shopping-cart:1.0-SNAPSHOT-20241028102843 successful!
```

### Example 3: Deploying a service

```command
akka service deploy my-service container-name:tag-name --push
```

### Example 4: Checking service status

```command
akka service list
```

### Example 5: How to update a deployed service

```command
akka service deploy my-service container-name:tag-name-2 --push
```

### Example 6: Pushing to Akka Container Registry

```command
akka container-registry push container-name:tag-name
```

### Example 7: Pushing to Akka Container Registry

```command
When deploying an Akka service, use the primary region image tag:
	acr.us-east-1.akka.io/my-organization/my-project/container-name:tag-name
```

### Example 8: ACR image paths

```xml
<properties>
  <docker.image>my-organization/my-project/container-name</docker.image>
</properties>
```

### Example 9: Pushing to external container registry

```command
docker push container-uri/container-name:tag-name
```

### Example 10: Using service descriptors

```command
akka container-registry push container-name:tag-name
```

### Example 11: Using service descriptors

```yaml
name: my-service
service:
  resources:
    runtime:
      mode: embedded
  image: acr.us-east-1.akka.io/my-organization/my-project/container-name:tag-name
  env:
  - name: SOME_VARIABLE
    value: some value
```

### Example 12: Using service descriptors

```command
akka service apply -f my-service.yaml
```

### Example 13: Using service descriptors

```command
akka service export my-service -f my-service.yaml
```

### Example 14: Redeploying with a descriptor

```command
akka service apply -f my-service.yaml
```

### Example 15: Editing the service descriptor in place

```command
akka service edit my-service
```

### Example 16: Removing a deployed service

```command
akka service delete my-service
```

### Example 17: Removing a deployed service

```command
akka service delete my-service --hard
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/cli/installation.html
- https://doc.akka.io/operations/projects/create-project.html
- https://doc.akka.io/operations/projects/external-container-registries.html
- https://doc.akka.io/reference/cli/akka-cli/akka_services.html
- https://doc.akka.io/reference/descriptors/project-descriptor.html
- https://doc.akka.io/reference/descriptors/service-descriptor.html

---
*Source: [https://doc.akka.io/operations/services/deploy-service.html](https://doc.akka.io/operations/services/deploy-service.html)*