---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:57Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/projects/external-container-registries.html
title: 'Configure an external container registry :: Akka Documentation'
---

# Configure an external container registry :: Akka Documentation

## Content

# Configure an external container registry

To use an external container registry with Akka, you need to give Akka permissions to connect to your registry. To add credentials for your container registry to Akka, you can use the Akka CLI or the Akka Console.

|  | If the container registry you’re using does not require authentication, you don’t have to add any credentials. Akka will automatically pull the container image using the URL you use to deploy your service. |
| --- | --- |

External container registries are configured by creating an Akka secret, and then configuring your Akka project to use that secret as docker registry credentials. The secret, and project configuration, are both managed by the `akka docker` command.

There are four parameters you need to specify, depending on the registry you want to connect to:

- Server: The first part of the container image URL. For example, if your image is at `us-central1-docker.pkg.dev/my-project/my-repo/my-image`, the server is `https://us-central1-docker.pkg.dev` (*mandatory*).
- Username: The username (*optional*).
- Email: The email address (*optional*).
- Password: The password (*mandatory*).

Use the `akka docker add-credentials` command.

```
akka docker add-credentials --docker-server <my-server> \ (1)
  --docker-username <my-username> \ (2)
  --docker-email <my-email> \ (3)
  --docker-password <my-password> (4)
```

| **1** | Server |
| --- | --- |
| **2** | Username |
| **3** | Email |
| **4** | Password |

If you wish to specify the name of the secret that you want to use, that can be done using the `--secret-name` parameter. By default, if not specified, the name of the secret will be `docker-credentials`.

## Updating credentials

The `add-credentials` command can also be used to update existing credentials. Simply ensure that the `--secret-name` argument matches the secret name used when the credentials were added, if it was specified then.

## Listing credentials

To list all container registry credentials for your Akka project, you can use the Akka CLI or the Akka Console. For security purposes, neither the CLI nor the Console will show the password of the configured registry.

Use the `akka docker list-credentials` command:

```
akka docker list-credentials
```

The results should look something like:

```
NAME                STATUS  SERVER                                  EMAIL             USERNAME
docker-credentials  OK      https://us-central1-docker.pkg.dev     [[email protected]](/cdn-cgi/l/email-protection)  _json_key
```

## Removing credentials

To remove container registry credentials from your Akka project, you can use the Akka CLI or the Akka Console.

If you specified a `--secret-name` when creating the credentials, this is the name that you must pass to the command to remove. Otherwise, you should pass the default secret name of `docker-credentials`. The name of the secret appears in the `NAME` column when listing credentials.

```
akka docker delete-credentials docker-credentials
```

Note that this will only remove the credentials from the configuration for the project, it will not delete the underlying secret. To delete the secret as well, run:

```
akka secrets delete docker-credentials
```

## Supported external registries

### Private container registries

To connect your Akka project to private or self\-hosted container registries, the parameters you need are:

- Server: The full URL of your container registry, including the API version (like `https://mycontainerregistry.example.com/v1/`).
- Username: Your username.
- Email: Your email address.
- Password: Your password.

### Docker Hub

To connect your Akka project to Docker Hub, the parameters you need are:

- Server: `<https://index.docker.io/v1/>`.
- Username: Your Docker Hub username.
- Email: Your Docker Hub email address.
- Password: Your Docker Hub password or Personal Access Token.

When you use the Akka Console, you don’t need to provide the Server URL.

#### Limits on unauthenticated and free usage

