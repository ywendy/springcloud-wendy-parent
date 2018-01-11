##  config from native

启动项目后访问
### http://localhost:8888/my-config/dev
```yaml
{
    name: "my-config",
    profiles: - [
    "dev"
    ],
    label: null,
    version: null,
    state: null,
    propertySources: - [
        - {
            name: "classpath:config-file/my-config-dev.yaml",
            source: - {
                user.name: "tony-uat"
            }
        }
    ]
}

```
### http://localhost:8888/my-config/uat
```yaml

{
    name: "my-config",
    profiles: - [
    "uat"
    ],
    label: null,
    version: null,
    state: null,
    propertySources: - [
        - {
            name: "classpath:config-file/my-config-uat.yaml",
            source: - {
              user.name: "tony-dev"
            }
        }
    ]
}

```
### http://localhost:8888/my-config/pro
```yaml

{
    name: "my-config",
    profiles: - [
    "pro"
    ],
    label: null,
    version: null,
    state: null,
    propertySources: - [
        - {
        name: "classpath:config-file/my-config-pro.yaml",
        source: - {
          user.name: "tony-pro"
        }
        }
    ]
}

```
