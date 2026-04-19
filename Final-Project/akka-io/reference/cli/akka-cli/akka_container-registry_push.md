---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:48Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_push.html
title: 'akka container-registry push :: Akka Documentation'
---

# akka container-registry push :: Akka Documentation

## Content

# akka container\-registry push

Push an Akka service image for a particular Akka project.

## Synopsis

The `akka container-registry push image` command will push the given container image to the Akka container registry.
The provided image name must be a valid Docker image tag and not an image hash/SHA\-256\.

This command will replace the `HOST[:PORT_NUMBER]` portion of the specified *image* with the appropriate Akka container registry hostname if it does not match the expected hostname.
This command is also multi\-region aware.
If the current (or specified) Akka project is a multi\-region project, the provided *image* will be tagged with a new tag for each Akka region where the project resides and this command will push the image to each of those regions for you.

|  | You must have the source *image* in your local Docker service image catalog for this command to function. If the image is not locally stored, you can pull it (via `docker pull image` first before running this command. |
| --- | --- |

```
akka container-registry push IMAGE [flags]
```

## Options

```
  -h, --help             help for push
      --owner string     the owner of the project to use, needed if you have two projects with the same name from different owners
      --project string   project to use if not using the default configured project
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

- [akka container\-registry](akka_container-registry.html) \- Manage and push service images to the Akka Container Registry.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_container-registry.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_push.html](https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_push.html)*