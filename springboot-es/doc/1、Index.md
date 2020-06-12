## 创建索引

创建名为 dztt-user 的索引与对应 Mapping。

```
PUT /dztt-user
{
  "mappings": {
    "doc": {
      "dynamic": true,
      "properties": {
        "name": {
          "type": "text",
          "fields": {
            "keyword": {
              "type": "keyword"
            }
          }
        },
        "address": {
          "type": "text",
          "fields": {
            "keyword": {
              "type": "keyword"
            }
          }
        },
        "remark": {
          "type": "text",
          "fields": {
            "keyword": {
              "type": "keyword"
            }
          }
        },
        "age": {
          "type": "integer"
        },
        "salary": {
          "type": "float"
        },
        "birthDate": {
          "type": "date",
          "format": "yyyy-MM-dd"
        },
        "createTime": {
          "type": "date"
        }
      }
    }
  }
}
```

## 删除索引

删除 dztt-user 索引。

```
DELETE /dztt-user
```