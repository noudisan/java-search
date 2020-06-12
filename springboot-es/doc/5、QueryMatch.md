##匹配查询(match)

###匹配查询全部数据与分页

匹配查询符合条件的所有数据，并且设置以 salary 字段升序排序，并设置分页：
```
GET dztt-user/_search
{
  "query": {
    "match_all": {}
  },
  "from": 0,
  "size": 10,
  "sort": [
    {
      "salary": {
        "order": "asc"
      }
    }
  ]
}
```

###匹配查询数据

匹配查询地址为 通州区 的数据：
```
GET dztt-user/_search
{
  "query": {
    "match": {
      "address": "通州区"
    }
  }
}
```
###词语匹配查询

词语匹配进行查询，匹配 address 中为 北京市通州区 的员工信息：
```
GET dztt-user/_search
{
  "query": {
    "match_phrase": {
      "address": "北京市通州区"
    }
  }
}
```

###内容多字段查询

查询在字段 address、remark 中存在 北京 内容的员工信息：
```
GET dztt-user/_search
{
  "query": {
    "multi_match": {
      "query": "北京",
      "fields": ["address","remark"]
    }
  }
}
```
