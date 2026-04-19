---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:35Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry.html
title: 'akka auth container-registry :: Akka Documentation'
---

# akka auth container-registry :: Akka Documentation

## Content

# akka auth container\-registry

Manage configuration for Akka Container Registry.

## Synopsis

The Akka Container Registry (ACR) can be used by all users to deploy their services.
ACR uses an access token generated via Akka for authentication.
This command allows you to configure the Docker credential helper for ACR.

|  | to use this command, the current user must be logged into Akka and Docker must be installed and accessible for the current user. |
| --- | --- |

## Options

```
  -h, --help   help for container-registry
```

## Options inherited from parent commands

```
      --cache-file string   location of cache file (default "~/.akka/cache.yaml")
      --config string       location of config file (default "~/.akka/config.yaml")
      --context string      configuration context to use
      --disable-prompt      Disable all interactive prompts when running akka commands. If input is required, defaults will be used, or an error will be raised.
                            This is equivalent to setting the environment variable AKKA_DISABLE_PROMPTS to true.
  -o, --output string       set output format to one of [text,json,json-compact,go-template=] (default "text")
      --page-mode string    the mode for paging, either paged, buffered or auto. (default "auto")
  -q, --quiet               set quiet output (helpful when used as part of a script)
      --timeout duration    client command timeout (default 10s)
      --use-grpc-web        use grpc-web when talking to Akka APIs. This is useful when behind corporate firewalls that decrypt traffic but don't support HTTP/2.
  -v, --verbose             set verbose output
```

## SEE ALSO

- [akka auth](akka_auth.html) \- Manage Akka authentication.
- [akka auth container\-registry clear\-cached\-token](akka_auth_container-registry_clear-cached-token.html) \- Clear the cached Akka Container Registry access token.
- [akka auth container\-registry configure](akka_auth_container-registry_configure.html) \- Configure the Akka Container Registry docker credential helper.
- [akka auth container\-registry credentials](akka_auth_container-registry_credentials.html) \- Retrieve an Akka Container Registry access token for the current user.
- [akka auth container\-registry install\-helper](akka_auth_container-registry_install-helper.html) \- Install the Akka Docker credential helper in the selected directory.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_auth.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry_clear-cached-token.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry_configure.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry_credentials.html
- https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry_install-helper.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry.html](https://doc.akka.io/reference/cli/akka-cli/akka_auth_container-registry.html)*