Docker has [rate limits](https://docs.docker.com/docker-hub/download-rate-limit/) for unauthenticated and free Docker Hub usage. For unauthenticated users, pull rates are limited based on IP address (anonymous, or unauthenticated, users have a limit of 100 container image pulls per 6 hours per IP address). Akka leverages a limited set of IP addresses to connect to Docker Hub. This means that unauthenticated image pulls might be rate limited. The limit for unauthenticated pulls is shared by all users of Akka.

### Google Artifact Registry

To connect your Akka project to Google Artifact Registry, you’ll need:

- An active Google Cloud Platform account.
- The Artifact Registry API enabled on your Google Cloud project.
- The ID that corresponds with your GCP project.
- The location and name of your Artifact Registry repository.

	1. Create the service account.
	
	
	
	In the following example the service account is named `akka-docker-reader`. Run the create command in your terminal if you have the GCP shell tools installed. Or, run the command from the browser using Cloud Shell Terminal in the Google Cloud Platform (GCP) project.
	
	
	
	
	
	
	```
	gcloud iam service-accounts create akka-docker-reader
	```
	2. Grant the Artifact Registry Reader role to the service account.
	
	
	
	In the following example, replace `<gcp-project-id>` with the GCP project ID.
	
	
	
	
	
	
	```
	gcloud projects add-iam-policy-binding <gcp-project-id> \
	  --member "serviceAccount:akka-docker-reader@<gcp-project-id>.iam.gserviceaccount.com" \
	  --role "roles/artifactregistry.reader"
	```
	3. Generate the service account `_json_key`.
	
	
	
	
	
	```
	gcloud iam service-accounts keys create keyfile.json \
	  --iam-account akka-docker-reader@<gcp-project-id>.iam.gserviceaccount.com
	```
	4. Configure your Akka project to use these credentials, by passing the contents of the key file as the password.
	
	
	
	In the following example, replace `<location>` with your Artifact Registry location (e.g., `us-central1`, `us-east1`, `europe-west1`).
	
	
	
	
	
	
	```
	akka docker add-credentials --docker-server https://<location>-docker.pkg.dev \
	  --docker-username _json_key \
	  --docker-email [[email protected]](/cdn-cgi/l/email-protection) \
	  --docker-password "$(cat keyfile.json)"
	```
	
	
	
	
	
	
	|  | Find detailed configuration instructions in the [Google documentation](https://cloud.google.com/artifact-registry/docs/docker/authentication#json-key). |
	| --- | --- |

### Azure Container Registry

To connect your Akka project to Azure Container Registry (ACR), the parameters you need are:

- Server: `<registry name>.azurecr.io`.
- Password: The password is based on the "*service principal*." To create a service principal (like `akka-docker-reader`) run the command below.

```
ACR_REGISTRY_ID=$(az acr show —name akka-registry —query id —output tsv)
```

```
SP_PASSWD=$(az ad sp create-for-rbac --name http://akka-docker-reader --scopes $ACR_REGISTRY_ID --role acrpull --query password --output tsv)
```
- Username: The username is the application ID of the "service principal." To retrieve the ID, run the command below.

```
SP_APP_ID=$(az ad sp show —id http://akka-docker-reader —query appId —output tsv)
```

When you use the Akka Console, you only need to fill in the registry name for the Server URL.

## See also

- [`akka docker` commands](../../reference/cli/akka-cli/akka_docker.html#_see_also)
- [`akka container-registry` commands](../../reference/cli/akka-cli/akka_container-registry.html#_see_also)

## Code Examples

### Example 1: Configure an external container registry

```command
akka docker add-credentials --docker-server <my-server> \ (1)
  --docker-username <my-username> \ (2)
  --docker-email <my-email> \ (3)
  --docker-password <my-password> (4)
```

### Example 2: Listing credentials

```command
akka docker list-credentials
```

### Example 3: Removing credentials

```command
akka docker delete-credentials docker-credentials
```

### Example 4: Removing credentials

```command
akka secrets delete docker-credentials
```

### Example 5: Google Artifact Registry

```command
gcloud iam service-accounts create akka-docker-reader
```

### Example 6: Google Artifact Registry

```command
gcloud projects add-iam-policy-binding <gcp-project-id> \
  --member "serviceAccount:akka-docker-reader@<gcp-project-id>.iam.gserviceaccount.com" \
  --role "roles/artifactregistry.reader"
```

### Example 7: Google Artifact Registry

```command
gcloud iam service-accounts keys create keyfile.json \
  --iam-account akka-docker-reader@<gcp-project-id>.iam.gserviceaccount.com
```

### Example 8: Google Artifact Registry

```command
akka docker add-credentials --docker-server https://<location>-docker.pkg.dev \
  --docker-username _json_key \
  --docker-email [email protected] \
  --docker-password "$(cat keyfile.json)"
```

### Example 9: Azure Container Registry

```command
ACR_REGISTRY_ID=$(az acr show —name akka-registry —query id —output tsv)
```

### Example 10: Azure Container Registry

```command
SP_PASSWD=$(az ad sp create-for-rbac --name http://akka-docker-reader --scopes $ACR_REGISTRY_ID --role acrpull --query password --output tsv)
```

### Example 11: Azure Container Registry

```command
SP_APP_ID=$(az ad sp show —id http://akka-docker-reader —query appId —output tsv)
```

## Related Pages (Internal Links)

- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/reference/cli/akka-cli/akka_container-registry.html
- https://doc.akka.io/reference/cli/akka-cli/akka_docker.html

---
*Source: [https://doc.akka.io/operations/projects/external-container-registries.html](https://doc.akka.io/operations/projects/external-container-registries.html)*