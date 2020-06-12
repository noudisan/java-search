##通配符查询(wildcard)

查询所有以 “三” 结尾的姓名：

```
GET dztt-user/_search
{
  "query": {
    "wildcard": {
      "name.keyword": {
        "value": "*三"
      }
    }
  }
}
```