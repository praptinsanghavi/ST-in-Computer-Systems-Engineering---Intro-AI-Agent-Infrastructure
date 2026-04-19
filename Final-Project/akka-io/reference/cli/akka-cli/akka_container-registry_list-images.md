---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:47Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_list-images.html
title: 'akka container-registry list-images :: Akka Documentation'
---

# akka container-registry list-images :: Akka Documentation

## Content

# akka container\-registry list\-images

list images from the Akka Container Registry.

```
akka container-registry list-images [flags]
```

## Options

```
  -h, --help                help for list-images
      --hostname string     list all images in a specific container registry host. For example, 'kcr.us-east-1.akka.io'
      --repository string   list all images in a specific repository, no recursion down. For example, 'kcr.us-east-1.akka.io/my-org/my-project'
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
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_list-images.html](https://doc.akka.io/reference/cli/akka-cli/akka_container-registry_list-images.html)*