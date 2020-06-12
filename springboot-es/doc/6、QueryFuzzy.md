##模糊查询(fuzzy)

模糊查询所有以 三 结尾的姓名
```
GET dztt-user/_search
{
  "query": {
    "fuzzy": {
      "name": "三"
    }
  }
}
```